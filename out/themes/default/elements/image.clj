(clojure.core/ns
 themes.default.elements.image
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def placeholderColor "(:identifier transparent)")
(def roundedBorderRadius "(:measurement 0.3125 em)")
(def imageHorizontalMargin "(:identifier rem)")
(def imageVerticalMargin "(:identifier rem)")
(def imageBorder ")")
(def avatarSize "(:measurement 2 em)")
(def avatarMargin "(:measurement 0.25 em)")
(def spacedDistance "(:measurement 0.5 em)")
(def floatedHorizontalMargin "(:measurement 1 em)")
(def floatedVerticalMargin "(:measurement 1 em)")
(def miniWidth "(:measurement 35 px)")
(def tinyWidth "(:measurement 80 px)")
(def smallWidth "(:measurement 150 px)")
(def mediumWidth "(:measurement 300 px)")
(def largeWidth "(:measurement 450 px)")
(def bigWidth "(:measurement 600 px)")
(def hugeWidth "(:measurement 800 px)")
(def massiveWidth "(:measurement 960 px)")
(defstyles root)
