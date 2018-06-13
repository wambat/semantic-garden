(clojure.core/ns
 themes.pulsar.elements.loader
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def loaderSpeed (clojure.core/str "2s"))
(def loaderLineColor (clojure.core/str primaryColor))
(def invertedLoaderLineColor (clojure.core/str lightPrimaryColor))
(defstyles root)
