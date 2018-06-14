(clojure.core/ns
 styles.themes.default.modules.popup
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def zIndex (clojure.core/str "19001900"))
(def background (clojure.core/str white))
(def maxWidth (clojure.core/str "250px"))
(def borderColor (clojure.core/str solidBorderColor))
(def borderWidth (clojure.core/str "1px"))
(def boxShadow (clojure.core/str floatingShadow))
(def color (clojure.core/str textColor))
(def verticalPadding (clojure.core/str "0.833em"))
(def horizontalPadding (clojure.core/str "1em"))
(def fontWeight (clojure.core/str normal))
(def fontStyle (clojure.core/str normal))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def arrowSize (clojure.core/str relative10px))
(def arrowWidth (clojure.core/str "1em"))
(def arrowDistanceFromEdge (clojure.core/str "1em"))
(def boxArrowOffset (clojure.core/str "0em"))
(def popupDistanceAway (clojure.core/str arrowSize))
(def headerFontFamily (clojure.core/str headerFont))
(def headerFontWeight (clojure.core/str bold))
(def headerFontSize (clojure.core/str relativeLarge))
(def headerDistance (clojure.core/str relative7px))
(def headerLineHeight (clojure.core/str "1.21.2"))
(def border (clojure.core/str borderWidth " " "solid" " " borderColor))
(def arrowBackground (clojure.core/str background))
(def arrowZIndex (clojure.core/str "22"))
(def arrowJitter (clojure.core/str "0.05em"))
(def arrowOffset (clojure.core/str))
(def arrowStroke (clojure.core/str borderWidth))
(def arrowColor (clojure.core/str "darken"))
(def arrowTopBackground (clojure.core/str arrowBackground))
(def arrowCenterBackground (clojure.core/str arrowBackground))
(def arrowBottomBackground (clojure.core/str arrowBackground))
(def
 arrowBoxShadow
 (clojure.core/str
  arrowStroke
  " "
  arrowStroke
  " "
  "0px"
  " "
  "0px"
  " "
  arrowColor))
(def leftArrowBoxShadow nil)
(def rightArrowBoxShadow nil)
(def bottomArrowBoxShadow nil)
(def tooltipBackground (clojure.core/str background))
(def tooltipBorderRadius (clojure.core/str borderRadius))
(def
 tooltipPadding
 (clojure.core/str verticalPadding " " horizontalPadding))
(def tooltipFontWeight (clojure.core/str fontWeight))
(def tooltipFontStyle (clojure.core/str fontStyle))
(def tooltipColor (clojure.core/str color))
(def tooltipBorder (clojure.core/str border))
(def tooltipBoxShadow (clojure.core/str boxShadow))
(def tooltipMaxWidth (clojure.core/str "none"))
(def tooltipFontSize (clojure.core/str medium))
(def tooltipLineHeight (clojure.core/str lineHeight))
(def tooltipDistanceAway (clojure.core/str relative7px))
(def tooltipZIndex (clojure.core/str "11"))
(def tooltipDuration (clojure.core/str defaultDuration))
(def tooltipEasing (clojure.core/str defaultEasing))
(def tooltipInvertedBackground (clojure.core/str invertedBackground))
(def tooltipInvertedColor (clojure.core/str invertedColor))
(def tooltipInvertedBorder (clojure.core/str invertedBorder))
(def tooltipInvertedBoxShadow (clojure.core/str invertedBoxShadow))
(def
 tooltipInvertedHeaderBackground
 (clojure.core/str invertedHeaderBackground))
(def tooltipInvertedHeaderColor (clojure.core/str invertedHeaderColor))
(def tooltipArrowVerticalOffset nil)
(def tooltipArrowHorizontalOffset nil)
(def tooltipArrowBoxShadow (clojure.core/str arrowBoxShadow))
(def tooltipArrowBackground (clojure.core/str arrowBackground))
(def tooltipArrowTopBackground (clojure.core/str arrowTopBackground))
(def
 tooltipArrowCenterBackground
 (clojure.core/str arrowCenterBackground))
(def
 tooltipArrowBottomBackground
 (clojure.core/str arrowBottomBackground))
(def
 nestedGridMargin
 (clojure.core/str "-0.7-0.7" " " "rem" " " "-0.875-0.875" " " "rem"))
(def nestedGridWidth nil)
(def loadingZIndex (clojure.core/str "-1-1"))
(def wideWidth (clojure.core/str "350px"))
(def veryWideWidth (clojure.core/str "550px"))
(def invertedBackground (clojure.core/str black))
(def invertedColor (clojure.core/str white))
(def invertedBorder (clojure.core/str "none"))
(def invertedBoxShadow (clojure.core/str "none"))
(def invertedHeaderBackground (clojure.core/str "none"))
(def invertedHeaderColor (clojure.core/str white))
(def invertedArrowColor (clojure.core/str invertedBackground))
(def invertedArrowTopBackground (clojure.core/str invertedBackground))
(def
 invertedArrowCenterBackground
 (clojure.core/str invertedBackground))
(def
 invertedArrowBottomBackground
 (clojure.core/str invertedBackground))
(defstyles root)
