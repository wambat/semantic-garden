(clojure.core/ns
 themes.material.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [) :refer :all]))
(defstyles
 root
 ["h1.ui.header" {"font-weight" (clojure.core/str "normal")}]
 [".ui.huge.header" {"font-weight" (clojure.core/str "normal")}]
 ["h2.ui.header" {"font-weight" (clojure.core/str "normal")}]
 [".ui.large.header" {"font-weight" (clojure.core/str "normal")}])
