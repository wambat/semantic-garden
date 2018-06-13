(clojure.core/ns
 themes.gmail.collections.message
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background "#F3F3F3")
(def boxShadow "(:identifier inset)")
(def borderRadius "(:measurement 4 px)")
(def verticalPadding "(:measurement 7 px)")
(def horizontalPadding "(:measurement 15 px)")
(def headerFontSize "(:measurement 1 em)")
(def floatingBoxShadow ")")
(def iconSize "(:measurement 1.5 em)")
(def iconDistance "(:measurement 1 em)")
(def warningBackgroundColor "#F9EDBE")
(defstyles root)
