(clojure.core/ns
 themes.default.elements.reveal
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def transitionDelay (clojure.core/str "0.1s"))
(def transitionDuration (clojure.core/str "0.5s"))
(def transitionEasing (clojure.core/str "cubic-bezier"))
(def
 transition
 (clojure.core/str
  "all"
  " "
  transitionDuration
  " "
  defaultEasing
  " "
  transitionDelay))
(def bottomZIndex (clojure.core/str "22"))
(def topZIndex (clojure.core/str "33"))
(def activeZIndex (clojure.core/str "44"))
(def overlayZIndex (clojure.core/str "55"))
(def rotateDegrees (clojure.core/str "110deg"))
(def
 moveTransition
 (clojure.core/str
  "transform"
  " "
  transitionDuration
  " "
  transitionEasing
  " "
  transitionDelay))
(def
 slideTransition
 (clojure.core/str
  "transform"
  " "
  transitionDuration
  " "
  defaultEasing
  " "
  transitionDelay))
(defstyles root)
