(clojure.core/ns
 themes.twitter.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.primary.button"
  {"box-shadow"
   (clojure.core/str "00" " " "2px" " " "00" " " "rgba" " " "inset")}]
 [".ui.primary.button" ["> .icon" {"color" nil}]])
