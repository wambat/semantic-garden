((clojure.core/ns
  definitions.collections.table
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'collection'")
 (def element "'table'")
 (defstyles
  root
  [".ui.table"
   {"width" (clojure.core/str "100%"),
    "margin" (clojure.core/str margin),
    "border" (clojure.core/str border),
    "border-collapse" (clojure.core/str borderCollapse),
    "text-align" (clojure.core/str textAlign),
    "box-shadow" (clojure.core/str boxShadow),
    "border-radius" (clojure.core/str borderRadius),
    "border-spacing" (clojure.core/str borderSpacing),
    "background" (clojure.core/str background),
    "color" (clojure.core/str color)}]
  [".ui.table:first-child" {"margin-top" (clojure.core/str "0em")}]
  [".ui.table:last-child" {"margin-bottom" (clojure.core/str "0em")}]
  [".ui.table" ["th" {"transition" (clojure.core/str transition)}]]
  [".ui.table" ["td" {"transition" (clojure.core/str transition)}]]
  [".ui.table"
   ["thead" {"box-shadow" (clojure.core/str headerBoxShadow)}]]
  [".ui.table"
   ["thead"
    ["th"
     {"border-bottom" (clojure.core/str headerBorder),
      "border-left" (clojure.core/str headerDivider),
      "text-transform" (clojure.core/str headerTextTransform),
      "vertical-align" (clojure.core/str headerVerticalAlign),
      "padding"
      (clojure.core/str
       headerVerticalPadding
       " "
       headerHorizontalPadding),
      "text-align" (clojure.core/str headerAlign),
      "cursor" (clojure.core/str "auto"),
      "font-weight" (clojure.core/str headerFontWeight),
      "font-style" (clojure.core/str headerFontStyle),
      "background" (clojure.core/str headerBackground),
      "color" (clojure.core/str headerColor)}]]]
  [".ui.table"
   ["thead"
    ["tr"
     ["> th:first-child" {"border-left" (clojure.core/str "none")}]]]]
  [".ui.table"
   ["thead"
    ["tr:first-child"
     ["> th:first-child"
      {"border-radius"
       (clojure.core/str
        borderRadius
        " "
        "0em"
        " "
        "0em"
        " "
        "0em")}]]]]
  [".ui.table"
   ["thead"
    ["tr:first-child"
     ["> th:last-child"
      {"border-radius"
       (clojure.core/str
        "0em"
        " "
        borderRadius
        " "
        "0em"
        " "
        "0em")}]]]]
  [".ui.table"
   ["thead"
    ["tr:first-child"
     ["> th:only-child"
      {"border-radius"
       (clojure.core/str
        borderRadius
        " "
        borderRadius
        " "
        "0em"
        " "
        "0em")}]]]]
  [".ui.table"
   ["tfoot" {"box-shadow" (clojure.core/str footerBoxShadow)}]]
  [".ui.table"
   ["tfoot"
    ["th"
     {"text-transform" (clojure.core/str footerTextTransform),
      "vertical-align" (clojure.core/str footerVerticalAlign),
      "padding"
      (clojure.core/str
       footerVerticalPadding
       " "
       footerHorizontalPadding),
      "text-align" (clojure.core/str footerAlign),
      "border-top" (clojure.core/str footerBorder),
      "cursor" (clojure.core/str "auto"),
      "font-weight" (clojure.core/str footerFontWeight),
      "font-style" (clojure.core/str footerFontStyle),
      "background" (clojure.core/str footerBackground),
      "color" (clojure.core/str footerColor)}]]]
  [".ui.table"
   ["tfoot"
    ["tr"
     ["> th:first-child" {"border-left" (clojure.core/str "none")}]]]]
  [".ui.table"
   ["tfoot"
    ["tr:first-child"
     ["> th:first-child"
      {"border-radius"
       (clojure.core/str
        "0em"
        " "
        "0em"
        " "
        "0em"
        " "
        borderRadius)}]]]]
  [".ui.table"
   ["tfoot"
    ["tr:first-child"
     ["> th:last-child"
      {"border-radius"
       (clojure.core/str
        "0em"
        " "
        "0em"
        " "
        borderRadius
        " "
        "0em")}]]]]
  [".ui.table"
   ["tfoot"
    ["tr:first-child"
     ["> th:only-child"
      {"border-radius"
       (clojure.core/str
        "0em"
        " "
        "0em"
        " "
        borderRadius
        " "
        borderRadius)}]]]]
  [".ui.table"
   ["tr" ["td" {"border-top" (clojure.core/str rowBorder)}]]]
  [".ui.table"
   ["tr:first-child" ["td" {"border-top" (clojure.core/str "none")}]]]
  [".ui.table"
   ["tbody"
    ["+ tbody"
     ["tr:first-child"
      ["td" {"border-top" (clojure.core/str rowBorder)}]]]]]
  [".ui.table"
   ["td"
    {"padding"
     (clojure.core/str cellVerticalPadding " " cellHorizontalPadding),
     "text-align" (clojure.core/str cellTextAlign)}]]
  [".ui.table"
   ["> .icon" {"vertical-align" (clojure.core/str iconVerticalAlign)}]]
  [".ui.table"
   ["> .icon:only-child" {"margin" (clojure.core/str "0em")}]]
  [".ui.table.segment" {"padding" (clojure.core/str "0em")}]
  [".ui.table.segment:after" {"display" (clojure.core/str "none")}]
  [".ui.table.segment.stacked:after"
   {"display" (clojure.core/str "block")}]))
