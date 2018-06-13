(clojure.core/ns
 definitions.modules.accordion
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "accordion"))
(defstyles
 root
 [".ui.accordion" {"max-width" (clojure.core/str "100%")}]
 [".ui.accordion"
  [".accordion" {"max-width" (clojure.core/str "100%")}]]
 [".ui.accordion"
  [".accordion"
   {"margin" (clojure.core/str childAccordionMargin),
    "padding" (clojure.core/str childAccordionPadding)}]]
 [".ui.accordion" [".title" {"cursor" (clojure.core/str "pointer")}]]
 [".ui.accordion"
  [".accordion" [".title" {"cursor" (clojure.core/str "pointer")}]]]
 [".ui.accordion"
  [".title:not([.ui])"
   {"padding" (clojure.core/str titlePadding),
    "font-family" (clojure.core/str titleFont),
    "font-size" (clojure.core/str titleFontSize),
    "color" (clojure.core/str titleColor)}]]
 [".ui.accordion"
  [".title" ["~ .content" {"display" (clojure.core/str "none")}]]]
 [".ui.accordion"
  [".accordion"
   [".title" ["~ .content" {"display" (clojure.core/str "none")}]]]]
 [".ui.accordion:not([.styled])"
  [".title"
   ["~ .content:not([.ui])"
    {"margin" (clojure.core/str contentMargin),
     "padding" (clojure.core/str contentPadding)}]]]
 [".ui.accordion:not([.styled])"
  [".accordion"
   [".title"
    ["~ .content:not([.ui])"
     {"margin" (clojure.core/str contentMargin),
      "padding" (clojure.core/str contentPadding)}]]]]
 [".ui.accordion:not([.styled])"
  [".title"
   ["~ .content:not([.ui]):last-child"
    {"padding-bottom" (clojure.core/str "0em")}]]]
 [".ui.accordion"
  [".title"
   [".dropdown.icon"
    {"float" (clojure.core/str iconFloat),
     "width" (clojure.core/str iconWidth),
     "height" (clojure.core/str iconHeight),
     "margin" (clojure.core/str iconMargin),
     "vertical-align" (clojure.core/str iconVerticalAlign),
     "padding" (clojure.core/str iconPadding),
     "transform" (clojure.core/str iconTransform),
     "font-size" (clojure.core/str iconFontSize),
     "display" (clojure.core/str iconDisplay),
     "transition" (clojure.core/str iconTransition),
     "opacity" (clojure.core/str iconOpacity)}]]]
 [".ui.accordion"
  [".accordion"
   [".title"
    [".dropdown.icon"
     {"float" (clojure.core/str iconFloat),
      "width" (clojure.core/str iconWidth),
      "height" (clojure.core/str iconHeight),
      "margin" (clojure.core/str iconMargin),
      "vertical-align" (clojure.core/str iconVerticalAlign),
      "padding" (clojure.core/str iconPadding),
      "transform" (clojure.core/str iconTransform),
      "font-size" (clojure.core/str iconFontSize),
      "display" (clojure.core/str iconDisplay),
      "transition" (clojure.core/str iconTransition),
      "opacity" (clojure.core/str iconOpacity)}]]]]
 [".ui.accordion.menu"
  [".item"
   [".title"
    {"display" (clojure.core/str "block"),
     "padding" (clojure.core/str menuTitlePadding)}]]]
 [".ui.accordion.menu"
  [".item"
   [".title"
    ["> .dropdown.icon"
     {"float" (clojure.core/str menuIconFloat),
      "margin" (clojure.core/str menuIconMargin),
      "transform" (clojure.core/str menuIconTransform)}]]]]
 [".ui.accordion"
  [".ui.header"
   [".dropdown.icon"
    {"font-size" (clojure.core/str iconFontSize),
     "margin" (clojure.core/str iconMargin)}]]]
 [".ui.accordion"
  [".active.title"
   [".dropdown.icon"
    {"transform" (clojure.core/str activeIconTransform)}]]]
 [".ui.accordion"
  [".accordion"
   [".active.title"
    [".dropdown.icon"
     {"transform" (clojure.core/str activeIconTransform)}]]]]
 [".ui.accordion.menu"
  [".item"
   [".active.title"
    ["> .dropdown.icon"
     {"transform" (clojure.core/str activeIconTransform)}]]]]
 [".ui.styled.accordion" {"width" (clojure.core/str styledWidth)}]
 [".ui.styled.accordion"
  {"border-radius" (clojure.core/str styledBorderRadius),
   "background" (clojure.core/str styledBackground),
   "box-shadow" (clojure.core/str styledBoxShadow)}]
 [".ui.styled.accordion"
  [".accordion"
   {"border-radius" (clojure.core/str styledBorderRadius),
    "background" (clojure.core/str styledBackground),
    "box-shadow" (clojure.core/str styledBoxShadow)}]]
 [".ui.styled.accordion"
  [".title"
   {"margin" (clojure.core/str styledTitleMargin),
    "padding" (clojure.core/str styledTitlePadding),
    "color" (clojure.core/str styledTitleColor),
    "font-weight" (clojure.core/str styledTitleFontWeight),
    "border-top" (clojure.core/str styledTitleBorder),
    "transition" (clojure.core/str styledTitleTransition)}]]
 [".ui.styled.accordion"
  [".accordion"
   [".title"
    {"margin" (clojure.core/str styledTitleMargin),
     "padding" (clojure.core/str styledTitlePadding),
     "color" (clojure.core/str styledTitleColor),
     "font-weight" (clojure.core/str styledTitleFontWeight),
     "border-top" (clojure.core/str styledTitleBorder),
     "transition" (clojure.core/str styledTitleTransition)}]]]
 [".ui.styled.accordion"
  ["> .title:first-child" {"border-top" (clojure.core/str "none")}]]
 [".ui.styled.accordion"
  [".accordion"
   [".title:first-child" {"border-top" (clojure.core/str "none")}]]]
 [".ui.styled.accordion"
  [".content"
   {"margin" (clojure.core/str styledContentMargin),
    "padding" (clojure.core/str styledContentPadding)}]]
 [".ui.styled.accordion"
  [".accordion"
   [".content"
    {"margin" (clojure.core/str styledContentMargin),
     "padding" (clojure.core/str styledContentPadding)}]]]
 [".ui.styled.accordion"
  [".accordion"
   [".content"
    {"padding" (clojure.core/str styledChildContentPadding)}]]]
 [".ui.styled.accordion"
  [".title:hover"
   {"background" (clojure.core/str styledTitleHoverBackground),
    "color" (clojure.core/str styledTitleHoverColor)}]]
 [".ui.styled.accordion"
  [".active.title"
   {"background" (clojure.core/str styledTitleHoverBackground),
    "color" (clojure.core/str styledTitleHoverColor)}]]
 [".ui.styled.accordion"
  [".accordion"
   [".title:hover"
    {"background" (clojure.core/str styledTitleHoverBackground),
     "color" (clojure.core/str styledTitleHoverColor)}]]]
 [".ui.styled.accordion"
  [".accordion"
   [".active.title"
    {"background" (clojure.core/str styledTitleHoverBackground),
     "color" (clojure.core/str styledTitleHoverColor)}]]]
 [".ui.styled.accordion"
  [".accordion"
   [".title:hover"
    {"background" (clojure.core/str styledHoverChildTitleBackground),
     "color" (clojure.core/str styledHoverChildTitleColor)}]]]
 [".ui.styled.accordion"
  [".accordion"
   [".active.title"
    {"background" (clojure.core/str styledHoverChildTitleBackground),
     "color" (clojure.core/str styledHoverChildTitleColor)}]]]
 [".ui.styled.accordion"
  [".active.title"
   {"background" (clojure.core/str styledActiveTitleBackground),
    "color" (clojure.core/str styledActiveTitleColor)}]]
 [".ui.styled.accordion"
  [".accordion"
   [".active.title"
    {"background" (clojure.core/str styledActiveChildTitleBackground),
     "color" (clojure.core/str styledActiveChildTitleColor)}]]]
 [".ui.accordion"
  [".active.content" {"display" (clojure.core/str "block")}]]
 [".ui.accordion"
  [".accordion"
   [".active.content" {"display" (clojure.core/str "block")}]]]
 [".ui.fluid.accordion" {"width" (clojure.core/str "100%")}]
 [".ui.fluid.accordion"
  [".accordion" {"width" (clojure.core/str "100%")}]]
 [".ui.inverted.accordion"
  [".title:not([.ui])"
   {"color" (clojure.core/str invertedTitleColor)}]])
