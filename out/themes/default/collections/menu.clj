(clojure.core/ns
 styles.themes.default.collections.menu
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def verticalMargin (clojure.core/str medium))
(def horizontalMargin (clojure.core/str "0em"))
(def margin (clojure.core/str verticalMargin " " horizontalMargin))
(def background (clojure.core/str "#FFFFFF"))
(def fontFamily (clojure.core/str pageFont))
(def itemBackground (clojure.core/str "none"))
(def fontWeight (clojure.core/str normal))
(def borderWidth (clojure.core/str "1px"))
(def border (clojure.core/str borderWidth " " "solid" " " borderColor))
(def boxShadow (clojure.core/str subtleShadow))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def itemVerticalPadding (clojure.core/str relativeSmall))
(def itemHorizontalPadding (clojure.core/str relativeLarge))
(def itemTextTransform (clojure.core/str "none"))
(def
 itemTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def itemFontWeight (clojure.core/str normal))
(def itemTextColor (clojure.core/str textColor))
(def dividerSize (clojure.core/str "1px"))
(def dividerBackground (clojure.core/str internalBorderColor))
(def subMenuDistance (clojure.core/str "0.5em"))
(def subMenuMargin nil)
(def subMenuFontSize (clojure.core/str relativeTiny))
(def subMenuTextColor (clojure.core/str "rgba"))
(def subMenuIndent (clojure.core/str "0em"))
(def subMenuVerticalPadding (clojure.core/str "0.5em"))
(def textLineHeight (clojure.core/str "1.31.3"))
(def iconFloat (clojure.core/str "none"))
(def
 iconMargin
 (clojure.core/str "0em" " " relative5px " " "0em" " " "0em"))
