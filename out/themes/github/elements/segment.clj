(clojure.core/ns
 themes.github.elements.segment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def segmentBorderWidth (clojure.core/str "1px"))
(def border nil)
(def boxShadow (clojure.core/str "0px" " " "1px" " " "3px" " " "rgba"))
(def verticalPadding (clojure.core/str "20px"))
(def horizontalPadding (clojure.core/str "20px"))
(def borderRadius (clojure.core/str "4px"))
(def
 raisedBoxShadow
 (clojure.core/str "0px" " " "1px" " " "3px" " " "rgba"))
(def coloredBorderSize (clojure.core/str "0.5em"))
(def secondaryBackground nil)
(def secondaryColor (clojure.core/str textColor))
(def tertiaryBackground nil)
(def tertiaryColor (clojure.core/str textColor))
(def secondaryInvertedBackground nil)
(def secondaryInvertedColor (clojure.core/str textColor))
(def tertiaryInvertedBackground nil)
(def tertiaryInvertedColor (clojure.core/str textColor))
(defstyles root)
