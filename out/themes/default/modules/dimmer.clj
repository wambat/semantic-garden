(clojure.core/ns
 themes.default.modules.dimmer
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def dimmablePosition (clojure.core/str "relative"))
(def dimmerPosition (clojure.core/str "absolute"))
(def backgroundColor (clojure.core/str "rgba"))
(def lineHeight (clojure.core/str "11"))
(def perspective (clojure.core/str "2000px"))
(def padding (clojure.core/str "1em"))
(def duration (clojure.core/str "0.5s"))
(def
 transition
 (clojure.core/str "background-color" " " duration " " "linear"))
(def zIndex (clojure.core/str "10001000"))
(def textAlign (clojure.core/str "center"))
(def verticalAlign (clojure.core/str "middle"))
(def textColor (clojure.core/str white))
(def overflow (clojure.core/str "hidden"))
(def blurredStartFilter nil)
(def blurredEndFilter nil)
(def
 blurredTransition
 (clojure.core/str "800ms" " " "filter" " " defaultEasing))
(def blurredBackgroundColor (clojure.core/str "rgba"))
(def blurredInvertedBackgroundColor (clojure.core/str "rgba"))
(def hiddenOpacity (clojure.core/str "00"))
(def visibleOpacity (clojure.core/str "11"))
(def transformStyle (clojure.core/str ""))
(def pageDimmerPosition (clojure.core/str "fixed"))
(def invertedBackgroundColor (clojure.core/str "rgba"))
(def invertedTextColor (clojure.core/str textColor))
(def simpleZIndex (clojure.core/str "11"))
(def simpleStartBackgroundColor (clojure.core/str "rgba"))
(def simpleEndBackgroundColor (clojure.core/str backgroundColor))
(def simpleInvertedStartBackgroundColor (clojure.core/str "rgba"))
(def
 simpleInvertedEndBackgroundColor
 (clojure.core/str invertedBackgroundColor))
(defstyles root)
