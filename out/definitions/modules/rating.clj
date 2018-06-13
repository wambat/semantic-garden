(clojure.core/ns
 definitions.modules.rating
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "rating"))
(defstyles
 root
 [".ui.rating"
  {"display" (clojure.core/str "inline-flex"),
   "white-space" (clojure.core/str whiteSpace),
   "vertical-align" (clojure.core/str verticalAlign)}]
 [".ui.rating:last-child" {"margin-right" (clojure.core/str "0em")}]
 [".ui.rating"
  [".icon"
   {"width" (clojure.core/str iconWidth),
    "height" (clojure.core/str iconHeight),
    "margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str "0em"),
    "text-align" (clojure.core/str "center"),
    "cursor" (clojure.core/str iconCursor),
    "font-weight" (clojure.core/str normal),
    "font-style" (clojure.core/str "normal"),
    "transition" (clojure.core/str iconTransition),
    "flex" (clojure.core/str "11" " " "00" " " "auto")}]]
 [".ui.rating"
  [".icon"
   {"background" (clojure.core/str inactiveBackground),
    "color" (clojure.core/str inactiveColor)}]]
 [".ui.rating"
  [".active.icon"
   {"background" (clojure.core/str activeBackground),
    "color" (clojure.core/str activeColor)}]]
 [".ui.rating"
  [".icon.selected"
   {"background" (clojure.core/str selectedBackground),
    "color" (clojure.core/str selectedColor)}]]
 [".ui.rating"
  [".icon.selected.active"
   {"background" (clojure.core/str selectedBackground),
    "color" (clojure.core/str selectedColor)}]]
 [".ui.star.rating"
  [".icon"
   {"width" (clojure.core/str starIconWidth),
    "height" (clojure.core/str starIconHeight),
    "background" (clojure.core/str starInactiveBackground),
    "color" (clojure.core/str starInactiveColor),
    "text-shadow" (clojure.core/str starInactiveTextShadow)}]]
 [".ui.star.rating"
  [".active.icon"
   {"background" (clojure.core/str starActiveBackground),
    "color" (clojure.core/str starActiveColor),
    "text-shadow" (clojure.core/str starActiveTextShadow)}]]
 [".ui.star.rating"
  [".icon.selected"
   {"background" (clojure.core/str starSelectedBackground),
    "color" (clojure.core/str starSelectedColor),
    "text-shadow" (clojure.core/str starSelectedTextShadow)}]]
 [".ui.star.rating"
  [".icon.selected.active"
   {"background" (clojure.core/str starSelectedBackground),
    "color" (clojure.core/str starSelectedColor),
    "text-shadow" (clojure.core/str starSelectedTextShadow)}]]
 [".ui.heart.rating"
  [".icon"
   {"width" (clojure.core/str heartIconWidth),
    "height" (clojure.core/str heartIconHeight),
    "background" (clojure.core/str heartInactiveBackground),
    "color" (clojure.core/str heartInactiveColor),
    "text-shadow" (clojure.core/str heartInactiveTextShadow)}]]
 [".ui.heart.rating"
  [".active.icon"
   {"background" (clojure.core/str heartActiveBackground),
    "color" (clojure.core/str heartActiveColor),
    "text-shadow" (clojure.core/str heartActiveTextShadow)}]]
 [".ui.heart.rating"
  [".icon.selected"
   {"background" (clojure.core/str heartSelectedBackground),
    "color" (clojure.core/str heartSelectedColor),
    "text-shadow" (clojure.core/str heartSelectedTextShadow)}]]
 [".ui.heart.rating"
  [".icon.selected.active"
   {"background" (clojure.core/str heartSelectedBackground),
    "color" (clojure.core/str heartSelectedColor),
    "text-shadow" (clojure.core/str heartSelectedTextShadow)}]]
 [".ui.disabled.rating"
  [".icon" {"cursor" (clojure.core/str "default")}]]
 [".ui.rating.selected"
  [".active.icon"
   {"opacity" (clojure.core/str interactiveActiveIconOpacity)}]]
 [".ui.rating.selected"
  [".icon.selected"
   {"opacity" (clojure.core/str interactiveSelectedIconOpacity)}]]
 [".ui.rating"
  [".icon.selected"
   {"opacity" (clojure.core/str interactiveSelectedIconOpacity)}]]
 [".ui.mini.rating" {"font-size" (clojure.core/str mini)}]
 [".ui.tiny.rating" {"font-size" (clojure.core/str tiny)}]
 [".ui.small.rating" {"font-size" (clojure.core/str small)}]
 [".ui.rating" {"font-size" (clojure.core/str medium)}]
 [".ui.large.rating" {"font-size" (clojure.core/str large)}]
 [".ui.huge.rating" {"font-size" (clojure.core/str huge)}]
 [".ui.massive.rating" {"font-size" (clojure.core/str massive)}])
