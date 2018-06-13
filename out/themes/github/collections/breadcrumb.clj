(clojure.core/ns
 themes.github.collections.breadcrumb
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def dividerOpacity (clojure.core/str "11"))
(def dividerSpacing (clojure.core/str "00"))
(def dividerSize (clojure.core/str big))
(def dividerColor (clojure.core/str "inherit"))
(def huge (clojure.core/str "1.5384em"))
(defstyles root)
