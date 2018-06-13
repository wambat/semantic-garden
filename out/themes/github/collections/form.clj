(clojure.core/ns
 themes.github.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def inputBackground "#FAFAFA")
(def inputBorder "#CCCCCC")
(def inputBoxShadow "(:identifier inset)")
(def inputBorderRadius "(:measurement 3 px)")
(def labelFontWeight "(:identifier bold)")
(def labelDistance "(:measurement 6 px)")
(def inputFocusBackground "#FFFFFF")
(def inputFocusBoxShadow ")")
(def inputFocusBorderColor "#51A7E8")
(def inputFocusBorderRadius "(:variableName @ inputBorderRadius)")
(defstyles root)
