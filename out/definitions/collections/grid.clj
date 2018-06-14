(clojure.core/ns
 styles.definitions.collections.grid
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "collection"))
(def element (clojure.core/str "grid"))
(defstyles
 root
 [".ui.grid"
  {"display" (clojure.core/str "flex"),
   "flex-direction" (clojure.core/str "row"),
   "flex-wrap" (clojure.core/str "wrap"),
   "align-items" (clojure.core/str "stretch"),
   "padding" (clojure.core/str "0em")}]
 [".ui.grid" nil])
