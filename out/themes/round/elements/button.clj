(clojure.core/ns
 themes.round.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def borderRadius (clojure.core/str circularRadius))
(def textTransform (clojure.core/str "uppercase"))
(def backgroundColor nil)
(def backgroundImage (clojure.core/str "none"))
(def fontWeight (clojure.core/str "bold"))
(def textColor (clojure.core/str "rgba"))
(def
 boxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  "rgba"
  " "
  "inset"))
(def verticalPadding (clojure.core/str "1.25em"))
(def horizontalPadding (clojure.core/str "3em"))
(def iconOpacity (clojure.core/str "0.80.8"))
(def iconDistance (clojure.core/str "0.4em"))
(def
 iconTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def iconMargin nil)
(def iconVerticalAlign (clojure.core/str "top"))
(def
 verticalBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  borderColor
  " "
  "inset"))
(def hoverBackgroundColor nil)
(def hoverBackgroundImage (clojure.core/str "none"))
(def
 hoverBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  "rgba"
  " "
  "inset"))
(def downBackgroundColor nil)
(def downBackgroundImage (clojure.core/str "none"))
(def
 downBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  "rgba"
  " "
  "inset"))
(def activeBackgroundColor nil)
(def activeBackgroundImage (clojure.core/str "none"))
(def
 activeBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  "rgba"
  " "
  "inset"))
(def loadingBackgroundColor nil)
(def labeledIconWidth nil)
(def labeledIconBackgroundColor (clojure.core/str "transparent"))
(def labeledIconPadding nil)
(def labeledIconBorder (clojure.core/str "rgba"))
(def labeledIconColor nil)
(def labeledIconLeftShadow (clojure.core/str "none"))
(def labeledIconRightShadow (clojure.core/str "none"))
(def
 basicBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " borderColor))
(def iconOffset (clojure.core/str "0.05em"))
(def basicLoadingColor nil)
(def basicHoverBackground nil)
(def
 basicHoverBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " "rgba"))
(def basicDownBackground (clojure.core/str "rgba"))
(def
 basicDownBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " "rgba"))
(def basicActiveBackground (clojure.core/str transparentBlack))
(def basicActiveColor (clojure.core/str selectedTextColor))
(def basicInvertedBackground (clojure.core/str "transparent"))
(def basicInvertedHoverBackground (clojure.core/str "transparent"))
(def basicInvertedDownBackground (clojure.core/str transparentWhite))
(def basicInvertedActiveBackground (clojure.core/str transparentWhite))
(def
 basicInvertedBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "2px" " " "rgba"))
(def
 basicInvertedHoverBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  selectedWhiteBorderColor))
(def
 basicInvertedDownBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  selectedWhiteBorderColor))
(def
 basicInvertedActiveBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  selectedWhiteBorderColor))
(def basicInvertedColor (clojure.core/str darkWhite))
(def basicInvertedHoverColor (clojure.core/str darkWhiteHover))
(def basicInvertedDownColor (clojure.core/str darkWhiteActive))
(def basicInvertedActiveColor (clojure.core/str invertedTextColor))
(def
 basicGroupBorder
 (clojure.core/str "1px" " " "solid" " " borderColor))
(def
 basicGroupBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " borderColor))
(def coloredBackgroundImage (clojure.core/str "linear-gradient"))
(def coloredBoxShadow (clojure.core/str shadowBoxShadow))
(def compactVerticalPadding nil)
(def compactHorizontalPadding nil)
(def attachedOffset (clojure.core/str "-1px"))
(def
 attachedBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " "rgba"))
(def attachedHorizontalPadding (clojure.core/str "0.75em"))
(def floatedMargin (clojure.core/str "0.25em"))
(def animationDuration (clojure.core/str "0.3s"))
(def animationEasing (clojure.core/str "ease"))
(def fadeScaleHigh (clojure.core/str "1.51.5"))
(def fadeScaleLow (clojure.core/str "0.750.75"))
(def mini (clojure.core/str "0.70.7" " " "rem"))
(def tiny (clojure.core/str "0.80.8" " " "rem"))
(def small (clojure.core/str "0.8750.875" " " "rem"))
(def medium (clojure.core/str "11" " " "rem"))
(def large (clojure.core/str "1.1251.125" " " "rem"))
(def big (clojure.core/str "1.251.25" " " "rem"))
(def huge (clojure.core/str "1.3751.375" " " "rem"))
(def massive (clojure.core/str "1.51.5" " " "rem"))
(defstyles root)
