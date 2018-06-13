(clojure.core/ns
 definitions.views.feed
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "view"))
(def element (clojure.core/str "feed"))
(defstyles
 root
 [".ui.feed" {"margin" (clojure.core/str margin)}]
 [".ui.feed:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.feed:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.feed"
  ["> .event"
   {"display" (clojure.core/str "flex"),
    "flex-direction" (clojure.core/str "row"),
    "width" (clojure.core/str eventWidth),
    "padding" (clojure.core/str eventPadding),
    "margin" (clojure.core/str eventMargin),
    "background" (clojure.core/str eventBackground),
    "border-top" (clojure.core/str eventDivider)}]]
 [".ui.feed"
  ["> .event:first-child"
   {"border-top" (clojure.core/str "0px"),
    "padding-top" (clojure.core/str "0em")}]]
 [".ui.feed"
  ["> .event:last-child" {"padding-bottom" (clojure.core/str "0em")}]]
 [".ui.feed"
  ["> .event"
   ["> .label"
    {"display" (clojure.core/str "block"),
     "flex" (clojure.core/str "00" " " "00" " " "auto"),
     "width" (clojure.core/str labelWidth),
     "height" (clojure.core/str labelHeight),
     "align-self" (clojure.core/str labelAlignSelf),
     "text-align" (clojure.core/str labelTextAlign)}]]]
 [".ui.feed"
  ["> .event"
   ["> .label"
    [".icon"
     {"opacity" (clojure.core/str iconLabelOpacity),
      "font-size" (clojure.core/str iconLabelSize),
      "width" (clojure.core/str iconLabelWidth),
      "padding" (clojure.core/str iconLabelPadding),
      "background" (clojure.core/str iconLabelBackground),
      "border" (clojure.core/str iconLabelBorder),
      "border-radius" (clojure.core/str iconLabelBorderRadius),
      "color" (clojure.core/str iconLabelColor)}]]]]
 [".ui.feed"
  ["> .event"
   ["> .label"
    ["img"
     {"width" (clojure.core/str imageLabelWidth),
      "height" (clojure.core/str imageLabelHeight),
      "border-radius" (clojure.core/str imageLabelBorderRadius)}]]]]
 [".ui.feed"
  ["> .event"
   ["> .label"
    ["+ .content"
     {"margin" (clojure.core/str labeledContentMargin)}]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    {"display" (clojure.core/str "block"),
     "flex" (clojure.core/str "11" " " "11" " " "auto"),
     "align-self" (clojure.core/str contentAlignSelf),
     "text-align" (clojure.core/str contentTextAlign),
     "word-wrap" (clojure.core/str contentWordWrap)}]]]
 [".ui.feed"
  ["> .event:last-child"
   ["> .content"
    {"padding-bottom" (clojure.core/str lastLabeledContentPadding)}]]]
 [".ui.feed"
  ["> .event"
   ["> .content" ["a" {"cursor" (clojure.core/str "pointer")}]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".date"
     {"margin" (clojure.core/str dateMargin),
      "padding" (clojure.core/str datePadding),
      "color" (clojure.core/str dateColor),
      "font-weight" (clojure.core/str dateFontWeight),
      "font-size" (clojure.core/str dateFontSize),
      "font-style" (clojure.core/str dateFontStyle)}]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".summary"
     {"margin" (clojure.core/str summaryMargin),
      "font-size" (clojure.core/str summaryFontSize),
      "font-weight" (clojure.core/str summaryFontWeight),
      "color" (clojure.core/str summaryColor)}]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".summary"
     ["img"
      {"display" (clojure.core/str "inline-block"),
       "width" (clojure.core/str summaryImageWidth),
       "height" (clojure.core/str summaryImageHeight),
       "margin" (clojure.core/str summaryImageMargin),
       "border-radius" (clojure.core/str summaryImageBorderRadius),
       "vertical-align"
       (clojure.core/str summaryImageVerticalAlign)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".user"
     {"display" (clojure.core/str "inline-block"),
      "font-weight" (clojure.core/str userFontWeight),
      "margin-right" (clojure.core/str userDistance),
      "vertical-align" (clojure.core/str "baseline")}]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".user"
     ["img"
      {"margin" (clojure.core/str userImageMargin),
       "width" (clojure.core/str userImageWidth),
       "height" (clojure.core/str userImageHeight),
       "vertical-align" (clojure.core/str userImageVerticalAlign)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".summary"
     ["> .date"
      {"display" (clojure.core/str summaryDateDisplay),
       "float" (clojure.core/str summaryDateFloat),
       "font-weight" (clojure.core/str summaryDateFontWeight),
       "font-size" (clojure.core/str summaryDateFontSize),
       "font-style" (clojure.core/str summaryDateFontStyle),
       "margin" (clojure.core/str summaryDateMargin),
       "padding" (clojure.core/str summaryDatePadding),
       "color" (clojure.core/str summaryDateColor)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".extra"
     {"margin" (clojure.core/str extraMargin),
      "background" (clojure.core/str extraBackground),
      "padding" (clojure.core/str extraPadding),
      "color" (clojure.core/str extraColor)}]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".extra.images"
     ["img"
      {"display" (clojure.core/str "inline-block"),
       "margin" (clojure.core/str extraImageMargin),
       "width" (clojure.core/str extraImageWidth)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".extra.text"
     {"padding" (clojure.core/str extraTextPadding),
      "border-left" (clojure.core/str extraTextPointer),
      "font-size" (clojure.core/str extraTextFontSize),
      "max-width" (clojure.core/str extraTextMaxWidth),
      "line-height" (clojure.core/str extraTextLineHeight)}]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     {"display" (clojure.core/str metadataDisplay),
      "font-size" (clojure.core/str metadataFontSize),
      "margin" (clojure.core/str metadataMargin),
      "background" (clojure.core/str metadataBackground),
      "border" (clojure.core/str metadataBorder),
      "border-radius" (clojure.core/str metadataBorderRadius),
      "box-shadow" (clojure.core/str metadataBoxShadow),
      "padding" (clojure.core/str metadataPadding),
      "color" (clojure.core/str metadataColor)}]]]]
 nil
 nil
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     [".like"
      {"color" (clojure.core/str likeColor),
       "transition" (clojure.core/str likeTransition)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     [".like:hover"
      [".icon" {"color" (clojure.core/str likeHoverColor)}]]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     [".active.like"
      [".icon" {"color" (clojure.core/str likeActiveColor)}]]]]]]
 [":first-child" {"margin-left" (clojure.core/str "0em")}]
 [":after" {"display" (clojure.core/str "none")}]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     ["a"
      {"cursor" (clojure.core/str metadataActionCursor),
       "opacity" (clojure.core/str metadataActionOpacity),
       "color" (clojure.core/str metadataActionColor),
       "transition" (clojure.core/str metadataActionTransition)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     ["> .icon"
      {"cursor" (clojure.core/str metadataActionCursor),
       "opacity" (clojure.core/str metadataActionOpacity),
       "color" (clojure.core/str metadataActionColor),
       "transition" (clojure.core/str metadataActionTransition)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     ["a:hover"
      {"color" (clojure.core/str metadataActionHoverColor)}]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     ["a:hover"
      [".icon"
       {"color" (clojure.core/str metadataActionHoverColor)}]]]]]]
 [".ui.feed"
  ["> .event"
   ["> .content"
    [".meta"
     ["> .icon:hover"
      {"color" (clojure.core/str metadataActionHoverColor)}]]]]]
 [".ui.small.feed" {"font-size" (clojure.core/str small)}]
 [".ui.feed" {"font-size" (clojure.core/str medium)}]
 [".ui.large.feed" {"font-size" (clojure.core/str large)}])
