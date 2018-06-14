(clojure.core/ns
 styles.themes.colored.modules.checkbox
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def checkboxActiveBackground (clojure.core/str primaryColor))
(def checkboxActiveBorderColor (clojure.core/str primaryColor))
(def checkboxActiveCheckColor (clojure.core/str white))
(def checkboxActiveFocusBackground (clojure.core/str primaryColorFocus))
(def
 checkboxActiveFocusBorderColor
 (clojure.core/str primaryColorFocus))
(def checkboxActiveFocusCheckColor (clojure.core/str white))
(def checkboxTransition (clojure.core/str "none"))
(def radioActiveBackground (clojure.core/str white))
(def radioActiveBorderColor (clojure.core/str primaryColor))
(def radioActiveBulletColor (clojure.core/str primaryColor))
(def radioActiveFocusBackground (clojure.core/str white))
(def radioActiveFocusBorderColor (clojure.core/str primaryColorFocus))
(def radioActiveFocusBulletColor (clojure.core/str primaryColorFocus))
(def sliderOnLineColor (clojure.core/str primaryColor))
(def sliderOnFocusLineColor (clojure.core/str primaryColorFocus))
(def handleBackground (clojure.core/str white " " subtleGradient))
(def
 handleBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  selectedBorderColor
  " "
  "inset"))
(defstyles root)
