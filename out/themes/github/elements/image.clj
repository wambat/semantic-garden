(clojure.core/ns
 styles.themes.github.elements.image
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def miniWidth (clojure.core/str "20px"))
(defstyles root)
