((clojure.core/ns
  definitions.elements.header
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'element'")
 (def element "'header'")
 (defstyles
  root
  [".ui.header"
   {"border" (clojure.core/str "none"),
    "margin" (clojure.core/str margin),
    "padding" (clojure.core/str verticalPadding " " horizontalPadding),
    "font-family" (clojure.core/str fontFamily),
    "font-weight" (clojure.core/str fontWeight),
    "line-height" (clojure.core/str lineHeight),
    "text-transform" (clojure.core/str textTransform),
    "color" (clojure.core/str textColor)}]
  [".ui.header:first-child"
   {"margin-top" (clojure.core/str firstMargin)}]
  [".ui.header:last-child"
   {"margin-bottom" (clojure.core/str lastMargin)}]
  [".ui.header"
   [".sub.header"
    {"display" (clojure.core/str "block"),
     "font-weight" (clojure.core/str normal),
     "padding" (clojure.core/str "0em"),
     "margin" (clojure.core/str subHeaderMargin),
     "font-size" (clojure.core/str subHeaderFontSize),
     "line-height" (clojure.core/str subHeaderLineHeight),
     "color" (clojure.core/str subHeaderColor)}]]
  [".ui.header"
   ["> .icon"
    {"display" (clojure.core/str "table-cell"),
     "opacity" (clojure.core/str iconOpacity),
     "font-size" (clojure.core/str iconSize),
     "padding-top" (clojure.core/str iconOffset),
     "vertical-align" (clojure.core/str iconAlignment)}]]
  [".ui.header"
   [".icon:only-child"
    {"display" (clojure.core/str "inline-block"),
     "padding" (clojure.core/str "0em"),
     "margin-right" (clojure.core/str iconMargin)}]]
  [".ui.header"
   ["> .image:not([\".icon\"])"
    {"display" (clojure.core/str "inline-block"),
     "margin-top" (clojure.core/str imageOffset),
     "width" (clojure.core/str imageWidth),
     "height" (clojure.core/str imageHeight),
     "vertical-align" (clojure.core/str imageAlignment)}]]
  [".ui.header"
   ["> img"
    {"display" (clojure.core/str "inline-block"),
     "margin-top" (clojure.core/str imageOffset),
     "width" (clojure.core/str imageWidth),
     "height" (clojure.core/str imageHeight),
     "vertical-align" (clojure.core/str imageAlignment)}]]
  [".ui.header"
   ["> .image:not([\".icon\"]):only-child"
    {"margin-right" (clojure.core/str imageMargin)}]]
  [".ui.header"
   ["> img:only-child"
    {"margin-right" (clojure.core/str imageMargin)}]]
  [".ui.header"
   [".content"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str contentAlignment)}]]
  [".ui.header"
   ["> img"
    ["+ .content"
     {"padding-left" (clojure.core/str imageMargin),
      "vertical-align" (clojure.core/str contentImageAlignment)}]]]
  [".ui.header"
   ["> .image"
    ["+ .content"
     {"padding-left" (clojure.core/str imageMargin),
      "vertical-align" (clojure.core/str contentImageAlignment)}]]]
  [".ui.header"
   ["> .icon"
    ["+ .content"
     {"padding-left" (clojure.core/str iconMargin),
      "display" (clojure.core/str "table-cell"),
      "vertical-align" (clojure.core/str contentIconAlignment)}]]]
  [".ui.header"
   [".ui.label"
    {"font-size" (clojure.core/str labelSize),
     "margin-left" (clojure.core/str labelDistance),
     "vertical-align" (clojure.core/str labelVerticalAlign)}]]
  [".ui.header"
   ["+ p" {"margin-top" (clojure.core/str nextParagraphDistance)}]]
  ["h1.ui.header" {"font-size" (clojure.core/str h1)}]
  ["h2.ui.header" {"font-size" (clojure.core/str h2)}]
  ["h3.ui.header" {"font-size" (clojure.core/str h3)}]
  ["h4.ui.header" {"font-size" (clojure.core/str h4)}]
  ["h5.ui.header" {"font-size" (clojure.core/str h5)}]
  ["h1.ui.header"
   [".sub.header"
    {"font-size" (clojure.core/str h1SubHeaderFontSize)}]]
  ["h2.ui.header"
   [".sub.header"
    {"font-size" (clojure.core/str h2SubHeaderFontSize)}]]
  ["h3.ui.header"
   [".sub.header"
    {"font-size" (clojure.core/str h3SubHeaderFontSize)}]]
  ["h4.ui.header"
   [".sub.header"
    {"font-size" (clojure.core/str h4SubHeaderFontSize)}]]
  ["h5.ui.header"
   [".sub.header"
    {"font-size" (clojure.core/str h5SubHeaderFontSize)}]]
  [".ui.huge.header"
   {"min-height" (clojure.core/str "1em"),
    "font-size" (clojure.core/str hugeFontSize)}]
  [".ui.large.header" {"font-size" (clojure.core/str largeFontSize)}]
  [".ui.medium.header" {"font-size" (clojure.core/str mediumFontSize)}]
  [".ui.small.header" {"font-size" (clojure.core/str smallFontSize)}]
  [".ui.tiny.header" {"font-size" (clojure.core/str tinyFontSize)}]
  [".ui.huge.header"
   [".sub.header"
    {"font-size" (clojure.core/str hugeSubHeaderFontSize)}]]
  [".ui.large.header"
   [".sub.header"
    {"font-size" (clojure.core/str hugeSubHeaderFontSize)}]]
  [".ui.header"
   [".sub.header" {"font-size" (clojure.core/str subHeaderFontSize)}]]
  [".ui.small.header"
   [".sub.header"
    {"font-size" (clojure.core/str smallSubHeaderFontSize)}]]
  [".ui.tiny.header"
   [".sub.header"
    {"font-size" (clojure.core/str tinySubHeaderFontSize)}]]
  [".ui.sub.header"
   {"padding" (clojure.core/str "0em"),
    "margin-bottom" (clojure.core/str subHeadingDistance),
    "font-weight" (clojure.core/str subHeadingFontWeight),
    "font-size" (clojure.core/str subHeadingFontSize),
    "text-transform" (clojure.core/str subHeadingTextTransform),
    "color" (clojure.core/str subHeadingColor)}]
  [".ui.small.sub.header"
   {"font-size" (clojure.core/str smallSubHeadingSize)}]
  [".ui.sub.header"
   {"font-size" (clojure.core/str subHeadingFontSize)}]
  [".ui.large.sub.header"
   {"font-size" (clojure.core/str largeSubHeadingSize)}]
  [".ui.huge.sub.header"
   {"font-size" (clojure.core/str hugeSubHeadingSize)}]
  [".ui.icon.header"
   {"display" (clojure.core/str "inline-block"),
    "text-align" (clojure.core/str "center"),
    "margin"
    (clojure.core/str
     iconHeaderTopMargin
     " "
     "0em"
     " "
     iconHeaderBottomMargin)}]
  [".ui.icon.header:after"
   {"content" nil,
    "display" (clojure.core/str "block"),
    "height" (clojure.core/str "0px"),
    "clear" (clojure.core/str "both"),
    "visibility" (clojure.core/str "hidden")}]
  [".ui.icon.header:first-child"
   {"margin-top" (clojure.core/str iconHeaderFirstMargin)}]
  [".ui.icon.header"
   [".icon"
    {"float" (clojure.core/str "none"),
     "display" (clojure.core/str "block"),
     "width" (clojure.core/str "auto"),
     "height" (clojure.core/str "auto"),
     "line-height" (clojure.core/str "11"),
     "padding" (clojure.core/str "0em"),
     "font-size" (clojure.core/str iconHeaderSize),
     "margin" (clojure.core/str "0em" " " "auto" " " iconHeaderMargin),
     "opacity" (clojure.core/str iconHeaderOpacity)}]]
  [".ui.icon.header"
   [".content"
    {"display" (clojure.core/str "block"),
     "padding" (clojure.core/str "0em")}]]
  [".ui.icon.header"
   [".circular.icon"
    {"font-size" (clojure.core/str circularHeaderIconSize)}]]
  [".ui.icon.header"
   [".square.icon"
    {"font-size" (clojure.core/str squareHeaderIconSize)}]]
  [".ui.block.icon.header"
   [".icon" {"margin-bottom" (clojure.core/str "0em")}]]
  [".ui.icon.header.aligned"
   {"margin-left" (clojure.core/str "auto"),
    "margin-right" (clojure.core/str "auto"),
    "display" (clojure.core/str "block")}]
  [".ui.disabled.header"
   {"opacity" (clojure.core/str disabledOpacity)}]
  [".ui.inverted.header" {"color" (clojure.core/str invertedColor)}]
  [".ui.inverted.header"
   [".sub.header" {"color" (clojure.core/str invertedSubHeaderColor)}]]
  [".ui.inverted.attached.header"
   {"background" (clojure.core/str invertedAttachedBackground),
    "box-shadow" (clojure.core/str "none"),
    "border-color" (clojure.core/str "transparent")}]
  [".ui.inverted.block.header"
   {"background" (clojure.core/str invertedBlockBackground),
    "box-shadow" (clojure.core/str "none")}]
  [".ui.inverted.block.header"
   {"border-bottom" (clojure.core/str "none")}]
  [".ui.red.header" {"color" (clojure.core/str red)}]
  ["a.ui.red.header:hover" {"color" (clojure.core/str redHover)}]
  [".ui.red.dividing.header"
   {"border-bottom"
    (clojure.core/str dividedColoredBorderWidth " " "solid" " " red)}]
  [".ui.inverted.red.header" {"color" (clojure.core/str lightRed)}]
  ["a.ui.inverted.red.header:hover"
   {"color" (clojure.core/str lightRedHover)}]
  [".ui.orange.header" {"color" (clojure.core/str orange)}]
  ["a.ui.orange.header:hover" {"color" (clojure.core/str orangeHover)}]
  [".ui.orange.dividing.header"
   {"border-bottom"
    (clojure.core/str
     dividedColoredBorderWidth
     " "
     "solid"
     " "
     orange)}]
  [".ui.inverted.orange.header"
   {"color" (clojure.core/str lightOrange)}]
  ["a.ui.inverted.orange.header:hover"
   {"color" (clojure.core/str lightOrangeHover)}]
  [".ui.olive.header" {"color" (clojure.core/str olive)}]
  ["a.ui.olive.header:hover" {"color" (clojure.core/str oliveHover)}]
  [".ui.olive.dividing.header"
   {"border-bottom"
    (clojure.core/str
     dividedColoredBorderWidth
     " "
     "solid"
     " "
     olive)}]
  [".ui.inverted.olive.header" {"color" (clojure.core/str lightOlive)}]
  ["a.ui.inverted.olive.header:hover"
   {"color" (clojure.core/str lightOliveHover)}]
  [".ui.yellow.header" {"color" (clojure.core/str yellow)}]
  ["a.ui.yellow.header:hover" {"color" (clojure.core/str yellowHover)}]
  [".ui.yellow.dividing.header"
   {"border-bottom"
    (clojure.core/str
     dividedColoredBorderWidth
     " "
     "solid"
     " "
     yellow)}]
  [".ui.inverted.yellow.header"
   {"color" (clojure.core/str lightYellow)}]
  ["a.ui.inverted.yellow.header:hover"
   {"color" (clojure.core/str lightYellowHover)}]
  [".ui.green.header" {"color" (clojure.core/str green)}]
  ["a.ui.green.header:hover" {"color" (clojure.core/str greenHover)}]
  [".ui.green.dividing.header"
   {"border-bottom"
    (clojure.core/str
     dividedColoredBorderWidth
     " "
     "solid"
     " "
     green)}]
  [".ui.inverted.green.header" {"color" (clojure.core/str lightGreen)}]
  ["a.ui.inverted.green.header:hover"
   {"color" (clojure.core/str lightGreenHover)}]
  [".ui.teal.header" {"color" (clojure.core/str teal)}]
  ["a.ui.teal.header:hover" {"color" (clojure.core/str tealHover)}]
  [".ui.teal.dividing.header"
   {"border-bottom"
    (clojure.core/str dividedColoredBorderWidth " " "solid" " " teal)}]
  [".ui.inverted.teal.header" {"color" (clojure.core/str lightTeal)}]
  ["a.ui.inverted.teal.header:hover"
   {"color" (clojure.core/str lightTealHover)}]
  [".ui.blue.header" {"color" (clojure.core/str blue)}]
  ["a.ui.blue.header:hover" {"color" (clojure.core/str blueHover)}]
  [".ui.blue.dividing.header"
   {"border-bottom"
    (clojure.core/str dividedColoredBorderWidth " " "solid" " " blue)}]
  [".ui.inverted.blue.header" {"color" (clojure.core/str lightBlue)}]
  ["a.ui.inverted.blue.header:hover"
   {"color" (clojure.core/str lightBlueHover)}]
  [".ui.violet.header" {"color" (clojure.core/str violet)}]
  ["a.ui.violet.header:hover" {"color" (clojure.core/str violetHover)}]
  [".ui.violet.dividing.header"
   {"border-bottom"
    (clojure.core/str
     dividedColoredBorderWidth
     " "
     "solid"
     " "
     violet)}]
  [".ui.inverted.violet.header"
   {"color" (clojure.core/str lightViolet)}]
  ["a.ui.inverted.violet.header:hover"
   {"color" (clojure.core/str lightVioletHover)}]
  [".ui.purple.header" {"color" (clojure.core/str purple)}]
  ["a.ui.purple.header:hover" {"color" (clojure.core/str purpleHover)}]
  ...))
