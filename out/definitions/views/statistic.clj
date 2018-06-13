(clojure.core/ns
 definitions.views.statistic
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type nil)
(def element nil)
(defstyles
 root
 [".ui.statistic"
  {"display" (clojure.core/str "inline-flex"),
   "flex-direction" (clojure.core/str "column"),
   "margin" (clojure.core/str margin),
   "max-width" (clojure.core/str maxWidth)}]
 [".ui.statistic"
  ["+ .ui.statistic"
   {"margin"
    (clojure.core/str
     "0em"
     " "
     "0em"
     " "
     "0em"
     " "
     horizontalSpacing)}]]
 [".ui.statistic:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.statistic:last-child"
  {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.statistics"
  {"display" (clojure.core/str "flex"),
   "align-items" (clojure.core/str "flex-start"),
   "flex-wrap" (clojure.core/str "wrap")}]
 [".ui.statistics"
  ["> .statistic"
   {"display" (clojure.core/str "inline-flex"),
    "flex" (clojure.core/str "00" " " "11" " " "auto"),
    "flex-direction" (clojure.core/str "column"),
    "margin" (clojure.core/str elementMargin),
    "max-width" (clojure.core/str elementMaxWidth)}]]
 [".ui.statistics"
  {"display" (clojure.core/str "flex"),
   "margin" (clojure.core/str groupMargin)}]
 [".ui.statistics:after"
  {"display" (clojure.core/str "block"),
   "content" nil,
   "height" (clojure.core/str "0px"),
   "clear" (clojure.core/str "both"),
   "overflow" (clojure.core/str "hidden"),
   "visibility" (clojure.core/str "hidden")}]
 [".ui.statistics:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.statistics:last-child"
  {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.statistics"
  [".statistic"
   ["> .value"
    {"font-family" (clojure.core/str valueFont),
     "font-size" (clojure.core/str valueSize),
     "font-weight" (clojure.core/str valueFontWeight),
     "line-height" (clojure.core/str valueLineHeight),
     "color" (clojure.core/str valueColor),
     "text-transform" (clojure.core/str valueTextTransform),
     "text-align" (clojure.core/str textAlign)}]]]
 [".ui.statistic"
  ["> .value"
   {"font-family" (clojure.core/str valueFont),
    "font-size" (clojure.core/str valueSize),
    "font-weight" (clojure.core/str valueFontWeight),
    "line-height" (clojure.core/str valueLineHeight),
    "color" (clojure.core/str valueColor),
    "text-transform" (clojure.core/str valueTextTransform),
    "text-align" (clojure.core/str textAlign)}]]
 [".ui.statistics"
  [".statistic"
   ["> .label"
    {"font-family" (clojure.core/str labelFont),
     "font-size" (clojure.core/str labelSize),
     "font-weight" (clojure.core/str labelFontWeight),
     "color" (clojure.core/str labelColor),
     "text-transform" (clojure.core/str labelTextTransform),
     "text-align" (clojure.core/str textAlign)}]]]
 [".ui.statistic"
  ["> .label"
   {"font-family" (clojure.core/str labelFont),
    "font-size" (clojure.core/str labelSize),
    "font-weight" (clojure.core/str labelFontWeight),
    "color" (clojure.core/str labelColor),
    "text-transform" (clojure.core/str labelTextTransform),
    "text-align" (clojure.core/str textAlign)}]]
 [".ui.statistics"
  [".statistic"
   ["> .label"
    ["~ .value" {"margin-top" (clojure.core/str topLabelDistance)}]]]]
 [".ui.statistic"
  ["> .label"
   ["~ .value" {"margin-top" (clojure.core/str topLabelDistance)}]]]
 [".ui.statistics"
  [".statistic"
   ["> .value"
    ["~ .label"
     {"margin-top" (clojure.core/str bottomLabelDistance)}]]]]
 [".ui.statistic"
  ["> .value"
   ["~ .label" {"margin-top" (clojure.core/str bottomLabelDistance)}]]]
 [".ui.statistics"
  [".statistic"
   ["> .value"
    [".icon"
     {"opacity" (clojure.core/str "11"),
      "width" (clojure.core/str "auto"),
      "margin" (clojure.core/str "0em")}]]]]
 [".ui.statistic"
  ["> .value"
   [".icon"
    {"opacity" (clojure.core/str "11"),
     "width" (clojure.core/str "auto"),
     "margin" (clojure.core/str "0em")}]]]
 [".ui.statistics"
  [".statistic"
   ["> .text.value"
    {"line-height" (clojure.core/str textValueLineHeight),
     "min-height" (clojure.core/str textValueMinHeight),
     "font-weight" (clojure.core/str textValueFontWeight),
     "text-align" (clojure.core/str "center")}]]]
 [".ui.statistic"
  ["> .text.value"
   {"line-height" (clojure.core/str textValueLineHeight),
    "min-height" (clojure.core/str textValueMinHeight),
    "font-weight" (clojure.core/str textValueFontWeight),
    "text-align" (clojure.core/str "center")}]]
 [".ui.statistics"
  [".statistic"
   ["> .text.value"
    ["+ .label" {"text-align" (clojure.core/str "center")}]]]]
 [".ui.statistic"
  ["> .text.value"
   ["+ .label" {"text-align" (clojure.core/str "center")}]]]
 [".ui.statistics"
  [".statistic"
   ["> .value"
    ["img"
     {"max-height" (clojure.core/str imageHeight),
      "vertical-align" (clojure.core/str imageVerticalAlign)}]]]]
 [".ui.statistic"
  ["> .value"
   ["img"
    {"max-height" (clojure.core/str imageHeight),
     "vertical-align" (clojure.core/str imageVerticalAlign)}]]]
 [".ui.ten.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.ten.statistics"
  [".statistic"
   {"min-width" (clojure.core/str tenColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.nine.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.nine.statistics"
  [".statistic"
   {"min-width" (clojure.core/str nineColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.eight.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.eight.statistics"
  [".statistic"
   {"min-width" (clojure.core/str eightColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.seven.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.seven.statistics"
  [".statistic"
   {"min-width" (clojure.core/str sevenColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.six.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.six.statistics"
  [".statistic"
   {"min-width" (clojure.core/str sixColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.five.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.five.statistics"
  [".statistic"
   {"min-width" (clojure.core/str fiveColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.four.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.four.statistics"
  [".statistic"
   {"min-width" (clojure.core/str fourColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.three.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.three.statistics"
  [".statistic"
   {"min-width" (clojure.core/str threeColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.two.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.two.statistics"
  [".statistic"
   {"min-width" (clojure.core/str twoColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.one.statistics" {"margin" (clojure.core/str itemGroupMargin)}]
 [".ui.one.statistics"
  [".statistic"
   {"min-width" (clojure.core/str oneColumn),
    "margin" (clojure.core/str itemMargin)}]]
 [".ui.horizontal.statistic"
  {"flex-direction" (clojure.core/str "row"),
   "align-items" (clojure.core/str "center")}]
 [".ui.horizontal.statistics"
  {"flex-direction" (clojure.core/str "column"),
   "margin" (clojure.core/str "0em"),
   "max-width" (clojure.core/str "none")}]
 [".ui.horizontal.statistics"
  [".statistic"
   {"flex-direction" (clojure.core/str "row"),
    "align-items" (clojure.core/str "center"),
    "max-width" (clojure.core/str "none"),
    "margin" (clojure.core/str horizontalGroupElementMargin)}]]
 [".ui.horizontal.statistic" ["> .text.value" nil]]
 [".ui.horizontal.statistics" ["> .statistic" ["> .text.value" nil]]]
 [".ui.horizontal.statistics"
  [".statistic"
   ["> .value" [".icon" {"width" (clojure.core/str iconWidth)}]]]]
 [".ui.horizontal.statistic"
  ["> .value" [".icon" {"width" (clojure.core/str iconWidth)}]]]
 [".ui.horizontal.statistics"
  [".statistic"
   ["> .value"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "middle")}]]]
 [".ui.horizontal.statistic"
  ["> .value"
   {"display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "middle")}]]
 [".ui.horizontal.statistics"
  [".statistic"
   ["> .label"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "middle"),
     "margin"
     (clojure.core/str
      "0em"
      " "
      "0em"
      " "
      "0em"
      " "
      horizontalLabelDistance)}]]]
 [".ui.horizontal.statistic"
  ["> .label"
   {"display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "middle"),
    "margin"
    (clojure.core/str
     "0em"
     " "
     "0em"
     " "
     "0em"
     " "
     horizontalLabelDistance)}]]
 [".ui.red.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str red)}]]]
 [".ui.statistics"
  [".red.statistic" ["> .value" {"color" (clojure.core/str red)}]]]
 [".ui.red.statistic" ["> .value" {"color" (clojure.core/str red)}]]
 [".ui.orange.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str orange)}]]]
 [".ui.statistics"
  [".orange.statistic"
   ["> .value" {"color" (clojure.core/str orange)}]]]
 [".ui.orange.statistic"
  ["> .value" {"color" (clojure.core/str orange)}]]
 [".ui.yellow.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str yellow)}]]]
 [".ui.statistics"
  [".yellow.statistic"
   ["> .value" {"color" (clojure.core/str yellow)}]]]
 [".ui.yellow.statistic"
  ["> .value" {"color" (clojure.core/str yellow)}]]
 [".ui.olive.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str olive)}]]]
 [".ui.statistics"
  [".olive.statistic" ["> .value" {"color" (clojure.core/str olive)}]]]
 [".ui.olive.statistic"
  ["> .value" {"color" (clojure.core/str olive)}]]
 [".ui.green.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str green)}]]]
 [".ui.statistics"
  [".green.statistic" ["> .value" {"color" (clojure.core/str green)}]]]
 [".ui.green.statistic"
  ["> .value" {"color" (clojure.core/str green)}]]
 [".ui.teal.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str teal)}]]]
 [".ui.statistics"
  [".teal.statistic" ["> .value" {"color" (clojure.core/str teal)}]]]
 [".ui.teal.statistic" ["> .value" {"color" (clojure.core/str teal)}]]
 [".ui.blue.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str blue)}]]]
 [".ui.statistics"
  [".blue.statistic" ["> .value" {"color" (clojure.core/str blue)}]]]
 [".ui.blue.statistic" ["> .value" {"color" (clojure.core/str blue)}]]
 [".ui.violet.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str violet)}]]]
 [".ui.statistics"
  [".violet.statistic"
   ["> .value" {"color" (clojure.core/str violet)}]]]
 [".ui.violet.statistic"
  ["> .value" {"color" (clojure.core/str violet)}]]
 [".ui.purple.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str purple)}]]]
 [".ui.statistics"
  [".purple.statistic"
   ["> .value" {"color" (clojure.core/str purple)}]]]
 [".ui.purple.statistic"
  ["> .value" {"color" (clojure.core/str purple)}]]
 [".ui.pink.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str pink)}]]]
 [".ui.statistics"
  [".pink.statistic" ["> .value" {"color" (clojure.core/str pink)}]]]
 [".ui.pink.statistic" ["> .value" {"color" (clojure.core/str pink)}]]
 [".ui.brown.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str brown)}]]]
 [".ui.statistics"
  [".brown.statistic" ["> .value" {"color" (clojure.core/str brown)}]]]
 [".ui.brown.statistic"
  ["> .value" {"color" (clojure.core/str brown)}]]
 [".ui.grey.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str grey)}]]]
 [".ui.statistics"
  [".grey.statistic" ["> .value" {"color" (clojure.core/str grey)}]]]
 [".ui.grey.statistic" ["> .value" {"color" (clojure.core/str grey)}]]
 [".ui.inverted.statistics"
  [".statistic"
   ["> .value" {"color" (clojure.core/str invertedValueColor)}]]]
 [".ui.inverted.statistic"
  [".value" {"color" (clojure.core/str invertedValueColor)}]]
 [".ui.inverted.statistics"
  [".statistic"
   ["> .label" {"color" (clojure.core/str invertedLabelColor)}]]]
 [".ui.inverted.statistic"
  [".label" {"color" (clojure.core/str invertedLabelColor)}]]
 [".ui.inverted.red.statistics"
  [".statistic" ["> .value" {"color" (clojure.core/str lightRed)}]]]
 ...)
