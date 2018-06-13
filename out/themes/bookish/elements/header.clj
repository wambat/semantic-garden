(clojure.core/ns
 themes.bookish.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [) :refer :all]))
(defstyles
 root
 ["h1.ui.header" {"font-weight" (clojure.core/str "bold")}]
 [".ui.huge.header" {"font-weight" (clojure.core/str "bold")}]
 ["h2.ui.header" {"font-weight" (clojure.core/str "bold")}]
 [".ui.large.header" {"font-weight" (clojure.core/str "bold")}])
