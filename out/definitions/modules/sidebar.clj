(clojure.core/ns
 styles.definitions.modules.sidebar
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "sidebar"))
(defstyles root [".ui.sidebar" nil])
