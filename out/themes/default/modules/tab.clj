(clojure.core/ns
 themes.default.modules.tab
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def loadingMinHeight "(:measurement 250 px)")
(def loadingContentPosition "(:identifier relative)")
(def loadingContentOffset "(:measurement -10000 px)")
(def loaderDistanceFromTop "(:measurement 100 px)")
(def loaderSize "(:measurement 2.5 em)")
(defstyles root)
