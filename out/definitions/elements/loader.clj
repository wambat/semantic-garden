(clojure.core/ns
 definitions.elements.loader
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type nil)
(def element nil)
(defstyles
 root
 [".ui.loader"
  {"display" (clojure.core/str "none"),
   "position" (clojure.core/str "absolute"),
   "top" (clojure.core/str loaderTopOffset),
   "left" (clojure.core/str loaderLeftOffset),
   "margin" (clojure.core/str "0px"),
   "text-align" (clojure.core/str "center"),
   "z-index" (clojure.core/str "10001000"),
   "transform" (clojure.core/str "translateX" " " "translateY")}]
 [".ui.loader:before"
  {"position" (clojure.core/str "absolute"),
   "content" nil,
   "top" (clojure.core/str "0%"),
   "left" (clojure.core/str "50%"),
   "width" (clojure.core/str "100%"),
   "height" (clojure.core/str "100%"),
   "border-radius" (clojure.core/str circularRadius),
   "border"
   (clojure.core/str loaderLineWidth " " "solid" " " loaderFillColor)}]
 [".ui.loader:after"
  {"width" (clojure.core/str "100%"),
   "border-width" (clojure.core/str loaderLineWidth),
   "top" (clojure.core/str "0%"),
   "border-color" (clojure.core/str shapeBorderColor),
   "height" (clojure.core/str "100%"),
   "border-style" (clojure.core/str "solid"),
   "position" (clojure.core/str "absolute"),
   "animation-iteration-count" (clojure.core/str "infinite"),
   "animation"
   (clojure.core/str "loader" " " loaderSpeed " " "linear"),
   "content" nil,
   "box-shadow"
   (clojure.core/str
    "0px"
    " "
    "0px"
    " "
    "0px"
    " "
    "1px"
    " "
    "transparent"),
   "border-radius" (clojure.core/str circularRadius),
   "left" (clojure.core/str "50%")}]
 ["from" {"transform" (clojure.core/str "rotate")}]
 ["to" {"transform" (clojure.core/str "rotate")}])
