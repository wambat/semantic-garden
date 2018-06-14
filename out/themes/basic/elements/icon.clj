(clojure.core/ns
 styles.themes.basic.elements.icon
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def fontPath (clojure.core/str "themes/basic/assets/fonts"))
(def src nil)
(defstyles root)
