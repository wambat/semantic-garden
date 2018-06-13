(clojure.core/ns
 definitions.elements.label
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "label"))
(defstyles
 root
 [".ui.label"
  {"line-height" (clojure.core/str "11"),
   "margin" (clojure.core/str verticalMargin " " horizontalMargin),
   "border" (clojure.core/str border),
   "text-transform" (clojure.core/str textTransform),
   "vertical-align" (clojure.core/str verticalAlign),
   "padding" (clojure.core/str verticalPadding " " horizontalPadding),
   "font-weight" (clojure.core/str fontWeight),
   "background-color" (clojure.core/str backgroundColor),
   "border-radius" (clojure.core/str borderRadius),
   "display" (clojure.core/str "inline-block"),
   "background-image" (clojure.core/str backgroundImage),
   "transition" (clojure.core/str transition),
   "color" (clojure.core/str color)}]
 [".ui.label:first-child" {"margin-left" (clojure.core/str "0em")}]
 [".ui.label:last-child" {"margin-right" (clojure.core/str "0em")}]
 ["a.ui.label" {"cursor" (clojure.core/str "pointer")}]
 [".ui.label"
  ["> a"
   {"cursor" (clojure.core/str "pointer"),
    "color" (clojure.core/str "inherit"),
    "opacity" (clojure.core/str linkOpacity),
    "transition" (clojure.core/str linkTransition)}]]
 [".ui.label" ["> a:hover" {"opacity" (clojure.core/str "11")}]]
 [".ui.label"
  ["> img"
   {"width" (clojure.core/str "auto"),
    "vertical-align" (clojure.core/str "middle"),
    "height" (clojure.core/str imageHeight)}]]
 [".ui.label"
  ["> .icon"
   {"width" (clojure.core/str "auto"),
    "margin"
    (clojure.core/str "0em" " " iconDistance " " "0em" " " "0em")}]]
 [".ui.label"
  ["> .detail"
   {"display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "top"),
    "font-weight" (clojure.core/str detailFontWeight),
    "margin-left" (clojure.core/str detailMargin),
    "opacity" (clojure.core/str detailOpacity)}]]
 [".ui.label"
  ["> .detail"
   [".icon"
    {"margin"
     (clojure.core/str
      "0em"
      " "
      detailIconDistance
      " "
      "0em"
      " "
      "0em")}]]]
 [".ui.label"
  ["> .close.icon"
   {"cursor" (clojure.core/str "pointer"),
    "margin-right" (clojure.core/str "0em"),
    "margin-left" (clojure.core/str deleteMargin),
    "font-size" (clojure.core/str deleteSize),
    "opacity" (clojure.core/str deleteOpacity),
    "transition" (clojure.core/str deleteTransition)}]]
 [".ui.label"
  ["> .delete.icon"
   {"cursor" (clojure.core/str "pointer"),
    "margin-right" (clojure.core/str "0em"),
    "margin-left" (clojure.core/str deleteMargin),
    "font-size" (clojure.core/str deleteSize),
    "opacity" (clojure.core/str deleteOpacity),
    "transition" (clojure.core/str deleteTransition)}]]
 [".ui.label"
  ["> .delete.icon:hover" {"opacity" (clojure.core/str "11")}]]
 [".ui.labels"
  ["> .label"
   {"margin"
    (clojure.core/str
     "0em"
     " "
     groupHorizontalMargin
     " "
     groupVerticalMargin
     " "
     "0em")}]]
 [".ui.header"
  ["> .ui.label" {"margin-top" (clojure.core/str lineHeightOffset)}]]
 [".ui.attached.segment"
  ["> .ui.top.left.attached.label"
   {"border-top-left-radius" (clojure.core/str "00")}]]
 [".ui.bottom.attached.segment"
  ["> .ui.top.left.attached.label"
   {"border-top-left-radius" (clojure.core/str "00")}]]
 [".ui.attached.segment"
  ["> .ui.top.right.attached.label"
   {"border-top-right-radius" (clojure.core/str "00")}]]
 [".ui.bottom.attached.segment"
  ["> .ui.top.right.attached.label"
   {"border-top-right-radius" (clojure.core/str "00")}]]
 [".ui.top.attached.segment"
  ["> .ui.bottom.left.attached.label"
   {"border-bottom-left-radius" (clojure.core/str "00")}]]
 [".ui.top.attached.segment"
  ["> .ui.bottom.right.attached.label"
   {"border-bottom-right-radius" (clojure.core/str "00")}]]
 nil
 [":last-child:not([.attached])"
  {"margin-top" (clojure.core/str "0em"),
   "margin-bottom" (clojure.core/str attachedSegmentPadding)}]
 [".ui.image.label"
  {"width" (clojure.core/str "auto"),
   "max-width" (clojure.core/str "9999px"),
   "text-transform" (clojure.core/str "none"),
   "vertical-align" (clojure.core/str "baseline"),
   "padding" (clojure.core/str imageLabelPadding),
   "margin-top" (clojure.core/str "0em"),
   "margin-bottom" (clojure.core/str "0em"),
   "box-shadow" (clojure.core/str imageLabelBoxShadow),
   "border-radius" (clojure.core/str imageLabelBorderRadius),
   "background" (clojure.core/str imageLabelBackground)}]
 [".ui.image.label"
  ["img"
   {"display" (clojure.core/str "inline-block"),
    "vertical-align" (clojure.core/str "top"),
    "height" (clojure.core/str imageLabelImageHeight),
    "margin" (clojure.core/str imageLabelImageMargin),
    "border-radius" (clojure.core/str imageLabelImageBorderRadius)}]]
 [".ui.image.label"
  [".detail"
   {"background" (clojure.core/str imageLabelDetailBackground),
    "margin" (clojure.core/str imageLabelDetailMargin),
    "padding" (clojure.core/str imageLabelDetailPadding),
    "border-radius"
    (clojure.core/str
     "0em"
     " "
     imageLabelBorderRadius
     " "
     imageLabelBorderRadius
     " "
     "0em")}]]
 [".ui.tag.labels"
  [".label"
   {"margin-left" (clojure.core/str "1em"),
    "position" (clojure.core/str "relative"),
    "padding-left" (clojure.core/str tagHorizontalPadding),
    "padding-right" (clojure.core/str tagHorizontalPadding),
    "border-radius"
    (clojure.core/str
     "0em"
     " "
     borderRadius
     " "
     borderRadius
     " "
     "0em"),
    "transition" (clojure.core/str tagTransition)}]]
 [".ui.tag.label"
  {"margin-left" (clojure.core/str "1em"),
   "position" (clojure.core/str "relative"),
   "padding-left" (clojure.core/str tagHorizontalPadding),
   "padding-right" (clojure.core/str tagHorizontalPadding),
   "border-radius"
   (clojure.core/str
    "0em"
    " "
    borderRadius
    " "
    borderRadius
    " "
    "0em"),
   "transition" (clojure.core/str tagTransition)}]
 [".ui.tag.labels"
  [".label:before"
   {"width" (clojure.core/str tagTriangleSize),
    "right" (clojure.core/str tagTriangleRightOffset),
    "top" (clojure.core/str tagTriangleTopOffset),
    "height" (clojure.core/str tagTriangleSize),
    "transform"
    (clojure.core/str "translateY" " " "translateX" " " "rotate"),
    "position" (clojure.core/str "absolute"),
    "content" (clojure.core/str ""),
    "background-color" (clojure.core/str "inherit"),
    "background-image" (clojure.core/str tagTriangleBackgroundImage),
    "transition" (clojure.core/str tagTransition)}]]
 [".ui.tag.label:before"
  {"width" (clojure.core/str tagTriangleSize),
   "right" (clojure.core/str tagTriangleRightOffset),
   "top" (clojure.core/str tagTriangleTopOffset),
   "height" (clojure.core/str tagTriangleSize),
   "transform"
   (clojure.core/str "translateY" " " "translateX" " " "rotate"),
   "position" (clojure.core/str "absolute"),
   "content" (clojure.core/str ""),
   "background-color" (clojure.core/str "inherit"),
   "background-image" (clojure.core/str tagTriangleBackgroundImage),
   "transition" (clojure.core/str tagTransition)}]
 [".ui.tag.labels" [".label:after" nil]]
 [".ui.tag.label:after" nil])
