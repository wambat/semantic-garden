(clojure.core/ns
 themes.basic.elements.step
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.steps" [".step:after" {"display" (clojure.core/str "none")}]]
 [".ui.steps" [".step" nil]])
