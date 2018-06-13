(clojure.core/ns
 themes.github.elements.image
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def miniWidth "(:measurement 20 px)")
(defstyles root)
