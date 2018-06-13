(clojure.core/ns
 themes.default.elements.icon
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def fontName nil)
(def src nil)
(def fallbackSRC nil)
(def outlineFontName nil)
(def outlineSrc nil)
(def outlineFallbackSRC nil)
(def brandFontName nil)
(def brandSrc nil)
(def brandFallbackSRC nil)
(def opacity (clojure.core/str "11"))
(def width (clojure.core/str iconWidth))
(def height (clojure.core/str "1em"))
(def distanceFromText (clojure.core/str "0.250.25" " " "rem"))
(def linkOpacity (clojure.core/str "0.80.8"))
(def linkDuration (clojure.core/str "0.3s"))
(def loadingDuration (clojure.core/str "2s"))
(def circularSize (clojure.core/str "2em"))
(def circularPadding (clojure.core/str "0.5em" " " "0em"))
(def
 circularShadow
 (clojure.core/str
  "0em"
  " "
  "0em"
  " "
  "0em"
  " "
  "0.1em"
  " "
  "rgba"
  " "
  "inset"))
(def borderedSize (clojure.core/str "2em"))
(def borderedVerticalPadding (clojure.core/str))
(def borderedHorizontalPadding (clojure.core/str "0em"))
(def
 borderedShadow
 (clojure.core/str
  "0em"
  " "
  "0em"
  " "
  "0em"
  " "
  "0.1em"
  " "
  "rgba"
  " "
  "inset"))
(def cornerIconSize (clojure.core/str "0.45em"))
(def cornerIconStroke (clojure.core/str "1px"))
(def
 cornerIconShadow
 (clojure.core/str
  cornerIconStroke
  " "
  cornerIconStroke
  " "
  "00"
  " "
  white))
(def
 cornerIconInvertedShadow
 (clojure.core/str
  cornerIconStroke
  " "
  cornerIconStroke
  " "
  "00"
  " "
  black))
(def mini (clojure.core/str "0.4em"))
(def tiny (clojure.core/str "0.5em"))
(def small (clojure.core/str "0.75em"))
(def medium (clojure.core/str "1em"))
(def large (clojure.core/str "1.5em"))
(def big (clojure.core/str "2em"))
(def huge (clojure.core/str "4em"))
(def massive (clojure.core/str "8em"))
(defstyles root)
