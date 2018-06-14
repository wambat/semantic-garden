(clojure.core/ns
 styles.themes.github.collections.grid
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def gutterWidth (clojure.core/str "1.5381.538" " " "rem"))
(defstyles root)
