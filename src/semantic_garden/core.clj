(ns semantic-garden.core
  (:require [clj-antlr.coerce :as antlr.coerce]
            [com.rpl.specter :as sp]
            [clojure.java.io :as io])
  (:import
   (lessparser LessLexer
               LessParser
               LessParserBaseListener)
   (java.lang ThreadLocal)
   (org.antlr.v4 Tool)
   (org.antlr.v4.tool LexerGrammar
                      Grammar)
   (org.antlr.v4.parse ANTLRParser)
   (org.antlr.v4.runtime CommonTokenStream
                         ANTLRInputStream
                         Lexer
                         LexerInterpreter
                         Parser
                         ParserInterpreter)
   (org.antlr.v4.runtime.tree ParseTree ParseTreeWalker)))

(defn sexpr-named? [name]
  (fn [sexpr]
    ;; (println sexpr)
    (when (seq? sexpr)
      (= (first sexpr)
         name))))
;; (defn dig-s [name]
;;   "call it like (dig-s sexprs [:variableDeclaration :values :commandStatement :expression])
;; (dig-s sexprs [:variableDeclaration :variableName])
;; "
;;   ())
(defn import-path [name]
  name
  '"theme.config")

(defn translate-imports [ss]
  (when-let [imports (sp/select [sp/ALL
                                 (sp/pred (sexpr-named? :statement))
                                 (sp/nthpath 1)
                                 (sp/pred (sexpr-named? :importDeclaration))]
                                ss)]
    `(:require
      ~@(let [paths (map (fn [i]
                           [(import-path
                             (first (sp/select [sp/ALL
                                                (sp/pred (sexpr-named? :referenceUrl))
                                                sp/LAST] i)))
                            :refer :all])
                       imports)]
        paths))))

(defn translate-variables [ss]
  (when-let [declarations (sp/select [sp/ALL
                                      (sp/pred (sexpr-named? :statement))
                                      (sp/nthpath 1)
                                      (sp/pred (sexpr-named? :variableDeclaration))
                                      ]
                                     ss)]
    ;; (println declarations)
    (map (fn [i]
           (println i)
           (let [var (sp/select-first [sp/ALL
                                       (sp/pred (sexpr-named? :variableName))
                                       sp/LAST]
                                      i)
                 val (sp/select-first [sp/ALL
                                       (sp/pred (sexpr-named? :values))
                                       sp/LAST
                                       (sp/pred (sexpr-named? :commandStatement))
                                       sp/LAST
                                       (sp/pred (sexpr-named? :expression))
                                       sp/LAST
                                       ]
                                      i)]
             `(def ~var ~val)))
         declarations)))

