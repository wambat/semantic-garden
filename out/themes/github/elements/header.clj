(clojure.core/ns
 themes.github.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def iconMargin "(:measurement 4 px)")
(defstyles root)
