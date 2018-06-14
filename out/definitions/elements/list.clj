(clojure.core/ns
 styles.definitions.elements.list
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "list"))
(defstyles
 root
 ["ul.ui.list"
  {"list-style-type" (clojure.core/str listStyleType),
   "margin" (clojure.core/str margin),
   "padding" (clojure.core/str verticalPadding " " horizontalPadding)}]
 ["ol.ui.list"
  {"list-style-type" (clojure.core/str listStyleType),
   "margin" (clojure.core/str margin),
   "padding" (clojure.core/str verticalPadding " " horizontalPadding)}]
 [".ui.list"
  {"list-style-type" (clojure.core/str listStyleType),
   "margin" (clojure.core/str margin),
   "padding" (clojure.core/str verticalPadding " " horizontalPadding)}]
 ["ul.ui.list:first-child"
  {"margin-top" (clojure.core/str "0em"),
   "padding-top" (clojure.core/str "0em")}]
 ["ol.ui.list:first-child"
  {"margin-top" (clojure.core/str "0em"),
   "padding-top" (clojure.core/str "0em")}]
 [".ui.list:first-child"
  {"margin-top" (clojure.core/str "0em"),
   "padding-top" (clojure.core/str "0em")}]
 ["ul.ui.list:last-child"
  {"margin-bottom" (clojure.core/str "0em"),
   "padding-bottom" (clojure.core/str "0em")}]
 ["ol.ui.list:last-child"
  {"margin-bottom" (clojure.core/str "0em"),
   "padding-bottom" (clojure.core/str "0em")}]
 [".ui.list:last-child"
  {"margin-bottom" (clojure.core/str "0em"),
   "padding-bottom" (clojure.core/str "0em")}]
 ["ul.ui.list"
  ["li"
   {"display" (clojure.core/str "list-item"),
    "table-layout" (clojure.core/str "fixed"),
    "list-style-type" (clojure.core/str listStyleType),
    "list-style-position" (clojure.core/str listStylePosition),
    "padding" (clojure.core/str itemPadding),
    "line-height" (clojure.core/str itemLineHeight)}]]
 ["ol.ui.list"
  ["li"
   {"display" (clojure.core/str "list-item"),
    "table-layout" (clojure.core/str "fixed"),
    "list-style-type" (clojure.core/str listStyleType),
    "list-style-position" (clojure.core/str listStylePosition),
    "padding" (clojure.core/str itemPadding),
    "line-height" (clojure.core/str itemLineHeight)}]]
 [".ui.list"
  ["> .item"
   {"display" (clojure.core/str "list-item"),
    "table-layout" (clojure.core/str "fixed"),
    "list-style-type" (clojure.core/str listStyleType),
    "list-style-position" (clojure.core/str listStylePosition),
    "padding" (clojure.core/str itemPadding),
    "line-height" (clojure.core/str itemLineHeight)}]]
 [".ui.list"
  [".list"
   ["> .item"
    {"display" (clojure.core/str "list-item"),
     "table-layout" (clojure.core/str "fixed"),
     "list-style-type" (clojure.core/str listStyleType),
     "list-style-position" (clojure.core/str listStylePosition),
     "padding" (clojure.core/str itemPadding),
     "line-height" (clojure.core/str itemLineHeight)}]]]
 ["ul.ui.list"
  ["> li:first-child"
   {"content" (clojure.core/str ""),
    "display" (clojure.core/str "block"),
    "height" (clojure.core/str "00"),
    "clear" (clojure.core/str "both"),
    "visibility" (clojure.core/str "hidden")}]]
 ["ol.ui.list"
  ["> li:first-child"
   {"content" (clojure.core/str ""),
    "display" (clojure.core/str "block"),
    "height" (clojure.core/str "00"),
    "clear" (clojure.core/str "both"),
    "visibility" (clojure.core/str "hidden")}]]
 [".ui.list"
  ["> .list"
   ["> .item"
    {"content" (clojure.core/str ""),
     "display" (clojure.core/str "block"),
     "height" (clojure.core/str "00"),
     "clear" (clojure.core/str "both"),
     "visibility" (clojure.core/str "hidden")}]]]
 [".ui.list"
  ["> .item:after"
   {"content" (clojure.core/str ""),
    "display" (clojure.core/str "block"),
    "height" (clojure.core/str "00"),
    "clear" (clojure.core/str "both"),
    "visibility" (clojure.core/str "hidden")}]]
 ["ul.ui.list"
  ["li:first-child" {"padding-top" (clojure.core/str "0em")}]]
 ["ol.ui.list"
  ["li:first-child" {"padding-top" (clojure.core/str "0em")}]]
 [".ui.list"
  [".list"
   ["> .item:first-child" {"padding-top" (clojure.core/str "0em")}]]]
 [".ui.list"
  ["> .item:first-child" {"padding-top" (clojure.core/str "0em")}]]
 ["ul.ui.list"
  ["li:last-child" {"padding-bottom" (clojure.core/str "0em")}]]
 ["ol.ui.list"
  ["li:last-child" {"padding-bottom" (clojure.core/str "0em")}]]
 [".ui.list"
  [".list"
   ["> .item:last-child" {"padding-bottom" (clojure.core/str "0em")}]]]
 [".ui.list"
  ["> .item:last-child" {"padding-bottom" (clojure.core/str "0em")}]]
 ["ul.ui.list"
  ["ul"
   {"clear" (clojure.core/str "both"),
    "margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str childListPadding)}]]
 ["ol.ui.list"
  ["ol"
   {"clear" (clojure.core/str "both"),
    "margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str childListPadding)}]]
 [".ui.list"
  [".list"
   {"clear" (clojure.core/str "both"),
    "margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str childListPadding)}]]
 ["ul.ui.list"
  ["ul"
   ["li"
    {"padding" (clojure.core/str childItemPadding),
     "line-height" (clojure.core/str childItemLineHeight)}]]]
 ["ol.ui.list"
  ["ol"
   ["li"
    {"padding" (clojure.core/str childItemPadding),
     "line-height" (clojure.core/str childItemLineHeight)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    {"padding" (clojure.core/str childItemPadding),
     "line-height" (clojure.core/str childItemLineHeight)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> i.icon"
     {"display" (clojure.core/str "table-cell"),
      "margin" (clojure.core/str "0em"),
      "padding-top" (clojure.core/str iconOffset),
      "padding-right" (clojure.core/str iconDistance),
      "vertical-align" (clojure.core/str iconContentVerticalAlign),
      "transition" (clojure.core/str iconTransition)}]]]]
 [".ui.list"
  ["> .item"
   ["> i.icon"
    {"display" (clojure.core/str "table-cell"),
     "margin" (clojure.core/str "0em"),
     "padding-top" (clojure.core/str iconOffset),
     "padding-right" (clojure.core/str iconDistance),
     "vertical-align" (clojure.core/str iconContentVerticalAlign),
     "transition" (clojure.core/str iconTransition)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> i.icon:only-child"
     {"display" (clojure.core/str "inline-block"),
      "vertical-align" (clojure.core/str iconVerticalAlign)}]]]]
 [".ui.list"
  ["> .item"
   ["> i.icon:only-child"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str iconVerticalAlign)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .image"
     {"display" (clojure.core/str "table-cell"),
      "background-color" (clojure.core/str "transparent"),
      "margin" (clojure.core/str "0em"),
      "vertical-align" (clojure.core/str imageAlign)}]]]]
 [".ui.list"
  ["> .item"
   ["> .image"
    {"display" (clojure.core/str "table-cell"),
     "background-color" (clojure.core/str "transparent"),
     "margin" (clojure.core/str "0em"),
     "vertical-align" (clojure.core/str imageAlign)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .image:not([:only-child]):not([img])"
     {"padding-right" (clojure.core/str imageDistance)}]]]]
 [".ui.list"
  ["> .item"
   ["> .image:not([:only-child]):not([img])"
    {"padding-right" (clojure.core/str imageDistance)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .image"
     ["img" {"vertical-align" (clojure.core/str imageAlign)}]]]]]
 [".ui.list"
  ["> .item"
   ["> .image"
    ["img" {"vertical-align" (clojure.core/str imageAlign)}]]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> img.image" {"display" (clojure.core/str "inline-block")}]]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .image:only-child"
     {"display" (clojure.core/str "inline-block")}]]]]
 [".ui.list"
  ["> .item"
   ["> img.image" {"display" (clojure.core/str "inline-block")}]]]
 [".ui.list"
  ["> .item"
   ["> .image:only-child"
    {"display" (clojure.core/str "inline-block")}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .content"
     {"line-height" (clojure.core/str contentLineHeight)}]]]]
 [".ui.list"
  ["> .item"
   ["> .content"
    {"line-height" (clojure.core/str contentLineHeight)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .image"
     ["+ .content"
      {"display" (clojure.core/str "table-cell"),
       "padding"
       (clojure.core/str
        "0em"
        " "
        "0em"
        " "
        "0em"
        " "
        contentDistance),
       "vertical-align" (clojure.core/str contentVerticalAlign)}]]]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .icon"
     ["+ .content"
      {"display" (clojure.core/str "table-cell"),
       "padding"
       (clojure.core/str
        "0em"
        " "
        "0em"
        " "
        "0em"
        " "
        contentDistance),
       "vertical-align" (clojure.core/str contentVerticalAlign)}]]]]]
 [".ui.list"
  ["> .item"
   ["> .image"
    ["+ .content"
     {"display" (clojure.core/str "table-cell"),
      "padding"
      (clojure.core/str "0em" " " "0em" " " "0em" " " contentDistance),
      "vertical-align" (clojure.core/str contentVerticalAlign)}]]]]
 [".ui.list"
  ["> .item"
   ["> .icon"
    ["+ .content"
     {"display" (clojure.core/str "table-cell"),
      "padding"
      (clojure.core/str "0em" " " "0em" " " "0em" " " contentDistance),
      "vertical-align" (clojure.core/str contentVerticalAlign)}]]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> img.image"
     ["+ .content" {"display" (clojure.core/str "inline-block")}]]]]]
 [".ui.list"
  ["> .item"
   ["> img.image"
    ["+ .content" {"display" (clojure.core/str "inline-block")}]]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["> .content"
     ["> .list"
      {"margin-left" (clojure.core/str "0em"),
       "padding-left" (clojure.core/str "0em")}]]]]]
 [".ui.list"
  ["> .item"
   ["> .content"
    ["> .list"
     {"margin-left" (clojure.core/str "0em"),
      "padding-left" (clojure.core/str "0em")}]]]]
 [".ui.list"
  [".list"
   ["> .item"
    [".header"
     {"display" (clojure.core/str "block"),
      "margin" (clojure.core/str "0em"),
      "font-family" (clojure.core/str itemHeaderFontFamily),
      "font-weight" (clojure.core/str itemHeaderFontWeight),
      "color" (clojure.core/str itemHeaderColor)}]]]]
 [".ui.list"
  ["> .item"
   [".header"
    {"display" (clojure.core/str "block"),
     "margin" (clojure.core/str "0em"),
     "font-family" (clojure.core/str itemHeaderFontFamily),
     "font-weight" (clojure.core/str itemHeaderFontWeight),
     "color" (clojure.core/str itemHeaderColor)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    [".description"
     {"display" (clojure.core/str "block"),
      "color" (clojure.core/str itemDescriptionColor)}]]]]
 [".ui.list"
  ["> .item"
   [".description"
    {"display" (clojure.core/str "block"),
     "color" (clojure.core/str itemDescriptionColor)}]]]
 [".ui.list" ["> .item" ["a" {"cursor" (clojure.core/str "pointer")}]]]
 [".ui.list"
  [".list" ["> .item" ["a" {"cursor" (clojure.core/str "pointer")}]]]]
 [".ui.list"
  [".list"
   ["> a.item"
    {"cursor" (clojure.core/str "pointer"),
     "color" (clojure.core/str itemLinkColor)}]]]
 [".ui.list"
  ["> a.item"
   {"cursor" (clojure.core/str "pointer"),
    "color" (clojure.core/str itemLinkColor)}]]
 [".ui.list"
  [".list"
   ["> a.item:hover" {"color" (clojure.core/str itemLinkHoverColor)}]]]
 [".ui.list"
  ["> a.item:hover" {"color" (clojure.core/str itemLinkHoverColor)}]]
 [".ui.list"
  [".list"
   ["> a.item"
    ["i.icon" {"color" (clojure.core/str itemLinkIconColor)}]]]]
 [".ui.list"
  ["> a.item"
   ["i.icon" {"color" (clojure.core/str itemLinkIconColor)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["a.header"
     {"cursor" (clojure.core/str "pointer"),
      "color" (clojure.core/str itemHeaderLinkColor)}]]]]
 [".ui.list"
  ["> .item"
   ["a.header"
    {"cursor" (clojure.core/str "pointer"),
     "color" (clojure.core/str itemHeaderLinkColor)}]]]
 [".ui.list"
  [".list"
   ["> .item"
    ["a.header:hover"
     {"color" (clojure.core/str itemHeaderLinkHoverColor)}]]]]
 [".ui.list"
  ["> .item"
   ["a.header:hover"
    {"color" (clojure.core/str itemHeaderLinkHoverColor)}]]]
 [".ui[class='left']" [nil {"float" (clojure.core/str "left")}]]
 [".ui[class='right']" [nil {"float" (clojure.core/str "right")}]]
 [nil
  ["floated"
   {"float" (clojure.core/str "left"),
    "margin" (clojure.core/str leftFloatMargin)}]]
 [nil
  ["floated"
   {"float" (clojure.core/str "right"),
    "margin" (clojure.core/str rightFloatMargin)}]]
 [".ui.menu"
  [".ui.list"
   ["> .item"
    {"display" (clojure.core/str "list-item"),
     "table-layout" (clojure.core/str "fixed"),
     "background-color" (clojure.core/str "transparent"),
     "list-style-type" (clojure.core/str listStyleType),
     "list-style-position" (clojure.core/str listStylePosition),
     "padding"
     (clojure.core/str itemVerticalPadding " " itemHorizontalPadding),
     "line-height" (clojure.core/str itemLineHeight)}]]]
 [".ui.menu"
  [".ui.list"
   [".list"
    ["> .item"
     {"display" (clojure.core/str "list-item"),
      "table-layout" (clojure.core/str "fixed"),
      "background-color" (clojure.core/str "transparent"),
      "list-style-type" (clojure.core/str listStyleType),
      "list-style-position" (clojure.core/str listStylePosition),
      "padding"
      (clojure.core/str itemVerticalPadding " " itemHorizontalPadding),
      "line-height" (clojure.core/str itemLineHeight)}]]]]
 [".ui.menu"
  [".ui.list"
   [".list"
    ["> .item:before"
     {"border" (clojure.core/str "none"),
      "background" (clojure.core/str "none")}]]]]
 [".ui.menu"
  [".ui.list"
   ["> .item:before"
    {"border" (clojure.core/str "none"),
     "background" (clojure.core/str "none")}]]]
 [".ui.menu"
  [".ui.list"
   [".list"
    ["> .item:first-child" {"padding-top" (clojure.core/str "0em")}]]]]
 [".ui.menu"
  [".ui.list"
   ["> .item:first-child" {"padding-top" (clojure.core/str "0em")}]]]
 [".ui.menu"
  [".ui.list"
   [".list"
    ["> .item:last-child"
     {"padding-bottom" (clojure.core/str "0em")}]]]]
 [".ui.menu"
  [".ui.list"
   ["> .item:last-child" {"padding-bottom" (clojure.core/str "0em")}]]]
 [".ui.horizontal.list"
  {"display" (clojure.core/str "inline-block"),
   "font-size" (clojure.core/str "0em")}]
 [".ui.horizontal.list"
  ["> .item"
   {"display" (clojure.core/str "inline-block"),
    "margin-left" (clojure.core/str horizontalSpacing),
    "font-size" (clojure.core/str "11" " " "rem")}]]
 [".ui.horizontal.list:not([.celled])" ["> .item:first-child" nil]]
 [".ui.horizontal.list"
  [".list"
   {"padding-left" (clojure.core/str "0em"),
    "padding-bottom" (clojure.core/str "0em")}]]
 [".ui.horizontal.list"
  ["> .item"
   ["> .image"
    {"vertical-align" (clojure.core/str horizontalVerticalAlign)}]]]
 [".ui.horizontal.list"
  [".list"
   ["> .item"
    ["> .image"
     {"vertical-align" (clojure.core/str horizontalVerticalAlign)}]]]]
 [".ui.horizontal.list"
  ["> .item"
   ["> .icon"
    {"vertical-align" (clojure.core/str horizontalVerticalAlign)}]]]
 [".ui.horizontal.list"
  [".list"
   ["> .item"
    ["> .icon"
     {"vertical-align" (clojure.core/str horizontalVerticalAlign)}]]]]
 [".ui.horizontal.list"
  ["> .item"
   ["> .content"
    {"vertical-align" (clojure.core/str horizontalVerticalAlign)}]]]
 [".ui.horizontal.list"
  [".list"
   ["> .item"
    ["> .content"
     {"vertical-align" (clojure.core/str horizontalVerticalAlign)}]]]]
 [".ui.horizontal.list"
  ["> .item:first-child"
   {"padding-top" (clojure.core/str itemVerticalPadding),
    "padding-bottom" (clojure.core/str itemVerticalPadding)}]]
 [".ui.horizontal.list"
  ["> .item:last-child"
   {"padding-top" (clojure.core/str itemVerticalPadding),
    "padding-bottom" (clojure.core/str itemVerticalPadding)}]]
 [".ui.horizontal.list"
  ["> .item"
   ["> i.icon"
    {"margin" (clojure.core/str "0em"),
     "padding"
     (clojure.core/str
      "0em"
      " "
      horizontalIconDistance
      " "
      "0em"
      " "
      "0em")}]]]
 [".ui.horizontal.list"
  ["> .item"
   ["> .icon"
    {"float" (clojure.core/str "none"),
     "display" (clojure.core/str "inline-block")}]]]
 [".ui.horizontal.list"
  ["> .item"
   ["> .icon"
    ["+ .content"
     {"float" (clojure.core/str "none"),
      "display" (clojure.core/str "inline-block")}]]]]
 ...)
