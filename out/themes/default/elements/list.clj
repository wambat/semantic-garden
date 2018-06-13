(clojure.core/ns
 themes.default.elements.list
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def listStyleType "(:identifier none)")
(def listStylePosition "(:identifier outside)")
(def margin "(:measurement 0 em)")
(def verticalPadding "(:measurement 0 em)")
(def horizontalPadding "(:measurement 0 em)")
(def itemVerticalPadding "(:variableName @ relative3px)")
(def itemHorizontalPadding "(:measurement 0 em)")
(def itemPadding "(:variableName @ itemHorizontalPadding)")
(def itemLineHeight "(:variableName @ relativeLarge)")
(def childListPadding "(:measurement 0.5 em)")
(def childListIndent "(:measurement 1 em)")
(def childItemVerticalPadding "(:variableName @ relative2px)")
(def childItemHorizontalPadding "(:measurement 0 em)")
(def childItemPadding "(:variableName @ childItemHorizontalPadding)")
(def childItemLineHeight "(:identifier inherit)")
(def iconDistance "(:variableName @ relative4px)")
(def iconOffset "(:measurement 0 em)")
(def iconTransition "(:variableName @ defaultEasing)")
(def iconVerticalAlign "(:identifier top)")
(def iconContentVerticalAlign "(:identifier top)")
(def imageDistance "(:measurement 0.5 em)")
(def imageAlign "(:identifier top)")
(def contentDistance "(:measurement 0.5 em)")
(def contentLineHeight "(:variableName @ itemLineHeight)")
(def contentVerticalAlign "(:identifier top)")
(def itemHeaderFontFamily "(:variableName @ headerFont)")
(def itemHeaderFontWeight "(:variableName @ bold)")
(def itemHeaderColor "(:variableName @ textColor)")
(def itemDescriptionColor ")")
(def itemLinkColor "(:variableName @ linkColor)")
(def itemLinkHoverColor "(:variableName @ linkHoverColor)")
(def itemHeaderLinkColor "(:variableName @ itemLinkColor)")
(def itemHeaderLinkHoverColor "(:variableName @ itemLinkHoverColor)")
(def itemLinkIconColor "(:variableName @ lightTextColor)")
(def itemLinkIconHoverColor "(:variableName @ textColor)")
(def invertedIconLinkColor "(:variableName @ invertedLightTextColor)")
(def disabledColor "(:variableName @ disabledTextColor)")
(def
 invertedDisabledColor
 "(:variableName @ invertedDisabledTextColor)")
(def floatDistance "(:measurement 1 em)")
(def leftFloatMargin "(:measurement 0 em)")
(def rightFloatMargin "(:variableName @ floatDistance)")
(def horizontalSpacing "(:measurement 1 em)")
(def horizontalIconDistance "(:measurement 0.25 em)")
(def horizontalVerticalAlign "(:identifier middle)")
(def invertedListIconColor "(:variableName @ invertedLightTextColor)")
(def invertedHeaderColor "(:variableName @ invertedTextColor)")
(def
 invertedDescriptionColor
 "(:variableName @ invertedLightTextColor)")
(def invertedItemLinkColor "(:variableName @ invertedTextColor)")
(def invertedItemLinkHoverColor "(:variableName @ linkHoverColor)")
(def linkListItemColor "(:variableName @ unselectedTextColor)")
(def linkListItemHoverColor "(:variableName @ hoveredTextColor)")
(def linkListItemDownColor "(:variableName @ pressedTextColor)")
(def linkListItemActiveColor "(:variableName @ selectedTextColor)")
(def linkListTransition "(:variableName @ defaultEasing)")
(def
 invertedLinkListItemColor
 "(:variableName @ invertedUnselectedTextColor)")
(def
 invertedLinkListItemHoverColor
 "(:variableName @ invertedHoveredTextColor)")
(def
 invertedLinkListItemDownColor
 "(:variableName @ invertedPressedTextColor)")
(def
 invertedLinkListItemActiveColor
 "(:variableName @ invertedSelectedTextColor)")
(def selectionListItemMargin "(:measurement 0 em)")
(def selectionListItemBorderRadius "(:measurement 0.5 em)")
(def selectionListItemVerticalPadding "(:measurement 0.5 em)")
(def selectionListItemHorizontalPadding "(:measurement 0.5 em)")
(def selectionListTransition "(:variableName @ defaultEasing)")
(def selectionListBackground "(:identifier transparent)")
(def selectionListColor "(:variableName @ unselectedTextColor)")
(def
 selectionListHoverBackground
 "(:variableName @ subtleTransparentBlack)")
