(clojure.core/ns
 themes.pulsar.elements.loader
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.loader:after"
  {"-webkit-animation"
   (clojure.core/str
    "loader-pulsar"
    " "
    "2s"
    " "
    "infinite"
    " "
    "linear"),
   "animation"
   (clojure.core/str
    "loader-pulsar"
    " "
    "2s"
    " "
    "infinite"
    " "
    "linear")}])
