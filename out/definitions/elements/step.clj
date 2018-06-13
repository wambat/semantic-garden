(clojure.core/ns
 definitions.elements.step
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "step"))
(defstyles
 root
 [".ui.steps"
  {"display" (clojure.core/str "inline-flex"),
   "flex-direction" (clojure.core/str "row"),
   "align-items" (clojure.core/str "stretch"),
   "margin" (clojure.core/str stepMargin),
   "background" (clojure.core/str stepsBackground),
   "box-shadow" (clojure.core/str stepsBoxShadow),
   "line-height" (clojure.core/str lineHeight),
   "border-radius" (clojure.core/str stepsBorderRadius),
   "border" (clojure.core/str stepsBorder)}]
 [".ui.steps:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.steps:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.steps"
  [".step"
   {"justify-content" (clojure.core/str justifyContent),
    "margin" (clojure.core/str verticalMargin " " horizontalMargin),
    "border" (clojure.core/str border),
    "vertical-align" (clojure.core/str "middle"),
    "align-items" (clojure.core/str "center"),
    "padding" (clojure.core/str verticalPadding " " horizontalPadding),
    "flex-direction" (clojure.core/str "row"),
    "border-right" (clojure.core/str divider),
    "position" (clojure.core/str "relative"),
    "flex-wrap" (clojure.core/str "wrap"),
    "box-shadow" (clojure.core/str boxShadow),
    "border-radius" (clojure.core/str borderRadius),
    "display" (clojure.core/str "flex"),
    "transition" (clojure.core/str transition),
    "flex" (clojure.core/str "11" " " "00" " " "auto"),
    "background" (clojure.core/str background),
    "color" (clojure.core/str textColor)}]]
 [".ui.steps"
  [".step:after"
   {"width" (clojure.core/str arrowSize),
    "right" (clojure.core/str arrowRightOffset),
    "border-width" (clojure.core/str arrowBorderWidth),
    "top" (clojure.core/str arrowTopOffset),
    "border-color" (clojure.core/str borderColor),
    "height" (clojure.core/str arrowSize),
    "border" (clojure.core/str "medium" " " "none"),
    "transform"
    (clojure.core/str "translateY" " " "translateX" " " "rotate"),
    "border-style" (clojure.core/str "solid"),
    "position" (clojure.core/str "absolute"),
    "z-index" (clojure.core/str "22"),
    "content" (clojure.core/str ""),
    "background-color" (clojure.core/str arrowBackgroundColor),
    "display" (clojure.core/str "none"),
    "transition" (clojure.core/str transition)}]]
 [".ui.steps"
  [".step:first-child"
   {"padding-left" (clojure.core/str horizontalPadding),
    "border-radius"
    (clojure.core/str
     stepsBorderRadius
     " "
     "0em"
     " "
     "0em"
     " "
     stepsBorderRadius)}]]
 [".ui.steps"
  [".step:last-child"
   {"border-radius"
    (clojure.core/str
     "0em"
     " "
     stepsBorderRadius
     " "
     stepsBorderRadius
     " "
     "0em")}]]
 [".ui.steps"
  [".step:last-child"
   {"border-right" (clojure.core/str "none"),
    "margin-right" (clojure.core/str "0em")}]]
 [".ui.steps"
  [".step:only-child"
   {"border-radius" (clojure.core/str stepsBorderRadius)}]]
 [".ui.steps"
  [".step"
   [".title"
    {"font-family" (clojure.core/str titleFontFamily),
     "font-size" (clojure.core/str titleFontSize),
     "font-weight" (clojure.core/str titleFontWeight)}]]]
 [".ui.steps"
  [".step" ["> .title" {"width" (clojure.core/str "100%")}]]]
 [".ui.steps"
  [".step"
   [".description"
    {"font-weight" (clojure.core/str descriptionFontWeight),
     "font-size" (clojure.core/str descriptionFontSize),
     "color" (clojure.core/str descriptionColor)}]]]
 [".ui.steps"
  [".step" ["> .description" {"width" (clojure.core/str "100%")}]]]
 [".ui.steps"
  [".step"
   [".title"
    ["~ .description"
     {"margin-top" (clojure.core/str descriptionDistance)}]]]]
 [".ui.steps"
  [".step"
   ["> .icon"
    {"line-height" (clojure.core/str "11"),
     "font-size" (clojure.core/str iconSize),
     "margin"
     (clojure.core/str "0em" " " iconDistance " " "0em" " " "0em")}]]]
 [".ui.steps"
  [".step"
   ["> .icon"
    {"display" (clojure.core/str "block"),
     "flex" (clojure.core/str "00" " " "11" " " "auto"),
     "align-self" (clojure.core/str iconAlign)}]]]
 [".ui.steps"
  [".step"
   ["> .icon"
    ["~ .content"
     {"display" (clojure.core/str "block"),
      "flex" (clojure.core/str "00" " " "11" " " "auto"),
      "align-self" (clojure.core/str iconAlign)}]]]]
 [".ui.steps"
  [".step"
   ["> .icon"
    ["~ .content"
     {"flex-grow" (clojure.core/str "11" " " "00" " " "auto")}]]]]
 [".ui.steps:not([.vertical])"
  [".step" ["> .icon" {"width" (clojure.core/str "auto")}]]]
 [".ui.steps" [".link.step" {"cursor" (clojure.core/str "pointer")}]]
 [".ui.steps" ["a.step" {"cursor" (clojure.core/str "pointer")}]]
 [".ui.ordered.steps" {"counter-reset" (clojure.core/str "ordered")}]
 [".ui.ordered.steps"
  [".step:before"
   {"counter-increment" (clojure.core/str "ordered"),
    "font-family" (clojure.core/str orderedFontFamily),
    "margin-right" (clojure.core/str iconDistance),
    "text-align" (clojure.core/str "center"),
    "align-self" (clojure.core/str iconAlign),
    "position" (clojure.core/str "static"),
    "font-weight" (clojure.core/str orderedFontWeight),
    "content" (clojure.core/str "counters"),
    "font-size" (clojure.core/str iconSize),
    "display" (clojure.core/str "block")}]]
 nil
 [".ui.vertical.steps"
  {"display" (clojure.core/str "inline-flex"),
   "flex-direction" (clojure.core/str "column"),
   "overflow" (clojure.core/str "visible")}]
 [".ui.vertical.steps"
  [".step"
   {"justify-content" (clojure.core/str "flex-start"),
    "border-radius" (clojure.core/str borderRadius),
    "padding" (clojure.core/str verticalPadding " " horizontalPadding),
    "border-right" (clojure.core/str "none"),
    "border-bottom" (clojure.core/str verticalDivider)}]]
 [".ui.vertical.steps"
  [".step:first-child"
   {"padding" (clojure.core/str verticalPadding " " horizontalPadding),
    "border-radius"
    (clojure.core/str
     stepsBorderRadius
     " "
     stepsBorderRadius
     " "
     "0em"
     " "
     "0em")}]]
 [".ui.vertical.steps"
  [".step:last-child"
   {"border-bottom" (clojure.core/str "none"),
    "border-radius"
    (clojure.core/str
     "0em"
     " "
     "0em"
     " "
     stepsBorderRadius
     " "
     stepsBorderRadius)}]]
 [".ui.vertical.steps"
  [".step:only-child"
   {"border-radius" (clojure.core/str stepsBorderRadius)}]]
 [".ui.vertical.steps"
  [".step:after" {"display" (clojure.core/str "none")}]]
 [".ui.vertical.steps"
  [".step:after"
   {"top" (clojure.core/str verticalArrowTopOffset),
    "right" (clojure.core/str verticalArrowRightOffset),
    "border-width" (clojure.core/str verticalArrowBorderWidth)}]]
 [".ui.vertical.steps"
  [".step:after" {"display" (clojure.core/str verticalArrowDisplay)}]]
 [".ui.vertical.steps"
  [".active.step:after"
   {"display" (clojure.core/str verticalActiveArrowDisplay)}]]EXPR
(((:variableName @ verticalActiveLastArrowDisplay)))
PROP
(:variableName @ verticalActiveLastArrowDisplay)

 [".ui.vertical.steps"
  [".step:last-child"
   {"display" (clojure.core/str verticalLastArrowDisplay)}]]
 [".ui.vertical.steps"
  [".active.step:last-child"
   {"display" (clojure.core/str verticalActiveLastArrowDisplay)}]])
