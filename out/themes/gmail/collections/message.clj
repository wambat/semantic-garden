(clojure.core/ns
 themes.gmail.collections.message
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background nil)
(def
 boxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  "rgba"
  " "
  "inset"))
(def borderRadius (clojure.core/str "4px"))
(def verticalPadding (clojure.core/str "7px"))
(def horizontalPadding (clojure.core/str "15px"))
(def headerFontSize (clojure.core/str "1em"))
(def
 floatingBoxShadow
 (clojure.core/str "0px" " " "2px" " " "4px" " " "rgba"))
(def iconSize (clojure.core/str "1.5em"))
(def iconDistance (clojure.core/str "1em"))
(def warningBackgroundColor nil)
(defstyles root)
