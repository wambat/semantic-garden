(clojure.core/ns
 styles.themes.classic.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def headerFont (clojure.core/str "sans-serif"))
(def blockBackground (clojure.core/str offWhite " " subtleGradient))
(def blockBoxShadow (clojure.core/str subtleShadow))
(defstyles root)
