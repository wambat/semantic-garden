(clojure.core/ns
 themes.material.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [) :refer :all]))
(defstyles
 root
 [".ui.primary.button:hover" nil]
 [".ui.secondary.button:hover" nil])
