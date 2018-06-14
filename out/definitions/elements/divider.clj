(clojure.core/ns
 styles.definitions.elements.divider
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "divider"))
(defstyles
 root
 [".ui.divider"
  {"margin" (clojure.core/str margin),
   "line-height" (clojure.core/str "11"),
   "height" (clojure.core/str "0em"),
   "font-weight" (clojure.core/str fontWeight),
   "text-transform" (clojure.core/str textTransform),
   "letter-spacing" (clojure.core/str letterSpacing),
   "color" (clojure.core/str color),
   "user-select" (clojure.core/str "none"),
   "-webkit-tap-highlight-color" (clojure.core/str "rgba")}]
 [".ui.divider:not([.vertical]):not([.horizontal])"
  {"border-top"
   (clojure.core/str shadowWidth " " "solid" " " shadowColor),
   "border-bottom"
   (clojure.core/str highlightWidth " " "solid" " " highlightColor)}]
 [".ui.grid"
  ["> .column" ["+ .divider" {"left" (clojure.core/str "auto")}]]]
 [".ui.grid"
  ["> .row"
   ["> .column" ["+ .divider" {"left" (clojure.core/str "auto")}]]]]
 [".ui.horizontal.divider"
  {"display" (clojure.core/str "table"),
   "white-space" (clojure.core/str "nowrap"),
   "height" (clojure.core/str "auto"),
   "margin" (clojure.core/str horizontalMargin),
   "line-height" (clojure.core/str "11"),
   "text-align" (clojure.core/str "center")}]
 [".ui.horizontal.divider:before"
  {"content" (clojure.core/str ""),
   "display" (clojure.core/str "table-cell"),
   "position" (clojure.core/str "relative"),
   "top" (clojure.core/str "50%"),
   "width" (clojure.core/str "50%"),
   "background-repeat" (clojure.core/str "no-repeat")}]
 [".ui.horizontal.divider:after"
  {"content" (clojure.core/str ""),
   "display" (clojure.core/str "table-cell"),
   "position" (clojure.core/str "relative"),
   "top" (clojure.core/str "50%"),
   "width" (clojure.core/str "50%"),
   "background-repeat" (clojure.core/str "no-repeat")}]
 [".ui.horizontal.divider:before"
  {"background-position"
   (clojure.core/str
    "right"
    " "
    horizontalDividerMargin
    " "
    "top"
    " "
    "50%")}]
 [".ui.horizontal.divider:after"
  {"background-position"
   (clojure.core/str
    "left"
    " "
    horizontalDividerMargin
    " "
    "top"
    " "
    "50%")}]
 [".ui.vertical.divider"
  {"line-height" (clojure.core/str "0em"),
   "width" (clojure.core/str "auto"),
   "top" (clojure.core/str "50%"),
   "height" (clojure.core/str "50%"),
   "margin" (clojure.core/str "00" " " "rem"),
   "padding" (clojure.core/str "0em"),
   "text-align" (clojure.core/str "center"),
   "transform" (clojure.core/str "translateX"),
   "position" (clojure.core/str "absolute"),
   "z-index" (clojure.core/str "22"),
   "left" (clojure.core/str "50%")}]
 [".ui.vertical.divider:before"
  {"position" (clojure.core/str "absolute"),
   "left" (clojure.core/str "50%"),
   "content" (clojure.core/str ""),
   "z-index" (clojure.core/str "33"),
   "border-left"
   (clojure.core/str shadowWidth " " "solid" " " shadowColor),
   "border-right"
   (clojure.core/str highlightWidth " " "solid" " " highlightColor),
   "width" (clojure.core/str "0%"),
   "height" (clojure.core/str verticalDividerHeight)}]
 [".ui.vertical.divider:after"
  {"position" (clojure.core/str "absolute"),
   "left" (clojure.core/str "50%"),
   "content" (clojure.core/str ""),
   "z-index" (clojure.core/str "33"),
   "border-left"
   (clojure.core/str shadowWidth " " "solid" " " shadowColor),
   "border-right"
   (clojure.core/str highlightWidth " " "solid" " " highlightColor),
   "width" (clojure.core/str "0%"),
   "height" (clojure.core/str verticalDividerHeight)}]
 [".ui.vertical.divider:before" {"top" (clojure.core/str "-100%")}]
 [".ui.vertical.divider:after"
  {"top" (clojure.core/str "auto"), "bottom" (clojure.core/str "0px")}])
