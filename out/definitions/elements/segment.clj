(clojure.core/ns
 definitions.elements.segment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "segment"))
(defstyles
 root
 [".ui.segment"
  {"position" (clojure.core/str "relative"),
   "background" (clojure.core/str background),
   "box-shadow" (clojure.core/str boxShadow),
   "margin" (clojure.core/str margin),
   "padding" (clojure.core/str padding),
   "border-radius" (clojure.core/str borderRadius),
   "border" (clojure.core/str border)}]
 [".ui.segment:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.segment:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.vertical.segment"
  {"margin" (clojure.core/str "0em"),
   "padding-left" (clojure.core/str "0em"),
   "padding-right" (clojure.core/str "0em"),
   "background" (clojure.core/str "none" " " "transparent"),
   "border-radius" (clojure.core/str "0px"),
   "box-shadow" (clojure.core/str "none"),
   "border" (clojure.core/str "none"),
   "border-bottom"
   (clojure.core/str borderWidth " " "solid" " " borderColor)}]
 [".ui.vertical.segment:last-child"
  {"border-bottom" (clojure.core/str "none")}]
 [".ui.inverted.segment"
  ["> .ui.header" {"color" (clojure.core/str white)}]]
 [nil
  [nil
   {"border-top-left-radius" (clojure.core/str "0em"),
    "border-top-right-radius" (clojure.core/str "0em")}]]
 [nil
  [nil
   {"border-bottom-left-radius" (clojure.core/str "0em"),
    "border-bottom-right-radius" (clojure.core/str "0em")}]]
 [nil
  [nil
   {"border-top-left-radius" (clojure.core/str "0em"),
    "border-top-right-radius" (clojure.core/str "0em")}]]
 [nil
  [nil
   {"border-bottom-left-radius" (clojure.core/str "0em"),
    "border-bottom-right-radius" (clojure.core/str "0em")}]]
 [".ui.page.grid.segment"
  {"padding-top" (clojure.core/str pageGridMargin),
   "padding-bottom" (clojure.core/str pageGridMargin)}]
 [".ui.grid"
  ["> .row"
   ["> .ui.segment.column"
    {"padding-top" (clojure.core/str pageGridMargin),
     "padding-bottom" (clojure.core/str pageGridMargin)}]]]
 [".ui.grid"
  ["> .ui.segment.column"
   {"padding-top" (clojure.core/str pageGridMargin),
    "padding-bottom" (clojure.core/str pageGridMargin)}]]
 [".ui.grid.segment"
  {"margin" (clojure.core/str margin),
   "border-radius" (clojure.core/str borderRadius)}]
 [".ui.basic.table.segment"
  {"background" (clojure.core/str background),
   "border" (clojure.core/str border),
   "box-shadow" (clojure.core/str boxShadow)}]
 [".ui[class='very']" [nil {"padding" (clojure.core/str padding)}]]
 [".ui.piled.segments"
  {"margin" (clojure.core/str piledMargin " " "0em"),
   "box-shadow" (clojure.core/str piledBoxShadow),
   "z-index" (clojure.core/str piledZIndex)}]
 [".ui.piled.segment"
  {"margin" (clojure.core/str piledMargin " " "0em"),
   "box-shadow" (clojure.core/str piledBoxShadow),
   "z-index" (clojure.core/str piledZIndex)}]
 [".ui.piled.segment:first-child"
  {"margin-top" (clojure.core/str "0em")}]
 [".ui.piled.segment:last-child"
  {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.piled.segments:after"
  {"width" (clojure.core/str "100%"),
   "height" (clojure.core/str "100%"),
   "border" (clojure.core/str piledBorder),
   "visibility" (clojure.core/str "visible"),
   "position" (clojure.core/str "absolute"),
   "content" (clojure.core/str ""),
   "box-shadow" (clojure.core/str piledBoxShadow),
   "background-color" (clojure.core/str white),
   "display" (clojure.core/str "block"),
   "left" (clojure.core/str "0px")}]
 [".ui.piled.segments:before"
  {"width" (clojure.core/str "100%"),
   "height" (clojure.core/str "100%"),
   "border" (clojure.core/str piledBorder),
   "visibility" (clojure.core/str "visible"),
   "position" (clojure.core/str "absolute"),
   "content" (clojure.core/str ""),
   "box-shadow" (clojure.core/str piledBoxShadow),
   "background-color" (clojure.core/str white),
   "display" (clojure.core/str "block"),
   "left" (clojure.core/str "0px")}]
 [".ui.piled.segment:after"
  {"width" (clojure.core/str "100%"),
   "height" (clojure.core/str "100%"),
   "border" (clojure.core/str piledBorder),
   "visibility" (clojure.core/str "visible"),
   "position" (clojure.core/str "absolute"),
   "content" (clojure.core/str ""),
   "box-shadow" (clojure.core/str piledBoxShadow),
   "background-color" (clojure.core/str white),
   "display" (clojure.core/str "block"),
   "left" (clojure.core/str "0px")}]
 [".ui.piled.segment:before"
  {"width" (clojure.core/str "100%"),
   "height" (clojure.core/str "100%"),
   "border" (clojure.core/str piledBorder),
   "visibility" (clojure.core/str "visible"),
   "position" (clojure.core/str "absolute"),
   "content" (clojure.core/str ""),
   "box-shadow" (clojure.core/str piledBoxShadow),
   "background-color" (clojure.core/str white),
   "display" (clojure.core/str "block"),
   "left" (clojure.core/str "0px")}]
 [".ui.piled.segments:before" nil]
 [".ui.piled.segment:before" nil]
 [".ui.piled.segments:after"
  {"transform" (clojure.core/str "rotate"),
   "top" (clojure.core/str "00"),
   "z-index" (clojure.core/str "-1-1")}]
 [".ui.piled.segment:after"
  {"transform" (clojure.core/str "rotate"),
   "top" (clojure.core/str "00"),
   "z-index" (clojure.core/str "-1-1")}]
 [".ui[class='top']"
  [nil
   {"margin-top" (clojure.core/str piledMargin),
    "margin-bottom" (clojure.core/str "0em")}]]
 [".ui.piled.segment[class='top']"
  ["attached:first-child" {"margin-top" (clojure.core/str "0em")}]]
 [".ui.piled.segment[class='bottom']"
  ["attached"
   {"margin-top" (clojure.core/str "0em"),
    "margin-bottom" (clojure.core/str piledMargin)}]]
 [".ui.piled.segment[class='bottom']"
  ["attached:last-child" {"margin-bottom" (clojure.core/str "0em")}]]
 [".ui.stacked.segment"
  {"padding-bottom" (clojure.core/str stackedPadding)}]
 [".ui.stacked.segments:before" nil]
 [".ui.stacked.segments:after" nil]
 [".ui.stacked.segment:before" nil]
 [".ui.stacked.segment:after" nil]
 [".ui.stacked.segments:before" {"display" (clojure.core/str "none")}]
 [".ui.stacked.segment:before" {"display" (clojure.core/str "none")}]
 [".ui.tall.stacked.segments:before"
  {"display" (clojure.core/str "block"),
   "bottom" (clojure.core/str "0px")}]
 [".ui.tall.stacked.segment:before"
  {"display" (clojure.core/str "block"),
   "bottom" (clojure.core/str "0px")}]
 [".ui.stacked.inverted.segments:before"
  {"background-color" (clojure.core/str subtleTransparentBlack),
   "border-top"
   (clojure.core/str "1px" " " "solid" " " selectedBorderColor)}]
 [".ui.stacked.inverted.segments:after"
  {"background-color" (clojure.core/str subtleTransparentBlack),
   "border-top"
   (clojure.core/str "1px" " " "solid" " " selectedBorderColor)}]
 [".ui.stacked.inverted.segment:before"
  {"background-color" (clojure.core/str subtleTransparentBlack),
   "border-top"
   (clojure.core/str "1px" " " "solid" " " selectedBorderColor)}]
 [".ui.stacked.inverted.segment:after"
  {"background-color" (clojure.core/str subtleTransparentBlack),
   "border-top"
   (clojure.core/str "1px" " " "solid" " " selectedBorderColor)}]
 [".ui.padded.segment"
  {"padding" (clojure.core/str paddedSegmentPadding)}]
 [".ui[class='very']"
  [nil {"padding" (clojure.core/str veryPaddedSegmentPadding)}]]EXPR
(((:identifier table)))
PROP
(:identifier table)
EXPR
(((:identifier inline-flex)))
PROP
(:identifier inline-flex)
EXPR
(((:identifier block)))
PROP
(:identifier block)
EXPR
(((:measurement 0)) ((:measurement 1)) ((:identifier auto)))
PROP
(:measurement 0)
PROP
(:measurement 1)
PROP
(:identifier auto)
EXPR
(((:identifier table-cell)))
PROP
(:identifier table-cell)
EXPR
(((:variableName @ circularPadding)))
PROP
(:variableName @ circularPadding)
EXPR
(((:identifier center)))
PROP
(:identifier center)
EXPR
(((:identifier middle)))
PROP
(:identifier middle)
EXPR
(((:measurement 500 em)))
PROP
(:measurement 500 em)
EXPR
(((:variableName @ raisedBoxShadow)))
PROP
(:variableName @ raisedBoxShadow)
EXPR
(((:identifier column)))
PROP
(:identifier column)
EXPR
(((:identifier relative)))
PROP
(:identifier relative)
EXPR
(((:variableName @ groupedMargin)))
PROP
(:variableName @ groupedMargin)
EXPR
(((:variableName @ groupedBorder)))
PROP
(:variableName @ groupedBorder)
EXPR
(((:variableName @ groupedBoxShadow)))
PROP
(:variableName @ groupedBoxShadow)
EXPR
(((:variableName @ groupedBorderRadius)))
PROP
(:variableName @ groupedBorderRadius)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:variableName @ groupedSegmentMargin)))
PROP
(:variableName @ groupedSegmentMargin)
EXPR
(((:variableName @ groupedSegmentWidth)))
PROP
(:variableName @ groupedSegmentWidth)
EXPR
(((:variableName @ groupedSegmentBoxShadow)))
PROP
(:variableName @ groupedSegmentBoxShadow)
EXPR
(((:variableName @ groupedSegmentBorder)))
PROP
(:variableName @ groupedSegmentBorder)
EXPR
(((:variableName @ groupedSegmentDivider)))
PROP
(:variableName @ groupedSegmentDivider)
EXPR
(((:variableName @ attachedTopOffset)))
PROP
(:variableName @ attachedTopOffset)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:variableName @ attachedTopOffset)))
PROP
(:variableName @ attachedTopOffset)
EXPR
(((:variableName @ borderRadius)) ((:variableName @ borderRadius)) ((:measurement 0 em)) ((:measurement 0 em)))
PROP
(:variableName @ borderRadius)
PROP
(:variableName @ borderRadius)
PROP
(:measurement 0 em)
PROP
(:measurement 0 em)
EXPR
(((:variableName @ attachedBottomOffset)))
PROP
(:variableName @ attachedBottomOffset)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:variableName @ attachedBottomBoxShadow)))
PROP
(:variableName @ attachedBottomBoxShadow)
EXPR
(((:measurement 0 em)) ((:measurement 0 em)) ((:variableName @ borderRadius)) ((:variableName @ borderRadius)))
PROP
(:measurement 0 em)
PROP
(:measurement 0 em)
PROP
(:variableName @ borderRadius)
PROP
(:variableName @ borderRadius)
EXPR
(((:variableName @ borderRadius)))
PROP
(:variableName @ borderRadius)
EXPR
(((:variableName @ groupedSegmentDivider)))
PROP
(:variableName @ groupedSegmentDivider)
EXPR
(((:variableName @ nestedGroupMargin)))
PROP
(:variableName @ nestedGroupMargin)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:identifier flex)))
PROP
(:identifier flex)
EXPR
(((:identifier row)))
PROP
(:identifier row)
EXPR
(((:identifier transparent)))
PROP
(:identifier transparent)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:variableName @ background)))
PROP
(:variableName @ background)
EXPR
(((:variableName @ boxShadow)))
PROP
(:variableName @ boxShadow)
EXPR
(((:variableName @ margin)))
PROP
(:variableName @ margin)
EXPR
(((:variableName @ borderRadius)))
PROP
(:variableName @ borderRadius)
EXPR
(((:variableName @ border)))
PROP
(:variableName @ border)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:identifier transparent)))
PROP
(:identifier transparent)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:variableName @ groupedSegmentDivider)))
PROP
(:variableName @ groupedSegmentDivider)
EXPR
(((:measurement 1)) ((:measurement 1)) ((:identifier auto)))
PROP
(:measurement 1)
PROP
(:measurement 1)
PROP
(:identifier auto)
EXPR
(((:measurement 1)) ((:measurement 1)) ((:measurement 0 px)))
PROP
(:measurement 1)
PROP
(:measurement 1)
PROP
(:measurement 0 px)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:identifier transparent)))
PROP
(:identifier transparent)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:variableName @ borderWidth)) ((:identifier solid)) ((:variableName @ borderColor)))
PROP
(:variableName @ borderWidth)
PROP
(:identifier solid)
PROP
(:variableName @ borderColor)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:variableName @ disabledOpacity)))
PROP
(:variableName @ disabledOpacity)
EXPR
(((:variableName @ disabledTextColor)))
PROP
(:variableName @ disabledTextColor)
EXPR
(((:identifier relative)))
PROP
(:identifier relative)
EXPR
(((:identifier default)))
PROP
(:identifier default)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:identifier none) !important))
PROP
!important
EXPR
(((:identifier transparent) !important))
PROP
!important
EXPR
(((:identifier all)) ((:measurement 0 s)) ((:identifier linear)))
PROP
(:identifier all)
PROP
(:measurement 0 s)
PROP
(:identifier linear)
EXPR
(((:identifier absolute)))
PROP
(:identifier absolute)
EXPR
((''))
PROP
''
EXPR
(((:measurement 0 %)))
PROP
(:measurement 0 %)
EXPR
(((:measurement 0 %)))
PROP
(:measurement 0 %)
EXPR
(((:variableName @ loaderDimmerColor)))
PROP
(:variableName @ loaderDimmerColor)
EXPR
(((:measurement 100 %)))
PROP
(:measurement 100 %)
EXPR
(((:measurement 100 %)))
PROP
(:measurement 100 %)
EXPR
(((:variableName @ borderRadius)))
PROP
(:variableName @ borderRadius)
EXPR
(((:variableName @ loaderDimmerZIndex)))
PROP
(:variableName @ loaderDimmerZIndex)
EXPR
(((:identifier absolute)))
PROP
(:identifier absolute)
EXPR
((''))
PROP
''
EXPR
(((:measurement 50 %)))
PROP
(:measurement 50 %)
EXPR
(((:measurement 50 %)))
PROP
(:measurement 50 %)
EXPR
(((:variableName @ loaderMargin)))
PROP
(:variableName @ loaderMargin)
EXPR
(((:variableName @ loaderSize)))
PROP
(:variableName @ loaderSize)
EXPR
(((:variableName @ loaderSize)))
PROP
(:variableName @ loaderSize)
EXPR
(((:identifier segment-spin)) ((:variableName @ loaderSpeed)) ((:identifier linear)))
PROP
(:identifier segment-spin)
PROP
(:variableName @ loaderSpeed)
PROP
(:identifier linear)
EXPR
(((:identifier infinite)))
PROP
(:identifier infinite)
EXPR
(((:variableName @ circularRadius)))
PROP
(:variableName @ circularRadius)
EXPR
(((:variableName @ loaderLineColor)) ((:variableName @ loaderFillColor)) ((:variableName @ loaderFillColor)) ((:variableName @ loaderFillColor)))
PROP
(:variableName @ loaderLineColor)
PROP
(:variableName @ loaderFillColor)
PROP
(:variableName @ loaderFillColor)
PROP
(:variableName @ loaderFillColor)
EXPR
(((:identifier solid)))
PROP
(:identifier solid)
EXPR
(((:variableName @ loaderLineWidth)))
PROP
(:variableName @ loaderLineWidth)
EXPR
(((:measurement 0 px)) ((:measurement 0 px)) ((:measurement 0 px)) ((:measurement 1 px)) ((:identifier transparent)))
PROP
(:measurement 0 px)
PROP
(:measurement 0 px)
PROP
(:measurement 0 px)
PROP
(:measurement 1 px)
PROP
(:identifier transparent)
EXPR
(((:identifier visible)))
PROP
(:identifier visible)
EXPR
(((:variableName @ loaderLineZIndex)))
PROP
(:variableName @ loaderLineZIndex)
EXPR
(((:identifier rotate) ( (:values (:commandStatement (:expression (:measurement 0 deg)))) )))
PROP
)
EXPR
(((:identifier rotate) ( (:values (:commandStatement (:expression (:measurement 360 deg)))) )))
PROP
)

 [".ui.padded.segment.vertical.segment"
  {"padding-left" (clojure.core/str "0px"),
   "padding-right" (clojure.core/str "0px")}]
 [".ui[class='very']"
  [nil
   {"padding-left" (clojure.core/str "0px"),
    "padding-right" (clojure.core/str "0px")}]]
 [".ui.compact.segment" {"display" (clojure.core/str "table")}]
 [".ui.compact.segments" {"display" (clojure.core/str "inline-flex")}]
 [".ui.compact.segments"
  [".segment"
   {"display" (clojure.core/str "block"),
    "flex" (clojure.core/str "00" " " "11" " " "auto")}]]
 [".ui.segments"
  [".compact.segment"
   {"display" (clojure.core/str "block"),
    "flex" (clojure.core/str "00" " " "11" " " "auto")}]]
 [".ui.circular.segment"
  {"display" (clojure.core/str "table-cell"),
   "padding" (clojure.core/str circularPadding),
   "text-align" (clojure.core/str "center"),
   "vertical-align" (clojure.core/str "middle"),
   "border-radius" (clojure.core/str "500em")}]
 [".ui.raised.segments"
  {"box-shadow" (clojure.core/str raisedBoxShadow)}]
 [".ui.raised.segment"
  {"box-shadow" (clojure.core/str raisedBoxShadow)}]
 [".ui.segments"
  {"flex-direction" (clojure.core/str "column"),
   "position" (clojure.core/str "relative"),
   "margin" (clojure.core/str groupedMargin),
   "border" (clojure.core/str groupedBorder),
   "box-shadow" (clojure.core/str groupedBoxShadow),
   "border-radius" (clojure.core/str groupedBorderRadius)}]
 [".ui.segments:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.segments:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.segments"
  ["> .segment"
   {"top" (clojure.core/str "0px"),
    "bottom" (clojure.core/str "0px"),
    "border-radius" (clojure.core/str "0px"),
    "margin" (clojure.core/str groupedSegmentMargin),
    "width" (clojure.core/str groupedSegmentWidth),
    "box-shadow" (clojure.core/str groupedSegmentBoxShadow),
    "border" (clojure.core/str groupedSegmentBorder),
    "border-top" (clojure.core/str groupedSegmentDivider)}]]
 [".ui.segments:not([.horizontal])"
  ["> .segment:first-child"
   {"top" (clojure.core/str attachedTopOffset),
    "bottom" (clojure.core/str "0px"),
    "border-top" (clojure.core/str "none"),
    "margin-top" (clojure.core/str "0em"),
    "margin-bottom" (clojure.core/str "0em"),
    "border-radius"
    (clojure.core/str
     borderRadius
     " "
     borderRadius
     " "
     "0em"
     " "
     "0em")}]]
 [".ui.segments:not([.horizontal])"
  ["> .segment:last-child"
   {"top" (clojure.core/str attachedBottomOffset),
    "bottom" (clojure.core/str "0px"),
    "margin-top" (clojure.core/str "0em"),
    "margin-bottom" (clojure.core/str "0em"),
    "box-shadow" (clojure.core/str attachedBottomBoxShadow),
    "border-radius"
    (clojure.core/str
     "0em"
     " "
     "0em"
     " "
     borderRadius
     " "
     borderRadius)}]]
 [".ui.segments:not([.horizontal])"
  ["> .segment:only-child"
   {"border-radius" (clojure.core/str borderRadius)}]]
 [".ui.segments"
  ["> .ui.segments"
   {"border-top" (clojure.core/str groupedSegmentDivider),
    "margin" (clojure.core/str nestedGroupMargin)}]]
 [".ui.segments"
  ["> .segments:first-child" {"border-top" (clojure.core/str "none")}]]
 [".ui.segments"
  ["> .segment"
   ["+ .segments:not([.horizontal])"
    {"margin-top" (clojure.core/str "0em")}]]]
 [".ui.horizontal.segments"
  {"display" (clojure.core/str "flex"),
   "flex-direction" (clojure.core/str "row"),
   "background-color" (clojure.core/str background),
   "border-radius" (clojure.core/str borderRadius),
   "padding" (clojure.core/str "0em"),
   "box-shadow" (clojure.core/str boxShadow),
   "margin" (clojure.core/str margin),
   "border" (clojure.core/str border)}]
 [".ui.segments"
  ["> .horizontal.segments"
   {"margin" (clojure.core/str "0em"),
    "background-color" (clojure.core/str "transparent"),
    "border-radius" (clojure.core/str "0px"),
    "border" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str "none"),
    "border-top" (clojure.core/str groupedSegmentDivider)}]]
 [".ui.horizontal.segments"
  ["> .segment"
   {"flex" (clojure.core/str "11" " " "11" " " "auto"),
    "-ms-flex" (clojure.core/str "11" " " "11" " " "0px"),
    "margin" (clojure.core/str "0em"),
    "min-width" (clojure.core/str "0px"),
    "background-color" (clojure.core/str "transparent"),
    "border-radius" (clojure.core/str "0px"),
    "border" (clojure.core/str "none"),
    "box-shadow" (clojure.core/str "none"),
    "border-left"
    (clojure.core/str borderWidth " " "solid" " " borderColor)}]]
 [".ui.segments"
  ["> .horizontal.segments:first-child"
   {"border-top" (clojure.core/str "none")}]]
 [".ui.horizontal.segments"
  ["> .segment:first-child" {"border-left" (clojure.core/str "none")}]]
 [".ui.disabled.segment"
  {"opacity" (clojure.core/str disabledOpacity),
   "color" (clojure.core/str disabledTextColor)}]
 [".ui.loading.segment"
  {"position" (clojure.core/str "relative"),
   "cursor" (clojure.core/str "default"),
   "pointer-events" (clojure.core/str "none"),
   "text-shadow" (clojure.core/str "none"),
   "color" (clojure.core/str "transparent"),
   "transition" (clojure.core/str "all" " " "0s" " " "linear")}]
 [".ui.loading.segment:before"
  {"position" (clojure.core/str "absolute"),
   "content" (clojure.core/str ""),
   "top" (clojure.core/str "0%"),
   "left" (clojure.core/str "0%"),
   "background" (clojure.core/str loaderDimmerColor),
   "width" (clojure.core/str "100%"),
   "height" (clojure.core/str "100%"),
   "border-radius" (clojure.core/str borderRadius),
   "z-index" (clojure.core/str loaderDimmerZIndex)}]
 [".ui.loading.segment:after"
  {"width" (clojure.core/str loaderSize),
   "border-width" (clojure.core/str loaderLineWidth),
   "top" (clojure.core/str "50%"),
   "border-color"
   (clojure.core/str
    loaderLineColor
    " "
    loaderFillColor
    " "
    loaderFillColor
    " "
    loaderFillColor),
   "height" (clojure.core/str loaderSize),
   "margin" (clojure.core/str loaderMargin),
   "border-style" (clojure.core/str "solid"),
   "visibility" (clojure.core/str "visible"),
   "position" (clojure.core/str "absolute"),
   "animation-iteration-count" (clojure.core/str "infinite"),
   "animation"
   (clojure.core/str "segment-spin" " " loaderSpeed " " "linear"),
   "z-index" (clojure.core/str loaderLineZIndex),
   "content" (clojure.core/str ""),
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
   "left" (clojure.core/str "50%")}]
 ["from" {"transform" (clojure.core/str "rotate")}]
 ["to" {"transform" (clojure.core/str "rotate")}])