(def iconOpacity (clojure.core/str "0.90.9"))
(def dropdownIconFloat (clojure.core/str "right"))
(def dropdownIconDistance (clojure.core/str "1em"))
(def headerBackground (clojure.core/str ""))
(def headerWeight (clojure.core/str bold))
(def headerTextTransform (clojure.core/str normal))
(def verticalIconFloat (clojure.core/str "right"))
(def
 verticalIconMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0.5em"))
(def
 verticalHeaderMargin
 (clojure.core/str "0em" " " "0em" " " "0.5em"))
(def verticalHeaderFontSize (clojure.core/str relativeMedium))
(def verticalHeaderFontWeight (clojure.core/str bold))
(def arrowSize (clojure.core/str relative8px))
(def arrowBorderWidth (clojure.core/str "1px"))
(def
 arrowBorder
 (clojure.core/str arrowBorderWidth " " "solid" " " solidBorderColor))
(def
 arrowTransition
 (clojure.core/str "background" " " defaultDuration " " defaultEasing))
(def arrowZIndex (clojure.core/str "22"))
(def arrowHoverColor (clojure.core/str "#F2F2F2"))
(def arrowActiveColor (clojure.core/str arrowHoverColor))
(def arrowActiveHoverColor (clojure.core/str arrowActiveColor))
(def arrowVerticalHoverColor (clojure.core/str arrowHoverColor))
(def arrowVerticalActiveColor (clojure.core/str arrowActiveColor))
(def arrowVerticalSubMenuColor (clojure.core/str white))
(def buttonSize (clojure.core/str relativeMedium))
(def buttonOffset (clojure.core/str "0em"))
(def buttonMargin (clojure.core/str "-0.5em" " " "0em"))
(def buttonVerticalPadding (clojure.core/str relativeMini))
(def inputSize (clojure.core/str relativeMedium))
(def inputVerticalMargin (clojure.core/str "-0.5em"))
(def inputOffset (clojure.core/str "0em"))
(def inputVerticalPadding (clojure.core/str relative8px))
(def imageMargin (clojure.core/str "-0.3em" " " "0em"))
(def imageWidth (clojure.core/str "2.5em"))
(def verticalImageWidth (clojure.core/str "auto"))
(def labelOffset (clojure.core/str "-0.15em"))
(def labelBackground (clojure.core/str "#999999"))
(def labelTextColor (clojure.core/str white))
(def labelTextMargin (clojure.core/str "1em"))
(def labelVerticalPadding (clojure.core/str "0.3em"))
(def labelHorizontalPadding (clojure.core/str relativeMini))
(def labelAndIconFloat (clojure.core/str "none"))
(def
 labelAndIconMargin
 (clojure.core/str "0em" " " "0.5em" " " "0em" " " "0em"))
(def
 dropdownMenuBoxShadow
 (clojure.core/str "0px" " " "1px" " " "3px" " " "0px" " " "rgba"))
(def dropdownBackground (clojure.core/str "#FFFFFF"))
(def dropdownMenuDistance (clojure.core/str "0em"))
(def dropdownMenuBorderRadius (clojure.core/str borderRadius))
(def dropdownItemFontSize (clojure.core/str relativeMedium))
(def
 dropdownItemPadding
 (clojure.core/str relativeMini " " relativeLarge))
(def dropdownItemBackground (clojure.core/str "transparent"))
(def dropdownItemColor (clojure.core/str textColor))
(def dropdownItemTextTransform (clojure.core/str "none"))
(def dropdownItemFontWeight (clojure.core/str normal))
(def dropdownItemBoxShadow (clojure.core/str "none"))
(def dropdownItemTransition (clojure.core/str "none"))
(def dropdownItemIconFloat (clojure.core/str "none"))
(def dropdownItemIconFontSize (clojure.core/str relativeMedium))
(def
 dropdownItemIconMargin
 (clojure.core/str "0em" " " "0.75em" " " "0em" " " "0em"))
(def dropdownHoveredItemBackground (clojure.core/str transparentBlack))
(def dropdownHoveredItemColor (clojure.core/str selectedTextColor))
(def
 dropdownVerticalMenuBoxShadow
 (clojure.core/str "00" " " "1px" " " "3px" " " "0px" " " "rgba"))
(def secondaryDropdownMenuDistance (clojure.core/str relative5px))
(def pointingDropdownMenuDistance (clojure.core/str "0.75em"))
(def
 invertedSelectionDropdownColor
 (clojure.core/str invertedTextColor))
(def hoverItemBackground (clojure.core/str subtleTransparentBlack))
(def hoverItemTextColor (clojure.core/str selectedTextColor))
(def pressedItemBackground (clojure.core/str subtleTransparentBlack))
(def pressedItemTextColor (clojure.core/str hoverItemTextColor))
(def activeItemBackground (clojure.core/str transparentBlack))
(def activeItemTextColor (clojure.core/str selectedTextColor))
(def activeItemFontWeight (clojure.core/str normal))
(def activeIconOpacity (clojure.core/str "11"))
(def activeItemBoxShadow (clojure.core/str "none"))
(def activeHoverItemBackground (clojure.core/str transparentBlack))
(def activeHoverItemColor (clojure.core/str selectedTextColor))
(def dropdownSelectedItemBackground (clojure.core/str transparentBlack))
(def dropdownSelectedItemColor (clojure.core/str selectedTextColor))
(def
 dropdownActiveItemBackground
 (clojure.core/str subtleTransparentBlack))
(def dropdownActiveItemColor (clojure.core/str selectedTextColor))
(def dropdownActiveItemFontWeight (clojure.core/str bold))
(def subMenuActiveBackground (clojure.core/str "transparent"))
(def subMenuActiveTextColor (clojure.core/str activeItemTextColor))
(def subMenuActiveFontWeight (clojure.core/str bold))
(def verticalBoxShadow (clojure.core/str boxShadow))
(def verticalPointerWidth (clojure.core/str "2px"))
(def verticalBackground (clojure.core/str "#FFFFFF"))
(def verticalItemBackground (clojure.core/str "none"))
(def verticalDividerBackground (clojure.core/str dividerBackground))
(def verticalActiveBoxShadow (clojure.core/str "none"))
(def secondaryBackground (clojure.core/str "none"))
(def secondaryMargin nil)
(def secondaryItemBackground (clojure.core/str "none"))
(def secondaryItemSpacing (clojure.core/str relative5px))
(def
 secondaryItemMargin
 (clojure.core/str "0em" " " secondaryItemSpacing))
(def secondaryItemVerticalPadding (clojure.core/str relativeMini))
(def secondaryItemHorizontalPadding (clojure.core/str relativeSmall))
(def
 secondaryItemPadding
 (clojure.core/str relativeMini " " relativeSmall))
(def secondaryItemBorderRadius (clojure.core/str defaultBorderRadius))
(def
 secondaryItemTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def secondaryItemColor (clojure.core/str unselectedTextColor))
(def secondaryHoverItemBackground (clojure.core/str transparentBlack))
(def secondaryHoverItemColor (clojure.core/str selectedTextColor))
(def secondaryActiveItemBackground (clojure.core/str transparentBlack))
(def secondaryActiveItemColor (clojure.core/str selectedTextColor))
(def
 secondaryActiveHoverItemBackground
 (clojure.core/str transparentBlack))
(def secondaryActiveHoverItemColor (clojure.core/str selectedTextColor))
(def
 secondaryActiveHoveredItemBackground
 (clojure.core/str transparentBlack))
(def
 secondaryActiveHoveredItemColor
 (clojure.core/str selectedTextColor))
(def
 secondaryHeaderBackground
 (clojure.core/str "none" " " "transparent"))
(def secondaryHeaderBorder (clojure.core/str "none"))
(def
 secondaryItemVerticalSpacing
 (clojure.core/str secondaryItemSpacing))
(def
 secondaryVerticalItemMargin
 (clojure.core/str "0em" " " "0em" " " secondaryItemVerticalSpacing))
(def
 secondaryVerticalItemBorderRadius
 (clojure.core/str defaultBorderRadius))
(def secondaryMenuSubMenuMargin nil)
(def secondaryMenuSubMenuItemMargin (clojure.core/str "0em"))
(def
 secondaryMenuSubMenuItemPadding
 (clojure.core/str relative7px " " secondarySubMenuHorizontalPadding))
(def secondaryPointingBorderWidth (clojure.core/str "2px"))
(def secondaryPointingBorderColor (clojure.core/str borderColor))
(def
 secondaryPointingItemVerticalPadding
 (clojure.core/str relativeTiny))
(def
 secondaryPointingItemHorizontalPadding
 (clojure.core/str relativeLarge))
(def secondaryPointingHoverTextColor (clojure.core/str textColor))
(def secondaryPointingActiveBorderColor (clojure.core/str black))
(def
 secondaryPointingActiveTextColor
 (clojure.core/str selectedTextColor))
(def secondaryPointingActiveFontWeight (clojure.core/str bold))
(def
 secondaryPointingActiveDropdownBorderColor
 (clojure.core/str "transparent"))
(def
 secondaryPointingActiveHoverBorderColor
 (clojure.core/str secondaryPointingActiveBorderColor))
(def
 secondaryPointingActiveHoverTextColor
 (clojure.core/str secondaryPointingActiveTextColor))
(def secondaryPointingHeaderColor (clojure.core/str darkTextColor))
(def secondaryVerticalPointingItemMargin nil)
(def secondaryInvertedColor (clojure.core/str invertedLightTextColor))
(def
 secondaryInvertedHoverBackground
 (clojure.core/str transparentWhite))
(def
 secondaryInvertedHoverColor
 (clojure.core/str invertedSelectedTextColor))
(def
 secondaryInvertedActiveBackground
 (clojure.core/str strongTransparentWhite))
(def
 secondaryInvertedActiveColor
 (clojure.core/str invertedSelectedTextColor))
(def
 secondaryPointingInvertedBorderColor
 (clojure.core/str whiteBorderColor))
(def
 secondaryPointingInvertedItemTextColor
 (clojure.core/str invertedTextColor))
(def secondaryPointingInvertedItemHeaderColor (clojure.core/str white))
(def
 secondaryPointingInvertedItemHoverTextColor
 (clojure.core/str selectedTextColor))
(def
 secondaryPointingInvertedActiveBorderColor
 (clojure.core/str white))
(def
 secondaryPointingInvertedActiveColor
 (clojure.core/str invertedSelectedTextColor))
(def tieredActiveItemBackground (clojure.core/str "#FCFCFC"))
(def tieredActiveMenuBackground (clojure.core/str "#FCFCFC"))
(def tieredSubMenuTextTransform (clojure.core/str normal))
(def tieredSubMenuFontWeight (clojure.core/str normal))
(def tieredSubMenuColor (clojure.core/str lightTextColor))
(def
 tieredSubMenuHoverBackground
 (clojure.core/str "none" " " "transparent"))
(def tieredSubMenuHoverColor (clojure.core/str hoveredTextColor))
(def
 tieredSubMenuActiveBackground
 (clojure.core/str "none" " " "transparent"))
(def tieredSubMenuActiveColor (clojure.core/str selectedTextColor))
(def tieredInvertedSubMenuBackground (clojure.core/str "rgba"))
(def iconMenuTextAlign (clojure.core/str "center"))
(def iconMenuItemColor (clojure.core/str black))
(def iconMenuInvertedItemColor (clojure.core/str white))
(def tabularBorderColor (clojure.core/str solidBorderColor))
(def tabularBackgroundColor (clojure.core/str "transparent"))
(def
 tabularBackground
 (clojure.core/str "none" " " tabularBackgroundColor))
(def tabularBorderWidth (clojure.core/str "1px"))
(def tabularOppositeBorderWidth nil)
(def tabularVerticalPadding (clojure.core/str itemVerticalPadding))
(def tabularHorizontalPadding (clojure.core/str relativeHuge))
(def tabularBorderRadius (clojure.core/str defaultBorderRadius))
(def tabularTextColor (clojure.core/str itemTextColor))
(def tabularHoveredTextColor (clojure.core/str hoveredTextColor))
(def
 tabularVerticalBackground
 (clojure.core/str "none" " " tabularBackgroundColor))
(def tabularFluidOffset (clojure.core/str "1px"))
(def tabularActiveBackground (clojure.core/str "none" " " white))
(def tabularActiveColor (clojure.core/str selectedTextColor))
(def tabularActiveBoxShadow (clojure.core/str "none"))
(def tabularActiveWeight (clojure.core/str bold))
(def paginationMinWidth (clojure.core/str "3em"))
(def paginationActiveBackground (clojure.core/str transparentBlack))
(def paginationActiveTextColor (clojure.core/str selectedTextColor))
(def
 labeledIconItemHorizontalPadding
 (clojure.core/str relativeMassive))
(def labeledIconSize (clojure.core/str relativeMassive))
(def labeledIconMinWidth (clojure.core/str "6em"))
(def labeledIconTextMargin (clojure.core/str "0.50.5" " " "rem"))
(def textMenuItemSpacing (clojure.core/str relative7px))
(def textMenuMargin nil)
(def textMenuItemColor (clojure.core/str mutedTextColor))
(def textMenuItemFontWeight (clojure.core/str normal))
(def textMenuItemMargin (clojure.core/str "0em" " " "0em"))
(def
 textMenuItemPadding
 (clojure.core/str relative5px " " textMenuItemSpacing))
(def
 textMenuItemTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def textMenuSubMenuMargin (clojure.core/str "0em"))
(def textMenuSubMenuItemMargin (clojure.core/str "0em"))
(def
 textMenuSubMenuItemPadding
 (clojure.core/str relative7px " " "0em"))
(def textMenuActiveItemFontWeight (clojure.core/str normal))
(def textMenuActiveItemColor (clojure.core/str selectedTextColor))
(def textMenuHeaderSize (clojure.core/str relativeSmall))
(def textMenuHeaderColor (clojure.core/str darkTextColor))
(def textMenuHeaderFontWeight (clojure.core/str bold))
(def textMenuHeaderTextTransform (clojure.core/str "uppercase"))
(def textVerticalMenuMargin (clojure.core/str relativeMedium " " "0em"))
(def
 textVerticalMenuHeaderMargin
 (clojure.core/str relative8px " " "0em" " " relative10px))
(def
 textVerticalMenuItemMargin
 (clojure.core/str relative8px " " "0em"))
(def textVerticalMenuIconFloat (clojure.core/str "none"))
(def textVerticalMenuIconMargin (clojure.core/str iconMargin))
(def invertedBackground (clojure.core/str black))
(def invertedBoxShadow (clojure.core/str "none"))
(def
 invertedBorder
 (clojure.core/str "0px" " " "solid" " " "transparent"))
(def invertedHeaderBackground (clojure.core/str "transparent"))
(def invertedItemBackground (clojure.core/str "transparent"))
(def invertedItemTextColor (clojure.core/str invertedTextColor))
(def invertedSubMenuBackground (clojure.core/str "transparent"))
(def
 invertedSubMenuColor
 (clojure.core/str invertedUnselectedTextColor))
(def invertedHoverBackground (clojure.core/str transparentWhite))
(def invertedHoverColor (clojure.core/str invertedSelectedTextColor))
(def invertedSubMenuHoverBackground (clojure.core/str "transparent"))
(def
 invertedSubMenuHoverColor
 (clojure.core/str invertedSelectedTextColor))
(def invertedMenuPressedBackground (clojure.core/str transparentWhite))
(def
 invertedMenuPressedColor
 (clojure.core/str invertedSelectedTextColor))
(def invertedActiveBackground (clojure.core/str strongTransparentWhite))
(def invertedActiveColor (clojure.core/str invertedSelectedTextColor))
(def invertedArrowActiveColor (clojure.core/str "#3D3E3F"))
(def
 invertedActiveHoverBackground
 (clojure.core/str invertedActiveBackground))
(def invertedActiveHoverColor (clojure.core/str white))
(def
 invertedArrowActiveHoverColor
 (clojure.core/str invertedArrowActiveColor))
(def invertedSubMenuActiveBackground (clojure.core/str "transparent"))
(def invertedSubMenuActiveColor (clojure.core/str white))
(def invertedDividerBackground (clojure.core/str "rgba"))
(def
 invertedVerticalDividerBackground
 (clojure.core/str invertedDividerBackground))
(def
 invertedColoredDividerBackground
 (clojure.core/str dividerBackground))
(def
 invertedColoredActiveBackground
 (clojure.core/str strongTransparentBlack))
(def fixedPrecedingGridMargin (clojure.core/str "2.752.75" " " "rem"))
(def floatedDistance (clojure.core/str "0.50.5" " " "rem"))
(def attachedTopOffset (clojure.core/str "0px"))
(def attachedBottomOffset (clojure.core/str "0px"))
(def attachedHorizontalOffset nil)
(def attachedWidth nil)
(def attachedBoxShadow (clojure.core/str "none"))
(def
 attachedBorder
 (clojure.core/str borderWidth " " "solid" " " solidBorderColor))
(def attachedBottomBoxShadow (clojure.core/str attachedBoxShadow))
(def mini nil)
(def tiny nil)
(def small nil)
(def large nil)
(def big nil)
(def huge nil)
(def massive nil)
(def miniWidth (clojure.core/str "99" " " "rem"))
(def tinyWidth (clojure.core/str "1111" " " "rem"))
(def smallWidth (clojure.core/str "1313" " " "rem"))
(def mediumWidth (clojure.core/str "1515" " " "rem"))
(def largeWidth (clojure.core/str "1818" " " "rem"))
(def bigWidth (clojure.core/str "2020" " " "rem"))
(def hugeWidth (clojure.core/str "2222" " " "rem"))
(def massiveWidth (clojure.core/str "2525" " " "rem"))
(defstyles root)
