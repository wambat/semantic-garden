(clojure.core/ns
 definitions.collections.form
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
 [".ui.form"
  {"position" (clojure.core/str "relative"),
   "max-width" (clojure.core/str "100%")}]
 [".ui.form" ["> p" {"margin" (clojure.core/str paragraphMargin)}]]
 [".ui.form"
  [".field"
   {"clear" (clojure.core/str "both"),
    "margin" (clojure.core/str fieldMargin)}]]
 [".ui.form"
  [".field:last-child" {"margin-bottom" (clojure.core/str "0em")}]]
 [".ui.form"
  [".fields:last-child"
   [".field" {"margin-bottom" (clojure.core/str "0em")}]]]
 [".ui.form"
  [".fields"
   [".field"
    {"clear" (clojure.core/str "both"),
     "margin" (clojure.core/str "0em")}]]]
 [".ui.form"
  [".field"
   ["> label"
    {"display" (clojure.core/str "block"),
     "margin" (clojure.core/str labelMargin),
     "color" (clojure.core/str labelColor),
     "font-size" (clojure.core/str labelFontSize),
     "font-weight" (clojure.core/str labelFontWeight),
     "text-transform" (clojure.core/str labelTextTransform)}]]]
 [".ui.form"
  ["textarea"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input:not([type])"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='date']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='datetime-local']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='email']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='number']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='password']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='search']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='tel']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='time']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='text']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='file']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form"
  ["input[type='url']"
   {"width" (clojure.core/str inputWidth),
    "vertical-align" (clojure.core/str "top")}]]
 [".ui.form::-webkit-datetime-edit"
  {"height" (clojure.core/str inputLineHeight)}]
 [".ui.form::-webkit-inner-spin-button"
  {"height" (clojure.core/str inputLineHeight)}]
 [".ui.form"
  ["input:not([type])"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='date']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='datetime-local']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='email']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='number']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='password']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='search']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='tel']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='time']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='text']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='file']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["input[type='url']"
   {"line-height" (clojure.core/str inputLineHeight),
    "font-family" (clojure.core/str inputFont),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str inputBorder),
    "padding" (clojure.core/str inputPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str inputFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "transition" (clojure.core/str inputTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str inputBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["textarea"
   {"line-height" (clojure.core/str textAreaLineHeight),
    "margin" (clojure.core/str "0em"),
    "-webkit-appearance" (clojure.core/str "none"),
    "border" (clojure.core/str textAreaBorder),
    "padding" (clojure.core/str textAreaPadding),
    "outline" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str inputBoxShadow),
    "font-size" (clojure.core/str textAreaFontSize),
    "border-radius" (clojure.core/str inputBorderRadius),
    "resize" (clojure.core/str textAreaResize),
    "transition" (clojure.core/str textAreaTransition),
    "tap-highlight-color" (clojure.core/str "rgba"),
    "background" (clojure.core/str textAreaBackground),
    "color" (clojure.core/str inputColor)}]]
 [".ui.form"
  ["textarea:not([rows])"
   {"height" (clojure.core/str textAreaHeight),
    "min-height" (clojure.core/str textAreaMinHeight),
    "max-height" (clojure.core/str textAreaMaxHeight)}]]
 [".ui.form"
  ["textarea"
   {"vertical-align" (clojure.core/str checkboxVerticalAlign)}]]
 [".ui.form"
  ["input[type='checkbox']"
   {"vertical-align" (clojure.core/str checkboxVerticalAlign)}]]
 [".ui.form" ["input.attached" {"width" (clojure.core/str "auto")}]]
 [".ui.form"
  ["select"
   {"width" (clojure.core/str "100%"),
    "height" (clojure.core/str "auto"),
    "border" (clojure.core/str selectBorder),
    "padding" (clojure.core/str selectPadding),
    "box-shadow" (clojure.core/str selectBoxShadow),
    "border-radius" (clojure.core/str selectBorderRadius),
    "display" (clojure.core/str "block"),
    "transition" (clojure.core/str selectTransition),
    "background" (clojure.core/str selectBackground),
    "color" (clojure.core/str selectColor)}]]
 [".ui.form"
  [".field"
   ["> .selection.dropdown" {"width" (clojure.core/str "100%")}]]]
 [".ui.form"
  [".field"
   ["> .selection.dropdown"
    ["> .dropdown.icon" {"float" (clojure.core/str "right")}]]]]
 [".ui.form"
  [".inline.fields"
   [".field"
    ["> .selection.dropdown" {"width" (clojure.core/str "auto")}]]]]
 [".ui.form"
  [".inline.field"
   ["> .selection.dropdown" {"width" (clojure.core/str "auto")}]]]
 [".ui.form"
  [".inline.fields"
   [".field"
    ["> .selection.dropdown"
     ["> .dropdown.icon" {"float" (clojure.core/str "none")}]]]]]
 [".ui.form"
  [".inline.field"
   ["> .selection.dropdown"
    ["> .dropdown.icon" {"float" (clojure.core/str "none")}]]]]
 [".ui.form"
  [".field" [".ui.input" {"width" (clojure.core/str "100%")}]]]
 [".ui.form"
  [".fields"
   [".field" [".ui.input" {"width" (clojure.core/str "100%")}]]]]
 [".ui.form"
  [".wide.field" [".ui.input" {"width" (clojure.core/str "100%")}]]]
 [".ui.form"
  [".inline.fields"
   [".field:not([.wide])"
    [".ui.input"
     {"width" (clojure.core/str "auto"),
      "vertical-align" (clojure.core/str "middle")}]]]]
 [".ui.form"
  [".inline.field:not([.wide])"
   [".ui.input"
    {"width" (clojure.core/str "auto"),
     "vertical-align" (clojure.core/str "middle")}]]]
 [".ui.form"
  [".fields"
   [".field"
    [".ui.input" ["input" {"width" (clojure.core/str "auto")}]]]]]
 [".ui.form"
  [".field"
   [".ui.input" ["input" {"width" (clojure.core/str "auto")}]]]]
 [".ui.form"
  [".ten.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".nine.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".eight.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".seven.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".six.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".five.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".four.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".three.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".two.fields"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".wide.field"
   [".ui.input"
    ["input"
     {"flex" (clojure.core/str "11" " " "00" " " "auto"),
      "width" (clojure.core/str "0px")}]]]]
 [".ui.form"
  [".success.message" {"display" (clojure.core/str "none")}]]
 [".ui.form"
  [".warning.message" {"display" (clojure.core/str "none")}]]
 [".ui.form" [".error.message" {"display" (clojure.core/str "none")}]]
 [".ui.form"
  [".message:first-child" {"margin-top" (clojure.core/str "0px")}]]
 [".ui.form"
  [".field"
   [".prompt.label"
    {"white-space" (clojure.core/str "normal"),
     "background" (clojure.core/str promptBackground),
     "border" (clojure.core/str promptBorder),
     "color" (clojure.core/str promptTextColor)}]]]
 [".ui.form"
  [".inline.fields"
   [".field"
    [".prompt"
     {"vertical-align" (clojure.core/str "top"),
      "margin" (clojure.core/str inlinePromptMargin)}]]]]
 [".ui.form"
  [".inline.field"
   [".prompt"
    {"vertical-align" (clojure.core/str "top"),
     "margin" (clojure.core/str inlinePromptMargin)}]]]
 [".ui.form"
  [".inline.fields"
   [".field"
    [".prompt:before"
     {"border-width"
      (clojure.core/str
       "0px"
       " "
       "0px"
       " "
       inlinePromptBorderWidth
       " "
       inlinePromptBorderWidth),
      "bottom" (clojure.core/str "auto"),
      "right" (clojure.core/str "auto"),
      "top" (clojure.core/str "50%"),
      "left" (clojure.core/str "0em")}]]]]
 [".ui.form"
  [".inline.field"
   [".prompt:before"
    {"border-width"
     (clojure.core/str
      "0px"
      " "
      "0px"
      " "
      inlinePromptBorderWidth
      " "
      inlinePromptBorderWidth),
     "bottom" (clojure.core/str "auto"),
     "right" (clojure.core/str "auto"),
     "top" (clojure.core/str "50%"),
     "left" (clojure.core/str "0em")}]]]
 [".ui.form"
  [".field.field"
   ["input:-webkit-autofill"
    {"box-shadow"
     (clojure.core/str
      "0px"
      " "
      "0px"
      " "
      "0px"
      " "
      "100px"
      " "
      inputAutoFillBackground
      " "
      "inset"),
     "border-color" (clojure.core/str inputAutoFillBorder)}]]]
 [".ui.form"
  [".field.field"
   ["input:-webkit-autofill"
    {"box-shadow"
     (clojure.core/str
      "0px"
      " "
      "0px"
      " "
      "0px"
      " "
      "100px"
      " "
      inputAutoFillFocusBackground
      " "
      "inset"),
     "border-color" (clojure.core/str inputAutoFillFocusBorder)}]]]
 [".ui.form"
  [".error.error"
   ["input:-webkit-autofill"
    {"box-shadow"
     (clojure.core/str
      "0px"
      " "
      "0px"
      " "
      "0px"
      " "
      "100px"
      " "
      inputAutoFillErrorBackground
      " "
      "inset"),
     "border-color" (clojure.core/str inputAutoFillErrorBorder)}]]]
 [".ui.form::-webkit-input-placeholder"
  {"color" (clojure.core/str inputPlaceholderColor)}]
 [".ui.form:-ms-input-placeholder"
  {"color" (clojure.core/str inputPlaceholderColor)}]
 [".ui.form::-moz-placeholder"
  {"color" (clojure.core/str inputPlaceholderColor)}]
 [":-webkit-input-placeholder"
  {"color" (clojure.core/str inputPlaceholderFocusColor)}]
 [".ui.form:focus"
  {"color" (clojure.core/str inputPlaceholderFocusColor)}]
 [":-moz-placeholder"
  {"color" (clojure.core/str inputPlaceholderFocusColor)}]
 [".ui.form"
  [".error::-webkit-input-placeholder"
   {"color" (clojure.core/str inputErrorPlaceholderColor)}]]
 [".ui.form"
  [".error:-ms-input-placeholder"
   {"color" (clojure.core/str inputErrorPlaceholderColor)}]]
 [".ui.form"
  [".error::-moz-placeholder"
   {"color" (clojure.core/str inputErrorPlaceholderColor)}]]
 [":-webkit-input-placeholder"
  {"color" (clojure.core/str inputErrorPlaceholderFocusColor)}]
 [".ui.form"
  [".error:focus"
   {"color" (clojure.core/str inputErrorPlaceholderFocusColor)}]]
 [":-moz-placeholder"
  {"color" (clojure.core/str inputErrorPlaceholderFocusColor)}]
 [".ui.form"
  ["input:not([type]):focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='date']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='datetime-local']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='email']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='number']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='password']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='search']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='tel']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='time']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='text']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 [".ui.form"
  ["input[type='file']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 ...)
