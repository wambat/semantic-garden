((clojure.core/ns
  definitions.modules.nag
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'module'")
 (def element "'nag'")
 (defstyles
  root
  [".ui.nag"
   {"width" (clojure.core/str width),
    "top" (clojure.core/str top),
    "margin" (clojure.core/str margin),
    "padding" (clojure.core/str padding),
    "text-align" (clojure.core/str textAlign),
    "position" (clojure.core/str position),
    "z-index" (clojure.core/str zIndex),
    "min-height" (clojure.core/str minHeight),
    "box-shadow" (clojure.core/str boxShadow),
    "font-size" (clojure.core/str fontSize),
    "border-radius" (clojure.core/str topBorderRadius),
    "display" (clojure.core/str "none"),
    "transition" (clojure.core/str transition),
    "background" (clojure.core/str background),
    "color" (clojure.core/str color),
    "opacity" (clojure.core/str opacity),
    "left" (clojure.core/str "0px")}]
  ["a.ui.nag" {"cursor" (clojure.core/str "pointer")}]
  [".ui.nag"
   ["> .title"
    {"display" (clojure.core/str "inline-block"),
     "margin" (clojure.core/str titleMargin),
     "color" (clojure.core/str titleColor)}]]
  [".ui.nag"
   ["> .close.icon"
    {"cursor" (clojure.core/str "pointer"),
     "opacity" (clojure.core/str closeOpacity),
     "position" (clojure.core/str "absolute"),
     "top" (clojure.core/str closeTop),
     "right" (clojure.core/str closeRight),
     "font-size" (clojure.core/str closeSize),
     "margin" (clojure.core/str closeMargin),
     "color" (clojure.core/str closeColor),
     "transition" (clojure.core/str closeTransition)}]]
  [".ui.nag:hover"
   {"background" (clojure.core/str nagHoverBackground),
    "opacity" (clojure.core/str nagHoverOpacity)}]
  [".ui.nag"
   [".close:hover" {"opacity" (clojure.core/str closeHoverOpacity)}]]
  [".ui.overlay.nag"
   {"position" (clojure.core/str "absolute"),
    "display" (clojure.core/str "block")}]
  [".ui.fixed.nag" {"position" (clojure.core/str "fixed")}]
  [".ui.bottom.nags"
   {"border-radius" (clojure.core/str bottomBorderRadius),
    "top" (clojure.core/str "auto"),
    "bottom" (clojure.core/str bottom)}]
  [".ui.bottom.nag"
   {"border-radius" (clojure.core/str bottomBorderRadius),
    "top" (clojure.core/str "auto"),
    "bottom" (clojure.core/str bottom)}]
  [".ui.inverted.nags"
   [".nag"
    {"background-color" (clojure.core/str invertedBackground),
     "color" (clojure.core/str darkTextColor)}]]
  [".ui.inverted.nag"
   {"background-color" (clojure.core/str invertedBackground),
    "color" (clojure.core/str darkTextColor)}]
  [".ui.inverted.nags"
   [".nag" [".close" {"color" (clojure.core/str lightTextColor)}]]]
  [".ui.inverted.nags"
   [".nag" [".title" {"color" (clojure.core/str lightTextColor)}]]]
  [".ui.inverted.nag"
   [".close" {"color" (clojure.core/str lightTextColor)}]]
  [".ui.inverted.nag"
   [".title" {"color" (clojure.core/str lightTextColor)}]]
  [".ui.nags"
   [".nag" {"border-radius" (clojure.core/str groupedBorderRadius)}]]
  [".ui.nags"
   [".nag:last-child"
    {"border-radius" (clojure.core/str topBorderRadius)}]]
  [".ui.bottom.nags"
   [".nag:last-child"
    {"border-radius" (clojure.core/str bottomBorderRadius)}]]))
