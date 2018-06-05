(ns semantic-garden.core
  (:require ;;[clj-antlr.core :as antlr]
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


(comment
  (with-open [output (clojure.java.io/writer "out.stream" :encoding "UTF-8")]
    (let [is (ANTLRInputStream. (slurp (io/resource "Semantic-UI/src/definitions/collections/form.less")))
          lessLexer (LessLexer. is)
          tokenStream (CommonTokenStream. lessLexer)
          tokenParser (LessParser. tokenStream)
          lessListener (LessParserBaseListener. )
          stylesheet (.stylesheet tokenParser)
          ]
      (.walk ParseTreeWalker/DEFAULT lessListener stylesheet)))


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
