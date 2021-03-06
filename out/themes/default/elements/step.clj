(clojure.core/ns
 styles.themes.default.elements.step
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def stepMargin (clojure.core/str "1em" " " "0em"))
(def stepsBorderRadius (clojure.core/str defaultBorderRadius))
(def stepsBackground (clojure.core/str ""))
(def stepsBoxShadow (clojure.core/str "none"))
(def stepsBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def verticalMargin (clojure.core/str "0em"))
(def horizontalMargin (clojure.core/str "0em"))
(def arrowSize (clojure.core/str relativeLarge))
(def verticalPadding (clojure.core/str relativeLarge))
(def horizontalPadding (clojure.core/str "2em"))
(def
 transition
 (clojure.core/str "box-shadow" " " defaultDuration " " defaultEasing))
(def lineHeight (clojure.core/str relativeLarge))
(def alignItems (clojure.core/str "center"))
(def justifyContent (clojure.core/str "center"))
(def backgroundColor (clojure.core/str white))
(def background (clojure.core/str backgroundColor))
(def borderRadius (clojure.core/str "0em"))
(def borderWidth (clojure.core/str "1px"))
(def boxShadow (clojure.core/str "none"))
(def border (clojure.core/str "none"))
(def divider (clojure.core/str borderWidth " " "solid" " " borderColor))
(def iconDistance (clojure.core/str "11" " " "rem"))
(def iconSize (clojure.core/str "2.5em"))
(def iconAlign (clojure.core/str "middle"))
(def titleFontFamily (clojure.core/str headerFont))
(def titleFontWeight (clojure.core/str bold))
(def titleFontSize (clojure.core/str relativeLarge))
(def titleColor (clojure.core/str darkTextColor))
(def descriptionDistance (clojure.core/str "0.25em"))
(def descriptionFontSize (clojure.core/str relativeSmall))
(def descriptionFontWeight (clojure.core/str normal))
(def descriptionColor (clojure.core/str textColor))
(def arrowBackgroundColor (clojure.core/str backgroundColor))
(def arrowTopOffset (clojure.core/str "50%"))
(def arrowRightOffset (clojure.core/str "0%"))
(def
 arrowBorderWidth
 (clojure.core/str "0px" " " borderWidth " " borderWidth " " "0px"))
(def arrowDisplay (clojure.core/str "block"))
(def lastArrowDisplay (clojure.core/str "none"))
(def activeArrowDisplay (clojure.core/str "block"))
(def activeLastArrowDisplay (clojure.core/str "none"))
(def mobileIconDistance (clojure.core/str iconDistance))
(def verticalDivider (clojure.core/str divider))
(def verticalArrowTopOffset (clojure.core/str "50%"))
(def verticalArrowRightOffset (clojure.core/str "0%"))
(def
 verticalArrowBorderWidth
 (clojure.core/str "0px" " " borderWidth " " borderWidth " " "0px"))
(def verticalArrowDisplay (clojure.core/str "none"))
(def verticalLastArrowDisplay (clojure.core/str verticalArrowDisplay))
(def verticalActiveArrowDisplay (clojure.core/str "block"))
(def verticalActiveLastArrowDisplay (clojure.core/str "block"))
(def attachedHorizontalOffset nil)
(def attachedVerticalOffset (clojure.core/str "00"))
(def attachedWidth nil)
(def orderedFontFamily (clojure.core/str "inherit"))
(def orderedFontWeight (clojure.core/str bold))
(def completedColor (clojure.core/str positiveColor))
(def hoverBackground (clojure.core/str offWhite))
(def hoverColor (clojure.core/str hoveredTextColor))
(def downBackground (clojure.core/str darkWhite))
(def downColor (clojure.core/str pressedTextColor))
(def activeBackground (clojure.core/str darkWhite))
(def activeColor (clojure.core/str linkColor))
(def activeIconColor (clojure.core/str darkTextColor))
(def activeHoverBackground (clojure.core/str lightGrey))
(def activeHoverColor (clojure.core/str textColor))
(def disabledBackground (clojure.core/str background))
(def disabledColor (clojure.core/str disabledTextColor))
(defstyles root)
