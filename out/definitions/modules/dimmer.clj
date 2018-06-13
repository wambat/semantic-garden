(clojure.core/ns
 definitions.modules.dimmer
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type "module")
(def element "dimmer")
(defstyles
 root
 [".dimmable:not([body])"
  {"position" (clojure.core/str dimmablePosition)}]
 [".ui.dimmer" nil])
