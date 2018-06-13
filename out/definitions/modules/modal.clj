(clojure.core/ns
 definitions.modules.modal
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
 [".ui.modal"
  {"transform-origin" (clojure.core/str transformOrigin),
   "will-change" (clojure.core/str "opacity"),
   "user-select" (clojure.core/str "text"),
   "border" (clojure.core/str border),
   "text-align" (clojure.core/str "left"),
   "z-index" (clojure.core/str zIndex),
   "box-shadow" (clojure.core/str boxShadow),
   "border-radius" (clojure.core/str borderRadius),
   "display" (clojure.core/str "none"),
   "flex" (clojure.core/str "00" " " "00" " " "auto"),
   "background" (clojure.core/str background)}]
 nil
 [":last-child"
  {"border-bottom-left-radius" (clojure.core/str borderRadius),
   "border-bottom-right-radius" (clojure.core/str borderRadius)}]
 [".ui.modal"
  ["> .close"
   {"width" (clojure.core/str closeHitbox),
    "right" (clojure.core/str closeRight),
    "top" (clojure.core/str closeTop),
    "height" (clojure.core/str closeHitbox),
    "padding" (clojure.core/str closePadding),
    "position" (clojure.core/str "absolute"),
    "z-index" (clojure.core/str "11"),
    "cursor" (clojure.core/str "pointer"),
    "font-size" (clojure.core/str closeSize),
    "color" (clojure.core/str closeColor),
    "opacity" (clojure.core/str closeOpacity)}]]
 [".ui.modal" ["> .close:hover" {"opacity" (clojure.core/str "11")}]]
 [".ui.modal"
  ["> .header"
   {"display" (clojure.core/str "block"),
    "font-family" (clojure.core/str headerFontFamily),
    "background" (clojure.core/str headerBackground),
    "margin" (clojure.core/str headerMargin),
    "padding" (clojure.core/str headerPadding),
    "box-shadow" (clojure.core/str headerBoxShadow),
    "color" (clojure.core/str headerColor),
    "border-bottom" (clojure.core/str headerBorder)}]]
 [".ui.modal"
  ["> .header:not([.ui])"
   {"font-size" (clojure.core/str headerFontSize),
    "line-height" (clojure.core/str headerLineHeight),
    "font-weight" (clojure.core/str headerFontWeight)}]]
 [".ui.modal"
  ["> .content"
   {"display" (clojure.core/str "block"),
    "width" (clojure.core/str "100%"),
    "font-size" (clojure.core/str contentFontSize),
    "line-height" (clojure.core/str contentLineHeight),
    "padding" (clojure.core/str contentPadding),
    "background" (clojure.core/str contentBackground)}]]
 [".ui.modal"
  ["> .image.content"
   {"display" (clojure.core/str "flex"),
    "flex-direction" (clojure.core/str "row")}]]
 [".ui.modal"
  ["> .content"
   ["> .image"
    {"display" (clojure.core/str "block"),
     "flex" (clojure.core/str "00" " " "11" " " "auto"),
     "width" (clojure.core/str imageWidth),
     "align-self" (clojure.core/str imageVerticalAlign)}]]]
 [nil ["aligned" {"align-self" (clojure.core/str "top")}]]
 [nil ["aligned" {"align-self" (clojure.core/str "middle")}]]
 [nil {"align-self" (clojure.core/str "stretch")}]
 [".ui.modal"
  ["> .content"
   ["> .description"
    {"display" (clojure.core/str "block"),
     "flex" (clojure.core/str "11" " " "00" " " "auto"),
     "min-width" (clojure.core/str "0px"),
     "align-self" (clojure.core/str descriptionVerticalAlign)}]]]
 [".ui.modal"
  ["> .content"
   ["> .icon"
    ["+ .description"
     {"flex" (clojure.core/str "00" " " "11" " " "auto"),
      "min-width" (clojure.core/str descriptionMinWidth),
      "width" (clojure.core/str descriptionWidth),
      "padding-left" (clojure.core/str descriptionDistance)}]]]]
 [".ui.modal"
  ["> .content"
   ["> .image"
    ["+ .description"
     {"flex" (clojure.core/str "00" " " "11" " " "auto"),
      "min-width" (clojure.core/str descriptionMinWidth),
      "width" (clojure.core/str descriptionWidth),
      "padding-left" (clojure.core/str descriptionDistance)}]]]]
 [".ui.modal"
  ["> .content"
   ["> .image"
    ["> i.icon"
     {"margin" (clojure.core/str "0em"),
      "opacity" (clojure.core/str "11"),
      "width" (clojure.core/str "auto"),
      "line-height" (clojure.core/str "11"),
      "font-size" (clojure.core/str imageIconSize)}]]]]
 [".ui.modal"
  ["> .actions"
   {"background" (clojure.core/str actionBackground),
    "padding" (clojure.core/str actionPadding),
    "border-top" (clojure.core/str actionBorder),
    "text-align" (clojure.core/str actionAlign)}]]
 [".ui.modal"
  [".actions"
   ["> .button" {"margin-left" (clojure.core/str buttonDistance)}]]])
