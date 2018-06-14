(clojure.core/ns
 styles.themes.default.modules.search
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def promptBackground (clojure.core/str inputBackground))
(def promptVerticalPadding (clojure.core/str inputVerticalPadding))
(def promptHorizontalPadding (clojure.core/str inputHorizontalPadding))
(def promptLineHeight (clojure.core/str inputLineHeight))
(def promptFontSize (clojure.core/str relativeMedium))
(def promptPadding nil)
(def promptBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def promptBorderRadius (clojure.core/str circularRadius))
(def promptColor (clojure.core/str textColor))
(def
 promptTransition
 (clojure.core/str
  "border-color"
  " "
  defaultDuration
  " "
  defaultEasing))
(def
 promptBoxShadow
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
(def mobileMaxWidth nil)
(def resultsWidth (clojure.core/str "18em"))
(def resultsBackground (clojure.core/str "#FFFFFF"))
(def resultsDistance (clojure.core/str "0.5em"))
(def resultsBorderRadius (clojure.core/str defaultBorderRadius))
(def
 resultsBorder
 (clojure.core/str "1px" " " "solid" " " solidBorderColor))
(def resultsBoxShadow (clojure.core/str floatingShadow))
(def resultFontSize (clojure.core/str "1em"))
(def resultVerticalPadding (clojure.core/str relativeTiny))
(def resultHorizontalPadding (clojure.core/str relativeLarge))
(def
 resultPadding
 (clojure.core/str resultVerticalPadding " " resultHorizontalPadding))
(def resultTextColor (clojure.core/str textColor))
(def resultLineHeight (clojure.core/str "1.331.33"))
(def
 resultDivider
 (clojure.core/str "1px" " " "solid" " " internalBorderColor))
(def resultLastDivider (clojure.core/str "none"))
(def resultImageFloat (clojure.core/str "right"))
(def resultImageBackground (clojure.core/str "none"))
(def resultImageWidth (clojure.core/str "5em"))
(def resultImageHeight (clojure.core/str "3em"))
(def resultImageBorderRadius (clojure.core/str "0.25em"))
(def
 resultImageMargin
 (clojure.core/str "0em" " " "6em" " " "0em" " " "0em"))
(def resultTitleFont (clojure.core/str headerFont))
(def resultTitleMargin nil)
(def resultTitleFontWeight (clojure.core/str bold))
(def resultTitleFontSize (clojure.core/str relativeMedium))
(def resultTitleColor (clojure.core/str darkTextColor))
(def resultDescriptionFontSize (clojure.core/str relativeSmall))
(def resultDescriptionDistance (clojure.core/str "00"))
(def resultDescriptionColor (clojure.core/str lightTextColor))
(def resultPriceFloat (clojure.core/str "right"))
(def resultPriceColor (clojure.core/str green))
(def messageVerticalPadding (clojure.core/str "1em"))
(def messageHorizontalPadding (clojure.core/str "1em"))
(def messageHeaderFontSize (clojure.core/str medium))
(def messageHeaderFontWeight (clojure.core/str bold))
(def messageHeaderColor (clojure.core/str textColor))
(def messageDescriptionDistance (clojure.core/str "0.250.25" " " "rem"))
(def messageDescriptionFontSize (clojure.core/str "1em"))
(def messageDescriptionColor (clojure.core/str textColor))
(def actionBorder (clojure.core/str "none"))
(def actionBackground (clojure.core/str darkWhite))
(def actionPadding (clojure.core/str relativeSmall " " relativeMedium))
(def actionColor (clojure.core/str textColor))
(def actionFontWeight (clojure.core/str bold))
(def actionAlign (clojure.core/str "center"))
(def promptFocusBackground (clojure.core/str promptBackground))
(def promptFocusBorderColor (clojure.core/str selectedBorderColor))
(def promptFocusColor (clojure.core/str selectedTextColor))
(def resultHoverBackground (clojure.core/str offWhite))
(def actionHoverBackground (clojure.core/str "#E0E0E0"))
(def invertedLoaderFillColor (clojure.core/str "rgba"))
(def categoryActiveBackground (clojure.core/str darkWhite))
(def categoryNameActiveColor (clojure.core/str textColor))
(def resultActiveBorderLeft (clojure.core/str internalBorderColor))
(def resultActiveBackground (clojure.core/str darkWhite))
(def resultActiveBoxShadow (clojure.core/str "none"))
(def resultActiveTitleColor (clojure.core/str darkTextColor))
(def resultActiveDescriptionColor (clojure.core/str darkTextColor))
(def resultsZIndex (clojure.core/str "998998"))
(def selectionPromptBorderRadius (clojure.core/str defaultBorderRadius))
(def selectionCloseTop (clojure.core/str "0em"))
(def
 selectionCloseTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def selectionCloseRight (clojure.core/str "0em"))
(def selectionCloseIconOpacity (clojure.core/str "0.80.8"))
(def selectionCloseIconColor (clojure.core/str ""))
(def selectionCloseIconHoverOpacity (clojure.core/str "11"))
(def selectionCloseIconHoverColor (clojure.core/str red))
(def selectionCloseIconInputRight (clojure.core/str "1.85714em"))
(def categoryBackground (clojure.core/str darkWhite))
(def categoryBoxShadow (clojure.core/str "none"))
(def
 categoryDivider
 (clojure.core/str "1px" " " "solid" " " internalBorderColor))
(def
 categoryTransition
 (clojure.core/str
  "border-color"
  " "
  defaultDuration
  " "
  defaultEasing))
(def categoryResultsWidth (clojure.core/str "28em"))
(def categoryResultBackground (clojure.core/str white))
(def
 categoryResultLeftBorder
 (clojure.core/str "1px" " " "solid" " " borderColor))
(def categoryResultDivider (clojure.core/str resultDivider))
(def categoryResultLastDivider (clojure.core/str "none"))
(def categoryResultPadding (clojure.core/str resultPadding))
(def categoryResultTransition (clojure.core/str categoryTransition))
(def categoryNameWidth (clojure.core/str "100px"))
(def categoryNameBackground (clojure.core/str "transparent"))
(def categoryNameFont (clojure.core/str pageFont))
(def categoryNameFontSize (clojure.core/str "1em"))
(def categoryNameWhitespace (clojure.core/str "nowrap"))
(def categoryNamePadding (clojure.core/str "0.4em" " " "1em"))
(def categoryNameFontWeight (clojure.core/str bold))
(def categoryNameColor (clojure.core/str lightTextColor))
(defstyles root)
