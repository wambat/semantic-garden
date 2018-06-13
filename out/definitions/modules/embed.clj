(clojure.core/ns
 definitions.modules.embed
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
 [".ui.embed"
  {"position" (clojure.core/str "relative"),
   "max-width" (clojure.core/str "100%"),
   "height" (clojure.core/str "0px"),
   "overflow" (clojure.core/str "hidden"),
   "background" (clojure.core/str background),
   "padding-bottom" (clojure.core/str widescreenRatio)}]
 [".ui.embed"
  ["iframe"
   {"position" (clojure.core/str "absolute"),
    "border" (clojure.core/str "none"),
    "width" (clojure.core/str "100%"),
    "height" (clojure.core/str "100%"),
    "top" (clojure.core/str "0px"),
    "left" (clojure.core/str "0px"),
    "margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str "0em")}]]
 [".ui.embed"
  ["embed"
   {"position" (clojure.core/str "absolute"),
    "border" (clojure.core/str "none"),
    "width" (clojure.core/str "100%"),
    "height" (clojure.core/str "100%"),
    "top" (clojure.core/str "0px"),
    "left" (clojure.core/str "0px"),
    "margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str "0em")}]]
 [".ui.embed"
  ["object"
   {"position" (clojure.core/str "absolute"),
    "border" (clojure.core/str "none"),
    "width" (clojure.core/str "100%"),
    "height" (clojure.core/str "100%"),
    "top" (clojure.core/str "0px"),
    "left" (clojure.core/str "0px"),
    "margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str "0em")}]]
 [".ui.embed" ["> .embed" {"display" (clojure.core/str "none")}]]
 [".ui.embed"
  ["> .placeholder"
   {"position" (clojure.core/str "absolute"),
    "cursor" (clojure.core/str "pointer"),
    "top" (clojure.core/str "0px"),
    "left" (clojure.core/str "0px"),
    "display" (clojure.core/str "block"),
    "width" (clojure.core/str "100%"),
    "height" (clojure.core/str "100%"),
    "background-color" (clojure.core/str placeholderBackground)}]]
 [".ui.embed"
  ["> .icon"
   {"cursor" (clojure.core/str "pointer"),
    "position" (clojure.core/str "absolute"),
    "top" (clojure.core/str "0px"),
    "left" (clojure.core/str "0px"),
    "width" (clojure.core/str "100%"),
    "height" (clojure.core/str "100%"),
    "z-index" (clojure.core/str "22")}]]
 [".ui.embed"
  ["> .icon:after"
   {"width" (clojure.core/str "100%"),
    "top" (clojure.core/str "0%"),
    "height" (clojure.core/str "100%"),
    "position" (clojure.core/str "absolute"),
    "z-index" (clojure.core/str "33"),
    "content" nil,
    "transition" (clojure.core/str placeholderBackgroundTransition),
    "background" (clojure.core/str placeholderBackground),
    "opacity" (clojure.core/str placeholderBackgroundOpacity),
    "left" (clojure.core/str "0%")}]]
 [".ui.embed"
  ["> .icon:before"
   {"position" (clojure.core/str "absolute"),
    "top" (clojure.core/str "50%"),
    "left" (clojure.core/str "50%"),
    "z-index" (clojure.core/str iconZIndex),
    "transform" (clojure.core/str "translateX" " " "translateY"),
    "color" (clojure.core/str iconColor),
    "font-size" (clojure.core/str iconSize),
    "text-shadow" (clojure.core/str iconShadow),
    "transition" (clojure.core/str iconTransition)}]]
 [".ui.embed"
  [".icon:hover"
   {"background" (clojure.core/str hoverPlaceholderBackground),
    "opacity" (clojure.core/str hoverPlaceholderBackgroundOpacity)}]]
 [".ui.embed"
  [".icon:hover" {"color" (clojure.core/str hoverIconColor)}]]
 [".ui.active.embed" ["> .icon" {"display" (clojure.core/str "none")}]]
 [".ui.active.embed"
  ["> .placeholder" {"display" (clojure.core/str "none")}]]
 [".ui.active.embed"
  ["> .embed" {"display" (clojure.core/str "block")}]]
 [".ui.square.embed" {"padding-bottom" (clojure.core/str squareRatio)}])
