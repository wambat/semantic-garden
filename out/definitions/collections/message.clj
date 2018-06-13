(clojure.core/ns
 definitions.collections.message
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "collection"))
(def element (clojure.core/str "message"))
(defstyles
 root
 [".ui.message"
  {"line-height" (clojure.core/str lineHeight),
   "margin" (clojure.core/str verticalMargin " " "0em"),
   "padding" (clojure.core/str padding),
   "position" (clojure.core/str "relative"),
   "min-height" (clojure.core/str "1em"),
   "box-shadow" (clojure.core/str boxShadow),
   "border-radius" (clojure.core/str borderRadius),
   "transition" (clojure.core/str transition),
   "background" (clojure.core/str background),
   "color" (clojure.core/str textColor)}]
 [".ui.message:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.message:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.message"
  [".header"
   {"display" (clojure.core/str headerDisplay),
    "font-family" (clojure.core/str headerFont),
    "font-weight" (clojure.core/str headerFontWeight),
    "margin" (clojure.core/str headerMargin)}]]
 [".ui.message"
  [".header:not([.ui])"
   {"font-size" (clojure.core/str headerFontSize)}]]
 [".ui.message"
  ["p"
   {"opacity" (clojure.core/str messageTextOpacity),
    "margin" (clojure.core/str messageParagraphMargin " " "0em")}]]
 [".ui.message"
  ["p:first-child" {"margin-top" (clojure.core/str "0em")}]]
 [".ui.message"
  ["p:last-child" {"margin-bottom" (clojure.core/str "0em")}]]
 [".ui.message"
  [".header"
   ["+ p" {"margin-top" (clojure.core/str headerParagraphDistance)}]]]
 [".ui.message"
  [".list:not([.ui])"
   {"text-align" (clojure.core/str "left"),
    "padding" (clojure.core/str "0em"),
    "opacity" (clojure.core/str listOpacity),
    "list-style-position" (clojure.core/str listStylePosition),
    "margin" (clojure.core/str listMargin " " "0em" " " "0em")}]]
 [".ui.message"
  [".list:not([.ui]):first-child"
   {"margin-top" (clojure.core/str "0em")}]]
 [".ui.message"
  [".list:not([.ui]):last-child"
   {"margin-bottom" (clojure.core/str "0em")}]]
 [".ui.message"
  [".list:not([.ui])"
   ["li"
    {"position" (clojure.core/str "relative"),
     "list-style-type" (clojure.core/str "none"),
     "margin"
     (clojure.core/str
      "0em"
      " "
      "0em"
      " "
      listItemMargin
      " "
      listItemIndent),
     "padding" (clojure.core/str "0em")}]]]
 [".ui.message"
  [".list:not([.ui])"
   ["li:before"
    {"position" (clojure.core/str "absolute"),
     "content" (clojure.core/str "•"),
     "left" (clojure.core/str "-1em"),
     "height" (clojure.core/str "100%"),
     "vertical-align" (clojure.core/str "baseline")}]]]
 [".ui.message"
  [".list:not([.ui])"
   ["li:last-child" {"margin-bottom" (clojure.core/str "0em")}]]]
 [".ui.message"
  ["> .icon" {"margin-right" (clojure.core/str iconDistance)}]]
 [".ui.message"
  ["> .close.icon"
   {"cursor" (clojure.core/str "pointer"),
    "position" (clojure.core/str "absolute"),
    "margin" (clojure.core/str "0em"),
    "top" (clojure.core/str closeTopDistance),
    "right" (clojure.core/str closeRightDistance),
    "opacity" (clojure.core/str closeOpacity),
    "transition" (clojure.core/str closeTransition)}]]
 [".ui.message"
  ["> .close.icon:hover" {"opacity" (clojure.core/str "11")}]]
 [":first-child" {"margin-top" (clojure.core/str "0em")}]
 [":last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.dropdown" [".menu" ["> .message" {"margin" nil}]]]
 [".ui.visible.visible.visible.visible.message"
  {"display" (clojure.core/str "block")}]
 [".ui.icon.visible.visible.visible.visible.message"
  {"display" (clojure.core/str "flex")}]
 [".ui.hidden.hidden.hidden.hidden.message"
  {"display" (clojure.core/str "none")}]
 [".ui.compact.message" {"display" (clojure.core/str "inline-block")}]
 [".ui.compact.icon.message"
  {"display" (clojure.core/str "inline-flex")}]
 [".ui.attached.message"
  {"margin-bottom" (clojure.core/str attachedYOffset),
   "border-radius"
   (clojure.core/str
    borderRadius
    " "
    borderRadius
    " "
    "0em"
    " "
    "0em"),
   "box-shadow" (clojure.core/str attachedBoxShadow),
   "margin-left" (clojure.core/str attachedXOffset),
   "margin-right" (clojure.core/str attachedXOffset)}]
 [".ui.attached"
  ["+ .ui.attached.message:not([.top]):not([.bottom])"
   {"margin-top" (clojure.core/str attachedYOffset),
    "border-radius" (clojure.core/str "0em")}]]
 [".ui.bottom.attached.message"
  {"margin-top" (clojure.core/str attachedYOffset),
   "border-radius"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    borderRadius
    " "
    borderRadius),
   "box-shadow" (clojure.core/str attachedBottomBoxShadow)}]
 [".ui.bottom.attached.message:not([:last-child])"
  {"margin-bottom" (clojure.core/str verticalMargin)}]
 [".ui.attached.icon.message" {"width" (clojure.core/str "auto")}]EXPR
