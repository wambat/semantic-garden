(clojure.core/ns
 styles.definitions.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "button"))
(defstyles root [".ui.button" nil])
