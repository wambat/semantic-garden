(clojure.core/ns
 themes.github.elements.input
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def boxShadow "(:identifier inset)")
(def verticalPadding "(:variableName @ relative7px)")
(def horizontalPadding "(:variableName @ relative8px)")
(def borderColor "#CCCCCC")
(def focusBorderColor "#51A7E8")
(def focusBoxShadow ")")
(defstyles root)
