(clojure.core/ns
 themes.default.modules.sidebar
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def perspective (clojure.core/str "1500px"))
(def duration (clojure.core/str "500ms"))
(def easing (clojure.core/str defaultEasing))
(def dimmerColor (clojure.core/str "rgba"))
(def dimmerTransition (clojure.core/str "opacity" " " duration))
(def canvasBackground (clojure.core/str lightBlack))
(def
 boxShadow
 (clojure.core/str "0px" " " "0px" " " "20px" " " borderColor))
(def horizontalBoxShadow (clojure.core/str boxShadow))
(def verticalBoxShadow (clojure.core/str boxShadow))
(def bottomLayer (clojure.core/str "11"))
(def middleLayer (clojure.core/str "22"))
(def fixedLayer (clojure.core/str "101101"))
(def topLayer (clojure.core/str "102102"))
(def dimmerLayer (clojure.core/str "10001000"))
(def veryThinWidth (clojure.core/str "60px"))
(def thinWidth (clojure.core/str "150px"))
(def width (clojure.core/str "260px"))
(def wideWidth (clojure.core/str "350px"))
(def veryWideWidth (clojure.core/str "475px"))
(def height (clojure.core/str "36px"))
(defstyles root)
