(clojure.core/ns
 themes.github.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageFont (clojure.core/str "sans-serif"))
(def textTransform (clojure.core/str "none"))
(def fontWeight (clojure.core/str "bold"))
(def textColor (clojure.core/str "#333333"))
(def textShadow (clojure.core/str "0px" " " "1px" " " "0px" " " "rgba"))
(def
 invertedTextShadow
 (clojure.core/str "0px" " " "-1px" " " "0px" " " "rgba"))
(def borderRadius (clojure.core/str relativeBorderRadius))
(def verticalPadding (clojure.core/str "0.75em"))
(def horizontalPadding (clojure.core/str "1.15em"))
(def backgroundColor (clojure.core/str "#FAFAFA"))
(def backgroundImage (clojure.core/str "linear-gradient"))
(def boxShadow (clojure.core/str "00" " " "1px" " " "3px" " " "rgba"))
(def coloredBackgroundImage (clojure.core/str "linear-gradient"))
(def
 coloredBoxShadow
 (clojure.core/str "00" " " "1px" " " "3px" " " "rgba"))
(def hoverBackgroundColor (clojure.core/str "#E0E0E0"))
(def hoverBackgroundImage (clojure.core/str "linear-gradient"))
(def hoverBoxShadow (clojure.core/str boxShadow))
(def downBackgroundColor (clojure.core/str ""))
(def downBackgroundImage (clojure.core/str ""))
(def
 downBoxShadow
 (clojure.core/str "00" " " "3px" " " "5px" " " "rgba" " " "inset"))
(def activeBackgroundColor (clojure.core/str "#DFDFDF"))
(def activeBackgroundImage (clojure.core/str "none"))
(def
 activeBoxShadow
 (clojure.core/str "00" " " "3px" " " "5px" " " "rgba" " " "inset"))
(def labeledIconBackgroundColor (clojure.core/str "transparent"))
(def labeledIconBorder (clojure.core/str "transparent"))
(def labeledIconPadding nil)
(def basicFontWeight (clojure.core/str "bold"))
(def basicTextColor (clojure.core/str linkColor))
(def basicHoverTextColor (clojure.core/str linkHoverColor))
(def basicHoverBackground (clojure.core/str "#E0E0E0"))
(def blue (clojure.core/str "#3072B3"))
(def green (clojure.core/str "#60B044"))
(def black (clojure.core/str "#5D5D5D"))
(def primaryColor (clojure.core/str blue))
(def secondaryColor (clojure.core/str black))
(def mini (clojure.core/str "0.60.6" " " "rem"))
(def tiny (clojure.core/str "0.70.7" " " "rem"))
(def small (clojure.core/str "0.850.85" " " "rem"))
(def medium (clojure.core/str "0.920.92" " " "rem"))
(def large (clojure.core/str "11" " " "rem"))
(def big (clojure.core/str "1.1251.125" " " "rem"))
(def huge (clojure.core/str "1.251.25" " " "rem"))
(def massive (clojure.core/str "1.31.3" " " "rem"))
(defstyles root)
