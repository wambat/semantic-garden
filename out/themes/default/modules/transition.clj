(clojure.core/ns
 themes.default.modules.transition
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def transitionDefaultEasing "(:variableName @ defaultEasing)")
(def transitionDefaultFill "(:identifier both)")
(def transitionDefaultDuration "(:measurement 300 ms)")
(def use3DAcceleration ")")
(def backfaceVisibility "(:identifier hidden)")
(defstyles root)
