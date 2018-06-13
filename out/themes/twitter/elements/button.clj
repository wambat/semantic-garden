(clojure.core/ns
 themes.twitter.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageFont (clojure.core/str "sans-serif"))
(def textColor nil)
(def blue nil)
(def backgroundColor nil)
(def backgroundImage (clojure.core/str "linear-gradient"))
(def color nil)
(def borderBoxShadowColor nil)
(def textTransform (clojure.core/str "none"))
(def fontWeight (clojure.core/str "bold"))
(def textColor nil)
(def horizontalPadding (clojure.core/str "1.284em"))
(def verticalPadding (clojure.core/str "0.8571em"))
(def activeBackgroundColor (clojure.core/str "rgba"))
(def primaryColor (clojure.core/str blue))
(def coloredBackgroundImage (clojure.core/str subtleGradient))
(def hoverBackgroundColor nil)
(def hoverBackgroundImage (clojure.core/str "linear-gradient"))
(def hoverColor nil)
(def downBackgroundColor nil)
(def downColor nil)
(def
 downPressedShadow
 (clojure.core/str "0px" " " "1px" " " "4px" " " "rgba" " " "inset"))
(def labeledIconBackgroundColor (clojure.core/str "rgba"))
(def labeledIconBorder (clojure.core/str "rgba"))
(defstyles root)
