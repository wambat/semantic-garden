(clojure.core/ns
 themes.material.collections.menu
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def fontFamily (clojure.core/str "sans-serif"))
(def boxShadow (clojure.core/str "0px" " " "1px" " " "6px" " " "rgba"))
(def dividerSize (clojure.core/str "0px"))
(def itemVerticalPadding (clojure.core/str relativeLarge))
(def itemHorizontalPadding (clojure.core/str relativeLarge))
(defstyles root)
