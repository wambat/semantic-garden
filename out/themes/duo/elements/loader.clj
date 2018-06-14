(clojure.core/ns
 styles.themes.duo.elements.loader
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def
 shapeBorderColor
 (clojure.core/str
  primaryColor
  " "
  primaryColor
  " "
  secondaryColor
  " "
  secondaryColor))
(def
 invertedShapeBorderColor
 (clojure.core/str
  lightPrimaryColor
  " "
  lightPrimaryColor
  " "
  lightSecondaryColor
  " "
  lightSecondaryColor))
(defstyles root)
