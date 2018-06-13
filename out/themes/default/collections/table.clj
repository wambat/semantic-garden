(clojure.core/ns
 themes.default.collections.table
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def verticalMargin (clojure.core/str "1em"))
(def horizontalMargin (clojure.core/str "0em"))
(def margin (clojure.core/str verticalMargin " " horizontalMargin))
(def borderCollapse (clojure.core/str "separate"))
(def borderSpacing (clojure.core/str "0px"))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def
 transition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def background (clojure.core/str white))
(def color (clojure.core/str textColor))
(def borderWidth (clojure.core/str "1px"))
(def border (clojure.core/str borderWidth " " "solid" " " borderColor))
(def boxShadow (clojure.core/str "none"))
(def textAlign (clojure.core/str "left"))
(def
 rowBorder
 (clojure.core/str "1px" " " "solid" " " internalBorderColor))
(def cellVerticalPadding (clojure.core/str relativeMini))
(def cellHorizontalPadding (clojure.core/str relativeMini))
(def cellVerticalAlign (clojure.core/str "inherit"))
(def cellTextAlign (clojure.core/str "inherit"))
(def
 cellBorder
 (clojure.core/str "1px" " " "solid" " " internalBorderColor))
(def
 headerBorder
 (clojure.core/str "1px" " " "solid" " " internalBorderColor))
(def headerDivider (clojure.core/str "none"))
(def headerBackground (clojure.core/str offWhite))
(def headerAlign (clojure.core/str "inherit"))
(def headerVerticalAlign (clojure.core/str "inherit"))
(def headerColor (clojure.core/str textColor))
(def headerVerticalPadding (clojure.core/str relativeSmall))
(def headerHorizontalPadding (clojure.core/str cellHorizontalPadding))
(def headerFontStyle (clojure.core/str "none"))
(def headerFontWeight (clojure.core/str bold))
(def headerTextTransform (clojure.core/str "none"))
(def headerBoxShadow (clojure.core/str "none"))
(def footerBoxShadow (clojure.core/str "none"))
(def footerBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def footerDivider (clojure.core/str "none"))
(def footerBackground (clojure.core/str offWhite))
(def footerAlign (clojure.core/str "inherit"))
(def footerVerticalAlign (clojure.core/str "middle"))
(def footerColor (clojure.core/str textColor))
(def footerVerticalPadding (clojure.core/str cellVerticalPadding))
(def footerHorizontalPadding (clojure.core/str cellHorizontalPadding))
(def footerFontStyle (clojure.core/str normal))
(def footerFontWeight (clojure.core/str normal))
(def footerTextTransform (clojure.core/str "none"))
(def responsiveHeaderDisplay (clojure.core/str "block"))
(def responsiveFooterDisplay (clojure.core/str "block"))
(def responsiveRowVerticalPadding (clojure.core/str "1em"))
(def
 responsiveRowBoxShadow
 (clojure.core/str
  "0px"
  " "
  "-1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "rgba"
  " "
  "inset"))
(def responsiveCellVerticalPadding (clojure.core/str "0.25em"))
(def responsiveCellHorizontalPadding (clojure.core/str "0.75em"))
(def responsiveCellBoxShadow (clojure.core/str "none"))
(def responsiveCellHeaderFontWeight (clojure.core/str bold))
(def definitionPageBackground (clojure.core/str white))
(def definitionHeaderBackground (clojure.core/str "transparent"))
(def definitionHeaderColor (clojure.core/str unselectedTextColor))
(def definitionHeaderFontWeight (clojure.core/str normal))
(def
 definitionFooterBackground
 (clojure.core/str definitionHeaderBackground))
(def definitionFooterColor (clojure.core/str definitionHeaderColor))
(def
 definitionFooterFontWeight
 (clojure.core/str definitionHeaderFontWeight))
(def
 definitionColumnBackground
 (clojure.core/str subtleTransparentBlack))
(def definitionColumnFontWeight (clojure.core/str bold))
(def definitionColumnColor (clojure.core/str selectedTextColor))
(def definitionColumnFontSize (clojure.core/str relativeMedium))
(def definitionColumnTextTransform (clojure.core/str ""))
(def definitionColumnBoxShadow (clojure.core/str ""))
(def definitionColumnTextAlign (clojure.core/str ""))
(def definitionColumnHorizontalPadding (clojure.core/str ""))
(def iconVerticalAlign (clojure.core/str "baseline"))
(def stateMarkerWidth (clojure.core/str "0px"))
(def positiveColor (clojure.core/str positiveTextColor))
(def
 positiveBoxShadow
 (clojure.core/str
  stateMarkerWidth
  " "
  "0px"
  " "
  "0px"
  " "
  positiveBorderColor
  " "
  "inset"))
(def positiveBackgroundHover (clojure.core/str "darken"))
(def positiveColorHover (clojure.core/str "darken"))
(def negativeColor (clojure.core/str negativeTextColor))
(def
 negativeBoxShadow
 (clojure.core/str
  stateMarkerWidth
  " "
  "0px"
  " "
  "0px"
  " "
  negativeBorderColor
  " "
  "inset"))
(def negativeBackgroundHover (clojure.core/str "darken"))
(def negativeColorHover (clojure.core/str "darken"))
(def errorColor (clojure.core/str errorTextColor))
(def
 errorBoxShadow
 (clojure.core/str
  stateMarkerWidth
  " "
  "0px"
  " "
  "0px"
  " "
  errorBorderColor
  " "
  "inset"))
