(clojure.core/ns
 themes.material.modules.modal
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [) :refer :all]))
(defstyles root [".ui.modal" [".header" nil]])
