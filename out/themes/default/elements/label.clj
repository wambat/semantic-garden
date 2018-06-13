(clojure.core/ns
 themes.default.elements.label
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def verticalAlign (clojure.core/str "baseline"))
(def verticalMargin (clojure.core/str "0em"))
(def horizontalMargin (clojure.core/str relative2px))
(def backgroundColor nil)
(def color (clojure.core/str mutedTextColor))
(def backgroundImage (clojure.core/str "none"))
(def verticalPadding (clojure.core/str "0.5833em"))
(def horizontalPadding (clojure.core/str "0.833em"))
(def borderRadius (clojure.core/str absoluteBorderRadius))
(def textTransform (clojure.core/str "none"))
(def fontWeight (clojure.core/str bold))
(def borderWidth (clojure.core/str "1px"))
(def border (clojure.core/str "0px" " " "solid" " " "transparent"))
(def lineHeightOffset (clojure.core/str))
(def labelTransitionDuration (clojure.core/str defaultDuration))
(def labelTransitionEasing (clojure.core/str defaultEasing))
(def
 transition
 (clojure.core/str
  "background"
  " "
  labelTransitionDuration
  " "
  labelTransitionEasing))
(def groupVerticalMargin (clojure.core/str "0.5em"))
(def groupHorizontalMargin (clojure.core/str "0.5em"))
(def linkOpacity (clojure.core/str "0.50.5"))
(def
 linkTransition
 (clojure.core/str
  labelTransitionDuration
  " "
  "opacity"
  " "
  labelTransitionEasing))
(def iconDistance (clojure.core/str "0.75em"))
(def imageHeight nil)
(def detailFontWeight (clojure.core/str bold))
(def detailOpacity (clojure.core/str "0.80.8"))
(def detailIconDistance (clojure.core/str "0.25em"))
(def detailMargin (clojure.core/str "1em"))
(def deleteOpacity (clojure.core/str linkOpacity))
(def deleteSize (clojure.core/str relativeSmall))
(def deleteMargin (clojure.core/str "0.5em"))
(def
 deleteTransition
 (clojure.core/str
  "background"
  " "
  labelTransitionDuration
  " "
  labelTransitionEasing))
(def imageLabelBackground (clojure.core/str backgroundColor))
(def imageLabelVerticalPadding (clojure.core/str verticalPadding))
(def imageLabelHorizontalPadding (clojure.core/str horizontalPadding))
(def imageLabelTextDistance (clojure.core/str "0.5em"))
(def imageLabelDetailDistance (clojure.core/str imageLabelTextDistance))
(def imageLabelBorderRadius (clojure.core/str borderRadius))
(def imageLabelBoxShadow (clojure.core/str "none"))
(def
 imageLabelPadding
 (clojure.core/str
  imageLabelVerticalPadding
  " "
  imageLabelHorizontalPadding
  " "
  imageLabelVerticalPadding
  " "
  imageLabelTextDistance))
(def imageLabelImageMargin nil)
(def
 imageLabelImageBorderRadius
 (clojure.core/str
  imageLabelBorderRadius
  " "
  "0em"
  " "
  "0em"
  " "
  imageLabelBorderRadius))
(def imageLabelImageHeight (clojure.core/str imageHeight))
(def
 imageLabelDetailBackground
 (clojure.core/str strongTransparentBlack))
(def
 imageLabelDetailPadding
 (clojure.core/str
  imageLabelVerticalPadding
  " "
  imageLabelHorizontalPadding))
(def imageLabelDetailMargin nil)
(def labelHoverBackgroundColor nil)
(def labelHoverBackgroundImage (clojure.core/str "none"))
(def labelHoverTextColor (clojure.core/str hoveredTextColor))
(def labelActiveBackgroundColor nil)
(def labelActiveBackgroundImage (clojure.core/str "none"))
(def labelActiveTextColor (clojure.core/str selectedTextColor))
(def labelActiveHoverBackgroundColor nil)
(def labelActiveHoverBackgroundImage (clojure.core/str "none"))
(def labelActiveHoverTextColor (clojure.core/str selectedTextColor))
(def basicBackground (clojure.core/str "none" " " white))
(def basicBorderWidth (clojure.core/str "1px"))
(def
 basicBorder
 (clojure.core/str basicBorderWidth " " "solid" " " borderColor))
(def basicColor (clojure.core/str textColor))
(def basicBoxShadow (clojure.core/str "none"))
(def basicHoverBackground (clojure.core/str basicBackground))
(def basicHoverColor (clojure.core/str linkHoverColor))
(def basicHoverBorder (clojure.core/str basicBorder))
(def basicHoverBoxShadow (clojure.core/str basicBoxShadow))
(def tagCircleColor (clojure.core/str white))
(def tagCircleSize (clojure.core/str "0.5em"))
(def tagHorizontalPadding (clojure.core/str "1.5em"))
(def
 tagCircleBoxShadow
 (clojure.core/str "00" " " "-1px" " " "1px" " " "00" " " "rgba"))
