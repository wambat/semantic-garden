(clojure.core/ns
 styles.themes.default.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def gutterWidth (clojure.core/str "1em"))
(def rowDistance (clojure.core/str "1em"))
(def paragraphMargin (clojure.core/str rowDistance " " "0em"))
(def fieldMargin (clojure.core/str "0em" " " "0em" " " rowDistance))
(def labelDistance nil)
(def
 labelMargin
 (clojure.core/str "0em" " " "0em" " " labelDistance " " "0em"))
(def labelFontSize (clojure.core/str relativeSmall))
(def labelFontWeight (clojure.core/str bold))
(def labelTextTransform (clojure.core/str "none"))
(def labelColor (clojure.core/str textColor))
(def inputFont (clojure.core/str pageFont))
(def inputWidth (clojure.core/str "100%"))
(def inputFontSize (clojure.core/str "1em"))
(def inputPadding nil)
(def inputBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def inputBorderRadius (clojure.core/str absoluteBorderRadius))
(def inputColor (clojure.core/str textColor))
(def
 inputTransition
 (clojure.core/str
  "border-color"
  " "
  defaultDuration
  " "
  defaultEasing))
(def
 inputBoxShadow
 (clojure.core/str
  "0em"
  " "
  "0em"
  " "
  "0em"
  " "
  "0em"
  " "
  "transparent"
  " "
  "inset"))
(def selectBackground (clojure.core/str white))
(def selectBorderRadius (clojure.core/str inputBorderRadius))
(def selectBorder (clojure.core/str inputBorder))
(def
 selectPadding
 (clojure.core/str "0.62em" " " inputHorizontalPadding))
(def selectBoxShadow (clojure.core/str inputBoxShadow))
(def selectTransition (clojure.core/str inputTransition))
(def selectColor (clojure.core/str inputColor))
(def
 textAreaPadding
 (clojure.core/str inputVerticalPadding " " inputHorizontalPadding))
(def textAreaHeight (clojure.core/str "12em"))
(def textAreaResize (clojure.core/str "vertical"))
(def textAreaLineHeight (clojure.core/str "1.28571.2857"))
(def textAreaMinHeight (clojure.core/str "8em"))
(def textAreaMaxHeight (clojure.core/str "24em"))
(def textAreaBackground (clojure.core/str inputBackground))
(def textAreaBorder (clojure.core/str inputBorder))
(def textAreaFontSize (clojure.core/str inputFontSize))
(def textAreaTransition (clojure.core/str inputTransition))
(def checkboxVerticalAlign (clojure.core/str "top"))
(def checkboxLabelFontSize (clojure.core/str "1em"))
(def checkboxLabelTextTransform (clojure.core/str labelTextTransform))
(def promptBackground (clojure.core/str white))
(def promptBorderColor (clojure.core/str formErrorBorder))
(def
 promptBorder
 (clojure.core/str "1px" " " "solid" " " promptBorderColor))
(def promptTextColor (clojure.core/str formErrorColor))
(def
 inlinePromptMargin
 (clojure.core/str "-0.25em" " " "0em" " " "-0.5em" " " "0.5em"))
(def inlinePromptBorderWidth (clojure.core/str "1px"))
(def inputFocusPointerSize (clojure.core/str "0px"))
(def inputFocusBackground (clojure.core/str inputBackground))
(def inputFocusBorderColor (clojure.core/str focusedFormBorderColor))
(def inputFocusColor (clojure.core/str selectedTextColor))
(def
 inputFocusBoxShadow
 (clojure.core/str
  inputFocusPointerSize
  " "
  "0em"
  " "
  "0em"
  " "
  "0em"
  " "
  selectedBorderColor
  " "
  "inset"))
(def inputFocusBorderRadius (clojure.core/str inputBorderRadius))
(def textAreaFocusBackground (clojure.core/str inputFocusBackground))
(def textAreaFocusBorderColor (clojure.core/str inputFocusBorderColor))
(def textAreaFocusColor (clojure.core/str inputFocusColor))
(def textAreaFocusBoxShadow (clojure.core/str inputFocusBoxShadow))
(def
 textAreaFocusBorderRadius
 (clojure.core/str inputFocusBorderRadius))
