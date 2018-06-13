(clojure.core/ns
 themes.default.modules.shape
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def display (clojure.core/str "inline-block"))
(def perspective (clojure.core/str "2000px"))
(def duration (clojure.core/str "0.6s"))
(def easing (clojure.core/str "ease-in-out"))
(def hiddenSideOpacity (clojure.core/str "0.60.6"))
(def animatingZIndex (clojure.core/str "100100"))
(def transition (clojure.core/str "height" " " duration " " easing))
(def
 sideTransition
 (clojure.core/str "opacity" " " duration " " easing))
(def backfaceVisibility (clojure.core/str "hidden"))
(def sideMargin (clojure.core/str "0em"))
(def cubeSize (clojure.core/str "15em"))
(def cubeBackground (clojure.core/str "#E6E6E6"))
(def cubePadding (clojure.core/str "2em"))
(def cubeTextColor (clojure.core/str textColor))
(def
 cubeBoxShadow
 (clojure.core/str "0px" " " "0px" " " "2px" " " "rgba"))
(def cubeTextAlign (clojure.core/str "center"))
(def cubeFontSize (clojure.core/str "2em"))
(defstyles root)
