(clojure.core/ns
 themes.chubby.modules.accordion
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.styled.accordion"
  [".accordion"
   [".active.title"
    {"border-bottom"
     (clojure.core/str "1px" " " "solid" " " "rgba")}]]])
