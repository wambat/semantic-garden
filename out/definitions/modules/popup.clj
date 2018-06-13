(clojure.core/ns
 definitions.modules.popup
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type "module")
(def element "popup")
(defstyles
 root
 [".ui.popup"
  {"min-width" (clojure.core/str "min-content"),
   "line-height" (clojure.core/str lineHeight),
   "right" (clojure.core/str "0px"),
   "max-width" (clojure.core/str maxWidth),
   "top" (clojure.core/str "0px"),
   "border" (clojure.core/str border),
   "padding" (clojure.core/str verticalPadding " " horizontalPadding),
   "position" (clojure.core/str "absolute"),
   "z-index" (clojure.core/str zIndex),
   "font-weight" (clojure.core/str fontWeight),
   "box-shadow" (clojure.core/str boxShadow),
   "border-radius" (clojure.core/str borderRadius),
   "display" (clojure.core/str "none"),
   "font-style" (clojure.core/str fontStyle),
   "background" (clojure.core/str background),
   "color" (clojure.core/str color)}]
 [".ui.popup"
  ["> .header"
   {"padding" (clojure.core/str "0em"),
    "font-family" (clojure.core/str headerFont),
    "font-size" (clojure.core/str headerFontSize),
    "line-height" (clojure.core/str headerLineHeight),
    "font-weight" (clojure.core/str headerFontWeight)}]]
 [".ui.popup"
  ["> .header"
   ["+ .content" {"padding-top" (clojure.core/str headerDistance)}]]]
 [".ui.popup:before"
  {"position" (clojure.core/str "absolute"),
   "content" nil,
   "width" (clojure.core/str arrowSize),
   "height" (clojure.core/str arrowSize),
   "background" (clojure.core/str arrowBackground),
   "transform" (clojure.core/str "rotate"),
   "z-index" (clojure.core/str arrowZIndex),
   "box-shadow" (clojure.core/str arrowBoxShadow)}])
