(ns semantic-garden.core
  (:require [clj-antlr.coerce :as antlr.coerce]
            [com.rpl.specter :as sp]
            [clojure.java.io :as io]
            [clojure.string :as str])
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
(defn unq [n]
  (let [nn (str/replace n #"\'" "")]
    nn))

(defn import-path [n]
  (symbol(unq n)))

(defn translate-imports [ss]
  (when-let [imports (sp/select [sp/ALL
                                 (sp/pred (sexpr-named? :statement))
                                 (sp/nthpath 1)
                                 (sp/pred (sexpr-named? :importDeclaration))]
                                ss)]
    `(:require
      [garden.def :refer [~(symbol "defstyles")]]
      [garden.stylesheet :refer [~(symbol "at-media")]]
      [garden.selectors :as ~(symbol "sel")]
      [garden.units :refer [~(symbol "px")]]
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
    (println declarations)
    (map (fn [i]
           ;; (println i)
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
             `(def ~(symbol (unq var)) ~(unq val))))
         declarations)))

(defn translate-selector [ss]
  (let [chunks (map rest ss)]
    (loop [chunks chunks
           path []]
      (if (pos? (count chunks))
        (let [ch (ffirst chunks)]
          ;; (println "CHUNK")
          ;; (println (ffirst chunks))
          ;; (println (first chunks))
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
             (update-in path [(- (count path) 1)] #(apply str % (rest ch))))
            (and
             (seq? ch)
             (= :selectorPrefix (first ch)))
            (recur
             (rest chunks)
             (conj path (str (last ch)
                             " "
                             (last (last (first chunks))))))
            ))
        path))))

(defn fold-in-block [s block]
  (reduce (fn [acc i]
            (if (nil? acc)
                [i block]
                [i acc])
            ) nil (reverse s)))

(defn translate-selectors [ss]
  (let [forms (sp/select [sp/ALL
                          (sp/pred (sexpr-named? :selector))]
                         (first ss))]

    (map translate-selector
         (map rest forms))))

(defn translate-expression [ss]
  ;; (println "EXPR")
  ;; (println (map rest ss))
  (let [chunks (map rest ss)
        pimp (fn [i s]
               (if (= " !important" i)
                 [s i]
                 [s]))]
    (loop [chunks chunks
           props []]
      (if (pos? (count chunks))
        (let [ch (ffirst chunks)
              imp (last (first chunks))]
          ;; (println "PROP")
          ;; (println ch imp)
          (cond
            (and
             (seq? ch)
             (= :identifier (first ch)))
            (recur
             (rest chunks)
             (conj props (pimp imp (last ch))))
            (and
             (seq? ch)
             (= :measurement (first ch)))
            (recur
             (rest chunks)
             (conj props (pimp imp
                               (str (second ch)
                                       (last ch)))))
            (and
             (seq? ch)
             (= :variableName (first ch)))
            (recur
             (rest chunks)
             (conj props (pimp imp (symbol (last ch)))))
            ))
        `(str ~@(flatten (interpose " " props))))))
  )
(defn translate-property [ss]
  (let [identifier (sp/select-first [sp/ALL
                                     (sp/pred (sexpr-named? :identifier))]
                                    ss)
        val (rest (sp/select-first [sp/ALL
                                    (sp/pred (sexpr-named? :values))
                                    sp/LAST
                                    (sp/pred (sexpr-named? :commandStatement))
                                    ]
                                   ss))
        ]
    {(last identifier) (translate-expression val)}))

(defn translate-block [ss]
  {:block :pock}
  ss
  (let [forms (sp/select [sp/ALL
                          (sp/pred (sexpr-named? :property))
                          ;; (sp/srange 1 999)
                          ]
                         ss)]
    (map translate-property forms)))

(defn make-defstyles [rulesets]
  `(~(symbol "defstyles") ~(symbol "root") ~@(map first rulesets)))

(defn translate-rulesets [ss]
  (when-let [declarations (sp/select [sp/ALL
                                      (sp/pred (sexpr-named? :statement))
                                      (sp/nthpath 1)
                                      (sp/pred (sexpr-named? :ruleset))]
                                     ss)]
    (make-defstyles
     (map (fn [i]
            (let [selectors (sp/select [sp/ALL
                                        (sp/pred (sexpr-named? :selectors))]
                                       i)
                  block (sp/select-first [sp/ALL
                                          (sp/pred (sexpr-named? :block))
                                          ]
                                         i)]
              ;; (println selectors)
              ;; (concat (translate-selectors selectors)
              ;;         )
              (let [tblock (apply merge (translate-block block))]
                (map #(fold-in-block % tblock) (translate-selectors selectors)))
              )) declarations))))

(defn translate-stylesheet
  [filename ss]
  `((ns ~(symbol filename)
      ~(translate-imports (rest ss)))
    ~@(translate-variables (rest ss))
    ;;DEFSTYLES
    ;; ("I'm not working without this line")
    ~(translate-rulesets (rest ss))
    ))

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
