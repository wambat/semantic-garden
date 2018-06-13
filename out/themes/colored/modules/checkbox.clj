(clojure.core/ns
 themes.colored.modules.checkbox
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def checkboxActiveBackground "(:variableName @ primaryColor)")
(def checkboxActiveBorderColor "(:variableName @ primaryColor)")
(def checkboxActiveCheckColor "(:variableName @ white)")
(def
 checkboxActiveFocusBackground
 "(:variableName @ primaryColorFocus)")
(def
 checkboxActiveFocusBorderColor
 "(:variableName @ primaryColorFocus)")
(def checkboxActiveFocusCheckColor "(:variableName @ white)")
(def checkboxTransition "(:identifier none)")
(def radioActiveBackground "(:variableName @ white)")
(def radioActiveBorderColor "(:variableName @ primaryColor)")
(def radioActiveBulletColor "(:variableName @ primaryColor)")
(def radioActiveFocusBackground "(:variableName @ white)")
(def radioActiveFocusBorderColor "(:variableName @ primaryColorFocus)")
(def radioActiveFocusBulletColor "(:variableName @ primaryColorFocus)")
(def sliderOnLineColor "(:variableName @ primaryColor)")
(def sliderOnFocusLineColor "(:variableName @ primaryColorFocus)")
(def handleBackground "(:variableName @ subtleGradient)")
(def handleBoxShadow "(:identifier inset)")
(defstyles root)