(((:identifier block)))
PROP
(:identifier block)
EXPR
(((:measurement 0)) ((:measurement 0)) ((:identifier auto)))
PROP
(:measurement 0)
PROP
(:measurement 0)
PROP
(:identifier auto)
EXPR
(((:identifier auto)))
PROP
(:identifier auto)
EXPR
(((:measurement 1)))
PROP
(:measurement 1)
EXPR
(((:variableName @ iconVerticalAlign)))
PROP
(:variableName @ iconVerticalAlign)
EXPR
(((:variableName @ iconSize)))
PROP
(:variableName @ iconSize)
EXPR
(((:variableName @ iconOpacity)))
PROP
(:variableName @ iconOpacity)
EXPR
(((:identifier block)))
PROP
(:identifier block)
EXPR
(((:measurement 1)) ((:measurement 1)) ((:identifier auto)))
PROP
(:measurement 1)
PROP
(:measurement 1)
PROP
(:identifier auto)
EXPR
(((:variableName @ iconVerticalAlign)))
PROP
(:variableName @ iconVerticalAlign)
EXPR
(((:variableName @ iconContentDistance)))
PROP
(:variableName @ iconContentDistance)
EXPR
(((:measurement 1 em)))
PROP
(:measurement 1 em)
EXPR
(((:variableName @ floatingBoxShadow)))
PROP
(:variableName @ floatingBoxShadow)
EXPR
(((:variableName @ black)))
PROP
(:variableName @ black)
EXPR
(((:variableName @ invertedTextColor)))
PROP
(:variableName @ invertedTextColor)
EXPR
(((:variableName @ positiveBackgroundColor)))
PROP
(:variableName @ positiveBackgroundColor)
EXPR
(((:variableName @ positiveTextColor)))
PROP
(:variableName @ positiveTextColor)
EXPR
(((:variableName @ positiveBoxShadow)))
PROP
(:variableName @ positiveBoxShadow)
EXPR
(((:variableName @ positiveHeaderColor)))
PROP
(:variableName @ positiveHeaderColor)
EXPR
(((:variableName @ negativeBackgroundColor)))
PROP
(:variableName @ negativeBackgroundColor)
EXPR
(((:variableName @ negativeTextColor)))
PROP
(:variableName @ negativeTextColor)
EXPR
(((:variableName @ negativeBoxShadow)))
PROP
(:variableName @ negativeBoxShadow)
EXPR
(((:variableName @ negativeHeaderColor)))
PROP
(:variableName @ negativeHeaderColor)
EXPR
(((:variableName @ infoBackgroundColor)))
PROP
(:variableName @ infoBackgroundColor)
EXPR
(((:variableName @ infoTextColor)))
PROP
(:variableName @ infoTextColor)
EXPR
(((:variableName @ infoBoxShadow)))
PROP
(:variableName @ infoBoxShadow)
EXPR
(((:variableName @ infoHeaderColor)))
PROP
(:variableName @ infoHeaderColor)
EXPR
(((:variableName @ warningBackgroundColor)))
PROP
(:variableName @ warningBackgroundColor)
EXPR
(((:variableName @ warningTextColor)))
PROP
(:variableName @ warningTextColor)
EXPR
(((:variableName @ warningBoxShadow)))
PROP
(:variableName @ warningBoxShadow)
EXPR
(((:variableName @ warningHeaderColor)))
PROP
(:variableName @ warningHeaderColor)
EXPR
(((:variableName @ errorBackgroundColor)))
PROP
(:variableName @ errorBackgroundColor)
EXPR
(((:variableName @ errorTextColor)))
PROP
(:variableName @ errorTextColor)
EXPR
(((:variableName @ errorBoxShadow)))
PROP
(:variableName @ errorBoxShadow)
EXPR
(((:variableName @ errorHeaderColor)))
PROP
(:variableName @ errorHeaderColor)
EXPR
(((:variableName @ successBackgroundColor)))
PROP
(:variableName @ successBackgroundColor)
EXPR
(((:variableName @ successTextColor)))
PROP
(:variableName @ successTextColor)
EXPR
(((:variableName @ successBoxShadow)))
PROP
(:variableName @ successBoxShadow)
EXPR
(((:variableName @ successHeaderColor)))
PROP
(:variableName @ successHeaderColor)
EXPR
(((:variableName @ black)))
PROP
(:variableName @ black)
EXPR
(((:variableName @ invertedTextColor)))
PROP
(:variableName @ invertedTextColor)
EXPR
(((:variableName @ redBackground)))
PROP
(:variableName @ redBackground)
EXPR
(((:variableName @ redTextColor)))
PROP
(:variableName @ redTextColor)
EXPR
(((:variableName @ redBoxShadow)))
PROP
(:variableName @ redBoxShadow)
EXPR
(((:variableName @ redHeaderColor)))
PROP
(:variableName @ redHeaderColor)
EXPR
(((:variableName @ orangeBackground)))
PROP
(:variableName @ orangeBackground)
EXPR
(((:variableName @ orangeTextColor)))
PROP
(:variableName @ orangeTextColor)
EXPR
(((:variableName @ orangeBoxShadow)))
PROP
(:variableName @ orangeBoxShadow)
EXPR
(((:variableName @ orangeHeaderColor)))
PROP
(:variableName @ orangeHeaderColor)
EXPR
(((:variableName @ yellowBackground)))
PROP
(:variableName @ yellowBackground)
EXPR
(((:variableName @ yellowTextColor)))
PROP
(:variableName @ yellowTextColor)
EXPR
(((:variableName @ yellowBoxShadow)))
PROP
(:variableName @ yellowBoxShadow)
EXPR
(((:variableName @ yellowHeaderColor)))
PROP
(:variableName @ yellowHeaderColor)
EXPR
(((:variableName @ oliveBackground)))
PROP
(:variableName @ oliveBackground)
EXPR
(((:variableName @ oliveTextColor)))
PROP
(:variableName @ oliveTextColor)
EXPR
(((:variableName @ oliveBoxShadow)))
PROP
(:variableName @ oliveBoxShadow)

 [".ui.icon.message"
  {"display" (clojure.core/str "flex"),
   "width" (clojure.core/str "100%"),
   "align-items" (clojure.core/str "center")}]
 [".ui.icon.message"
  ["> .icon:not([.close])"
   {"display" (clojure.core/str "block"),
    "flex" (clojure.core/str "00" " " "00" " " "auto"),
    "width" (clojure.core/str "auto"),
    "line-height" (clojure.core/str "11"),
    "vertical-align" (clojure.core/str iconVerticalAlign),
    "font-size" (clojure.core/str iconSize),
    "opacity" (clojure.core/str iconOpacity)}]]
 [".ui.icon.message"
  ["> .content"
   {"display" (clojure.core/str "block"),
    "flex" (clojure.core/str "11" " " "11" " " "auto"),
    "vertical-align" (clojure.core/str iconVerticalAlign)}]]
 [".ui.icon.message"
  [".icon:not([.close])"
   ["+ .content"
    {"padding-left" (clojure.core/str iconContentDistance)}]]]
 [".ui.icon.message"
  [".circular.icon" {"width" (clojure.core/str "1em")}]]
 [".ui.floating.message"
  {"box-shadow" (clojure.core/str floatingBoxShadow)}]
 [".ui.black.message"
  {"background-color" (clojure.core/str black),
   "color" (clojure.core/str invertedTextColor)}]
 [".ui.positive.message"
  {"background-color" (clojure.core/str positiveBackgroundColor),
   "color" (clojure.core/str positiveTextColor)}]
 [".ui.positive.message"
  {"box-shadow" (clojure.core/str positiveBoxShadow)}]
 [".ui.attached.positive.message"
  {"box-shadow" (clojure.core/str positiveBoxShadow)}]
 [".ui.positive.message"
  [".header" {"color" (clojure.core/str positiveHeaderColor)}]]
 [".ui.negative.message"
  {"background-color" (clojure.core/str negativeBackgroundColor),
   "color" (clojure.core/str negativeTextColor)}]
 [".ui.negative.message"
  {"box-shadow" (clojure.core/str negativeBoxShadow)}]
 [".ui.attached.negative.message"
  {"box-shadow" (clojure.core/str negativeBoxShadow)}]
 [".ui.negative.message"
  [".header" {"color" (clojure.core/str negativeHeaderColor)}]]
 [".ui.info.message"
  {"background-color" (clojure.core/str infoBackgroundColor),
   "color" (clojure.core/str infoTextColor)}]
 [".ui.info.message" {"box-shadow" (clojure.core/str infoBoxShadow)}]
 [".ui.attached.info.message"
  {"box-shadow" (clojure.core/str infoBoxShadow)}]
 [".ui.info.message"
  [".header" {"color" (clojure.core/str infoHeaderColor)}]]
 [".ui.warning.message"
  {"background-color" (clojure.core/str warningBackgroundColor),
   "color" (clojure.core/str warningTextColor)}]
 [".ui.warning.message"
  {"box-shadow" (clojure.core/str warningBoxShadow)}]
 [".ui.attached.warning.message"
  {"box-shadow" (clojure.core/str warningBoxShadow)}]
 [".ui.warning.message"
  [".header" {"color" (clojure.core/str warningHeaderColor)}]]
 [".ui.error.message"
  {"background-color" (clojure.core/str errorBackgroundColor),
   "color" (clojure.core/str errorTextColor)}]
 [".ui.error.message" {"box-shadow" (clojure.core/str errorBoxShadow)}]
 [".ui.attached.error.message"
  {"box-shadow" (clojure.core/str errorBoxShadow)}]
 [".ui.error.message"
  [".header" {"color" (clojure.core/str errorHeaderColor)}]]
 [".ui.success.message"
  {"background-color" (clojure.core/str successBackgroundColor),
   "color" (clojure.core/str successTextColor)}]
 [".ui.success.message"
  {"box-shadow" (clojure.core/str successBoxShadow)}]
 [".ui.attached.success.message"
  {"box-shadow" (clojure.core/str successBoxShadow)}]
 [".ui.success.message"
  [".header" {"color" (clojure.core/str successHeaderColor)}]]
 [".ui.inverted.message"
  {"background-color" (clojure.core/str black),
   "color" (clojure.core/str invertedTextColor)}]
 [".ui.black.message"
  {"background-color" (clojure.core/str black),
   "color" (clojure.core/str invertedTextColor)}]
 [".ui.red.message"
  {"background-color" (clojure.core/str redBackground),
   "color" (clojure.core/str redTextColor),
   "box-shadow" (clojure.core/str redBoxShadow)}]
 [".ui.red.message"
  [".header" {"color" (clojure.core/str redHeaderColor)}]]
 [".ui.orange.message"
  {"background-color" (clojure.core/str orangeBackground),
   "color" (clojure.core/str orangeTextColor),
   "box-shadow" (clojure.core/str orangeBoxShadow)}]
 [".ui.orange.message"
  [".header" {"color" (clojure.core/str orangeHeaderColor)}]]
 [".ui.yellow.message"
  {"background-color" (clojure.core/str yellowBackground),
   "color" (clojure.core/str yellowTextColor),
   "box-shadow" (clojure.core/str yellowBoxShadow)}]
 [".ui.yellow.message"
  [".header" {"color" (clojure.core/str yellowHeaderColor)}]]EXPR
