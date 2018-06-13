(clojure.core/ns
 definitions.modules.progress
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "progress"))
(defstyles
 root
 [".ui.progress"
  {"position" (clojure.core/str "relative"),
   "display" (clojure.core/str "block"),
   "max-width" (clojure.core/str "100%"),
   "border" (clojure.core/str border),
   "margin" (clojure.core/str margin),
   "box-shadow" (clojure.core/str boxShadow),
   "background" (clojure.core/str background),
   "padding" (clojure.core/str padding),
   "border-radius" (clojure.core/str borderRadius)}]
 [".ui.progress:first-child" {"margin" (clojure.core/str firstMargin)}]
 [".ui.progress:last-child" {"margin" (clojure.core/str lastMargin)}]
 [".ui.progress"
  [".bar"
   {"display" (clojure.core/str "block"),
    "line-height" (clojure.core/str "11"),
    "position" (clojure.core/str barPosition),
    "width" (clojure.core/str barInitialWidth),
    "min-width" (clojure.core/str barMinWidth),
    "background" (clojure.core/str barBackground),
    "border-radius" (clojure.core/str barBorderRadius),
    "transition" (clojure.core/str barTransition)}]]
 [".ui.progress"
  [".bar"
   ["> .progress"
    {"width" (clojure.core/str progressWidth),
     "right" (clojure.core/str progressRight),
     "top" (clojure.core/str progressTop),
     "text-align" (clojure.core/str progressTextAlign),
     "white-space" (clojure.core/str "nowrap"),
     "position" (clojure.core/str progressPosition),
     "margin-top" (clojure.core/str progressOffset),
     "font-weight" (clojure.core/str progressFontWeight),
     "font-size" (clojure.core/str progressSize),
     "bottom" (clojure.core/str progressBottom),
     "text-shadow" (clojure.core/str progressTextShadow),
     "color" (clojure.core/str progressColor),
     "left" (clojure.core/str progressLeft)}]]]
 [".ui.progress"
  ["> .label"
   {"width" (clojure.core/str labelWidth),
    "right" (clojure.core/str labelRight),
    "top" (clojure.core/str labelTop),
    "text-align" (clojure.core/str labelTextAlign),
    "position" (clojure.core/str "absolute"),
    "margin-top" (clojure.core/str labelOffset),
    "font-weight" (clojure.core/str labelFontWeight),
    "font-size" (clojure.core/str labelSize),
    "bottom" (clojure.core/str labelBottom),
    "transition" (clojure.core/str labelTransition),
    "text-shadow" (clojure.core/str labelTextShadow),
    "color" (clojure.core/str labelColor),
    "left" (clojure.core/str labelLeft)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingSecondColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingThirdColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingThirdColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFourthColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFifthColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFifthColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingSixthColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingSixthColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingSecondLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingThirdLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingThirdLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFourthLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFifthLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFifthLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingSixthLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingSixthLabelColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".bar"
   {"background-color" (clojure.core/str indicatingFirstColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [nil
  [".label" {"color" (clojure.core/str indicatingFirstLabelColor)}]]
 [".ui.indicating.progress.success"
  [".label" {"color" (clojure.core/str successHeaderColor)}]]
 [".ui.progress.success"
  [".bar" {"background-color" (clojure.core/str successColor)}]]
 [":after" {"animation" (clojure.core/str "none")}]
 [".ui.progress.success"
  ["> .label" {"color" (clojure.core/str successHeaderColor)}]]
 [".ui.progress.warning"
  [".bar" {"background-color" (clojure.core/str warningColor)}]]
 [":after" {"animation" (clojure.core/str "none")}]
 [".ui.progress.warning"
  ["> .label" {"color" (clojure.core/str warningHeaderColor)}]]
 [".ui.progress.error"
  [".bar" {"background-color" (clojure.core/str errorColor)}]]
 [":after" {"animation" (clojure.core/str "none")}]
 [".ui.progress.error"
  ["> .label" {"color" (clojure.core/str errorHeaderColor)}]]
 [".ui.active.progress"
  [".bar"
   {"position" (clojure.core/str "relative"),
    "min-width" (clojure.core/str activeMinWidth)}]]EXPR
(((:measurement 0.35)))
PROP
(:measurement 0.35)
EXPR
(((:identifier none) !important))
PROP
!important
EXPR
(((:variableName @ invertedBackground)))
PROP
(:variableName @ invertedBackground)
EXPR
(((:variableName @ invertedBorder)))
PROP
(:variableName @ invertedBorder)
EXPR
(((:variableName @ invertedBarBackground)))
PROP
(:variableName @ invertedBarBackground)
EXPR
(((:variableName @ invertedProgressColor)))
PROP
(:variableName @ invertedProgressColor)
EXPR
(((:variableName @ invertedLabelColor)))
PROP
(:variableName @ invertedLabelColor)
EXPR
(((:variableName @ successColor)))
PROP
(:variableName @ successColor)
EXPR
(((:variableName @ warningColor)))
PROP
(:variableName @ warningColor)
EXPR
(((:variableName @ errorColor)))
PROP
(:variableName @ errorColor)
EXPR
(((:variableName @ attachedBackground)))
PROP
(:variableName @ attachedBackground)
EXPR
(((:identifier relative)))
PROP
(:identifier relative)
EXPR
(((:identifier none)))
PROP
(:identifier none)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:identifier block)))
PROP
(:identifier block)
EXPR
(((:variableName @ attachedHeight)))
PROP
(:variableName @ attachedHeight)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:identifier hidden)))
PROP
(:identifier hidden)
EXPR
(((:measurement 0 em)) ((:measurement 0 em)) ((:variableName @ attachedBorderRadius)) ((:variableName @ attachedBorderRadius)))
PROP
(:measurement 0 em)
PROP
(:measurement 0 em)
PROP
(:variableName @ attachedBorderRadius)
PROP
(:variableName @ attachedBorderRadius)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:measurement 0 px)))
PROP
(:measurement 0 px)
EXPR
(((:variableName @ attachedBorderRadius)) ((:variableName @ attachedBorderRadius)) ((:measurement 0 em)) ((:measurement 0 em)))
PROP
(:variableName @ attachedBorderRadius)
PROP
(:variableName @ attachedBorderRadius)
PROP
(:measurement 0 em)
PROP
(:measurement 0 em)
EXPR
(((:measurement 0 em)))
PROP
(:measurement 0 em)
EXPR
(((:identifier absolute)))
PROP
(:identifier absolute)
EXPR
(((:identifier auto)))
PROP
(:identifier auto)
EXPR
(((:measurement 0)))
PROP
(:measurement 0)
EXPR
(((:measurement 100 %)))
PROP
(:measurement 100 %)
EXPR
(((:measurement 100 %)))
PROP
(:measurement 100 %)
EXPR
(((:measurement 100 %)))
PROP
(:measurement 100 %)
EXPR
(((:identifier auto)))
PROP
(:identifier auto)
EXPR
(((:variableName @ red)))
PROP
(:variableName @ red)
EXPR
(((:variableName @ lightRed)))
PROP
(:variableName @ lightRed)
EXPR
(((:variableName @ orange)))
PROP
(:variableName @ orange)
EXPR
(((:variableName @ lightOrange)))
PROP
(:variableName @ lightOrange)
EXPR
(((:variableName @ yellow)))
PROP
(:variableName @ yellow)
EXPR
(((:variableName @ lightYellow)))
PROP
(:variableName @ lightYellow)
EXPR
(((:variableName @ olive)))
PROP
(:variableName @ olive)
EXPR
(((:variableName @ lightOlive)))
PROP
(:variableName @ lightOlive)
EXPR
(((:variableName @ green)))
PROP
(:variableName @ green)
EXPR
(((:variableName @ lightGreen)))
PROP
(:variableName @ lightGreen)
EXPR
(((:variableName @ teal)))
PROP
(:variableName @ teal)
EXPR
(((:variableName @ lightTeal)))
PROP
(:variableName @ lightTeal)
EXPR
(((:variableName @ blue)))
PROP
(:variableName @ blue)
EXPR
(((:variableName @ lightBlue)))
PROP
(:variableName @ lightBlue)
EXPR
(((:variableName @ violet)))
PROP
(:variableName @ violet)
EXPR
(((:variableName @ lightViolet)))
PROP
(:variableName @ lightViolet)

 [":after"
  {"right" (clojure.core/str "0px"),
   "top" (clojure.core/str "0px"),
   "position" (clojure.core/str "absolute"),
   "animation"
   (clojure.core/str
    "progress-active"
    " "
    activePulseDuration
    " "
    defaultEasing
    " "
    "infinite"),
   "content" (clojure.core/str ""),
   "border-radius" (clojure.core/str barBorderRadius),
   "bottom" (clojure.core/str "0px"),
   "background" (clojure.core/str activePulseColor),
   "opacity" (clojure.core/str "00"),
   "left" (clojure.core/str "0px")}]
 [".ui.disabled.progress" {"opacity" (clojure.core/str "0.350.35")}]
 [":after" {"animation" (clojure.core/str "none")}]
 [".ui.inverted.progress"
  {"background" (clojure.core/str invertedBackground),
   "border" (clojure.core/str invertedBorder)}]
 [".ui.inverted.progress"
  [".bar" {"background" (clojure.core/str invertedBarBackground)}]]
 [".ui.inverted.progress"
  [".bar"
   ["> .progress" {"color" (clojure.core/str invertedProgressColor)}]]]
 [".ui.inverted.progress"
  ["> .label" {"color" (clojure.core/str invertedLabelColor)}]]
 [".ui.inverted.progress.success"
  ["> .label" {"color" (clojure.core/str successColor)}]]
 [".ui.inverted.progress.warning"
  ["> .label" {"color" (clojure.core/str warningColor)}]]
 [".ui.inverted.progress.error"
  ["> .label" {"color" (clojure.core/str errorColor)}]]
 [".ui.progress.attached"
  {"background" (clojure.core/str attachedBackground),
   "position" (clojure.core/str "relative"),
   "border" (clojure.core/str "none"),
   "margin" (clojure.core/str "0em")}]
 [".ui.progress.attached"
  {"display" (clojure.core/str "block"),
   "height" (clojure.core/str attachedHeight),
   "padding" (clojure.core/str "0px"),
   "overflow" (clojure.core/str "hidden"),
   "border-radius"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    attachedBorderRadius
    " "
    attachedBorderRadius)}]
 [".ui.progress.attached"
  [".bar"
   {"display" (clojure.core/str "block"),
    "height" (clojure.core/str attachedHeight),
    "padding" (clojure.core/str "0px"),
    "overflow" (clojure.core/str "hidden"),
    "border-radius"
    (clojure.core/str
     "0em"
     " "
     "0em"
     " "
     attachedBorderRadius
     " "
     attachedBorderRadius)}]]
 [".ui.progress.attached"
  [".bar" {"border-radius" (clojure.core/str "0em")}]]
 [".ui.progress.top.attached"
  {"top" (clojure.core/str "0px"),
   "border-radius"
   (clojure.core/str
    attachedBorderRadius
    " "
    attachedBorderRadius
    " "
    "0em"
    " "
    "0em")}]
 [".ui.progress.top.attached"
  [".bar"
   {"top" (clojure.core/str "0px"),
    "border-radius"
    (clojure.core/str
     attachedBorderRadius
     " "
     attachedBorderRadius
     " "
     "0em"
     " "
     "0em")}]]
 [".ui.progress.top.attached"
  [".bar" {"border-radius" (clojure.core/str "0em")}]]
 [".ui.segment"
  ["> .ui.attached.progress"
   {"position" (clojure.core/str "absolute"),
    "top" (clojure.core/str "auto"),
    "left" (clojure.core/str "00"),
    "bottom" (clojure.core/str "100%"),
    "width" (clojure.core/str "100%")}]]
 [".ui.card"
  ["> .ui.attached.progress"
   {"position" (clojure.core/str "absolute"),
    "top" (clojure.core/str "auto"),
    "left" (clojure.core/str "00"),
    "bottom" (clojure.core/str "100%"),
    "width" (clojure.core/str "100%")}]]
 [".ui.segment"
  ["> .ui.bottom.attached.progress"
   {"top" (clojure.core/str "100%"),
    "bottom" (clojure.core/str "auto")}]]
 [".ui.card"
  ["> .ui.bottom.attached.progress"
   {"top" (clojure.core/str "100%"),
    "bottom" (clojure.core/str "auto")}]]
 [".ui.red.progress"
  [".bar" {"background-color" (clojure.core/str red)}]]
 [".ui.red.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightRed)}]]
 [".ui.orange.progress"
  [".bar" {"background-color" (clojure.core/str orange)}]]
 [".ui.orange.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightOrange)}]]
 [".ui.yellow.progress"
  [".bar" {"background-color" (clojure.core/str yellow)}]]
 [".ui.yellow.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightYellow)}]]
 [".ui.olive.progress"
  [".bar" {"background-color" (clojure.core/str olive)}]]
 [".ui.olive.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightOlive)}]]
 [".ui.green.progress"
  [".bar" {"background-color" (clojure.core/str green)}]]
 [".ui.green.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightGreen)}]]
 [".ui.teal.progress"
  [".bar" {"background-color" (clojure.core/str teal)}]]
 [".ui.teal.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightTeal)}]]
 [".ui.blue.progress"
  [".bar" {"background-color" (clojure.core/str blue)}]]
 [".ui.blue.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightBlue)}]]
 [".ui.violet.progress"
  [".bar" {"background-color" (clojure.core/str violet)}]]EXPR
(((:variableName @ purple)))
PROP
(:variableName @ purple)
EXPR
(((:variableName @ lightPurple)))
PROP
(:variableName @ lightPurple)
EXPR
(((:variableName @ pink)))
PROP
(:variableName @ pink)
EXPR
(((:variableName @ lightPink)))
PROP
(:variableName @ lightPink)
EXPR
(((:variableName @ brown)))
PROP
(:variableName @ brown)
EXPR
(((:variableName @ lightBrown)))
PROP
(:variableName @ lightBrown)
EXPR
(((:variableName @ grey)))
PROP
(:variableName @ grey)
EXPR
(((:variableName @ lightGrey)))
PROP
(:variableName @ lightGrey)
EXPR
(((:variableName @ black)))
PROP
(:variableName @ black)
EXPR
(((:variableName @ lightBlack)))
PROP
(:variableName @ lightBlack)
EXPR
(((:variableName @ tiny)))
PROP
(:variableName @ tiny)
EXPR
(((:variableName @ tinyBarHeight)))
PROP
(:variableName @ tinyBarHeight)
EXPR
(((:variableName @ small)))
PROP
(:variableName @ small)
EXPR
(((:variableName @ smallBarHeight)))
PROP
(:variableName @ smallBarHeight)
EXPR
(((:variableName @ medium)))
PROP
(:variableName @ medium)
EXPR
(((:variableName @ barHeight)))
PROP
(:variableName @ barHeight)
EXPR
(((:variableName @ large)))
PROP
(:variableName @ large)
EXPR
(((:variableName @ largeBarHeight)))
PROP
(:variableName @ largeBarHeight)
EXPR
(((:variableName @ big)))
PROP
(:variableName @ big)
EXPR
(((:variableName @ bigBarHeight)))
PROP
(:variableName @ bigBarHeight)

 [".ui.violet.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightViolet)}]]
 [".ui.purple.progress"
  [".bar" {"background-color" (clojure.core/str purple)}]]
 [".ui.purple.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightPurple)}]]
 [".ui.pink.progress"
  [".bar" {"background-color" (clojure.core/str pink)}]]
 [".ui.pink.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightPink)}]]
 [".ui.brown.progress"
  [".bar" {"background-color" (clojure.core/str brown)}]]
 [".ui.brown.inverted.progress"
  [".bar" {"background-color" (clojure.core/str lightBrown)}]]
 ...)
