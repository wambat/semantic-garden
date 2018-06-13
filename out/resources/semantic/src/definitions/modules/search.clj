((clojure.core/ns
  definitions.modules.search
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'module'")
 (def element "'search'")
 (defstyles
  root
  [".ui.search" {"position" (clojure.core/str "relative")}]
  [".ui.search"
   ["> .prompt"
    {"line-height" (clojure.core/str promptLineHeight),
     "-webkit-tap-highlight-color" (clojure.core/str "rgba"),
     "margin" (clojure.core/str "0em"),
     "-webkit-appearance" (clojure.core/str "none"),
     "border" (clojure.core/str promptBorder),
     "padding" (clojure.core/str promptPadding),
     "outline" (clojure.core/str "none"),
     "font-weight" (clojure.core/str normal),
     "box-shadow" (clojure.core/str promptBoxShadow),
     "font-size" (clojure.core/str promptFontSize),
     "font-style" (clojure.core/str "normal"),
     "transition" (clojure.core/str promptTransition),
     "text-shadow" (clojure.core/str "none"),
     "background" (clojure.core/str promptBackground),
     "color" (clojure.core/str promptColor)}]]
  [".ui.search"
   [".prompt" {"border-radius" (clojure.core/str promptBorderRadius)}]]
  [".ui.search"
   [".prompt"
    ["~ .search.icon" {"cursor" (clojure.core/str "pointer")}]]]
  [".ui.search"
   ["> .results"
    {"width" (clojure.core/str resultsWidth),
     "top" (clojure.core/str "100%"),
     "transform-origin" (clojure.core/str "center" " " "top"),
     "border" (clojure.core/str resultsBorder),
     "white-space" (clojure.core/str "normal"),
     "position" (clojure.core/str "absolute"),
     "margin-top" (clojure.core/str resultsDistance),
     "z-index" (clojure.core/str resultsZIndex),
     "box-shadow" (clojure.core/str resultsBoxShadow),
     "border-radius" (clojure.core/str resultsBorderRadius),
     "display" (clojure.core/str "none"),
     "background" (clojure.core/str resultsBackground),
     "left" (clojure.core/str "0%")}]]
  [":first-child"
   {"border-radius"
    (clojure.core/str
     resultsBorderRadius
     " "
     resultsBorderRadius
     " "
     "0em"
     " "
     "0em")}]
  [":last-child"
   {"border-radius"
    (clojure.core/str
     "0em"
     " "
     "0em"
     " "
     resultsBorderRadius
     " "
     resultsBorderRadius)}]
  [".ui.search"
   ["> .results"
    [".result"
     {"cursor" (clojure.core/str "pointer"),
      "display" (clojure.core/str "block"),
      "overflow" (clojure.core/str "hidden"),
      "font-size" (clojure.core/str resultFontSize),
      "padding" (clojure.core/str resultPadding),
      "color" (clojure.core/str resultTextColor),
      "line-height" (clojure.core/str resultLineHeight),
      "border-bottom" (clojure.core/str resultDivider)}]]]
  [".ui.search"
   ["> .results"
    [".result:last-child"
     {"border-bottom" (clojure.core/str resultLastDivider)}]]]
  [".ui.search"
   ["> .results"
    [".result"
     [".image"
      {"float" (clojure.core/str resultImageFloat),
       "overflow" (clojure.core/str "hidden"),
       "background" (clojure.core/str resultImageBackground),
       "width" (clojure.core/str resultImageWidth),
       "height" (clojure.core/str resultImageHeight),
       "border-radius" (clojure.core/str resultImageBorderRadius)}]]]]
  [".ui.search"
   ["> .results"
    [".result"
     [".image"
      ["img"
       {"display" (clojure.core/str "block"),
        "width" (clojure.core/str "auto"),
        "height" (clojure.core/str "100%")}]]]]]
  [".ui.search"
   ["> .results"
    [".result"
     [".image"
      ["+ .content"
       {"margin" (clojure.core/str resultImageMargin)}]]]]]
  [".ui.search"
   ["> .results"
    [".result"
     [".title"
      {"margin" (clojure.core/str resultTitleMargin),
       "font-family" (clojure.core/str resultTitleFont),
       "font-weight" (clojure.core/str resultTitleFontWeight),
       "font-size" (clojure.core/str resultTitleFontSize),
       "color" (clojure.core/str resultTitleColor)}]]]]
  [".ui.search"
   ["> .results"
    [".result"
     [".description"
      {"margin-top" (clojure.core/str resultDescriptionDistance),
       "font-size" (clojure.core/str resultDescriptionFontSize),
       "color" (clojure.core/str resultDescriptionColor)}]]]]
  [".ui.search"
   ["> .results"
    [".result"
     [".price"
      {"float" (clojure.core/str resultPriceFloat),
       "color" (clojure.core/str resultPriceColor)}]]]]
  [".ui.search"
   ["> .results"
    ["> .message"
     {"padding"
      (clojure.core/str
       messageVerticalPadding
       " "
       messageHorizontalPadding)}]]]
  [".ui.search"
   ["> .results"
    ["> .message"
     [".header"
      {"font-family" (clojure.core/str headerFont),
       "font-size" (clojure.core/str messageHeaderFontSize),
       "font-weight" (clojure.core/str messageHeaderFontWeight),
       "color" (clojure.core/str messageHeaderColor)}]]]]
  [".ui.search"
   ["> .results"
    ["> .message"
     [".description"
      {"margin-top" (clojure.core/str messageDescriptionDistance),
       "font-size" (clojure.core/str messageDescriptionFontSize),
       "color" (clojure.core/str messageDescriptionColor)}]]]]
  [".ui.search"
   ["> .results"
    ["> .action"
     {"display" (clojure.core/str "block"),
      "border-top" (clojure.core/str actionBorder),
      "background" (clojure.core/str actionBackground),
      "padding" (clojure.core/str actionPadding),
      "color" (clojure.core/str actionColor),
      "font-weight" (clojure.core/str actionFontWeight),
      "text-align" (clojure.core/str actionAlign)}]]]
  [".ui.search"
   ["> .prompt:focus"
    {"border-color" (clojure.core/str promptFocusBorderColor),
     "background" (clojure.core/str promptFocusBackground),
     "color" (clojure.core/str promptFocusColor)}]]
  [".ui.loading.search"
   [".input"
    ["> i.icon:before"
     {"position" (clojure.core/str "absolute"),
      "content" nil,
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
       loaderFillColor)}]]]
  [".ui.loading.search"
   [".input"
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
      "content" nil,
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
      "left" (clojure.core/str "50%")}]]]
  [".ui.search"
   ["> .results"
    [".result:hover"
     {"background" (clojure.core/str resultHoverBackground)}]]]
  [".ui.category.search"
   ["> .results"
    [".category"
     [".result:hover"
      {"background" (clojure.core/str resultHoverBackground)}]]]]
  [".ui.search"
   [".action:hover"
    {"background" (clojure.core/str actionHoverBackground)}]]
  [".ui.category.search"
   ["> .results"
    [".category.active"
     {"background" (clojure.core/str categoryActiveBackground)}]]]
  [".ui.category.search"
   ["> .results"
    [".category.active"
     ["> .name"
      {"color" (clojure.core/str categoryNameActiveColor)}]]]]
  [".ui.search"
   ["> .results"
    [".result.active"
     {"position" (clojure.core/str "relative"),
      "border-left-color" (clojure.core/str resultActiveBorderLeft),
      "background" (clojure.core/str resultActiveBackground),
      "box-shadow" (clojure.core/str resultActiveBoxShadow)}]]]
  [".ui.category.search"
   ["> .results"
    [".category"
     [".result.active"
      {"position" (clojure.core/str "relative"),
       "border-left-color" (clojure.core/str resultActiveBorderLeft),
       "background" (clojure.core/str resultActiveBackground),
       "box-shadow" (clojure.core/str resultActiveBoxShadow)}]]]]
  [".ui.search"
   ["> .results"
    [".result.active"
     [".title" {"color" (clojure.core/str resultActiveTitleColor)}]]]]
  [".ui.search"
   ["> .results"
    [".result.active"
     [".description"
      {"color" (clojure.core/str resultActiveDescriptionColor)}]]]]
  [".ui.disabled.search"
   {"cursor" (clojure.core/str "default"),
    "pointer-events" (clojure.core/str "none"),
    "opacity" (clojure.core/str disabledOpacity)}]
  [".ui.search.selection"
   [".prompt"
    {"border-radius" (clojure.core/str selectionPromptBorderRadius)}]]
  [".ui.search.selection"
   ["> .icon.input"
    ["> .remove.icon"
     {"pointer-events" (clojure.core/str "none"),
      "position" (clojure.core/str "absolute"),
      "left" (clojure.core/str "auto"),
      "opacity" (clojure.core/str "00"),
      "color" (clojure.core/str selectionCloseIconColor),
      "top" (clojure.core/str selectionCloseTop),
      "right" (clojure.core/str selectionCloseRight),
      "transition" (clojure.core/str selectionCloseTransition)}]]]
  [".ui.search.selection"
   ["> .icon.input"
    ["> .active.remove.icon"
     {"cursor" (clojure.core/str "pointer"),
      "opacity" (clojure.core/str selectionCloseIconOpacity),
      "pointer-events" (clojure.core/str "auto")}]]]
  [".ui.search.selection"
   ["> .icon.input:not([nil \"icon\"])"
    ["> .icon"
     ["~ .remove.icon"
      {"right" (clojure.core/str selectionCloseIconInputRight)}]]]]
  [".ui.search.selection"
   ["> .icon.input"
    ["> .remove.icon:hover"
     {"opacity" (clojure.core/str selectionCloseIconHoverOpacity),
      "color" (clojure.core/str selectionCloseIconHoverColor)}]]]
  [".ui.category.search"
   [".results" {"width" (clojure.core/str categoryResultsWidth)}]]
  [".ui.category.search"
   [".results.animating" {"display" (clojure.core/str "table")}]]
  [".ui.category.search"
   [".results.visible" {"display" (clojure.core/str "table")}]]
  [".ui.category.search"
   ["> .results"
    [".category"
     {"display" (clojure.core/str "table-row"),
      "background" (clojure.core/str categoryBackground),
      "box-shadow" (clojure.core/str categoryBoxShadow),
      "transition" (clojure.core/str categoryTransition)}]]]
  [".ui.category.search"
   ["> .results"
    [".category:last-child"
     {"border-bottom" (clojure.core/str "none")}]]]
  [".ui.category.search"
   ["> .results"
    [".category:first-child"
     [".name"
      ["+ .result"
       {"border-radius"
        (clojure.core/str
         "0em"
         " "
         resultsBorderRadius
         " "
         "0em"
         " "
         "0em")}]]]]]
  [".ui.category.search"
   ["> .results"
    [".category:last-child"
     [".result:last-child"
      {"border-radius"
       (clojure.core/str
        "0em"
        " "
        "0em"
        " "
        resultsBorderRadius
        " "
        "0em")}]]]]
  [".ui.category.search"
   ["> .results"
    [".category"
     ["> .name"
      {"border-bottom" (clojure.core/str categoryDivider),
       "width" (clojure.core/str categoryNameWidth),
       "font-family" (clojure.core/str categoryNameFont),
       "padding" (clojure.core/str categoryNamePadding),
       "white-space" (clojure.core/str categoryNameWhitespace),
       "text-overflow" (clojure.core/str "ellipsis"),
       "font-weight" (clojure.core/str categoryNameFontWeight),
       "font-size" (clojure.core/str categoryNameFontSize),
       "display" (clojure.core/str "table-cell"),
       "background" (clojure.core/str categoryNameBackground),
       "color" (clojure.core/str categoryNameColor)}]]]]
  [".ui.category.search"
   ["> .results"
    [".category"
     [".results"
      {"display" (clojure.core/str "table-cell"),
       "background" (clojure.core/str categoryResultBackground),
       "border-left" (clojure.core/str categoryResultLeftBorder),
       "border-bottom" (clojure.core/str categoryDivider)}]]]]
  [".ui.category.search"
   ["> .results"
    [".category"
     [".result"
      {"border-bottom" (clojure.core/str categoryResultDivider),
       "transition" (clojure.core/str categoryResultTransition),
       "padding" (clojure.core/str categoryResultPadding)}]]]]
  [".ui[class='left']"
   [nil
    ["> .results"
     {"right" (clojure.core/str "auto"),
      "left" (clojure.core/str "0%")}]]]
  [".ui[class='right']"
   [nil
    ["> .results"
     {"right" (clojure.core/str "0%"),
      "left" (clojure.core/str "auto")}]]]
  [".ui.fluid.search" [".results" {"width" (clojure.core/str "100%")}]]
  [".ui.mini.search" {"font-size" (clojure.core/str relativeMini)}]
  [".ui.small.search" {"font-size" (clojure.core/str relativeSmall)}]
  [".ui.search" {"font-size" (clojure.core/str relativeMedium)}]
  [".ui.large.search" {"font-size" (clojure.core/str relativeLarge)}]
  [".ui.big.search" {"font-size" (clojure.core/str relativeBig)}]
  [".ui.huge.search" {"font-size" (clojure.core/str relativeHuge)}]
  [".ui.massive.search"
   {"font-size" (clojure.core/str relativeMassive)}]))