(def selectionListHoverColor "(:variableName @ hoveredTextColor)")
(def selectionListDownBackground "(:variableName @ transparentBlack)")
(def selectionListDownColor "(:variableName @ pressedTextColor)")
(def selectionListActiveBackground "(:variableName @ transparentBlack)")
(def selectionListActiveColor "(:variableName @ selectedTextColor)")
(def invertedSelectionListBackground "(:identifier transparent)")
(def
 invertedSelectionListColor
 "(:variableName @ invertedUnselectedTextColor)")
(def
 invertedSelectionListHoverBackground
 "(:variableName @ subtleTransparentWhite)")
(def
 invertedSelectionListHoverColor
 "(:variableName @ invertedHoveredTextColor)")
(def
 invertedSelectionListDownBackground
 "(:variableName @ transparentWhite)")
(def
 invertedSelectionListDownColor
 "(:variableName @ invertedPressedTextColor)")
(def
 invertedSelectionListActiveBackground
 "(:variableName @ transparentWhite)")
(def
 invertedSelectionListActiveColor
 "(:variableName @ invertedSelectedTextColor)")
(def animatedDuration "(:measurement 0.25 s)")
(def animatedDelay "(:measurement 0.1 s)")
(def animatedListTransition "(:variableName @ animatedDelay)")
(def animatedListIndent "(:measurement 1 em)")
(def bulletDistance "(:identifier rem)")
(def bulletOffset "(:variableName @ bulletDistance)")
(def bulletOpacity "(:measurement 1)")
(def bulletCharacter "•")
(def bulletColor "(:identifier inherit)")
(def bulletLinkColor "(:variableName @ textColor)")
(def bulletVerticalAlign "(:identifier top)")
(def bulletChildDistance "(:variableName @ bulletDistance)")
(def horizontalBulletColor "(:variableName @ textColor)")
(def horizontalBulletSpacing "")
(def orderedCountName "(:identifier ordered)")
(def orderedCountContent " ")
(def orderedCountColor "(:variableName @ textColor)")
(def orderedCountDistance "(:identifier rem)")
(def orderedCountOpacity "(:measurement 0.8)")
(def orderedCountTextAlign "(:identifier right)")
(def orderedCountVerticalAlign "(:identifier middle)")
(def orderedChildCountDistance "(:measurement 1 em)")
(def orderedChildCountOffset "(:measurement -2 em)")
(def
 orderedInvertedCountColor
 "(:variableName @ invertedLightTextColor)")
(def horizontalOrderedCountDistance "(:measurement 0.5 em)")
(def dividedBorderWidth "(:measurement 1 px)")
(def dividedBorder "(:variableName @ borderColor)")
(def dividedInvertedBorderColor "(:variableName @ whiteBorderColor)")
(def dividedChildListBorder "(:identifier none)")
(def dividedChildItemBorder "(:identifier none)")
(def horizontalDividedSpacing "")
(def horizontalDividedLineHeight "(:measurement 0.6)")
(def celledBorderWidth "(:measurement 1 px)")
(def celledBorder "(:variableName @ borderColor)")
(def celledInvertedBorder "(:variableName @ whiteBorderColor)")
(def celledHorizontalPadding "(:measurement 0.5 em)")
(def celledChildListBorder "(:identifier none)")
(def celledChildItemBorder "(:identifier none)")
(def horizontalCelledSpacing "")
(def horizontalCelledLineHeight "(:measurement 0.6)")
(def relaxedItemVerticalPadding "(:variableName @ relative6px)")
(def relaxedChildItemVerticalPadding "(:variableName @ relative3px)")
(def relaxedHeaderMargin "(:identifier rem)")
(def relaxedHorizontalPadding "(:identifier rem)")
(def veryRelaxedItemVerticalPadding "(:variableName @ relative12px)")
(def
 veryRelaxedChildItemVerticalPadding
 "(:variableName @ relative4px)")
(def veryRelaxedHeaderMargin "(:identifier rem)")
(def veryRelaxedHorizontalPadding "(:identifier rem)")
(defstyles root)
