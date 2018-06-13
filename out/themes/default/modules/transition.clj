(clojure.core/ns
 themes.default.modules.transition
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def transitionDefaultEasing (clojure.core/str defaultEasing))
(def transitionDefaultFill (clojure.core/str "both"))
(def transitionDefaultDuration (clojure.core/str "300ms"))
(def use3DAcceleration (clojure.core/str "translateZ"))
(def backfaceVisibility (clojure.core/str "hidden"))
(defstyles root)
