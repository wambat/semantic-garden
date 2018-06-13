(clojure.core/ns
 definitions.modules.sidebar
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type "module")
(def element "sidebar")
(defstyles root [".ui.sidebar" nil])
