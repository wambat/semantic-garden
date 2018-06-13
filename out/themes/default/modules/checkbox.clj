(clojure.core/ns
 themes.default.modules.checkbox
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def checkboxSize (clojure.core/str "17px"))
(def checkboxColor (clojure.core/str textColor))
(def checkboxLineHeight (clojure.core/str checkboxSize))
(def labelDistance (clojure.core/str "1.85714em"))
(def checkboxBackground (clojure.core/str white))
(def
 checkboxBorder
 (clojure.core/str "1px" " " "solid" " " solidBorderColor))
(def checkboxBorderRadius nil)
(def
 checkboxTransition
 (clojure.core/str "box-shadow" " " defaultDuration " " defaultEasing))
(def checkboxCheckFontSize (clojure.core/str "14px"))
(def checkboxCheckTop (clojure.core/str "0px"))
(def checkboxCheckLeft (clojure.core/str "0px"))
(def checkboxCheckSize (clojure.core/str checkboxSize))
(def labelFontSize (clojure.core/str relativeMedium))
(def labelColor (clojure.core/str textColor))
(def
 labelTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def checkboxHoverBackground (clojure.core/str checkboxBackground))
(def checkboxHoverBorderColor (clojure.core/str selectedBorderColor))
(def labelHoverColor (clojure.core/str hoveredTextColor))
(def checkboxPressedBackground (clojure.core/str offWhite))
(def checkboxPressedBorderColor (clojure.core/str selectedBorderColor))
(def checkboxPressedColor (clojure.core/str selectedTextColor))
(def labelPressedColor (clojure.core/str selectedTextColor))
(def checkboxFocusBackground (clojure.core/str white))
(def
 checkboxFocusBorderColor
 (clojure.core/str focusedFormMutedBorderColor))
(def checkboxFocusCheckColor (clojure.core/str selectedTextColor))
(def labelFocusColor (clojure.core/str selectedTextColor))
(def labelActiveColor (clojure.core/str selectedTextColor))
(def checkboxActiveBackground (clojure.core/str white))
(def checkboxActiveBorderColor (clojure.core/str selectedBorderColor))
(def checkboxActiveCheckColor (clojure.core/str selectedTextColor))
(def checkboxActiveCheckOpacity (clojure.core/str "11"))
(def checkboxActiveFocusBackground (clojure.core/str white))
(def
 checkboxActiveFocusBorderColor
 (clojure.core/str checkboxFocusBorderColor))
(def checkboxActiveFocusCheckColor (clojure.core/str selectedTextColor))
(def
 checkboxIndeterminateBackground
 (clojure.core/str checkboxActiveBackground))
(def
 checkboxIndeterminateBorderColor
 (clojure.core/str checkboxActiveBorderColor))
(def checkboxIndeterminateCheckOpacity (clojure.core/str "11"))
(def
 checkboxIndeterminateCheckColor
 (clojure.core/str checkboxActiveCheckColor))
(def disabledCheckboxOpacity (clojure.core/str "0.50.5"))
(def disabledCheckboxLabelColor (clojure.core/str "rgba"))
(def radioSize (clojure.core/str "15px"))
(def radioTop (clojure.core/str "1px"))
(def radioLeft (clojure.core/str "0px"))
(def radioLabelDistance (clojure.core/str labelDistance))
(def bulletTop (clojure.core/str "1px"))
(def bulletLeft (clojure.core/str "0px"))
(def bulletScale nil)
(def bulletColor (clojure.core/str textColor))
(def bulletRadius (clojure.core/str circularRadius))
(def radioFocusBackground (clojure.core/str checkboxFocusBackground))
(def radioFocusBulletColor (clojure.core/str checkboxFocusCheckColor))
(def radioActiveBackground (clojure.core/str checkboxActiveBackground))
(def radioActiveBulletColor (clojure.core/str checkboxActiveCheckColor))
(def
 radioActiveFocusBackground
 (clojure.core/str checkboxActiveFocusBackground))
