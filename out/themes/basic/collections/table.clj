(clojure.core/ns
 styles.themes.basic.collections.table
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def headerBackground (clojure.core/str white))
(def footerBackground (clojure.core/str white))
(def cellVerticalPadding (clojure.core/str "1em"))
(def cellHorizontalPadding (clojure.core/str "1em"))
(def stateMarkerWidth (clojure.core/str "1px"))
(defstyles root)
