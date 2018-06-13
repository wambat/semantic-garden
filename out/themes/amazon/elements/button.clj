(clojure.core/ns
 themes.amazon.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.button"
  {"background-image"
   (clojure.core/str
    "linear-gradient"
    " "
    "repeat"
    " "
    "scroll"
    " "
    "00"
    " "
    "00"
    " "
    "rgba")}]
 [".ui.primary.button"
  {"color" nil,
   "border" (clojure.core/str "1px" " " "solid"),
   "border-color" nil}]
 [".ui.primary.button:hover" {"border-color" nil, "color" nil}]
 [".ui.secondary.button"
  {"border" (clojure.core/str "1px" " " "solid"), "border-color" nil}]
 [".ui.secondary.button:hover" {"border-color" nil}]
 [".ui.labeled.icon.buttons"
  [".button"
   ["> .icon"
    {"padding-bottom" (clojure.core/str "0.48em"),
     "padding-top" (clojure.core/str "0.48em"),
     "position" (clojure.core/str "absolute"),
     "text-align" (clojure.core/str "center"),
     "width" (clojure.core/str "2em"),
     "height" (clojure.core/str "2em"),
     "top" (clojure.core/str "0.35em"),
     "left" (clojure.core/str "0.4em"),
     "border-radius" (clojure.core/str "3px")}]]]
 [".ui.labeled.icon.button"
  ["> .icon"
   {"padding-bottom" (clojure.core/str "0.48em"),
    "padding-top" (clojure.core/str "0.48em"),
    "position" (clojure.core/str "absolute"),
    "text-align" (clojure.core/str "center"),
    "width" (clojure.core/str "2em"),
    "height" (clojure.core/str "2em"),
    "top" (clojure.core/str "0.35em"),
    "left" (clojure.core/str "0.4em"),
    "border-radius" (clojure.core/str "3px")}]]
 [".ui.right.labeled.icon.buttons"
  [".button"
   ["> .icon"
    {"left" (clojure.core/str "auto"),
     "right" (clojure.core/str "0.4em"),
     "border-radius" (clojure.core/str "3px")}]]]
 [".ui.right.labeled.icon.button"
  ["> .icon"
   {"left" (clojure.core/str "auto"),
    "right" (clojure.core/str "0.4em"),
    "border-radius" (clojure.core/str "3px")}]]
 [".ui.basic.labeled.icon.buttons" [".button" ["> .icon" nil]]]
 [".ui.basic.labeled.icon.button" ["> .icon" nil]])
