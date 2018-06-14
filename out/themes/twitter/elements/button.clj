(clojure.core/ns
 styles.themes.twitter.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageFont (clojure.core/str "sans-serif"))
(def textColor (clojure.core/str "#66757F"))
(def blue (clojure.core/str "#55ACEE"))
(def backgroundColor (clojure.core/str "#F5F8FA"))
(def backgroundImage (clojure.core/str "linear-gradient"))
(def color (clojure.core/str "#66757F"))
(def borderBoxShadowColor (clojure.core/str "#E1E8ED"))
(def textTransform (clojure.core/str "none"))
(def fontWeight (clojure.core/str "bold"))
(def textColor (clojure.core/str "#333333"))
(def horizontalPadding (clojure.core/str "1.284em"))
(def verticalPadding (clojure.core/str "0.8571em"))
(def activeBackgroundColor (clojure.core/str "rgba"))
(def primaryColor (clojure.core/str blue))
(def coloredBackgroundImage (clojure.core/str subtleGradient))
(def hoverBackgroundColor (clojure.core/str "#E1E8ED"))
(def hoverBackgroundImage (clojure.core/str "linear-gradient"))
(def hoverColor (clojure.core/str "#292F33"))
(def downBackgroundColor (clojure.core/str "#E1E8ED"))
(def downColor (clojure.core/str "#292F33"))
(def
 downPressedShadow
 (clojure.core/str "0px" " " "1px" " " "4px" " " "rgba" " " "inset"))
(def labeledIconBackgroundColor (clojure.core/str "rgba"))
(def labeledIconBorder (clojure.core/str "rgba"))
(defstyles root)
