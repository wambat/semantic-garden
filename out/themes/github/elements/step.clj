(clojure.core/ns
 themes.github.elements.step
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.steps" [".step:after" {"display" (clojure.core/str "none")}]]
 [".ui.steps"
  [".completed.step:before" {"opacity" (clojure.core/str "0.50.5")}]]
 [".ui.steps"
  [".step.active:after"
   {"display" (clojure.core/str "block"),
    "border" (clojure.core/str "none"),
    "border-bottom" (clojure.core/str "1px" " " "solid" " " "rgba"),
    "border-left" (clojure.core/str "1px" " " "solid" " " "rgba")}]]
 [".ui.vertical.steps"
  [".step.active:after"
   {"display" (clojure.core/str "block"),
    "border" (clojure.core/str "none"),
    "top" (clojure.core/str "50%"),
    "right" (clojure.core/str "0%"),
    "border-left" (clojure.core/str "none"),
    "border-bottom" (clojure.core/str "1px" " " "solid" " " "rgba"),
    "border-right" (clojure.core/str "1px" " " "solid" " " "rgba")}]])
