(clojure.core/ns
 styles.definitions.globals.site
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "global"))
(def element (clojure.core/str "site"))
(defstyles
 root
 ["html" {"height" (clojure.core/str "100%")}]
 ["body" {"height" (clojure.core/str "100%")}]
 ["html" {"font-size" (clojure.core/str emSize)}]
 ["body"
  {"min-width" (clojure.core/str pageMinWidth),
   "line-height" (clojure.core/str lineHeight),
   "font-family" (clojure.core/str pageFont),
   "margin" (clojure.core/str "0px"),
   "font-smoothing" (clojure.core/str fontSmoothing),
   "padding" (clojure.core/str "0px"),
   "overflow-x" (clojure.core/str pageOverflowX),
   "font-size" (clojure.core/str fontSize),
   "background" (clojure.core/str pageBackground),
   "color" (clojure.core/str textColor)}]
 ["h1"
  {"font-family" (clojure.core/str headerFont),
   "line-height" (clojure.core/str headerLineHeight),
   "margin" (clojure.core/str headerMargin),
   "font-weight" (clojure.core/str headerFontWeight),
   "padding" (clojure.core/str "0em")}]
 ["h2"
  {"font-family" (clojure.core/str headerFont),
   "line-height" (clojure.core/str headerLineHeight),
   "margin" (clojure.core/str headerMargin),
   "font-weight" (clojure.core/str headerFontWeight),
   "padding" (clojure.core/str "0em")}]
 ["h3"
  {"font-family" (clojure.core/str headerFont),
   "line-height" (clojure.core/str headerLineHeight),
   "margin" (clojure.core/str headerMargin),
   "font-weight" (clojure.core/str headerFontWeight),
   "padding" (clojure.core/str "0em")}]
 ["h4"
  {"font-family" (clojure.core/str headerFont),
   "line-height" (clojure.core/str headerLineHeight),
   "margin" (clojure.core/str headerMargin),
   "font-weight" (clojure.core/str headerFontWeight),
   "padding" (clojure.core/str "0em")}]
 ["h5"
  {"font-family" (clojure.core/str headerFont),
   "line-height" (clojure.core/str headerLineHeight),
   "margin" (clojure.core/str headerMargin),
   "font-weight" (clojure.core/str headerFontWeight),
   "padding" (clojure.core/str "0em")}]
 ["h1"
  {"min-height" (clojure.core/str "11" " " "rem"),
   "font-size" (clojure.core/str h1)}]
 ["h2" {"font-size" (clojure.core/str h2)}]
 ["h3" {"font-size" (clojure.core/str h3)}]
 ["h4" {"font-size" (clojure.core/str h4)}]
 ["h5" {"font-size" (clojure.core/str h5)}]
 ["h1:first-child" {"margin-top" (clojure.core/str "0em")}]
 ["h2:first-child" {"margin-top" (clojure.core/str "0em")}]
 ["h3:first-child" {"margin-top" (clojure.core/str "0em")}]
 ["h4:first-child" {"margin-top" (clojure.core/str "0em")}]
 ["h5:first-child" {"margin-top" (clojure.core/str "0em")}]
 ["h1:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 ["h2:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 ["h3:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 ["h4:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 ["h5:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 ["p"
  {"margin" (clojure.core/str paragraphMargin),
   "line-height" (clojure.core/str paragraphLineHeight)}]
 ["p:first-child" {"margin-top" (clojure.core/str "0em")}]
 ["p:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 ["a"
  {"color" (clojure.core/str linkColor),
   "text-decoration" (clojure.core/str linkUnderline)}]
 ["a:hover"
  {"color" (clojure.core/str linkHoverColor),
   "text-decoration" (clojure.core/str linkHoverUnderline)}]
 [":-webkit-scrollbar-track"
  {"background" (clojure.core/str trackInvertedBackground)}]
 [":-webkit-scrollbar-thumb"
  {"background" (clojure.core/str thumbInvertedBackground)}]
 [":-webkit-scrollbar-thumb"
  {"background" (clojure.core/str thumbInvertedInactiveBackground)}]
 [":-webkit-scrollbar-thumb"
  {"background" (clojure.core/str thumbInvertedHoverBackground)}])
