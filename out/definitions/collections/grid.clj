(clojure.core/ns
 definitions.collections.grid
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type nil)
(def element nil)
(defstyles
 root
 [".ui.grid"
  {"display" (clojure.core/str "flex"),
   "flex-direction" (clojure.core/str "row"),
   "flex-wrap" (clojure.core/str "wrap"),
   "align-items" (clojure.core/str "stretch"),
   "padding" (clojure.core/str "0em")}]
 [".ui.grid" nil])
