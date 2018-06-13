(clojure.core/ns
 themes.classic.collections.table
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def boxShadow (clojure.core/str subtleGradient))
(def headerBackground (clojure.core/str subtleGradient))
(def headerBoxShadow (clojure.core/str subtleShadow))
(def
 footerBoxShadow
 (clojure.core/str "0px" " " "-1px" " " "1px" " " "0px" " " "rgba"))
(def footerBackground (clojure.core/str "rgba"))
(defstyles root)
