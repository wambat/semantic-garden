(clojure.core/ns
 themes.github.collections.table
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str "#F8F8F8"))
(def cellVerticalPadding (clojure.core/str relative6px))
(def cellHorizontalPadding (clojure.core/str relative8px))
(defstyles root)