(def
 radioActiveFocusBulletColor
 (clojure.core/str checkboxActiveFocusCheckColor))
(def handleBackground (clojure.core/str white " " subtleGradient))
(def
 handleBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  borderColor
  " "
  "inset"))
(def sliderHandleSize (clojure.core/str "1.51.5" " " "rem"))
(def sliderLineWidth (clojure.core/str "3.53.5" " " "rem"))
(def sliderTransitionDuration (clojure.core/str "0.3s"))
(def
 sliderHandleTransition
 (clojure.core/str
  "left"
  " "
  sliderTransitionDuration
  " "
  defaultEasing))
(def sliderWidth (clojure.core/str sliderLineWidth))
(def sliderHeight nil)
(def sliderLineHeight nil)
(def sliderLineVerticalOffset (clojure.core/str "0.40.4" " " "rem"))
(def sliderLineColor (clojure.core/str transparentBlack))
(def sliderLineRadius (clojure.core/str circularRadius))
(def
 sliderLineTransition
 (clojure.core/str
  "background"
  " "
  sliderTransitionDuration
  " "
  defaultEasing))
(def sliderTravelDistance nil)
(def sliderLabelDistance nil)
(def sliderOffLabelColor (clojure.core/str unselectedTextColor))
(def sliderLabelLineHeight (clojure.core/str "11" " " "rem"))
(def
 sliderHoverLaneBackground
 (clojure.core/str veryStrongTransparentBlack))
(def sliderHoverLabelColor (clojure.core/str hoveredTextColor))
(def sliderOnLineColor (clojure.core/str lightBlack))
(def sliderOnLabelColor (clojure.core/str selectedTextColor))
(def sliderOnFocusLineColor (clojure.core/str lightBlackFocus))
(def sliderOnFocusLabelColor (clojure.core/str sliderOnLabelColor))
(def toggleLaneWidth (clojure.core/str "3.53.5" " " "rem"))
(def toggleHandleSize (clojure.core/str "1.51.5" " " "rem"))
(def toggleTransitionDuration (clojure.core/str "0.2s"))
(def toggleWidth (clojure.core/str toggleLaneWidth))
(def toggleHeight (clojure.core/str toggleHandleSize))
(def toggleHandleRadius (clojure.core/str circularRadius))
(def toggleHandleOffset (clojure.core/str "00" " " "rem"))
(def
 toggleHandleTransition
 (clojure.core/str
  "left"
  " "
  sliderTransitionDuration
  " "
  defaultEasing))
(def toggleLaneBackground (clojure.core/str transparentBlack))
(def toggleLaneHeight (clojure.core/str toggleHandleSize))
(def toggleLaneBoxShadow (clojure.core/str "none"))
(def toggleLaneVerticalOffset (clojure.core/str "00" " " "rem"))
(def toggleOffOffset (clojure.core/str "-0.05-0.05" " " "rem"))
(def toggleLabelDistance nil)
(def toggleLabelLineHeight (clojure.core/str "1.51.5" " " "rem"))
(def toggleLabelOffset (clojure.core/str "0.15em"))
(def toggleFocusColor (clojure.core/str veryStrongTransparentBlack))
(def toggleHoverColor (clojure.core/str toggleFocusColor))
(def toggleOffLabelColor (clojure.core/str checkboxColor))
(def toggleOffHandleBoxShadow (clojure.core/str handleBoxShadow))
(def toggleOnLabelColor (clojure.core/str selectedTextColor))
(def toggleOnLaneColor (clojure.core/str primaryColor))
(def toggleOnHandleBoxShadow (clojure.core/str handleBoxShadow))
(def toggleOnFocusLaneColor (clojure.core/str primaryColorFocus))
(def toggleOnFocusLabelColor (clojure.core/str toggleOnLabelColor))
(defstyles root)
