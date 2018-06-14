(clojure.core/ns
 styles.themes.default.modules.tab
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def loadingMinHeight (clojure.core/str "250px"))
(def loadingContentPosition (clojure.core/str "relative"))
(def loadingContentOffset (clojure.core/str "-10000px"))
(def loaderDistanceFromTop (clojure.core/str "100px"))
(def loaderSize (clojure.core/str "2.5em"))
(defstyles root)
