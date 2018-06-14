(clojure.core/ns
 styles.themes.material.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def headerFont (clojure.core/str "sans-serif"))
(def fontWeight (clojure.core/str "normal"))
(def iconSize (clojure.core/str "2em"))
(def iconOffset (clojure.core/str "0.2em"))
(def iconAlignment (clojure.core/str "top"))
(def subHeaderFontSize (clojure.core/str "11" " " "rem"))
(def h1 (clojure.core/str "2.252.25" " " "rem"))
(def h2 (clojure.core/str "22" " " "rem"))
(def h3 (clojure.core/str "1.751.75" " " "rem"))
(def h4 (clojure.core/str "1.51.5" " " "rem"))
(def h5 (clojure.core/str "1.251.25" " " "rem"))
(defstyles root)
