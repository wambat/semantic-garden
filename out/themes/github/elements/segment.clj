(clojure.core/ns
 themes.github.elements.segment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def segmentBorderWidth (clojure.core/str "1px"))
(def border (clojure.core/str "1px" " " "solid" " " "#D8DEE2"))
(def boxShadow (clojure.core/str "0px" " " "1px" " " "3px" " " "rgba"))
(def verticalPadding (clojure.core/str "20px"))
(def horizontalPadding (clojure.core/str "20px"))
(def borderRadius (clojure.core/str "4px"))
(def
 raisedBoxShadow
 (clojure.core/str "0px" " " "1px" " " "3px" " " "rgba"))
(def coloredBorderSize (clojure.core/str "0.5em"))
(def secondaryBackground (clojure.core/str "#F9F9F9"))
(def secondaryColor (clojure.core/str textColor))
(def tertiaryBackground (clojure.core/str "#F0F0F0"))
(def tertiaryColor (clojure.core/str textColor))
(def secondaryInvertedBackground (clojure.core/str "#555555"))
(def secondaryInvertedColor (clojure.core/str textColor))
(def tertiaryInvertedBackground (clojure.core/str "#333333"))
(def tertiaryInvertedColor (clojure.core/str textColor))
(defstyles root)
