(clojure.core/ns
 themes.github.elements.segment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def segmentBorderWidth "(:measurement 1 px)")
(def border "#D8DEE2")
(def boxShadow ")")
(def verticalPadding "(:measurement 20 px)")
(def horizontalPadding "(:measurement 20 px)")
(def borderRadius "(:measurement 4 px)")
(def raisedBoxShadow ")")
(def coloredBorderSize "(:measurement 0.5 em)")
(def secondaryBackground "#F9F9F9")
(def secondaryColor "(:variableName @ textColor)")
(def tertiaryBackground "#F0F0F0")
(def tertiaryColor "(:variableName @ textColor)")
(def secondaryInvertedBackground "#555555")
(def secondaryInvertedColor "(:variableName @ textColor)")
(def tertiaryInvertedBackground "#333333")
(def tertiaryInvertedColor "(:variableName @ textColor)")
(defstyles root)
