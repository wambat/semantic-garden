(clojure.core/ns
 themes.basic.modules.progress
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background "(:identifier transparent)")
(def border "(:identifier none)")
(def padding "(:measurement 0 em)")
(def progressLeft "(:measurement 0 em)")
(def progressWidth "(:measurement 100 %)")
(def progressTextAlign "(:identifier center)")
(def labelFontWeight "(:variableName @ normal)")
(def labelTextAlign "(:identifier left)")
(def labelHeight "(:measurement 1.5 em)")
(defstyles root)
