(clojure.core/ns
 themes.github.elements.input
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def
 boxShadow
 (clojure.core/str "00" " " "1px" " " "2px" " " "rgba" " " "inset"))
(def verticalPadding (clojure.core/str relative7px))
(def horizontalPadding (clojure.core/str relative8px))
(def borderColor (clojure.core/str "#CCCCCC"))
(def focusBorderColor (clojure.core/str "#51A7E8"))
(def
 focusBoxShadow
 (clojure.core/str "00" " " "00" " " "5px" " " "rgba"))
(defstyles root)
