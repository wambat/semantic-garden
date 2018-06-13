(clojure.core/ns
 themes.default.elements.rail
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def width "(:measurement 300 px)")
(def height "(:measurement 100 %)")
(def distance "(:identifier rem)")
(def splitDistance "")
(def closeDistance "(:measurement 2 em)")
(def veryCloseDistance "(:measurement 1 em)")
(def splitCloseDistance "")
(def splitVeryCloseDistance "")
(def dividingBorder "(:variableName @ borderColor)")
(def dividingDistance "(:identifier rem)")
(def splitDividingDistance "")
(def dividingWidth "")
(defstyles root)
