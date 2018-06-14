(clojure.core/ns
 styles.themes.classic.modules.progress
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str "rgba"))
(def
 boxShadow
 (clojure.core/str "0px" " " "0px" " " "4px" " " "rgba" " " "inset"))
(def barBackground (clojure.core/str subtleGradient " " "#888888"))
(def border (clojure.core/str "1px" " " "solid" " " borderColor))
(def padding (clojure.core/str relative3px))
(defstyles root)
