(clojure.core/ns
 themes.default.elements.list
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def listStyleType (clojure.core/str "none"))
(def listStylePosition (clojure.core/str "outside"))
(def margin (clojure.core/str "1em" " " "0em"))
(def verticalPadding (clojure.core/str "0em"))
(def horizontalPadding (clojure.core/str "0em"))
(def itemVerticalPadding (clojure.core/str relative3px))
(def itemHorizontalPadding (clojure.core/str "0em"))
(def
 itemPadding
 (clojure.core/str itemVerticalPadding " " itemHorizontalPadding))
(def itemLineHeight (clojure.core/str relativeLarge))
(def
 childListPadding
 (clojure.core/str "0.75em" " " "0em" " " "0.25em" " " "0.5em"))
(def childListIndent (clojure.core/str "1em"))
(def childItemVerticalPadding (clojure.core/str relative2px))
(def childItemHorizontalPadding (clojure.core/str "0em"))
(def
 childItemPadding
 (clojure.core/str
  childItemVerticalPadding
  " "
  childItemHorizontalPadding))
(def childItemLineHeight (clojure.core/str "inherit"))
(def iconDistance (clojure.core/str relative4px))
(def iconOffset (clojure.core/str "0em"))
(def
 iconTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def iconVerticalAlign (clojure.core/str "top"))
(def iconContentVerticalAlign (clojure.core/str "top"))
(def imageDistance (clojure.core/str "0.5em"))
(def imageAlign (clojure.core/str "top"))
(def contentDistance (clojure.core/str "0.5em"))
(def contentLineHeight (clojure.core/str itemLineHeight))
(def contentVerticalAlign (clojure.core/str "top"))
(def itemHeaderFontFamily (clojure.core/str headerFont))
(def itemHeaderFontWeight (clojure.core/str bold))
(def itemHeaderColor (clojure.core/str textColor))
(def itemDescriptionColor (clojure.core/str "rgba"))
(def itemLinkColor (clojure.core/str linkColor))
(def itemLinkHoverColor (clojure.core/str linkHoverColor))
(def itemHeaderLinkColor (clojure.core/str itemLinkColor))
(def itemHeaderLinkHoverColor (clojure.core/str itemLinkHoverColor))
(def itemLinkIconColor (clojure.core/str lightTextColor))
(def itemLinkIconHoverColor (clojure.core/str textColor))
(def invertedIconLinkColor (clojure.core/str invertedLightTextColor))
(def disabledColor (clojure.core/str disabledTextColor))
(def invertedDisabledColor (clojure.core/str invertedDisabledTextColor))
(def floatDistance (clojure.core/str "1em"))
(def
 leftFloatMargin
 (clojure.core/str "0em" " " floatDistance " " "0em" " " "0em"))
