(clojure.core/ns
 themes.github.collections.grid
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def gutterWidth "(:identifier rem)")
(defstyles root)
