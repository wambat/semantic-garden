(clojure.core/ns
 styles.definitions.modules.dimmer
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "dimmer"))
(defstyles
 root
 [".dimmable:not([body])"
  {"position" (clojure.core/str dimmablePosition)}]
 [".ui.dimmer" nil])
