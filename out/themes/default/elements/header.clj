(clojure.core/ns
 styles.themes.default.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def textTransform (clojure.core/str "none"))
(def fontFamily (clojure.core/str headerFont))
(def fontWeight (clojure.core/str headerFontWeight))
(def lineHeight (clojure.core/str headerLineHeight))
(def lineHeightOffset (clojure.core/str headerLineHeightOffset))
(def topMargin (clojure.core/str headerTopMargin))
(def bottomMargin (clojure.core/str headerBottomMargin))
(def margin (clojure.core/str topMargin " " "0em" " " bottomMargin))
(def firstMargin nil)
(def lastMargin (clojure.core/str "0em"))
(def horizontalPadding (clojure.core/str "0em"))
(def verticalPadding (clojure.core/str "0em"))
(def subHeadingDistance nil)
(def subHeadingFontSize (clojure.core/str relativeTiny))
(def subHeadingFontWeight (clojure.core/str bold))
(def subHeadingTextTransform (clojure.core/str "uppercase"))
(def subHeadingColor (clojure.core/str ""))
(def smallSubHeadingSize (clojure.core/str relativeMini))
(def largeSubHeadingSize (clojure.core/str relativeSmall))
(def hugeSubHeadingSize (clojure.core/str relativeMedium))
(def subHeaderMargin (clojure.core/str "0em"))
(def subHeaderLineHeight (clojure.core/str "1.2em"))
(def subHeaderColor (clojure.core/str mutedTextColor))
(def iconOpacity (clojure.core/str "11"))
(def iconSize (clojure.core/str "1.5em"))
(def iconOffset (clojure.core/str "0em"))
(def iconMargin (clojure.core/str "0.750.75" " " "rem"))
(def iconAlignment (clojure.core/str "middle"))
(def imageWidth (clojure.core/str "2.5em"))
(def imageHeight (clojure.core/str "auto"))
(def imageOffset (clojure.core/str lineHeightOffset))
(def imageMargin (clojure.core/str iconMargin))
(def imageAlignment (clojure.core/str "middle"))
(def labelSize (clojure.core/str ""))
(def labelDistance (clojure.core/str "0.50.5" " " "rem"))
(def labelVerticalAlign (clojure.core/str "middle"))
(def contentAlignment (clojure.core/str "top"))
(def contentIconAlignment (clojure.core/str "middle"))
(def contentImageAlignment (clojure.core/str "middle"))
(def nextParagraphDistance (clojure.core/str "0em"))
(def hugeFontSize (clojure.core/str "unit"))
(def largeFontSize (clojure.core/str "unit"))
(def mediumFontSize (clojure.core/str "unit"))
(def smallFontSize (clojure.core/str "unit"))
(def tinyFontSize (clojure.core/str "unit"))
(def h1SubHeaderFontSize (clojure.core/str large))
(def h2SubHeaderFontSize (clojure.core/str large))
(def h3SubHeaderFontSize (clojure.core/str medium))
(def h4SubHeaderFontSize (clojure.core/str medium))
(def h5SubHeaderFontSize (clojure.core/str small))
(def hugeSubHeaderFontSize (clojure.core/str h1SubHeaderFontSize))
(def largeSubHeaderFontSize (clojure.core/str h2SubHeaderFontSize))
(def subHeaderFontSize (clojure.core/str h3SubHeaderFontSize))
(def smallSubHeaderFontSize (clojure.core/str h4SubHeaderFontSize))
(def tinySubHeaderFontSize (clojure.core/str h5SubHeaderFontSize))
(def iconHeaderSize (clojure.core/str "3em"))
(def iconHeaderOpacity (clojure.core/str "11"))
(def iconHeaderMargin (clojure.core/str "0.50.5" " " "rem"))
(def circularHeaderIconSize (clojure.core/str "2em"))
(def squareHeaderIconSize (clojure.core/str "2em"))
(def iconHeaderTopMargin (clojure.core/str "22" " " "rem"))
(def iconHeaderBottomMargin (clojure.core/str bottomMargin))
(def iconHeaderFirstMargin (clojure.core/str "0em"))
(def dividedBorderWidth (clojure.core/str "1px"))
(def
 dividedBorder
 (clojure.core/str dividedBorderWidth " " "solid" " " borderColor))
(def dividedColoredBorderWidth (clojure.core/str "2px"))
(def dividedBorderPadding nil)
(def dividedSubHeaderPadding nil)
(def dividedIconPadding (clojure.core/str "0em"))
(def blockBackground (clojure.core/str darkWhite))
(def blockBoxShadow (clojure.core/str "none"))
(def blockBorderWidth (clojure.core/str "1px"))
(def
 blockBorder
 (clojure.core/str blockBorderWidth " " "solid" " " solidBorderColor))
(def blockHorizontalPadding (clojure.core/str medium))
(def blockVerticalPadding (clojure.core/str mini))
(def blockBorderRadius (clojure.core/str defaultBorderRadius))
(def tinyBlock (clojure.core/str tiny))
(def smallBlock (clojure.core/str small))
(def mediumBlock (clojure.core/str medium))
(def largeBlock (clojure.core/str large))
(def hugeBlock (clojure.core/str huge))
(def attachedOffset (clojure.core/str "-1px"))
(def attachedBoxShadow (clojure.core/str "none"))
(def
 attachedBorder
 (clojure.core/str "1px" " " "solid" " " solidBorderColor))
(def attachedVerticalPadding (clojure.core/str blockVerticalPadding))
(def
 attachedHorizontalPadding
 (clojure.core/str blockHorizontalPadding))
(def attachedBackground (clojure.core/str white))
(def attachedBorderRadius (clojure.core/str blockBorderRadius))
(def tinyAttachedSize (clojure.core/str relativeTiny))
(def smallAttachedSize (clojure.core/str relativeSmall))
(def mediumAttachedSize (clojure.core/str relativeMedium))
(def largeAttachedSize (clojure.core/str relativeLarge))
(def bigAttachedSize (clojure.core/str relativeBig))
(def hugeAttachedSize (clojure.core/str relativeHuge))
(def invertedColor (clojure.core/str white))
(def invertedSubHeaderColor (clojure.core/str invertedMutedTextColor))
(def invertedDividedBorderColor (clojure.core/str whiteBorderColor))
(def
 invertedBlockBackground
 (clojure.core/str lightBlack " " subtleGradient))
(def
 invertedAttachedBackground
 (clojure.core/str invertedBlockBackground))
(def floatedMargin (clojure.core/str "0.5em"))
(defstyles root)
