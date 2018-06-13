((clojure.core/ns
  definitions.collections.menu
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'collection'")
 (def element "'menu'")
 (def
  dropdownMenuBorderRadius
  "(:variableName \"@\" \"dropdownMenuBorderRadius\")")
 (def dropdownMenuDistance "(:measurement \"0\" \"px\")")
 (defstyles
  root
  [".ui.menu"
   {"display" (clojure.core/str "flex"),
    "margin" (clojure.core/str margin),
    "font-family" (clojure.core/str fontFamily),
    "background" (clojure.core/str background),
    "font-weight" (clojure.core/str fontWeight),
    "border" (clojure.core/str border),
    "box-shadow" (clojure.core/str boxShadow),
    "border-radius" (clojure.core/str borderRadius),
    "min-height" (clojure.core/str minHeight)}]
  [".ui.menu:after"
   {"content" nil,
    "display" (clojure.core/str "block"),
    "height" (clojure.core/str "0px"),
    "clear" (clojure.core/str "both"),
    "visibility" (clojure.core/str "hidden")}]
  [".ui.menu:first-child"
   {"margin-top" (clojure.core/str "00" " " "rem")}]
  [".ui.menu:last-child"
   {"margin-bottom" (clojure.core/str "00" " " "rem")}]
  [".ui.menu" [".menu" {"margin" (clojure.core/str "0em")}]]
  [".ui.menu:not([\".vertical\"])"
   ["> .menu" {"display" (clojure.core/str "flex")}]]
  [".ui.menu:not([\".vertical\"])"
   [".item"
    {"display" (clojure.core/str "flex"),
     "align-items" (clojure.core/str "center")}]]
  [".ui.menu"
   [".item"
    {"line-height" (clojure.core/str "11"),
     "-webkit-tap-highlight-color" (clojure.core/str "transparent"),
     "user-select" (clojure.core/str "none"),
     "text-transform" (clojure.core/str itemTextTransform),
     "vertical-align" (clojure.core/str "middle"),
     "padding"
     (clojure.core/str itemVerticalPadding " " itemHorizontalPadding),
     "position" (clojure.core/str "relative"),
     "font-weight" (clojure.core/str itemFontWeight),
     "text-decoration" (clojure.core/str "none"),
     "transition" (clojure.core/str itemTransition),
     "flex" (clojure.core/str "00" " " "00" " " "auto"),
     "background" (clojure.core/str itemBackground),
     "color" (clojure.core/str itemTextColor)}]]
  [".ui.menu"
   ["> .item:first-child"
    {"border-radius"
     (clojure.core/str
      borderRadius
      " "
      "0px"
      " "
      "0px"
      " "
      borderRadius)}]]
  [".ui.menu"
   [".item:before"
    {"position" (clojure.core/str "absolute"),
     "content" nil,
     "top" (clojure.core/str "0%"),
     "right" (clojure.core/str "0px"),
     "height" (clojure.core/str "100%"),
     "width" (clojure.core/str dividerSize),
     "background" (clojure.core/str dividerBackground)}]]
  nil
  [".ui.menu"
   [".item"
    ["> a:not([\".ui\"])"
     {"user-select" (clojure.core/str "text"),
      "line-height" (clojure.core/str textLineHeight)}]]]
  [".ui.menu"
   [".item"
    ["> p:only-child"
     {"user-select" (clojure.core/str "text"),
      "line-height" (clojure.core/str textLineHeight)}]]]
  [".ui.menu"
   [".item"
    ["> p:first-child" {"margin-top" (clojure.core/str "00")}]]]
  [".ui.menu"
   [".item"
    ["> p:last-child" {"margin-bottom" (clojure.core/str "00")}]]]
  [".ui.menu"
   [".item"
    ["> i.icon"
     {"opacity" (clojure.core/str iconOpacity),
      "float" (clojure.core/str iconFloat),
      "margin" (clojure.core/str iconMargin)}]]]
  [".ui.menu:not([\".vertical\"])"
   [".item"
    ["> .button"
     {"position" (clojure.core/str "relative"),
      "top" (clojure.core/str buttonOffset),
      "margin" (clojure.core/str buttonMargin),
      "padding-bottom" (clojure.core/str buttonVerticalPadding),
      "padding-top" (clojure.core/str buttonVerticalPadding),
      "font-size" (clojure.core/str buttonSize)}]]]
  [".ui.menu"
   ["> .grid"
    {"display" (clojure.core/str "flex"),
     "align-items" (clojure.core/str "inherit"),
     "flex-direction" (clojure.core/str "inherit")}]]
  [".ui.menu"
   ["> .container"
    {"display" (clojure.core/str "flex"),
     "align-items" (clojure.core/str "inherit"),
     "flex-direction" (clojure.core/str "inherit")}]]
  [".ui.menu"
   [".item" ["> .input" {"width" (clojure.core/str "100%")}]]]
  [".ui.menu:not([\".vertical\"])"
   [".item"
    ["> .input"
     {"position" (clojure.core/str "relative"),
      "top" (clojure.core/str inputOffset),
      "margin" (clojure.core/str inputVerticalMargin " " "0em")}]]]
  [".ui.menu"
   [".item"
    ["> .input"
     ["input"
      {"font-size" (clojure.core/str inputSize),
       "padding-top" (clojure.core/str inputVerticalPadding),
       "padding-bottom" (clojure.core/str inputVerticalPadding)}]]]]
  [".ui.menu"
   [".header.item"
    {"margin" (clojure.core/str "0em"),
     "background" (clojure.core/str headerBackground),
     "text-transform" (clojure.core/str headerTextTransform),
     "font-weight" (clojure.core/str headerWeight)}]]
  [".ui.vertical.menu"
   [".header.item"
    {"margin" (clojure.core/str "0em"),
     "background" (clojure.core/str headerBackground),
     "text-transform" (clojure.core/str headerTextTransform),
     "font-weight" (clojure.core/str headerWeight)}]]
  [".ui.vertical.menu"
   [".item"
    ["> .header:not([\".ui\"])"
     {"margin" (clojure.core/str verticalHeaderMargin),
      "font-size" (clojure.core/str verticalHeaderFontSize),
      "font-weight" (clojure.core/str verticalHeaderFontWeight)}]]]
  [".ui.menu"
   [".item"
    ["> i.dropdown.icon"
     {"padding" (clojure.core/str "0em"),
      "float" (clojure.core/str dropdownIconFloat),
      "margin"
      (clojure.core/str
       "0em"
       " "
       "0em"
       " "
       "0em"
       " "
       dropdownIconDistance)}]]]
  [".ui.menu" [".dropdown.item" [".menu" nil]]]
  [".ui.menu"
   [".ui.dropdown"
    [".menu"
     ["> .item"
      {"margin" (clojure.core/str "00"),
       "text-transform" (clojure.core/str dropdownItemTextTransform),
       "padding" (clojure.core/str dropdownItemPadding),
       "text-align" (clojure.core/str "left"),
       "font-weight" (clojure.core/str dropdownItemFontWeight),
       "box-shadow" (clojure.core/str dropdownItemBoxShadow),
       "font-size" (clojure.core/str dropdownItemFontSize),
       "transition" (clojure.core/str dropdownItemTransition),
       "background" (clojure.core/str dropdownItemBackground),
       "color" (clojure.core/str dropdownItemColor)}]]]]
  [".ui.menu"
   [".ui.dropdown"
    [".menu"
     ["> .item:hover"
      {"background" (clojure.core/str dropdownHoveredItemBackground),
       "color" (clojure.core/str dropdownHoveredItemColor)}]]]]
  [".ui.menu"
   [".ui.dropdown"
    [".menu"
     ["> .selected.item"
      {"background" (clojure.core/str dropdownSelectedItemBackground),
       "color" (clojure.core/str dropdownSelectedItemColor)}]]]]
  [".ui.menu"
   [".ui.dropdown"
    [".menu"
     ["> .active.item"
      {"background" (clojure.core/str dropdownActiveItemBackground),
       "font-weight" (clojure.core/str dropdownActiveItemFontWeight),
       "color" (clojure.core/str dropdownActiveItemColor)}]]]]
  [".ui.menu"
   [".ui.dropdown.item"
    [".menu"
     [".item:not([\".filtered\"])"
      {"display" (clojure.core/str "block")}]]]]
  [".ui.menu"
   [".ui.dropdown"
    [".menu"
     ["> .item"
      [".icon:not([\".dropdown\"])"
       {"display" (clojure.core/str "inline-block"),
        "font-size" (clojure.core/str dropdownItemIconFontSize),
        "float" (clojure.core/str dropdownItemIconFloat),
        "margin" (clojure.core/str dropdownItemIconMargin)}]]]]]
  [".ui.secondary.menu"
   [".dropdown.item"
    ["> .menu"
     {"border-radius" (clojure.core/str dropdownMenuBorderRadius),
      "margin-top" (clojure.core/str secondaryDropdownMenuDistance)}]]]
  [".ui.text.menu"
   [".dropdown.item"
    ["> .menu"
     {"border-radius" (clojure.core/str dropdownMenuBorderRadius),
      "margin-top" (clojure.core/str secondaryDropdownMenuDistance)}]]]
  [".ui.menu"
   [".pointing.dropdown.item"
    [".menu"
     {"margin-top" (clojure.core/str pointingDropdownMenuDistance)}]]]
  [".ui.inverted.menu"
   [".search.dropdown.item"
    ["> .search"
     {"color" (clojure.core/str invertedSelectionDropdownColor)}]]]
  [".ui.inverted.menu"
   [".search.dropdown.item"
    ["> .text"
     {"color" (clojure.core/str invertedSelectionDropdownColor)}]]]
  [".ui.vertical.menu"
   [".dropdown.item"
    ["> .icon"
     {"float" (clojure.core/str "right"),
      "content" nil,
      "margin-left" (clojure.core/str "1em")}]]]
  [".ui.vertical.menu"
   [".dropdown.item"
    [".menu"
     {"left" (clojure.core/str "100%"),
      "min-width" (clojure.core/str "00"),
      "margin"
      (clojure.core/str
       "0em"
       " "
       "0em"
       " "
       "0em"
       " "
       dropdownMenuDistance),
      "box-shadow" (clojure.core/str dropdownVerticalMenuBoxShadow),
      "border-radius"
      (clojure.core/str
       "0em"
       " "
       dropdownMenuBorderRadius
       " "
       dropdownMenuBorderRadius
       " "
       dropdownMenuBorderRadius)}]]]
  [".ui.vertical.menu"
   [".dropdown.item.upward"
    [".menu" {"bottom" (clojure.core/str "00")}]]]
  [".ui.vertical.menu"
   [".dropdown.item:not([\".upward\"])"
    [".menu" {"top" (clojure.core/str "00")}]]]
  [".ui.vertical.menu"
   [".active.dropdown.item"
    {"border-top-right-radius" (clojure.core/str "0em"),
     "border-bottom-right-radius" (clojure.core/str "0em")}]]
  [".ui.vertical.menu"
   [".dropdown.active.item" {"box-shadow" (clojure.core/str "none")}]]
  [".ui.item.menu"
   [".dropdown"
    [".menu" [".item" {"width" (clojure.core/str "100%")}]]]]
  [".ui.menu"
   [".item"
    ["> .label"
     {"background" (clojure.core/str labelBackground),
      "color" (clojure.core/str labelTextColor),
      "margin-left" (clojure.core/str labelTextMargin),
      "padding"
      (clojure.core/str
       labelVerticalPadding
       " "
       labelHorizontalPadding)}]]]
  [".ui.vertical.menu"
   [".item"
    ["> .label"
     {"background" (clojure.core/str labelBackground),
      "color" (clojure.core/str labelTextColor),
      "margin-top" (clojure.core/str labelOffset),
      "margin-bottom" (clojure.core/str labelOffset),
      "padding"
      (clojure.core/str
       labelVerticalPadding
       " "
       labelHorizontalPadding)}]]]
  [".ui.menu"
   [".item"
    ["> .floating.label"
     {"padding"
      (clojure.core/str
       labelVerticalPadding
       " "
       labelHorizontalPadding)}]]]
  [".ui.menu"
   [".item"
    ["> img:not([\".ui\"])"
     {"display" (clojure.core/str "inline-block"),
      "vertical-align" (clojure.core/str "middle"),
      "margin" (clojure.core/str imageMargin),
      "width" (clojure.core/str imageWidth)}]]]
  [".ui.vertical.menu"
   [".item"
    ["> img:not([\".ui\"]):only-child"
     {"display" (clojure.core/str "block"),
      "max-width" (clojure.core/str "100%"),
      "width" (clojure.core/str verticalImageWidth)}]]]
  [".ui.menu"
   [".list" [".item:before" {"background" (clojure.core/str "none")}]]]
  [".ui.vertical.sidebar.menu"
   ["> .item:first-child" {"display" (clojure.core/str "block")}]]
  [":before"
   {"top" (clojure.core/str "auto"),
    "bottom" (clojure.core/str "0px")}]))
