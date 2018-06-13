(clojure.core/ns
 themes.classic.modules.progress
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background ")")
(def boxShadow "(:identifier inset)")
(def barBackground "#888888")
(def border "(:variableName @ borderColor)")
(def padding "(:variableName @ relative3px)")
(defstyles root)
