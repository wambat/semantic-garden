(clojure.core/ns
 themes.material.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def googleFontName nil)
(def pageFont (clojure.core/str "sans-serif"))
(def medium (clojure.core/str "13px"))
(def verticalPadding (clojure.core/str "0.8em"))
(def horizontalPadding (clojure.core/str "0.8em"))
(def borderRadius (clojure.core/str relative3px))
(def color nil)
(def fontWeight (clojure.core/str "normal"))
(def textTransform (clojure.core/str "none"))
(def backgroundColor (clojure.core/str white))
(def backgroundImage (clojure.core/str "linear-gradient"))
(def solidBorderColor nil)
(def borderBoxShadowColor (clojure.core/str solidBorderColor))
(def
 borderBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  solidBorderColor
  " "
  "inset"))
(def
 shadowBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "transparent"))
(def
 transition
 (clojure.core/str "background" " " "0.3s" " " defaultEasing))
(def hoverBackgroundColor (clojure.core/str white))
(def
 hoverBoxShadow
 (clojure.core/str "0px" " " "2px" " " "3px" " " "0px" " " "rgba"))
(def downBackgroundColor (clojure.core/str white))
(def downBackgroundImage (clojure.core/str "linear-gradient"))
(def downTextColor nil)
(def downBoxShadow (clojure.core/str borderBoxShadow))
(def activeBackgroundColor nil)
(def activeBoxShadow nil)
(def basicBorderSize (clojure.core/str "0px"))
(def basicBorderRadius (clojure.core/str "4px"))
(def basicColoredBorderSize (clojure.core/str "1px"))
(def basicHoverBackground (clojure.core/str white))
(def basicHoverBoxShadow (clojure.core/str hoverBoxShadow))
(def basicDownBackground (clojure.core/str white))
(def basicDownBoxShadow (clojure.core/str downBoxShadow))
(def basicActiveBackground nil)
(def
 basicActiveBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " "rgba"))
(def labeledIconBackgroundColor (clojure.core/str "transparent"))
(def labeledIconWidth (clojure.core/str "2em"))
(def labeledLabelBorderOffset (clojure.core/str "0px"))
(def coloredBackgroundImage (clojure.core/str subtleGradient))
(def
 coloredBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  "rgba"
  " "
  "inset"))
(def primaryColor nil)
(def primaryBoxShadow nil)
(def secondaryColor nil)
(def secondaryBackgroundImage (clojure.core/str backgroundImage))
(def secondaryTextColor (clojure.core/str textColor))
(def secondaryBoxShadow (clojure.core/str borderBoxShadow))
(def positiveColor nil)
(def negativeColor nil)
(def invertedBorderSize (clojure.core/str "1px"))
(defstyles root)
