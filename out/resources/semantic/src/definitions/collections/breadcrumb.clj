((clojure.core/ns
  definitions.collections.breadcrumb
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'collection'")
 (def element "'breadcrumb'")
 (defstyles
  root
  [".ui.breadcrumb"
   {"line-height" (clojure.core/str "11"),
    "display" (clojure.core/str display),
    "margin" (clojure.core/str verticalMargin " " "0em"),
    "vertical-align" (clojure.core/str verticalAlign)}]
  [".ui.breadcrumb:first-child"
   {"margin-top" (clojure.core/str "0em")}]
  [".ui.breadcrumb:last-child"
   {"margin-bottom" (clojure.core/str "0em")}]
  [".ui.breadcrumb"
   [".divider"
    {"display" (clojure.core/str "inline-block"),
     "opacity" (clojure.core/str dividerOpacity),
     "margin" (clojure.core/str "0em" " " dividerSpacing " " "0em"),
     "font-size" (clojure.core/str dividerSize),
     "color" (clojure.core/str dividerColor),
     "vertical-align" (clojure.core/str dividerVerticalAlign)}]]
  [".ui.breadcrumb" ["a" {"color" (clojure.core/str linkColor)}]]
  [".ui.breadcrumb"
   ["a:hover" {"color" (clojure.core/str linkHoverColor)}]]
  [".ui.breadcrumb"
   [".icon.divider"
    {"font-size" (clojure.core/str iconDividerSize),
     "vertical-align" (clojure.core/str iconDividerVerticalAlign)}]]
  [".ui.breadcrumb"
   ["a.section" {"cursor" (clojure.core/str "pointer")}]]
  [".ui.breadcrumb"
   [".section"
    {"display" (clojure.core/str "inline-block"),
     "margin" (clojure.core/str sectionMargin),
     "padding" (clojure.core/str sectionPadding)}]]
  [".ui.breadcrumb.segment"
   {"display" (clojure.core/str "inline-block"),
    "padding" (clojure.core/str segmentPadding)}]
  [".ui.breadcrumb"
   [".active.section"
    {"font-weight" (clojure.core/str activeFontWeight)}]]
  [".ui.mini.breadcrumb" {"font-size" (clojure.core/str mini)}]
  [".ui.tiny.breadcrumb" {"font-size" (clojure.core/str tiny)}]
  [".ui.small.breadcrumb" {"font-size" (clojure.core/str small)}]
  [".ui.breadcrumb" {"font-size" (clojure.core/str medium)}]
  [".ui.large.breadcrumb" {"font-size" (clojure.core/str large)}]
  [".ui.big.breadcrumb" {"font-size" (clojure.core/str big)}]
  [".ui.huge.breadcrumb" {"font-size" (clojure.core/str huge)}]
  [".ui.massive.breadcrumb" {"font-size" (clojure.core/str massive)}]))
