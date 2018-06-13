(clojure.core/ns
 themes.fixed-width.collections.grid
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def mobileWidth (clojure.core/str "auto"))
(def mobileMargin (clojure.core/str "0em"))
(def mobileGutter (clojure.core/str "0em"))
(def tabletWidth (clojure.core/str "auto"))
(def tabletMargin (clojure.core/str "0em"))
(def tabletGutter (clojure.core/str "8%"))
(def computerWidth (clojure.core/str "960px"))
(def computerMargin (clojure.core/str "auto"))
(def computerGutter (clojure.core/str "00"))
(def largeMonitorWidth (clojure.core/str "1180px"))
(def largeMonitorMargin (clojure.core/str "auto"))
(def largeMonitorGutter (clojure.core/str "00"))
(def widescreenMonitorWidth (clojure.core/str "1300px"))
(def widescreenMargin (clojure.core/str "auto"))
(def widescreenMonitorGutter (clojure.core/str "00"))
(def tableWidth (clojure.core/str ""))
(defstyles root)
