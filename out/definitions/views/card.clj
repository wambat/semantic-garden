(clojure.core/ns
 definitions.views.card
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "view"))
(def element (clojure.core/str "card"))
(def borderRadius (clojure.core/str borderRadius " " "0em" " " "0em"))
(defstyles
 root
 [".ui.cards"
  ["> .card"
   {"width" (clojure.core/str width),
    "max-width" (clojure.core/str "100%"),
    "border" (clojure.core/str border),
    "padding" (clojure.core/str padding),
    "flex-direction" (clojure.core/str "column"),
    "position" (clojure.core/str "relative"),
    "z-index" (clojure.core/str zIndex),
    "min-height" (clojure.core/str minHeight),
    "box-shadow" (clojure.core/str boxShadow),
    "border-radius" (clojure.core/str borderRadius),
    "display" (clojure.core/str display),
    "transition" (clojure.core/str transition),
    "background" (clojure.core/str background)}]]
 [".ui.card"
  {"width" (clojure.core/str width),
   "max-width" (clojure.core/str "100%"),
   "border" (clojure.core/str border),
   "padding" (clojure.core/str padding),
   "flex-direction" (clojure.core/str "column"),
   "position" (clojure.core/str "relative"),
   "z-index" (clojure.core/str zIndex),
   "min-height" (clojure.core/str minHeight),
   "box-shadow" (clojure.core/str boxShadow),
   "border-radius" (clojure.core/str borderRadius),
   "display" (clojure.core/str display),
   "transition" (clojure.core/str transition),
   "background" (clojure.core/str background)}]
 [".ui.card" {"margin" (clojure.core/str margin)}]
 [".ui.cards"
  ["> .card" ["a" {"cursor" (clojure.core/str "pointer")}]]]
 [".ui.card" ["a" {"cursor" (clojure.core/str "pointer")}]]
 [".ui.card:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.card:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.cards"
  {"display" (clojure.core/str groupDisplay),
   "margin" (clojure.core/str groupMargin),
   "flex-wrap" (clojure.core/str "wrap")}]
 [".ui.cards"
  ["> .card"
   {"display" (clojure.core/str groupCardDisplay),
    "margin" (clojure.core/str groupCardMargin),
    "float" (clojure.core/str groupCardFloat)}]]
 [".ui.cards:after"
  {"display" (clojure.core/str "block"),
   "content" (clojure.core/str " "),
   "height" (clojure.core/str "0px"),
   "clear" (clojure.core/str "both"),
   "overflow" (clojure.core/str "hidden"),
   "visibility" (clojure.core/str "hidden")}]
 [".ui.card:after"
  {"display" (clojure.core/str "block"),
   "content" (clojure.core/str " "),
   "height" (clojure.core/str "0px"),
   "clear" (clojure.core/str "both"),
   "overflow" (clojure.core/str "hidden"),
   "visibility" (clojure.core/str "hidden")}]
 [".ui.cards"
  ["~ .ui.cards"
   {"margin-top" (clojure.core/str consecutiveGroupDistance)}]]
 [":first-child" nil]
 [":last-child"
  {"border-radius"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    borderRadius
    " "
    borderRadius)}]
 [":only-child" {"border-radius" (clojure.core/str borderRadius)}]
 [".ui.cards"
  ["> .card"
   ["> .image"
    {"position" (clojure.core/str "relative"),
     "display" (clojure.core/str "block"),
     "flex" (clojure.core/str "00" " " "00" " " "auto"),
     "padding" (clojure.core/str imagePadding),
     "background" (clojure.core/str imageBackground)}]]]
 [".ui.card"
  ["> .image"
   {"position" (clojure.core/str "relative"),
    "display" (clojure.core/str "block"),
    "flex" (clojure.core/str "00" " " "00" " " "auto"),
    "padding" (clojure.core/str imagePadding),
    "background" (clojure.core/str imageBackground)}]]
 [".ui.cards"
  ["> .card"
   ["> .image"
    ["> img"
     {"display" (clojure.core/str "block"),
      "width" (clojure.core/str "100%"),
      "height" (clojure.core/str "auto"),
      "border-radius" (clojure.core/str "inherit")}]]]]
 [".ui.card"
  ["> .image"
   ["> img"
    {"display" (clojure.core/str "block"),
     "width" (clojure.core/str "100%"),
     "height" (clojure.core/str "auto"),
     "border-radius" (clojure.core/str "inherit")}]]]
 [".ui.cards"
  ["> .card"
   ["> .image:not([.ui])"
    ["> img" {"border" (clojure.core/str imageBorder)}]]]]
 [".ui.card"
  ["> .image:not([.ui])"
   ["> img" {"border" (clojure.core/str imageBorder)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    {"flex-grow" (clojure.core/str "11"),
     "border" (clojure.core/str contentBorder),
     "border-top" (clojure.core/str contentDivider),
     "background" (clojure.core/str contentBackground),
     "margin" (clojure.core/str contentMargin),
     "padding" (clojure.core/str contentPadding),
     "box-shadow" (clojure.core/str contentBoxShadow),
     "font-size" (clojure.core/str contentFontSize),
     "border-radius" (clojure.core/str contentBorderRadius)}]]]
 [".ui.card"
  ["> .content"
   {"flex-grow" (clojure.core/str "11"),
    "border" (clojure.core/str contentBorder),
    "border-top" (clojure.core/str contentDivider),
    "background" (clojure.core/str contentBackground),
    "margin" (clojure.core/str contentMargin),
    "padding" (clojure.core/str contentPadding),
    "box-shadow" (clojure.core/str contentBoxShadow),
    "font-size" (clojure.core/str contentFontSize),
    "border-radius" (clojure.core/str contentBorderRadius)}]]
 [".ui.cards"
  ["> .card"
   ["> .content:after"
    {"display" (clojure.core/str "block"),
     "content" (clojure.core/str " "),
     "height" (clojure.core/str "0px"),
     "clear" (clojure.core/str "both"),
     "overflow" (clojure.core/str "hidden"),
     "visibility" (clojure.core/str "hidden")}]]]
 [".ui.card"
  ["> .content:after"
   {"display" (clojure.core/str "block"),
    "content" (clojure.core/str " "),
    "height" (clojure.core/str "0px"),
    "clear" (clojure.core/str "both"),
    "overflow" (clojure.core/str "hidden"),
    "visibility" (clojure.core/str "hidden")}]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["> .header"
     {"display" (clojure.core/str "block"),
      "margin" (clojure.core/str headerMargin),
      "font-family" (clojure.core/str headerFont),
      "color" (clojure.core/str headerColor)}]]]]
 [".ui.card"
  ["> .content"
   ["> .header"
    {"display" (clojure.core/str "block"),
     "margin" (clojure.core/str headerMargin),
     "font-family" (clojure.core/str headerFont),
     "color" (clojure.core/str headerColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["> .header:not([.ui])"
     {"font-weight" (clojure.core/str headerFontWeight),
      "font-size" (clojure.core/str headerFontSize),
      "margin-top" (clojure.core/str headerLineHeightOffset),
      "line-height" (clojure.core/str headerLineHeight)}]]]]
 [".ui.card"
  ["> .content"
   ["> .header:not([.ui])"
    {"font-weight" (clojure.core/str headerFontWeight),
     "font-size" (clojure.core/str headerFontSize),
     "margin-top" (clojure.core/str headerLineHeightOffset),
     "line-height" (clojure.core/str headerLineHeight)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["> .meta"
     ["+ .description"
      {"margin-top" (clojure.core/str descriptionDistance)}]]]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["> .header"
     ["+ .description"
      {"margin-top" (clojure.core/str descriptionDistance)}]]]]]
 [".ui.card"
  ["> .content"
   ["> .meta"
    ["+ .description"
     {"margin-top" (clojure.core/str descriptionDistance)}]]]]
 [".ui.card"
  ["> .content"
   ["> .header"
    ["+ .description"
     {"margin-top" (clojure.core/str descriptionDistance)}]]]]
 [nil ["floated" {"float" (clojure.core/str "left")}]]
 [nil ["floated" {"float" (clojure.core/str "right")}]]
 [nil ["aligned" {"text-align" (clojure.core/str "left")}]]
 [nil ["aligned" {"text-align" (clojure.core/str "center")}]]
 [nil ["aligned" {"text-align" (clojure.core/str "right")}]]
 [".ui.cards"
  ["> .card"
   [".content"
    ["img"
     {"display" (clojure.core/str "inline-block"),
      "vertical-align" (clojure.core/str contentImageVerticalAlign),
      "width" (clojure.core/str contentImageWidth)}]]]]
 [".ui.card"
  [".content"
   ["img"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str contentImageVerticalAlign),
     "width" (clojure.core/str contentImageWidth)}]]]
 [".ui.cards"
  ["> .card"
   ["img.avatar"
    {"width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "border-radius" (clojure.core/str avatarBorderRadius)}]]]
 [".ui.cards"
  ["> .card"
   [".avatar"
    ["img"
     {"width" (clojure.core/str avatarSize),
      "height" (clojure.core/str avatarSize),
      "border-radius" (clojure.core/str avatarBorderRadius)}]]]]
 [".ui.card"
  ["img.avatar"
   {"width" (clojure.core/str avatarSize),
    "height" (clojure.core/str avatarSize),
    "border-radius" (clojure.core/str avatarBorderRadius)}]]
 [".ui.card"
  [".avatar"
   ["img"
    {"width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "border-radius" (clojure.core/str avatarBorderRadius)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["> .description"
     {"clear" (clojure.core/str "both"),
      "color" (clojure.core/str descriptionColor)}]]]]
 [".ui.card"
  ["> .content"
   ["> .description"
    {"clear" (clojure.core/str "both"),
     "color" (clojure.core/str descriptionColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["p"
     {"margin"
      (clojure.core/str "0em" " " "0em" " " paragraphDistance)}]]]]
 [".ui.card"
  ["> .content"
   ["p"
    {"margin"
     (clojure.core/str "0em" " " "0em" " " paragraphDistance)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["p:last-child" {"margin-bottom" (clojure.core/str "0em")}]]]]
 [".ui.card"
  ["> .content"
   ["p:last-child" {"margin-bottom" (clojure.core/str "0em")}]]]
 [".ui.cards"
  ["> .card"
   [".meta"
    {"font-size" (clojure.core/str metaFontSize),
     "color" (clojure.core/str metaColor)}]]]
 [".ui.card"
  [".meta"
   {"font-size" (clojure.core/str metaFontSize),
    "color" (clojure.core/str metaColor)}]]
 nil
 nil
 [".ui.cards"
  ["> .card"
   [".meta:last-child" {"margin-right" (clojure.core/str "0em")}]]]
 [".ui.card"
  [".meta:last-child" {"margin-right" (clojure.core/str "0em")}]]
 [nil
  ["floated"
   {"margin-right" (clojure.core/str "0em"),
    "margin-left" (clojure.core/str metaSpacing)}]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["a:not([.ui])"
     {"color" (clojure.core/str contentLinkColor),
      "transition" (clojure.core/str contentLinkTransition)}]]]]
 [".ui.card"
  ["> .content"
   ["a:not([.ui])"
    {"color" (clojure.core/str contentLinkColor),
     "transition" (clojure.core/str contentLinkTransition)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["a:not([.ui]):hover"
     {"color" (clojure.core/str contentLinkHoverColor)}]]]]
 [".ui.card"
  ["> .content"
   ["a:not([.ui]):hover"
    {"color" (clojure.core/str contentLinkHoverColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["> a.header" {"color" (clojure.core/str headerLinkColor)}]]]]
 [".ui.card"
  ["> .content"
   ["> a.header" {"color" (clojure.core/str headerLinkColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    ["> a.header:hover"
     {"color" (clojure.core/str headerLinkHoverColor)}]]]]
 [".ui.card"
  ["> .content"
   ["> a.header:hover"
    {"color" (clojure.core/str headerLinkHoverColor)}]]]
 [".ui.cards"
  ["> .card"
   [".meta"
    ["> a:not([.ui])" {"color" (clojure.core/str metaLinkColor)}]]]]
 [".ui.card"
  [".meta"
   ["> a:not([.ui])" {"color" (clojure.core/str metaLinkColor)}]]]
 [".ui.cards"
  ["> .card"
   [".meta"
    ["> a:not([.ui]):hover"
     {"color" (clojure.core/str metaLinkHoverColor)}]]]]
 [".ui.card"
  [".meta"
   ["> a:not([.ui]):hover"
    {"color" (clojure.core/str metaLinkHoverColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .buttons"
    {"margin" (clojure.core/str buttonMargin),
     "width" (clojure.core/str buttonWidth)}]]]
 [".ui.card"
  ["> .buttons"
   {"margin" (clojure.core/str buttonMargin),
    "width" (clojure.core/str buttonWidth)}]]
 [".ui.cards"
  ["> .card"
   ["> .button"
    {"margin" (clojure.core/str buttonMargin),
     "width" (clojure.core/str buttonWidth)}]]]
 [".ui.card"
  ["> .button"
   {"margin" (clojure.core/str buttonMargin),
    "width" (clojure.core/str buttonWidth)}]]
 [".ui.cards"
  ["> .card"
   [".dimmer"
    {"background-color" (clojure.core/str dimmerColor),
     "z-index" (clojure.core/str dimmerZIndex)}]]]
 [".ui.card"
  [".dimmer"
   {"background-color" (clojure.core/str dimmerColor),
    "z-index" (clojure.core/str dimmerZIndex)}]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    [".star.icon"
     {"cursor" (clojure.core/str "pointer"),
      "opacity" (clojure.core/str actionOpacity),
      "transition" (clojure.core/str actionTransition)}]]]]
 [".ui.card"
  ["> .content"
   [".star.icon"
    {"cursor" (clojure.core/str "pointer"),
     "opacity" (clojure.core/str actionOpacity),
     "transition" (clojure.core/str actionTransition)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    [".star.icon:hover"
     {"opacity" (clojure.core/str actionHoverOpacity),
      "color" (clojure.core/str starColor)}]]]]
 [".ui.card"
  ["> .content"
   [".star.icon:hover"
    {"opacity" (clojure.core/str actionHoverOpacity),
     "color" (clojure.core/str starColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    [".active.star.icon"
     {"color" (clojure.core/str starActiveColor)}]]]]
 [".ui.card"
  ["> .content"
   [".active.star.icon" {"color" (clojure.core/str starActiveColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    [".like.icon"
     {"cursor" (clojure.core/str "pointer"),
      "opacity" (clojure.core/str actionOpacity),
      "transition" (clojure.core/str actionTransition)}]]]]
 [".ui.card"
  ["> .content"
   [".like.icon"
    {"cursor" (clojure.core/str "pointer"),
     "opacity" (clojure.core/str actionOpacity),
     "transition" (clojure.core/str actionTransition)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    [".like.icon:hover"
     {"opacity" (clojure.core/str actionHoverOpacity),
      "color" (clojure.core/str likeColor)}]]]]
 [".ui.card"
  ["> .content"
   [".like.icon:hover"
    {"opacity" (clojure.core/str actionHoverOpacity),
     "color" (clojure.core/str likeColor)}]]]
 [".ui.cards"
  ["> .card"
   ["> .content"
    [".active.like.icon"
     {"color" (clojure.core/str likeActiveColor)}]]]]
 [".ui.card"
  ["> .content"
   [".active.like.icon" {"color" (clojure.core/str likeActiveColor)}]]]
 [".ui.cards" ["> .card" ["> .extra" nil]]]
 [".ui.card" ["> .extra" nil]])
