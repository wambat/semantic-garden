(clojure.core/ns
 themes.github.collections.table
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background "#F8F8F8")
(def cellVerticalPadding "(:variableName @ relative6px)")
(def cellHorizontalPadding "(:variableName @ relative8px)")
(defstyles root)