(defn translate-selector [ss]
  (let [chunks (map rest ss)]
    (loop [chunks chunks
           path []]
      (if (pos? (count chunks))
        (let [ch (ffirst chunks)]
          (println "CHUNK")
          (println (first chunks))
          (cond
            (and
             (seq? ch)
             (= :identifier (first ch)))
            (recur
             (rest chunks)
             (conj path (last ch)))
            (and
             (seq? ch)
             (= :pseudo (first ch)))
            (recur
             (rest chunks)
             (update-in path [(- (count path) 1)] #(apply str % (rest ch))))))
        path))))

(defn translate-selectors [ss]
  (let [forms (sp/select [sp/ALL
                          (sp/pred (sexpr-named? :selector))
                          ;; (sp/srange 1 999)
                          ]
                         (first ss))]
    (map translate-selector
         (map rest forms)))
  )

(defn translate-block [ss]
  {:block :pock})

(defn translate-rulesets [ss]
  (when-let [declarations (sp/select [sp/ALL
                                      (sp/pred (sexpr-named? :statement))
                                      (sp/nthpath 1)
                                      (sp/pred (sexpr-named? :ruleset))]
                                     ss)]
    (map (fn [i]
           (let [selectors (sp/select [sp/ALL
                                    (sp/pred (sexpr-named? :selectors))]
                                   i)
                 block (sp/select-first [sp/ALL
                                         (sp/pred (sexpr-named? :block))
                                         ]
                                        i)]
             (println selectors)
             (concat (translate-selectors selectors)
                     (translate-block block)
                     ))) declarations)))

(defn translate-stylesheet
  [filename ss]
  (conj [`(ns ~filename
              ~(translate-imports (rest ss)))
           (translate-variables (rest ss))
           (translate-rulesets (rest ss))
           ]))

(defn w [out s]
  (.write out s))

(defn parser [filename out]
  (let [cursor (atom {})
        add-to-cursor! (fn [content]
                         (swap! cursor #(merge-with into % content)))
        add! (fn [content]
            (swap! out #(merge-with into % content)))
        commit-cursor! (fn []
                         (add! {:elements [@cursor]})
                         (reset! cursor {}))
        ]
    (proxy [LessParserBaseListener] []
      (enterStylesheet [ctx]
        ;; (println "CTX" (.getText ctx))
        (add! {:ns [filename]} ))

      (enterRuleset [ctx]
        ;; (println "CTX" (.getText ctx))
        ;; (set-cursor! (.selectors ctx))
        ;; (add! {:elements ["e"]})
        )

      (exitRuleset [ctx]
        ;; (println "CTX" (.getText ctx))
        ;; (w out (str ")\n"))
        (commit-cursor!)
        )

      (enterSelector [ctx]
        (println "CTX" (.getText ctx))
        (println (map (fn [e]
                        (.getText e))
                      (.element ctx)))
        ;; (add! {:elements ["e"]})
        (add-to-cursor! {:selectors [(.toString ctx)]}) 
        ;; (w out (str "[" (.getText ctx) "]"))
        ))))

(defn parse-file
  ([filename]
   (parse-file "Semantic-UI/src/definitions/" filename))
  ([root filename]
   (let [output (atom {})
         ext ".less"
         is (ANTLRInputStream. (slurp (io/resource (str
                                                    root
                                                    filename
                                                    ext))))
         lessLexer (LessLexer. is)
         tokenStream (CommonTokenStream. lessLexer)
         tokenParser (LessParser. tokenStream)
         lessListener (parser filename output)
         stylesheet (.stylesheet tokenParser)
         ]
     (.walk ParseTreeWalker/DEFAULT lessListener stylesheet)
     @output)))

(defn parse-file-tree
  ([filename]
   (parse-file-tree "Semantic-UI/src/definitions/" filename))
  ([root filename]
   (let [output (atom {})
         ext ".less"
         is (ANTLRInputStream. (slurp (io/resource (str
                                                    root
                                                    filename
                                                    ext))))
         lessLexer (LessLexer. is)
         tokenStream (CommonTokenStream. lessLexer)
         tokenParser (LessParser. tokenStream)
         lessListener (parser filename output)
         stylesheet (.stylesheet tokenParser)
         ]
     (antlr.coerce/tree->sexpr {:tree stylesheet
                                :parser tokenParser}))))
(comment
  (let [ss (parse-file-tree "test/" "problems")

        statements (sp/select [sp/LAST
                               ;; (sp/pred #(= (first %) :statement))
                               ;; sp/LAST
                               ]
                              ss)
        ]

    statements)

  (with-open [output (clojure.java.io/writer "out.stream" :encoding "UTF-8")]
    (let [root "Semantic-UI/src/definitions/"
          filename "collections/form"
          ext ".less"
          is (ANTLRInputStream. (slurp (io/resource (str
                                                     root
                                                     filename
                                                     ext))))
          lessLexer (LessLexer. is)
          tokenStream (CommonTokenStream. lessLexer)
          tokenParser (LessParser. tokenStream)
          lessListener (parser filename output)
          stylesheet (.stylesheet tokenParser)
          ]
      ;; (clojure.pprint/pprint stylesheet)
      ;; (.walk ParseTreeWalker/DEFAULT lessListener stylesheet)
      (antlr.coerce/tree->sexpr {:tree stylesheet
                                 :parser tokenParser})))

  

  (.LessLexer)

  )
;; (def form (io/resource "Semantic-UI/src/definitions/collections/form.less"))

;; (def less-parse (antlr/parser (slurp (io/resource "grammars/LessParser.g4"))))
;; (def less-lex (antlr/parser (slurp (io/resource "grammars/LessLexer.g4"))))
;; (def less-a (antlr/parser (slurp (io/resource "grammars/LessLexer.g4"))
;;                         (slurp (io/resource "grammars/LessParser.g4"))))

;; (def less (antlr/parser (slurp (io/resource "grammars/Less.g4"))))

(comment
  
  (less-lex form)

  (less-a form)

  (less form)

  (slurp form)

  )
