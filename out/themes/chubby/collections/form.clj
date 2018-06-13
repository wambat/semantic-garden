(clojure.core/ns
 themes.chubby.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def labelTextTransform "(:identifier uppercase)")
(def labelFontSize "(:measurement 0.8 em)")
(def inputPadding "(:measurement 1.2 em)")
(def inputBorder "(:variableName @ borderColor)")
(defstyles root)
