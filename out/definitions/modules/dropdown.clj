(clojure.core/ns
 styles.definitions.modules.dropdown
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "dropdown"))
(defstyles
 root
 [".ui.dropdown"
  {"cursor" (clojure.core/str "pointer"),
   "position" (clojure.core/str "relative"),
   "display" (clojure.core/str "inline-block"),
   "outline" (clojure.core/str "none"),
   "text-align" (clojure.core/str "left"),
   "transition" (clojure.core/str transition),
   "-webkit-tap-highlight-color" (clojure.core/str "rgba")}]
 [".ui.dropdown"
  [".menu"
   {"min-width" (clojure.core/str "max-content"),
    "top" (clojure.core/str "100%"),
    "margin" (clojure.core/str menuMargin),
    "will-change" (clojure.core/str "opacity"),
    "border" (clojure.core/str menuBorder),
    "padding" (clojure.core/str menuPadding),
    "text-align" (clojure.core/str menuTextAlign),
    "outline" (clojure.core/str "none"),
    "position" (clojure.core/str "absolute"),
    "z-index" (clojure.core/str menuZIndex),
    "cursor" (clojure.core/str "auto"),
    "box-shadow" (clojure.core/str menuBoxShadow),
    "font-size" (clojure.core/str relativeMedium),
    "border-radius" (clojure.core/str menuBorderRadius),
    "display" (clojure.core/str "none"),
    "transition" (clojure.core/str menuTransition),
    "text-shadow" (clojure.core/str "none"),
    "background" (clojure.core/str menuBackground)}]]
 nil
 [".ui.dropdown"
  ["> input:not([.search]):first-child"
   {"display" (clojure.core/str "none")}]]
 [".ui.dropdown" ["> select" {"display" (clojure.core/str "none")}]]
 [".ui.dropdown"
  ["> .dropdown.icon"
   {"position" (clojure.core/str "relative"),
    "width" (clojure.core/str "auto"),
    "font-size" (clojure.core/str dropdownIconSize),
    "margin" (clojure.core/str dropdownIconMargin)}]]
 [".ui.dropdown"
  [".menu"
   ["> .item"
    [".dropdown.icon"
     {"width" (clojure.core/str "auto"),
      "float" (clojure.core/str itemDropdownIconFloat),
      "margin" (clojure.core/str itemDropdownIconMargin)}]]]]
 [".ui.dropdown"
  [".menu"
   ["> .item"
    [".dropdown.icon"
     ["+ .text"
      {"margin-right" (clojure.core/str itemDropdownIconDistance)}]]]]]
 [".ui.dropdown"
  ["> .text"
   {"display" (clojure.core/str "inline-block"),
    "transition" (clojure.core/str textTransition)}]]
 [".ui.dropdown"
  [".menu"
   ["> .item"
    {"line-height" (clojure.core/str itemLineHeight),
     "height" (clojure.core/str itemHeight),
     "-webkit-touch-callout" (clojure.core/str "none"),
     "border" (clojure.core/str itemBorder),
     "text-transform" (clojure.core/str itemTextTransform),
     "padding" (clojure.core/str itemPadding),
     "text-align" (clojure.core/str itemTextAlign),
     "position" (clojure.core/str "relative"),
     "border-top" (clojure.core/str itemDivider),
     "cursor" (clojure.core/str "pointer"),
     "font-weight" (clojure.core/str itemFontWeight),
     "box-shadow" (clojure.core/str itemBoxShadow),
     "font-size" (clojure.core/str itemFontSize),
     "display" (clojure.core/str "block"),
     "color" (clojure.core/str itemColor)}]]]
 [".ui.dropdown"
  [".menu"
   ["> .item:first-child"
    {"border-top-width" (clojure.core/str "0px")}]]]
 [nil ["floated" nil]])
