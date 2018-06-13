(clojure.core/ns
 definitions.views.item
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
 [".ui.items"
  ["> .item"
   {"width" (clojure.core/str width),
    "margin" (clojure.core/str itemSpacing " " "0em"),
    "border" (clojure.core/str border),
    "padding" (clojure.core/str padding),
    "z-index" (clojure.core/str zIndex),
    "min-height" (clojure.core/str minHeight),
    "box-shadow" (clojure.core/str boxShadow),
    "border-radius" (clojure.core/str borderRadius),
    "display" (clojure.core/str display),
    "transition" (clojure.core/str transition),
    "background" (clojure.core/str background)}]]
 [".ui.items"
  ["> .item" ["a" {"cursor" (clojure.core/str "pointer")}]]]
 [".ui.items" {"margin" (clojure.core/str groupMargin)}]
 [".ui.items:first-child" nil]
 [".ui.items:last-child" nil]
 [".ui.items"
  ["> .item:after"
   {"display" (clojure.core/str "block"),
    "content" nil,
    "height" (clojure.core/str "0px"),
    "clear" (clojure.core/str "both"),
    "overflow" (clojure.core/str "hidden"),
    "visibility" (clojure.core/str "hidden")}]]
 [".ui.items"
  ["> .item:first-child" {"margin-top" (clojure.core/str "0em")}]]
 [".ui.items"
  ["> .item:last-child" {"margin-bottom" (clojure.core/str "0em")}]]
 [".ui.items"
  ["> .item"
   ["> .image"
    {"position" (clojure.core/str "relative"),
     "flex" (clojure.core/str "00" " " "00" " " "auto"),
     "display" (clojure.core/str imageDisplay),
     "float" (clojure.core/str imageFloat),
     "margin" (clojure.core/str imageMargin),
     "padding" (clojure.core/str imagePadding),
     "max-height" (clojure.core/str imageMaxHeight),
     "align-self" (clojure.core/str imageVerticalAlign)}]]]
 [".ui.items"
  ["> .item"
   ["> .image"
    ["> img"
     {"display" (clojure.core/str "block"),
      "width" (clojure.core/str "100%"),
      "height" (clojure.core/str "auto"),
      "border-radius" (clojure.core/str imageBorderRadius),
      "border" (clojure.core/str imageBorder)}]]]]
 [".ui.items"
  ["> .item"
   ["> .image:only-child"
    ["> img" {"border-radius" (clojure.core/str borderRadius)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    {"display" (clojure.core/str "block"),
     "flex" (clojure.core/str "11" " " "11" " " "auto"),
     "background" (clojure.core/str contentBackground),
     "margin" (clojure.core/str contentMargin),
     "padding" (clojure.core/str contentPadding),
     "box-shadow" (clojure.core/str contentBoxShadow),
     "font-size" (clojure.core/str contentFontSize),
     "border" (clojure.core/str contentBorder),
     "border-radius" (clojure.core/str contentBorderRadius)}]]]
 [".ui.items"
  ["> .item"
   ["> .content:after"
    {"display" (clojure.core/str "block"),
     "content" nil,
     "height" (clojure.core/str "0px"),
     "clear" (clojure.core/str "both"),
     "overflow" (clojure.core/str "hidden"),
     "visibility" (clojure.core/str "hidden")}]]]
 [".ui.items"
  ["> .item"
   ["> .image"
    ["+ .content"
     {"min-width" (clojure.core/str "00"),
      "width" (clojure.core/str contentWidth),
      "display" (clojure.core/str contentDisplay),
      "margin-left" (clojure.core/str contentOffset),
      "align-self" (clojure.core/str contentVerticalAlign),
      "padding-left" (clojure.core/str contentImageDistance)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["> .header"
     {"display" (clojure.core/str "inline-block"),
      "margin" (clojure.core/str headerMargin),
      "font-family" (clojure.core/str headerFont),
      "font-weight" (clojure.core/str headerFontWeight),
      "color" (clojure.core/str headerColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["> .header:not([.ui])"
     {"font-size" (clojure.core/str headerFontSize)}]]]]
 [nil ["floated" {"float" (clojure.core/str "left")}]]
 [nil ["floated" {"float" (clojure.core/str "right")}]]
 [".ui.items"
  ["> .item"
   [".content"
    ["img"
     {"align-self" (clojure.core/str contentImageVerticalAlign),
      "width" (clojure.core/str contentImageWidth)}]]]]
 [".ui.items"
  ["> .item"
   ["img.avatar"
    {"width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "border-radius" (clojure.core/str avatarBorderRadius)}]]]
 [".ui.items"
  ["> .item"
   [".avatar"
    ["img"
     {"width" (clojure.core/str avatarSize),
      "height" (clojure.core/str avatarSize),
      "border-radius" (clojure.core/str avatarBorderRadius)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["> .description"
     {"margin-top" (clojure.core/str descriptionDistance),
      "max-width" (clojure.core/str descriptionMaxWidth),
      "font-size" (clojure.core/str descriptionFontSize),
      "line-height" (clojure.core/str descriptionLineHeight),
      "color" (clojure.core/str descriptionColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["p"
     {"margin"
      (clojure.core/str "0em" " " "0em" " " paragraphDistance)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["p:last-child" {"margin-bottom" (clojure.core/str "0em")}]]]]
 [".ui.items"
  ["> .item"
   [".meta"
    {"margin" (clojure.core/str metaMargin),
     "font-size" (clojure.core/str metaFontSize),
     "line-height" (clojure.core/str metaLineHeight),
     "color" (clojure.core/str metaColor)}]]]
 nil
 [".ui.items"
  ["> .item"
   [".meta:last-child" {"margin-right" (clojure.core/str "0em")}]]]
 [nil
  ["floated"
   {"margin-right" (clojure.core/str "0em"),
    "margin-left" (clojure.core/str metaSpacing)}]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["a:not([.ui])"
     {"color" (clojure.core/str contentLinkColor),
      "transition" (clojure.core/str contentLinkTransition)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["a:not([.ui]):hover"
     {"color" (clojure.core/str contentLinkHoverColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["> a.header" {"color" (clojure.core/str headerLinkColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    ["> a.header:hover"
     {"color" (clojure.core/str headerLinkHoverColor)}]]]]
 [".ui.items"
  ["> .item"
   [".meta"
    ["> a:not([.ui])" {"color" (clojure.core/str metaLinkColor)}]]]]
 [".ui.items"
  ["> .item"
   [".meta"
    ["> a:not([.ui]):hover"
     {"color" (clojure.core/str metaLinkHoverColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    [".favorite.icon"
     {"cursor" (clojure.core/str "pointer"),
      "opacity" (clojure.core/str actionOpacity),
      "transition" (clojure.core/str actionTransition)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    [".favorite.icon:hover"
     {"opacity" (clojure.core/str actionHoverOpacity),
      "color" (clojure.core/str favoriteColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    [".active.favorite.icon"
     {"color" (clojure.core/str favoriteActiveColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    [".like.icon"
     {"cursor" (clojure.core/str "pointer"),
      "opacity" (clojure.core/str actionOpacity),
      "transition" (clojure.core/str actionTransition)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    [".like.icon:hover"
     {"opacity" (clojure.core/str actionHoverOpacity),
      "color" (clojure.core/str likeColor)}]]]]
 [".ui.items"
  ["> .item"
   ["> .content"
    [".active.like.icon"
     {"color" (clojure.core/str likeActiveColor)}]]]]
 [".ui.items"
  ["> .item"
   [".extra"
    {"width" (clojure.core/str extraWidth),
     "top" (clojure.core/str extraTop),
     "margin" (clojure.core/str extraMargin),
     "padding" (clojure.core/str extraPadding),
     "position" (clojure.core/str extraPosition),
     "border-top" (clojure.core/str extraDivider),
     "box-shadow" (clojure.core/str extraBoxShadow),
     "display" (clojure.core/str extraDisplay),
     "transition" (clojure.core/str extraTransition),
     "background" (clojure.core/str extraBackground),
     "color" (clojure.core/str extraColor),
     "left" (clojure.core/str extraLeft)}]]]
 nil)
