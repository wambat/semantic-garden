(clojure.core/ns
 themes.default.elements.input
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def inputFont (clojure.core/str pageFont))
(def verticalPadding (clojure.core/str inputVerticalPadding))
(def horizontalPadding (clojure.core/str inputHorizontalPadding))
(def lineHeight (clojure.core/str inputLineHeight))
(def lineHeightOffset (clojure.core/str))
(def textAlign (clojure.core/str "left"))
(def background (clojure.core/str inputBackground))
(def borderWidth (clojure.core/str "1px"))
(def border (clojure.core/str borderWidth " " "solid" " " borderColor))
(def boxShadow (clojure.core/str "none"))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def
 transition
 (clojure.core/str
  "border-color"
  " "
  defaultDuration
  " "
  defaultEasing))
(def iconOpacity (clojure.core/str "0.50.5"))
(def iconFocusOpacity (clojure.core/str "11"))
(def iconOffset (clojure.core/str "-0.5em"))
(def iconDistance (clojure.core/str "0em"))
(def iconMargin nil)
(def
 iconTransition
 (clojure.core/str "opacity" " " "0.3s" " " defaultEasing))
(def transparentIconWidth (clojure.core/str glyphWidth))
(def transparentIconMargin (clojure.core/str "2em"))
(def circularIconVerticalOffset (clojure.core/str "0.35em"))
(def circularIconHorizontalOffset (clojure.core/str "0.5em"))
(def labelCornerTop (clojure.core/str borderWidth))
(def labelCornerRight (clojure.core/str borderWidth))
(def labelCornerSize (clojure.core/str relative9px))
(def labelSize (clojure.core/str "1em"))
(def labelVerticalPadding nil)
(def labeledMargin (clojure.core/str "2.5em"))
(def labeledIconInputMargin (clojure.core/str "3.25em"))
(def labeledIconMargin (clojure.core/str "1.25em"))
(def placeholderColor (clojure.core/str inputPlaceholderColor))
(def
 placeholderFocusColor
 (clojure.core/str inputPlaceholderFocusColor))
(def downBorderColor (clojure.core/str "rgba"))
(def downBackground (clojure.core/str "#FAFAFA"))
(def downColor (clojure.core/str textColor))
(def downBoxShadow (clojure.core/str "none"))
(def focusBorderColor (clojure.core/str focusedFormBorderColor))
(def focusBackground (clojure.core/str background))
(def focusColor (clojure.core/str hoveredTextColor))
(def focusBoxShadow (clojure.core/str "none"))
(def errorBackground (clojure.core/str negativeBackgroundColor))
(def errorColor (clojure.core/str negativeTextColor))
(def errorBorder (clojure.core/str negativeBorderColor))
(def errorBoxShadow (clojure.core/str "none"))
(def placeholderErrorColor (clojure.core/str "lighten"))
(def placeholderErrorFocusColor (clojure.core/str "lighten"))
(def invertedLoaderFillColor (clojure.core/str "rgba"))
(def
 transparentInvertedPlaceholderColor
 (clojure.core/str invertedUnselectedTextColor))
(def transparentInvertedColor (clojure.core/str white))
(defstyles root)