(def errorBackgroundHover (clojure.core/str "darken"))
(def errorColorHover (clojure.core/str "darken"))
(def warningColor (clojure.core/str warningTextColor))
(def
 warningBoxShadow
 (clojure.core/str
  stateMarkerWidth
  " "
  "0px"
  " "
  "0px"
  " "
  warningBorderColor
  " "
  "inset"))
(def warningBackgroundHover (clojure.core/str "darken"))
(def warningColorHover (clojure.core/str "darken"))
(def activeColor (clojure.core/str textColor))
(def activeBackgroundColor (clojure.core/str "#E0E0E0"))
(def
 activeBoxShadow
 (clojure.core/str
  stateMarkerWidth
  " "
  "0px"
  " "
  "0px"
  " "
  activeColor
  " "
  "inset"))
(def activeBackgroundHover (clojure.core/str "#EFEFEF"))
(def activeColorHover (clojure.core/str selectedTextColor))
(def attachedTopOffset (clojure.core/str "0px"))
(def attachedBottomOffset (clojure.core/str "0px"))
(def attachedHorizontalOffset nil)
(def attachedWidth nil)
(def attachedBoxShadow (clojure.core/str "none"))
(def
 attachedBorder
 (clojure.core/str borderWidth " " "solid" " " solidBorderColor))
(def attachedBottomBoxShadow (clojure.core/str attachedBoxShadow))
(def stripedBackground (clojure.core/str "rgba"))
(def invertedStripedBackground (clojure.core/str "rgba"))
(def selectableBackground (clojure.core/str transparentBlack))
(def selectableTextColor (clojure.core/str selectedTextColor))
(def selectableInvertedBackground (clojure.core/str transparentWhite))
(def
 selectableInvertedTextColor
 (clojure.core/str invertedSelectedTextColor))
(def sortableBackground (clojure.core/str ""))
(def sortableColor (clojure.core/str textColor))
(def
 sortableBorder
 (clojure.core/str "1px" " " "solid" " " borderColor))
(def sortableIconWidth (clojure.core/str "auto"))
(def sortableIconDistance (clojure.core/str "0.5em"))
(def sortableIconOpacity (clojure.core/str "0.80.8"))
(def sortableIconFont (clojure.core/str "Icons"))
(def sortableIconAscending (clojure.core/str "\\f0d8"))
(def sortableIconDescending (clojure.core/str "\\f0d7"))
(def sortableDisabledColor (clojure.core/str disabledTextColor))
(def sortableHoverBackground (clojure.core/str transparentBlack))
(def sortableHoverColor (clojure.core/str hoveredTextColor))
(def sortableActiveBackground (clojure.core/str transparentBlack))
(def sortableActiveColor (clojure.core/str selectedTextColor))
(def sortableActiveHoverBackground (clojure.core/str transparentBlack))
(def sortableActiveHoverColor (clojure.core/str selectedTextColor))
(def sortableInvertedBorderColor (clojure.core/str "transparent"))
(def
 sortableInvertedHoverBackground
 (clojure.core/str transparentWhite " " subtleGradient))
(def
 sortableInvertedHoverColor
 (clojure.core/str invertedHoveredTextColor))
(def
 sortableInvertedActiveBackground
 (clojure.core/str strongTransparentWhite " " subtleGradient))
(def
 sortableInvertedActiveColor
 (clojure.core/str invertedSelectedTextColor))
(def coloredBorderSize (clojure.core/str "0.2em"))
(def
 coloredBorderRadius
 (clojure.core/str "0em" " " "0em" " " borderRadius " " borderRadius))
(def invertedBackground (clojure.core/str "#333333"))
(def invertedBorder (clojure.core/str "none"))
(def invertedCellBorderColor (clojure.core/str whiteBorderColor))
(def invertedCellColor (clojure.core/str invertedTextColor))
(def
 invertedHeaderBackground
 (clojure.core/str veryStrongTransparentBlack))
(def invertedHeaderColor (clojure.core/str invertedTextColor))
(def
 invertedHeaderBorderColor
 (clojure.core/str invertedCellBorderColor))
(def
 invertedDefinitionColumnBackground
 (clojure.core/str subtleTransparentWhite))
(def
 invertedDefinitionColumnColor
 (clojure.core/str invertedSelectedTextColor))
(def invertedDefinitionColumnFontWeight (clojure.core/str bold))
(def basicTableBackground (clojure.core/str "transparent"))
(def
 basicTableBorder
 (clojure.core/str borderWidth " " "solid" " " borderColor))
(def basicBoxShadow (clojure.core/str "none"))
(def basicTableHeaderBackground (clojure.core/str "transparent"))
(def basicTableCellBackground (clojure.core/str "transparent"))
(def basicTableHeaderDivider (clojure.core/str "none"))
(def
 basicTableCellBorder
 (clojure.core/str "1px" " " "solid" " " "rgba"))
(def basicTableCellPadding (clojure.core/str ""))
(def basicTableStripedBackground (clojure.core/str transparentBlack))
(def paddedVerticalPadding (clojure.core/str "1em"))
(def paddedHorizontalPadding (clojure.core/str "1em"))
(def veryPaddedVerticalPadding (clojure.core/str "1.5em"))
(def veryPaddedHorizontalPadding (clojure.core/str "1.5em"))
(def compactVerticalPadding (clojure.core/str "0.5em"))
(def compactHorizontalPadding (clojure.core/str "0.7em"))
(def veryCompactVerticalPadding (clojure.core/str "0.4em"))
(def veryCompactHorizontalPadding (clojure.core/str "0.6em"))
(def small (clojure.core/str "0.9em"))
(def medium (clojure.core/str "1em"))
(def large (clojure.core/str "1.1em"))
(defstyles root)
