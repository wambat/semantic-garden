(clojure.core/ns
 themes.material.collections.menu
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def fontFamily "(:identifier sans-serif)")
(def boxShadow ")")
(def dividerSize "(:measurement 0 px)")
(def itemVerticalPadding "(:variableName @ relativeLarge)")
(def itemHorizontalPadding "(:variableName @ relativeLarge)")
(defstyles root)