(def
 rightFloatMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " floatDistance))
(def horizontalSpacing (clojure.core/str "1em"))
(def horizontalIconDistance (clojure.core/str "0.25em"))
(def horizontalVerticalAlign (clojure.core/str "middle"))
(def invertedListIconColor (clojure.core/str invertedLightTextColor))
(def invertedHeaderColor (clojure.core/str invertedTextColor))
(def invertedDescriptionColor (clojure.core/str invertedLightTextColor))
(def invertedItemLinkColor (clojure.core/str invertedTextColor))
(def invertedItemLinkHoverColor (clojure.core/str linkHoverColor))
(def linkListItemColor (clojure.core/str unselectedTextColor))
(def linkListItemHoverColor (clojure.core/str hoveredTextColor))
(def linkListItemDownColor (clojure.core/str pressedTextColor))
(def linkListItemActiveColor (clojure.core/str selectedTextColor))
(def
 linkListTransition
 (clojure.core/str defaultDuration " " "color" " " defaultEasing))
(def
 invertedLinkListItemColor
 (clojure.core/str invertedUnselectedTextColor))
(def
 invertedLinkListItemHoverColor
 (clojure.core/str invertedHoveredTextColor))
(def
 invertedLinkListItemDownColor
 (clojure.core/str invertedPressedTextColor))
(def
 invertedLinkListItemActiveColor
 (clojure.core/str invertedSelectedTextColor))
(def selectionListItemMargin (clojure.core/str "0em"))
(def selectionListItemBorderRadius (clojure.core/str "0.5em"))
(def selectionListItemVerticalPadding (clojure.core/str "0.5em"))
(def selectionListItemHorizontalPadding (clojure.core/str "0.5em"))
(def
 selectionListTransition
 (clojure.core/str
  defaultDuration
  " "
  "background-color"
  " "
  defaultEasing))
(def selectionListBackground (clojure.core/str "transparent"))
(def selectionListColor (clojure.core/str unselectedTextColor))
(def
 selectionListHoverBackground
 (clojure.core/str subtleTransparentBlack))
(def selectionListHoverColor (clojure.core/str hoveredTextColor))
(def selectionListDownBackground (clojure.core/str transparentBlack))
(def selectionListDownColor (clojure.core/str pressedTextColor))
(def selectionListActiveBackground (clojure.core/str transparentBlack))
(def selectionListActiveColor (clojure.core/str selectedTextColor))
(def invertedSelectionListBackground (clojure.core/str "transparent"))
(def
 invertedSelectionListColor
 (clojure.core/str invertedUnselectedTextColor))
(def
 invertedSelectionListHoverBackground
 (clojure.core/str subtleTransparentWhite))
(def
 invertedSelectionListHoverColor
 (clojure.core/str invertedHoveredTextColor))
(def
 invertedSelectionListDownBackground
 (clojure.core/str transparentWhite))
(def
 invertedSelectionListDownColor
 (clojure.core/str invertedPressedTextColor))
(def
 invertedSelectionListActiveBackground
 (clojure.core/str transparentWhite))
(def
 invertedSelectionListActiveColor
 (clojure.core/str invertedSelectedTextColor))
(def animatedDuration (clojure.core/str "0.25s"))
(def animatedDelay (clojure.core/str "0.1s"))
(def
 animatedListTransition
 (clojure.core/str
  animatedDuration
  " "
  "background-color"
  " "
  defaultEasing
  " "
  animatedDelay))
(def animatedListIndent (clojure.core/str "1em"))
(def bulletDistance (clojure.core/str "1.251.25" " " "rem"))
(def bulletOffset nil)
(def bulletOpacity (clojure.core/str "11"))
(def bulletCharacter (clojure.core/str "•"))
(def bulletColor (clojure.core/str "inherit"))
(def bulletLinkColor (clojure.core/str textColor))
(def bulletVerticalAlign (clojure.core/str "top"))
(def bulletChildDistance (clojure.core/str bulletDistance))
(def horizontalBulletColor (clojure.core/str textColor))
(def horizontalBulletSpacing nil)
(def orderedCountName (clojure.core/str "ordered"))
(def orderedCountContent (clojure.core/str "counters" " " " "))
(def orderedCountColor (clojure.core/str textColor))
(def orderedCountDistance (clojure.core/str "1.251.25" " " "rem"))
(def orderedCountOpacity (clojure.core/str "0.80.8"))
(def orderedCountTextAlign (clojure.core/str "right"))
(def orderedCountVerticalAlign (clojure.core/str "middle"))
(def orderedChildCountDistance (clojure.core/str "1em"))
(def orderedChildCountOffset (clojure.core/str "-2em"))
(def
 orderedInvertedCountColor
 (clojure.core/str invertedLightTextColor))
(def horizontalOrderedCountDistance (clojure.core/str "0.5em"))
(def dividedBorderWidth (clojure.core/str "1px"))
(def
 dividedBorder
 (clojure.core/str dividedBorderWidth " " "solid" " " borderColor))
(def dividedInvertedBorderColor (clojure.core/str whiteBorderColor))
(def dividedChildListBorder (clojure.core/str "none"))
(def dividedChildItemBorder (clojure.core/str "none"))
(def horizontalDividedSpacing nil)
(def horizontalDividedLineHeight (clojure.core/str "0.60.6"))
(def celledBorderWidth (clojure.core/str "1px"))
(def
 celledBorder
 (clojure.core/str celledBorderWidth " " "solid" " " borderColor))
(def
 celledInvertedBorder
 (clojure.core/str dividedBorderWidth " " "solid" " " whiteBorderColor))
(def celledHorizontalPadding (clojure.core/str "0.5em"))
(def celledChildListBorder (clojure.core/str "none"))
(def celledChildItemBorder (clojure.core/str "none"))
(def horizontalCelledSpacing nil)
(def horizontalCelledLineHeight (clojure.core/str "0.60.6"))
(def relaxedItemVerticalPadding (clojure.core/str relative6px))
(def relaxedChildItemVerticalPadding (clojure.core/str relative3px))
(def relaxedHeaderMargin (clojure.core/str "0.250.25" " " "rem"))
(def relaxedHorizontalPadding (clojure.core/str "11" " " "rem"))
(def veryRelaxedItemVerticalPadding (clojure.core/str relative12px))
(def veryRelaxedChildItemVerticalPadding (clojure.core/str relative4px))
(def veryRelaxedHeaderMargin (clojure.core/str "0.50.5" " " "rem"))
(def veryRelaxedHorizontalPadding (clojure.core/str "1.51.5" " " "rem"))
(defstyles root)
