(clojure.core/ns
 themes.default.elements.rail
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def width (clojure.core/str "300px"))
(def height (clojure.core/str "100%"))
(def distance (clojure.core/str "44" " " "rem"))
(def splitDistance nil)
(def closeDistance (clojure.core/str "2em"))
(def veryCloseDistance (clojure.core/str "1em"))
(def splitCloseDistance nil)
(def splitVeryCloseDistance nil)
(def
 dividingBorder
 (clojure.core/str "1px" " " "solid" " " borderColor))
(def dividingDistance (clojure.core/str "55" " " "rem"))
(def splitDividingDistance nil)
(def dividingWidth nil)
(defstyles root)