(def tagTriangleRightOffset (clojure.core/str "100%"))
(def tagTriangleTopOffset (clojure.core/str "50%"))
(def tagTriangleSize (clojure.core/str "1.56em"))
(def tagTriangleBackgroundImage (clojure.core/str "none"))
(def tagTransition (clojure.core/str "none"))
(def ribbonTriangleSize (clojure.core/str "1.2em"))
(def ribbonShadowColor (clojure.core/str "rgba"))
(def ribbonMargin (clojure.core/str "11" " " "rem"))
(def ribbonImageTopDistance (clojure.core/str "11" " " "rem"))
(def ribbonImageMargin (clojure.core/str "-0.05-0.05" " " "rem"))
(def ribbonTableMargin (clojure.core/str relativeMini))
(def redTextColor (clojure.core/str white))
(def orangeTextColor (clojure.core/str white))
(def yellowTextColor (clojure.core/str white))
(def oliveTextColor (clojure.core/str white))
(def greenTextColor (clojure.core/str white))
(def tealTextColor (clojure.core/str white))
(def blueTextColor (clojure.core/str white))
(def violetTextColor (clojure.core/str white))
(def purpleTextColor (clojure.core/str white))
(def pinkTextColor (clojure.core/str white))
(def brownTextColor (clojure.core/str white))
(def greyTextColor (clojure.core/str white))
(def blackTextColor (clojure.core/str white))
(def redHoverTextColor (clojure.core/str white))
(def orangeHoverTextColor (clojure.core/str white))
(def yellowHoverTextColor (clojure.core/str white))
(def oliveHoverTextColor (clojure.core/str white))
(def greenHoverTextColor (clojure.core/str white))
(def tealHoverTextColor (clojure.core/str white))
(def blueHoverTextColor (clojure.core/str white))
(def violetHoverTextColor (clojure.core/str white))
(def purpleHoverTextColor (clojure.core/str white))
(def pinkHoverTextColor (clojure.core/str white))
(def brownHoverTextColor (clojure.core/str white))
(def greyHoverTextColor (clojure.core/str white))
(def blackHoverTextColor (clojure.core/str white))
(def redRibbonShadow (clojure.core/str "darken"))
(def orangeRibbonShadow (clojure.core/str "darken"))
(def yellowRibbonShadow (clojure.core/str "darken"))
(def oliveRibbonShadow (clojure.core/str "darken"))
(def greenRibbonShadow (clojure.core/str "darken"))
(def tealRibbonShadow (clojure.core/str "darken"))
(def blueRibbonShadow (clojure.core/str "darken"))
(def violetRibbonShadow (clojure.core/str "darken"))
(def purpleRibbonShadow (clojure.core/str "darken"))
(def pinkRibbonShadow (clojure.core/str "darken"))
(def brownRibbonShadow (clojure.core/str "darken"))
(def greyRibbonShadow (clojure.core/str "darken"))
(def blackRibbonShadow (clojure.core/str "darken"))
(def attachedSegmentPadding (clojure.core/str "22" " " "rem"))
(def attachedVerticalPadding (clojure.core/str "0.75em"))
(def attachedHorizontalPadding (clojure.core/str "1em"))
(def attachedCornerBorderRadius nil)
(def attachedBorderRadius (clojure.core/str borderRadius))
(def cornerSizeRatio (clojure.core/str "11"))
(def
 cornerTransition
 (clojure.core/str
  "color"
  " "
  labelTransitionDuration
  " "
  labelTransitionEasing))
(def cornerTriangleSize (clojure.core/str "4em"))
(def
 cornerTriangleTransition
 (clojure.core/str
  "border-color"
  " "
  labelTransitionDuration
  " "
  labelTransitionEasing))
(def cornerTriangleZIndex (clojure.core/str "11"))
(def cornerIconSize (clojure.core/str relativeLarge))
(def cornerIconTopOffset (clojure.core/str relative9px))
(def cornerIconLeftOffset (clojure.core/str relative11px))
(def cornerTextWidth (clojure.core/str "3em"))
(def cornerTextWeight (clojure.core/str bold))
(def cornerTextSize (clojure.core/str "1em"))
(def horizontalLabelMinWidth (clojure.core/str "3em"))
(def horizontalLabelMargin (clojure.core/str "0.5em"))
(def horizontalLabelVerticalPadding (clojure.core/str "0.4em"))
(def circularPadding (clojure.core/str "0.5em"))
(def circularMinSize (clojure.core/str "2em"))
(def emptyCircleSize (clojure.core/str "0.5em"))
(def pointingBorderColor (clojure.core/str "inherit"))
(def pointingBorderWidth (clojure.core/str borderWidth))
(def pointingVerticalDistance (clojure.core/str "1em"))
(def pointingTriangleSize (clojure.core/str "0.6666em"))
(def pointingHorizontalDistance (clojure.core/str pointingTriangleSize))
(def
 pointingTriangleTransition
 (clojure.core/str
  "background"
  " "
  labelTransitionDuration
  " "
  labelTransitionEasing))
(def pointingTriangleZIndex (clojure.core/str "22"))
(def basicPointingTriangleOffset nil)
(def floatingTopOffset (clojure.core/str "-1em"))
(def floatingLeftOffset (clojure.core/str "-1.5em"))
(def floatingZIndex (clojure.core/str "100100"))
(def mini nil)
(def tiny nil)
(def small nil)
(def medium nil)
(def large (clojure.core/str absoluteMedium))
(def big (clojure.core/str absoluteBig))
(def huge (clojure.core/str absoluteHuge))
(def massive (clojure.core/str absoluteMassive))
(defstyles root)
