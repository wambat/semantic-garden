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
 [".ui.attached.icon.message" {"width" (clojure.core/str "auto")}]
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
  [".header" {"color" (clojure.core/str yellowHeaderColor)}]]
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
