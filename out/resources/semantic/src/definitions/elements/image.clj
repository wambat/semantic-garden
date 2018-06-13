((clojure.core/ns
  definitions.elements.image
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'element'")
 (def element "'image'")
 (defstyles
  root
  [".ui.image"
   {"position" (clojure.core/str "relative"),
    "display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "middle"),
    "max-width" (clojure.core/str "100%"),
    "background-color" (clojure.core/str placeholderColor)}]
  ["img.ui.image" {"display" (clojure.core/str "block")}]
  [".ui.image"
   ["svg"
    {"display" (clojure.core/str "block"),
     "max-width" (clojure.core/str "100%"),
     "height" (clojure.core/str "auto")}]]
  [".ui.image"
   ["img"
    {"display" (clojure.core/str "block"),
     "max-width" (clojure.core/str "100%"),
     "height" (clojure.core/str "auto")}]]
  [".ui.hidden.images" {"display" (clojure.core/str "none")}]
  [".ui.hidden.image" {"display" (clojure.core/str "none")}]
  [".ui.hidden.transition.images"
   {"display" (clojure.core/str "block"),
    "visibility" (clojure.core/str "hidden")}]
  [".ui.hidden.transition.image"
   {"display" (clojure.core/str "block"),
    "visibility" (clojure.core/str "hidden")}]
  [".ui.images"
   ["> .hidden.transition"
    {"display" (clojure.core/str "inline-block"),
     "visibility" (clojure.core/str "hidden")}]]
  [".ui.disabled.images"
   {"cursor" (clojure.core/str "default"),
    "opacity" (clojure.core/str disabledOpacity)}]
  [".ui.disabled.image"
   {"cursor" (clojure.core/str "default"),
    "opacity" (clojure.core/str disabledOpacity)}]
  [".ui.inline.image" {"display" (clojure.core/str "inline-block")}]
  [".ui.inline.image"
   ["svg" {"display" (clojure.core/str "inline-block")}]]
  [".ui.inline.image"
   ["img" {"display" (clojure.core/str "inline-block")}]]
  [".ui.top.aligned.images"
   [".image"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "top")}]]
  [".ui.top.aligned.image"
   {"display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "top")}]
  [".ui.top.aligned.image"
   ["svg"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "top")}]]
  [".ui.top.aligned.image"
   ["img"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "top")}]]
  [".ui.middle.aligned.images"
   [".image"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "middle")}]]
  [".ui.middle.aligned.image"
   {"display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "middle")}]
  [".ui.middle.aligned.image"
   ["svg"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "middle")}]]
  [".ui.middle.aligned.image"
   ["img"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "middle")}]]
  [".ui.bottom.aligned.images"
   [".image"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "bottom")}]]
  [".ui.bottom.aligned.image"
   {"display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "bottom")}]
  [".ui.bottom.aligned.image"
   ["svg"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "bottom")}]]
  [".ui.bottom.aligned.image"
   ["img"
    {"display" (clojure.core/str "inline-block"),
     "vertical-align" (clojure.core/str "bottom")}]]
  nil
  [".ui.bordered.images"
   [".image" {"border" (clojure.core/str imageBorder)}]]
  [".ui.bordered.images"
   ["img" {"border" (clojure.core/str imageBorder)}]]
  [".ui.bordered.images"
   ["svg" {"border" (clojure.core/str imageBorder)}]]
  [".ui.bordered.image"
   ["img" {"border" (clojure.core/str imageBorder)}]]
  [".ui.bordered.image"
   ["svg" {"border" (clojure.core/str imageBorder)}]]
  ["img.ui.bordered.image" {"border" (clojure.core/str imageBorder)}]
  [".ui.circular.images" {"overflow" (clojure.core/str "hidden")}]
  [".ui.circular.image" {"overflow" (clojure.core/str "hidden")}]
  nil
  [".ui.fluid.images"
   {"display" (clojure.core/str "block"),
    "width" (clojure.core/str "100%"),
    "height" (clojure.core/str "auto")}]
  [".ui.fluid.image"
   {"display" (clojure.core/str "block"),
    "width" (clojure.core/str "100%"),
    "height" (clojure.core/str "auto")}]
  [".ui.fluid.images"
   ["img"
    {"display" (clojure.core/str "block"),
     "width" (clojure.core/str "100%"),
     "height" (clojure.core/str "auto")}]]
  [".ui.fluid.images"
   ["svg"
    {"display" (clojure.core/str "block"),
     "width" (clojure.core/str "100%"),
     "height" (clojure.core/str "auto")}]]
  [".ui.fluid.image"
   ["svg"
    {"display" (clojure.core/str "block"),
     "width" (clojure.core/str "100%"),
     "height" (clojure.core/str "auto")}]]
  [".ui.fluid.image"
   ["img"
    {"display" (clojure.core/str "block"),
     "width" (clojure.core/str "100%"),
     "height" (clojure.core/str "auto")}]]
  [".ui.avatar.images"
   [".image"
    {"margin-right" (clojure.core/str avatarMargin),
     "display" (clojure.core/str "inline-block"),
     "width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "-webkit-border-radius" (clojure.core/str circularRadius),
     "-moz-border-radius" (clojure.core/str circularRadius),
     "border-radius" (clojure.core/str circularRadius)}]]
  [".ui.avatar.images"
   ["img"
    {"margin-right" (clojure.core/str avatarMargin),
     "display" (clojure.core/str "inline-block"),
     "width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "-webkit-border-radius" (clojure.core/str circularRadius),
     "-moz-border-radius" (clojure.core/str circularRadius),
     "border-radius" (clojure.core/str circularRadius)}]]
  [".ui.avatar.images"
   ["svg"
    {"margin-right" (clojure.core/str avatarMargin),
     "display" (clojure.core/str "inline-block"),
     "width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "-webkit-border-radius" (clojure.core/str circularRadius),
     "-moz-border-radius" (clojure.core/str circularRadius),
     "border-radius" (clojure.core/str circularRadius)}]]
  [".ui.avatar.image"
   ["img"
    {"margin-right" (clojure.core/str avatarMargin),
     "display" (clojure.core/str "inline-block"),
     "width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "-webkit-border-radius" (clojure.core/str circularRadius),
     "-moz-border-radius" (clojure.core/str circularRadius),
     "border-radius" (clojure.core/str circularRadius)}]]
  [".ui.avatar.image"
   ["svg"
    {"margin-right" (clojure.core/str avatarMargin),
     "display" (clojure.core/str "inline-block"),
     "width" (clojure.core/str avatarSize),
     "height" (clojure.core/str avatarSize),
     "-webkit-border-radius" (clojure.core/str circularRadius),
     "-moz-border-radius" (clojure.core/str circularRadius),
     "border-radius" (clojure.core/str circularRadius)}]]
  [".ui.avatar.image"
   {"margin-right" (clojure.core/str avatarMargin),
    "display" (clojure.core/str "inline-block"),
    "width" (clojure.core/str avatarSize),
    "height" (clojure.core/str avatarSize),
    "-webkit-border-radius" (clojure.core/str circularRadius),
    "-moz-border-radius" (clojure.core/str circularRadius),
    "border-radius" (clojure.core/str circularRadius)}]
  [".ui.spaced.image"
   {"display" (clojure.core/str "inline-block"),
    "margin-left" (clojure.core/str spacedDistance),
    "margin-right" (clojure.core/str spacedDistance)}]
  [".ui[class='left']"
   [nil
    {"margin-left" (clojure.core/str spacedDistance),
     "margin-right" (clojure.core/str "0em")}]]
  [".ui[class='right']"
   [nil
    {"margin-left" (clojure.core/str "0em"),
     "margin-right" (clojure.core/str spacedDistance)}]]
  [".ui.floated.image"
   {"float" (clojure.core/str "left"),
    "margin-right" (clojure.core/str floatedHorizontalMargin),
    "margin-bottom" (clojure.core/str floatedVerticalMargin)}]
  [".ui.floated.images"
   {"float" (clojure.core/str "left"),
    "margin-right" (clojure.core/str floatedHorizontalMargin),
    "margin-bottom" (clojure.core/str floatedVerticalMargin)}]
  [".ui.right.floated.images"
   {"float" (clojure.core/str "right"),
    "margin-right" (clojure.core/str "0em"),
    "margin-bottom" (clojure.core/str floatedVerticalMargin),
    "margin-left" (clojure.core/str floatedHorizontalMargin)}]
  [".ui.right.floated.image"
   {"float" (clojure.core/str "right"),
    "margin-right" (clojure.core/str "0em"),
    "margin-bottom" (clojure.core/str floatedVerticalMargin),
    "margin-left" (clojure.core/str floatedHorizontalMargin)}]
  [".ui.floated.images:last-child"
   {"margin-bottom" (clojure.core/str "0em")}]
  [".ui.floated.image:last-child"
   {"margin-bottom" (clojure.core/str "0em")}]
  [".ui.centered.images"
   {"margin-left" (clojure.core/str "auto"),
    "margin-right" (clojure.core/str "auto")}]
  [".ui.centered.image"
   {"margin-left" (clojure.core/str "auto"),
    "margin-right" (clojure.core/str "auto")}]
  [".ui.mini.images"
   [".image"
    {"width" (clojure.core/str miniWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str mini)}]]
  [".ui.mini.images"
   ["img"
    {"width" (clojure.core/str miniWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str mini)}]]
  [".ui.mini.images"
   ["svg"
    {"width" (clojure.core/str miniWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str mini)}]]
  [".ui.mini.image"
   {"width" (clojure.core/str miniWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str mini)}]
  [".ui.tiny.images"
   [".image"
    {"width" (clojure.core/str tinyWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str tiny)}]]
  [".ui.tiny.images"
   ["img"
    {"width" (clojure.core/str tinyWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str tiny)}]]
  [".ui.tiny.images"
   ["svg"
    {"width" (clojure.core/str tinyWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str tiny)}]]
  [".ui.tiny.image"
   {"width" (clojure.core/str tinyWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str tiny)}]
  [".ui.small.images"
   [".image"
    {"width" (clojure.core/str smallWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str small)}]]
  [".ui.small.images"
   ["img"
    {"width" (clojure.core/str smallWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str small)}]]
  [".ui.small.images"
   ["svg"
    {"width" (clojure.core/str smallWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str small)}]]
  [".ui.small.image"
   {"width" (clojure.core/str smallWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str small)}]
  [".ui.medium.images"
   [".image"
    {"width" (clojure.core/str mediumWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str medium)}]]
  [".ui.medium.images"
   ["img"
    {"width" (clojure.core/str mediumWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str medium)}]]
  [".ui.medium.images"
   ["svg"
    {"width" (clojure.core/str mediumWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str medium)}]]
  [".ui.medium.image"
   {"width" (clojure.core/str mediumWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str medium)}]
  [".ui.large.images"
   [".image"
    {"width" (clojure.core/str largeWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str large)}]]
  [".ui.large.images"
   ["img"
    {"width" (clojure.core/str largeWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str large)}]]
  [".ui.large.images"
   ["svg"
    {"width" (clojure.core/str largeWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str large)}]]
  [".ui.large.image"
   {"width" (clojure.core/str largeWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str large)}]
  [".ui.big.images"
   [".image"
    {"width" (clojure.core/str bigWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str big)}]]
  [".ui.big.images"
   ["img"
    {"width" (clojure.core/str bigWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str big)}]]
  [".ui.big.images"
   ["svg"
    {"width" (clojure.core/str bigWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str big)}]]
  [".ui.big.image"
   {"width" (clojure.core/str bigWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str big)}]
  [".ui.huge.images"
   [".image"
    {"width" (clojure.core/str hugeWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str huge)}]]
  [".ui.huge.images"
   ["img"
    {"width" (clojure.core/str hugeWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str huge)}]]
  [".ui.huge.images"
   ["svg"
    {"width" (clojure.core/str hugeWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str huge)}]]
  [".ui.huge.image"
   {"width" (clojure.core/str hugeWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str huge)}]
  [".ui.massive.images"
   [".image"
    {"width" (clojure.core/str massiveWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str massive)}]]
  [".ui.massive.images"
   ["img"
    {"width" (clojure.core/str massiveWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str massive)}]]
  [".ui.massive.images"
   ["svg"
    {"width" (clojure.core/str massiveWidth),
     "height" (clojure.core/str "auto"),
     "font-size" (clojure.core/str massive)}]]
  [".ui.massive.image"
   {"width" (clojure.core/str massiveWidth),
    "height" (clojure.core/str "auto"),
    "font-size" (clojure.core/str massive)}]
  [".ui.images" {"font-size" (clojure.core/str "0em"), "margin" nil}]
  [".ui.images"
   [".image"
    {"display" (clojure.core/str "inline-block"),
     "margin"
     (clojure.core/str
      "0em"
      " "
      imageHorizontalMargin
      " "
      imageVerticalMargin)}]]
  [".ui.images"
   ["> img"
    {"display" (clojure.core/str "inline-block"),
     "margin"
     (clojure.core/str
      "0em"
      " "
      imageHorizontalMargin
      " "
      imageVerticalMargin)}]]
  [".ui.images"
   ["> svg"
    {"display" (clojure.core/str "inline-block"),
     "margin"
     (clojure.core/str
      "0em"
      " "
      imageHorizontalMargin
      " "
      imageVerticalMargin)}]]))
