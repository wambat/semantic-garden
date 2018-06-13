(clojure.core/ns
 definitions.elements.icon
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "icon"))
(defstyles
 root
 ["i.icon"
  {"width" (clojure.core/str width),
   "font-family" (clojure.core/str "Icons"),
   "height" (clojure.core/str height),
   "margin"
   (clojure.core/str "0em" " " distanceFromText " " "0em" " " "0em"),
   "font-smoothing" (clojure.core/str "antialiased"),
   "backface-visibility" (clojure.core/str "hidden"),
   "-webkit-font-smoothing" (clojure.core/str "antialiased"),
   "text-align" (clojure.core/str "center"),
   "speak" (clojure.core/str "none"),
   "font-weight" (clojure.core/str normal),
   "text-decoration" (clojure.core/str "inherit"),
   "display" (clojure.core/str "inline-block"),
   "font-style" (clojure.core/str "normal"),
   "-moz-osx-font-smoothing" (clojure.core/str "grayscale"),
   "opacity" (clojure.core/str opacity)}]
 ["i.icon:before" {"background" (clojure.core/str "none")}]
 ["i.icon.loading"
  {"height" (clojure.core/str "1em"),
   "line-height" (clojure.core/str "11"),
   "animation"
   (clojure.core/str
    "icon-loading"
    " "
    loadingDuration
    " "
    "linear"
    " "
    "infinite")}]
 ["from" {"transform" (clojure.core/str "rotate")}]
 ["to" {"transform" (clojure.core/str "rotate")}])