(def disabledLabelOpacity (clojure.core/str disabledOpacity))
(def formErrorColor (clojure.core/str negativeTextColor))
(def formErrorBorder (clojure.core/str negativeBorderColor))
(def formErrorBackground (clojure.core/str negativeBackgroundColor))
(def inputAutoFillBackground (clojure.core/str "#FFFFF0"))
(def inputAutoFillBorder (clojure.core/str "#E5DFA1"))
(def
 inputAutoFillFocusBackground
 (clojure.core/str inputAutoFillBackground))
(def inputAutoFillFocusBorder (clojure.core/str "#D5C315"))
(def inputAutoFillErrorBackground (clojure.core/str "#FFFAF0"))
(def inputAutoFillErrorBorder (clojure.core/str "#E0B4B4"))
(def inputErrorBorderRadius (clojure.core/str ""))
(def inputErrorBoxShadow (clojure.core/str "none"))
(def dropdownErrorHoverBackground (clojure.core/str "#FBE7E7"))
(def
 dropdownErrorSelectedBackground
 (clojure.core/str dropdownErrorHoverBackground))
(def dropdownErrorActiveBackground (clojure.core/str "#FDCFCF"))
(def dropdownErrorLabelBackground (clojure.core/str "#EACBCB"))
(def dropdownErrorLabelColor (clojure.core/str errorTextColor))
(def
 inputErrorFocusBackground
 (clojure.core/str negativeBackgroundColor))
(def inputErrorFocusColor (clojure.core/str negativeTextColor))
(def inputErrorFocusBorder (clojure.core/str negativeBorderColor))
(def inputErrorFocusBoxShadow (clojure.core/str "none"))
(def inputErrorPlaceholderColor (clojure.core/str "lighten"))
(def inputErrorPlaceholderFocusColor (clojure.core/str "lighten"))
(def loaderDimmerColor (clojure.core/str "rgba"))
(def loaderDimmerZIndex (clojure.core/str "100100"))
(def loaderSize (clojure.core/str "3em"))
(def loaderLineZIndex (clojure.core/str "101101"))
(def requiredContent (clojure.core/str "*"))
(def requiredColor (clojure.core/str negativeColor))
(def requiredVerticalOffset (clojure.core/str "-0.2em"))
(def requiredDistance (clojure.core/str "0.2em"))
(def
 requiredMargin
 (clojure.core/str
  requiredVerticalOffset
  " "
  "0em"
  " "
  "0em"
  " "
  requiredDistance))
(def invertedInputBackground (clojure.core/str inputBackground))
(def invertedInputBorderColor (clojure.core/str whiteBorderColor))
(def invertedInputBoxShadow (clojure.core/str inputBoxShadow))
(def invertedInputColor (clojure.core/str inputColor))
(def invertedLabelColor (clojure.core/str invertedTextColor))
(def invertedInputBoxShadow (clojure.core/str "none"))
(def groupedMargin (clojure.core/str fieldMargin))
(def groupedFieldMargin (clojure.core/str "0.5em" " " "0em"))
(def groupedLabelDistance (clojure.core/str labelDistance))
(def groupedLabelColor (clojure.core/str labelColor))
(def groupedLabelMargin (clojure.core/str labelMargin))
(def groupedLabelFontSize (clojure.core/str labelFontSize))
(def groupedLabelFontWeight (clojure.core/str labelFontWeight))
(def groupedLabelTextTransform (clojure.core/str labelTextTransform))
(def inlineInputSize (clojure.core/str relativeMedium))
(def inlineLabelDistance (clojure.core/str relativeTiny))
(def inlineLabelColor (clojure.core/str labelColor))
(def inlineLabelFontSize (clojure.core/str labelFontSize))
(def inlineLabelFontWeight (clojure.core/str labelFontWeight))
(def inlineLabelTextTransform (clojure.core/str labelTextTransform))
(def
 groupedInlineLabelMargin
 (clojure.core/str "0.035714em" " " "1em" " " "0em" " " "0em"))
(def
 inlineFieldsMargin
 (clojure.core/str "0em" " " "1em" " " "0em" " " "0em"))
(defstyles root)
