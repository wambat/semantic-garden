(clojure.core/ns
 themes.default.modules.sticky
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def transitionDuration (clojure.core/str defaultDuration))
(def transition (clojure.core/str "none"))
(def zIndex (clojure.core/str "800800"))
(defstyles root)
