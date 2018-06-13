(clojure.core/ns
 themes.github.collections.breadcrumb
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def dividerOpacity "(:measurement 1)")
(def dividerSpacing "(:measurement 0)")
(def dividerSize "(:variableName @ big)")
(def dividerColor "(:identifier inherit)")
(def huge "(:measurement 1.5384 em)")
(defstyles root)
