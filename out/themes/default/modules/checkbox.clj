(clojure.core/ns
 themes.default.modules.checkbox
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def checkboxSize "(:measurement 17 px)")
(def checkboxColor "(:variableName @ textColor)")
(def checkboxLineHeight "(:variableName @ checkboxSize)")
(def labelDistance "(:measurement 1.85714 em)")
(def checkboxBackground "(:variableName @ white)")
(def checkboxBorder "(:variableName @ solidBorderColor)")
(def checkboxBorderRadius "(:measurement 3 px)")
(def checkboxTransition "(:variableName @ defaultEasing)")
(def checkboxCheckFontSize "(:measurement 14 px)")
(def checkboxCheckTop "(:measurement 0 px)")
(def checkboxCheckLeft "(:measurement 0 px)")
(def checkboxCheckSize "(:variableName @ checkboxSize)")
(def labelFontSize "(:variableName @ relativeMedium)")
(def labelColor "(:variableName @ textColor)")
(def labelTransition "(:variableName @ defaultEasing)")
(def checkboxHoverBackground "(:variableName @ checkboxBackground)")
(def checkboxHoverBorderColor "(:variableName @ selectedBorderColor)")
(def labelHoverColor "(:variableName @ hoveredTextColor)")
(def checkboxPressedBackground "(:variableName @ offWhite)")
(def checkboxPressedBorderColor "(:variableName @ selectedBorderColor)")
(def checkboxPressedColor "(:variableName @ selectedTextColor)")
(def labelPressedColor "(:variableName @ selectedTextColor)")
(def checkboxFocusBackground "(:variableName @ white)")
(def
 checkboxFocusBorderColor
 "(:variableName @ focusedFormMutedBorderColor)")
(def checkboxFocusCheckColor "(:variableName @ selectedTextColor)")
(def labelFocusColor "(:variableName @ selectedTextColor)")
(def labelActiveColor "(:variableName @ selectedTextColor)")
(def checkboxActiveBackground "(:variableName @ white)")
(def checkboxActiveBorderColor "(:variableName @ selectedBorderColor)")
(def checkboxActiveCheckColor "(:variableName @ selectedTextColor)")
(def checkboxActiveCheckOpacity "(:measurement 1)")
(def checkboxActiveFocusBackground "(:variableName @ white)")
(def
 checkboxActiveFocusBorderColor
 "(:variableName @ checkboxFocusBorderColor)")
(def
 checkboxActiveFocusCheckColor
 "(:variableName @ selectedTextColor)")
(def
 checkboxIndeterminateBackground
 "(:variableName @ checkboxActiveBackground)")
(def
 checkboxIndeterminateBorderColor
 "(:variableName @ checkboxActiveBorderColor)")
(def checkboxIndeterminateCheckOpacity "(:measurement 1)")
(def
 checkboxIndeterminateCheckColor
 "(:variableName @ checkboxActiveCheckColor)")
(def disabledCheckboxOpacity "(:measurement 0.5)")
(def disabledCheckboxLabelColor ")")
(def radioSize "(:measurement 15 px)")
(def radioTop "(:measurement 1 px)")
(def radioLeft "(:measurement 0 px)")
(def radioLabelDistance "(:variableName @ labelDistance)")
(def bulletTop "(:measurement 1 px)")
(def bulletLeft "(:measurement 0 px)")
(def bulletScale "")
(def bulletColor "(:variableName @ textColor)")
(def bulletRadius "(:variableName @ circularRadius)")
(def radioFocusBackground "(:variableName @ checkboxFocusBackground)")
(def radioFocusBulletColor "(:variableName @ checkboxFocusCheckColor)")
(def radioActiveBackground "(:variableName @ checkboxActiveBackground)")
(def
 radioActiveBulletColor
 "(:variableName @ checkboxActiveCheckColor)")
(def
 radioActiveFocusBackground
 "(:variableName @ checkboxActiveFocusBackground)")
(def
 radioActiveFocusBulletColor
 "(:variableName @ checkboxActiveFocusCheckColor)")
(def handleBackground "(:variableName @ subtleGradient)")
(def handleBoxShadow "(:identifier inset)")
(def sliderHandleSize "(:identifier rem)")
(def sliderLineWidth "(:identifier rem)")
(def sliderTransitionDuration "(:measurement 0.3 s)")
(def sliderHandleTransition "(:variableName @ defaultEasing)")
(def sliderWidth "(:variableName @ sliderLineWidth)")
(def sliderHeight "")
(def sliderLineHeight "(:measurement 3 px)")
(def sliderLineVerticalOffset "(:identifier rem)")
(def sliderLineColor "(:variableName @ transparentBlack)")
(def sliderLineRadius "(:variableName @ circularRadius)")
(def sliderLineTransition "(:variableName @ defaultEasing)")
(def sliderTravelDistance "")
(def sliderLabelDistance "")
(def sliderOffLabelColor "(:variableName @ unselectedTextColor)")
(def sliderLabelLineHeight "(:identifier rem)")
(def
 sliderHoverLaneBackground
 "(:variableName @ veryStrongTransparentBlack)")
(def sliderHoverLabelColor "(:variableName @ hoveredTextColor)")
(def sliderOnLineColor "(:variableName @ lightBlack)")
(def sliderOnLabelColor "(:variableName @ selectedTextColor)")
(def sliderOnFocusLineColor "(:variableName @ lightBlackFocus)")
(def sliderOnFocusLabelColor "(:variableName @ sliderOnLabelColor)")
(def toggleLaneWidth "(:identifier rem)")
(def toggleHandleSize "(:identifier rem)")
(def toggleTransitionDuration "(:measurement 0.2 s)")
(def toggleWidth "(:variableName @ toggleLaneWidth)")
(def toggleHeight "(:variableName @ toggleHandleSize)")
(def toggleHandleRadius "(:variableName @ circularRadius)")
(def toggleHandleOffset "(:identifier rem)")
(def toggleHandleTransition "(:variableName @ defaultEasing)")
(def toggleLaneBackground "(:variableName @ transparentBlack)")
(def toggleLaneHeight "(:variableName @ toggleHandleSize)")
(def toggleLaneBoxShadow "(:identifier none)")
(def toggleLaneVerticalOffset "(:identifier rem)")
(def toggleOffOffset "(:identifier rem)")
(def toggleLabelDistance "")
(def toggleLabelLineHeight "(:identifier rem)")
(def toggleLabelOffset "(:measurement 0.15 em)")
(def toggleFocusColor "(:variableName @ veryStrongTransparentBlack)")
(def toggleHoverColor "(:variableName @ toggleFocusColor)")
(def toggleOffLabelColor "(:variableName @ checkboxColor)")
(def toggleOffHandleBoxShadow "(:variableName @ handleBoxShadow)")
(def toggleOnLabelColor "(:variableName @ selectedTextColor)")
(def toggleOnLaneColor "(:variableName @ primaryColor)")
(def toggleOnHandleBoxShadow "(:variableName @ handleBoxShadow)")
(def toggleOnFocusLaneColor "(:variableName @ primaryColorFocus)")
(def toggleOnFocusLabelColor "(:variableName @ toggleOnLabelColor)")
(defstyles root)
