(clojure.core/ns
 themes.chubby.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def labelTextTransform (clojure.core/str "uppercase"))
(def labelFontSize (clojure.core/str "0.8em"))
(def inputPadding (clojure.core/str "1em" " " "1.2em"))
(def inputBorder (clojure.core/str "2px" " " "solid" " " borderColor))
(defstyles root)