(((:variableName @ oliveHeaderColor)))
PROP
(:variableName @ oliveHeaderColor)
EXPR
(((:variableName @ greenBackground)))
PROP
(:variableName @ greenBackground)
EXPR
(((:variableName @ greenTextColor)))
PROP
(:variableName @ greenTextColor)
EXPR
(((:variableName @ greenBoxShadow)))
PROP
(:variableName @ greenBoxShadow)
EXPR
(((:variableName @ greenHeaderColor)))
PROP
(:variableName @ greenHeaderColor)
EXPR
(((:variableName @ tealBackground)))
PROP
(:variableName @ tealBackground)
EXPR
(((:variableName @ tealTextColor)))
PROP
(:variableName @ tealTextColor)
EXPR
(((:variableName @ tealBoxShadow)))
PROP
(:variableName @ tealBoxShadow)
EXPR
(((:variableName @ tealHeaderColor)))
PROP
(:variableName @ tealHeaderColor)
EXPR
(((:variableName @ blueBackground)))
PROP
(:variableName @ blueBackground)
EXPR
(((:variableName @ blueTextColor)))
PROP
(:variableName @ blueTextColor)
EXPR
(((:variableName @ blueBoxShadow)))
PROP
(:variableName @ blueBoxShadow)
EXPR
(((:variableName @ blueHeaderColor)))
PROP
(:variableName @ blueHeaderColor)
EXPR
(((:variableName @ violetBackground)))
PROP
(:variableName @ violetBackground)
EXPR
(((:variableName @ violetTextColor)))
PROP
(:variableName @ violetTextColor)
EXPR
(((:variableName @ violetBoxShadow)))
PROP
(:variableName @ violetBoxShadow)
EXPR
(((:variableName @ violetHeaderColor)))
PROP
(:variableName @ violetHeaderColor)
EXPR
(((:variableName @ purpleBackground)))
PROP
(:variableName @ purpleBackground)
EXPR
(((:variableName @ purpleTextColor)))
PROP
(:variableName @ purpleTextColor)
EXPR
(((:variableName @ purpleBoxShadow)))
PROP
(:variableName @ purpleBoxShadow)
EXPR
(((:variableName @ purpleHeaderColor)))
PROP
(:variableName @ purpleHeaderColor)
EXPR
(((:variableName @ pinkBackground)))
PROP
(:variableName @ pinkBackground)
EXPR
(((:variableName @ pinkTextColor)))
PROP
(:variableName @ pinkTextColor)
EXPR
(((:variableName @ pinkBoxShadow)))
PROP
(:variableName @ pinkBoxShadow)
EXPR
(((:variableName @ pinkHeaderColor)))
PROP
(:variableName @ pinkHeaderColor)
EXPR
(((:variableName @ brownBackground)))
PROP
(:variableName @ brownBackground)
EXPR
(((:variableName @ brownTextColor)))
PROP
(:variableName @ brownTextColor)
EXPR
(((:variableName @ brownBoxShadow)))
PROP
(:variableName @ brownBoxShadow)
EXPR
(((:variableName @ brownHeaderColor)))
PROP
(:variableName @ brownHeaderColor)
EXPR
(((:variableName @ relativeMini)))
PROP
(:variableName @ relativeMini)
EXPR
(((:variableName @ relativeTiny)))
PROP
(:variableName @ relativeTiny)
EXPR
(((:variableName @ relativeSmall)))
PROP
(:variableName @ relativeSmall)
EXPR
(((:variableName @ relativeMedium)))
PROP
(:variableName @ relativeMedium)
EXPR
(((:variableName @ relativeLarge)))
PROP
(:variableName @ relativeLarge)
EXPR
(((:variableName @ relativeBig)))
PROP
(:variableName @ relativeBig)
EXPR
(((:variableName @ relativeHuge)))
PROP
(:variableName @ relativeHuge)
EXPR
(((:variableName @ relativeMassive)))
PROP
(:variableName @ relativeMassive)

 [".ui.olive.message"
  {"background-color" (clojure.core/str oliveBackground),
   "color" (clojure.core/str oliveTextColor),
   "box-shadow" (clojure.core/str oliveBoxShadow)}]
 [".ui.olive.message"
  [".header" {"color" (clojure.core/str oliveHeaderColor)}]]
 [".ui.green.message"
  {"background-color" (clojure.core/str greenBackground),
   "color" (clojure.core/str greenTextColor),
   "box-shadow" (clojure.core/str greenBoxShadow)}]
 [".ui.green.message"
  [".header" {"color" (clojure.core/str greenHeaderColor)}]]
 [".ui.teal.message"
  {"background-color" (clojure.core/str tealBackground),
   "color" (clojure.core/str tealTextColor),
   "box-shadow" (clojure.core/str tealBoxShadow)}]
 [".ui.teal.message"
  [".header" {"color" (clojure.core/str tealHeaderColor)}]]
 [".ui.blue.message"
  {"background-color" (clojure.core/str blueBackground),
   "color" (clojure.core/str blueTextColor),
   "box-shadow" (clojure.core/str blueBoxShadow)}]
 [".ui.blue.message"
  [".header" {"color" (clojure.core/str blueHeaderColor)}]]
 [".ui.violet.message"
  {"background-color" (clojure.core/str violetBackground),
   "color" (clojure.core/str violetTextColor),
   "box-shadow" (clojure.core/str violetBoxShadow)}]
 [".ui.violet.message"
  [".header" {"color" (clojure.core/str violetHeaderColor)}]]
 [".ui.purple.message"
  {"background-color" (clojure.core/str purpleBackground),
   "color" (clojure.core/str purpleTextColor),
   "box-shadow" (clojure.core/str purpleBoxShadow)}]
 [".ui.purple.message"
  [".header" {"color" (clojure.core/str purpleHeaderColor)}]]
 [".ui.pink.message"
  {"background-color" (clojure.core/str pinkBackground),
   "color" (clojure.core/str pinkTextColor),
   "box-shadow" (clojure.core/str pinkBoxShadow)}]
 [".ui.pink.message"
  [".header" {"color" (clojure.core/str pinkHeaderColor)}]]
 [".ui.brown.message"
  {"background-color" (clojure.core/str brownBackground),
   "color" (clojure.core/str brownTextColor),
   "box-shadow" (clojure.core/str brownBoxShadow)}]
 [".ui.brown.message"
  [".header" {"color" (clojure.core/str brownHeaderColor)}]]
 [".ui.mini.message" {"font-size" (clojure.core/str relativeMini)}]
 [".ui.tiny.message" {"font-size" (clojure.core/str relativeTiny)}]
 [".ui.small.message" {"font-size" (clojure.core/str relativeSmall)}]
 [".ui.message" {"font-size" (clojure.core/str relativeMedium)}]
 [".ui.large.message" {"font-size" (clojure.core/str relativeLarge)}]
 [".ui.big.message" {"font-size" (clojure.core/str relativeBig)}]
 [".ui.huge.message" {"font-size" (clojure.core/str relativeHuge)}]
 [".ui.massive.message"
  {"font-size" (clojure.core/str relativeMassive)}])
