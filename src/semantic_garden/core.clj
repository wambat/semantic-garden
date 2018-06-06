(ns semantic-garden.core
  (:require [clj-antlr.coerce :as antlr.coerce]
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

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

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

(defn parse-file [filename]
  (let [output (atom {})
        root "Semantic-UI/src/definitions/"
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
    @output))
(defn parse-file-tree [filename]
  (let [output (atom {})
        root "Semantic-UI/src/definitions/"
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
                               :parser tokenParser})))
(comment
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
