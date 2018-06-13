(clojure.core/ns
 themes.default.elements.divider
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.horizontal.divider:before" {"background-image" nil}]
 [".ui.horizontal.divider:after" {"background-image" nil}])
