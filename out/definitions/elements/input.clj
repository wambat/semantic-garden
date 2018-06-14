(clojure.core/ns
 styles.definitions.elements.input
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "input"))
(defstyles
 root
 [".ui.input"
  {"position" (clojure.core/str "relative"),
   "font-weight" (clojure.core/str normal),
   "font-style" (clojure.core/str "normal"),
   "display" (clojure.core/str "inline-flex"),
   "color" (clojure.core/str inputColor)}]
 [".ui.input"
  ["> input"
   {"line-height" (clojure.core/str lineHeight),
    "max-width" (clojure.core/str "100%"),
    "-webkit-tap-highlight-color" (clojure.core/str "rgba"),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "border" (clojure.core/str border),
    "padding" (clojure.core/str padding),
    "text-align" (clojure.core/str textAlign),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str boxShadow),
    "border-radius" (clojure.core/str borderRadius),
    "transition" (clojure.core/str transition),
    "flex" (clojure.core/str "11" " " "00" " " "auto"),
    "background" (clojure.core/str background),
    "color" (clojure.core/str inputColor)}]]
 [":-webkit-input-placeholder"
  {"color" (clojure.core/str placeholderColor)}]
 [":-moz-placeholder" {"color" (clojure.core/str placeholderColor)}]
 [".ui.input"
  ["> input:-ms-input-placeholder"
   {"color" (clojure.core/str placeholderColor)}]]
 [".ui.disabled.input" {"opacity" (clojure.core/str disabledOpacity)}]
 [".ui.input:not([.disabled])"
  [nil {"opacity" (clojure.core/str disabledOpacity)}]]
 [".ui.disabled.input"
  ["> input" {"pointer-events" (clojure.core/str "none")}]]
 [".ui.input:not([.disabled])"
  [nil {"pointer-events" (clojure.core/str "none")}]]
 [".ui.input"
  ["> input:active"
   {"border-color" (clojure.core/str downBorderColor),
    "background" (clojure.core/str downBackground),
    "color" (clojure.core/str downColor),
    "box-shadow" (clojure.core/str downBoxShadow)}]]
 [".ui.input.down"
  ["input"
   {"border-color" (clojure.core/str downBorderColor),
    "background" (clojure.core/str downBackground),
    "color" (clojure.core/str downColor),
    "box-shadow" (clojure.core/str downBoxShadow)}]]
 [".ui.loading.loading.input"
  ["> i.icon:before"
   {"position" (clojure.core/str "absolute"),
    "content" (clojure.core/str ""),
    "top" (clojure.core/str "50%"),
    "left" (clojure.core/str "50%"),
    "margin" (clojure.core/str loaderMargin),
    "width" (clojure.core/str loaderSize),
    "height" (clojure.core/str loaderSize),
    "border-radius" (clojure.core/str circularRadius),
    "border"
    (clojure.core/str
     loaderLineWidth
     " "
     "solid"
     " "
     loaderFillColor)}]]
 [".ui.loading.loading.input"
  ["> i.icon:after"
   {"width" (clojure.core/str loaderSize),
    "border-width" (clojure.core/str loaderLineWidth),
    "top" (clojure.core/str "50%"),
    "border-color"
    (clojure.core/str
     loaderLineColor
     " "
     "transparent"
     " "
     "transparent"),
    "height" (clojure.core/str loaderSize),
    "margin" (clojure.core/str loaderMargin),
    "border-style" (clojure.core/str "solid"),
    "position" (clojure.core/str "absolute"),
    "animation-iteration-count" (clojure.core/str "infinite"),
    "animation"
    (clojure.core/str "button-spin" " " loaderSpeed " " "linear"),
    "content" (clojure.core/str ""),
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
    "left" (clojure.core/str "50%")}]]
 [".ui.input.focus"
  ["> input"
   {"border-color" (clojure.core/str focusBorderColor),
    "background" (clojure.core/str focusBackground),
    "color" (clojure.core/str focusColor),
    "box-shadow" (clojure.core/str focusBoxShadow)}]]
 [".ui.input"
  ["> input:focus"
   {"border-color" (clojure.core/str focusBorderColor),
    "background" (clojure.core/str focusBackground),
    "color" (clojure.core/str focusColor),
    "box-shadow" (clojure.core/str focusBoxShadow)}]]
 [":-webkit-input-placeholder"
  {"color" (clojure.core/str placeholderFocusColor)}]
 [":-moz-placeholder"
  {"color" (clojure.core/str placeholderFocusColor)}]
 [".ui.input.focus"
  ["> input:-ms-input-placeholder"
   {"color" (clojure.core/str placeholderFocusColor)}]]
 [".ui.input"
  ["> input:focus" {"color" (clojure.core/str placeholderFocusColor)}]]
 [".ui.input.error"
  ["> input"
   {"background-color" (clojure.core/str errorBackground),
    "border-color" (clojure.core/str errorBorder),
    "color" (clojure.core/str errorColor),
    "box-shadow" (clojure.core/str errorBoxShadow)}]]
 [":-webkit-input-placeholder"
  {"color" (clojure.core/str placeholderErrorColor)}]
 [":-moz-placeholder"
  {"color" (clojure.core/str placeholderErrorColor)}]
 [".ui.input.error"
  ["> input:-ms-input-placeholder"
   {"color" (clojure.core/str placeholderErrorColor)}]]
 [":-webkit-input-placeholder"
  {"color" (clojure.core/str placeholderErrorFocusColor)}]
 [":-moz-placeholder"
  {"color" (clojure.core/str placeholderErrorFocusColor)}]
 [".ui.input.error"
  ["> input:focus"
   {"color" (clojure.core/str placeholderErrorFocusColor)}]]
 [".ui.transparent.input" ["> input" nil]]
 [".ui.transparent.icon.input"
  ["> i.icon" {"width" (clojure.core/str transparentIconWidth)}]]
 [".ui.transparent.icon.input" ["> input" nil]])
