(clojure.core/ns
 themes.default.collections.menu
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def verticalMargin "(:variableName @ medium)")
(def horizontalMargin "(:measurement 0 em)")
(def margin "(:variableName @ horizontalMargin)")
(def background "#FFFFFF")
(def fontFamily "(:variableName @ pageFont)")
(def itemBackground "(:identifier none)")
(def fontWeight "(:variableName @ normal)")
(def borderWidth "(:measurement 1 px)")
(def border "(:variableName @ borderColor)")
(def boxShadow "(:variableName @ subtleShadow)")
(def borderRadius "(:variableName @ defaultBorderRadius)")
(def itemVerticalPadding "(:variableName @ relativeSmall)")
(def itemHorizontalPadding "(:variableName @ relativeLarge)")
(def itemTextTransform "(:identifier none)")
(def itemTransition "(:variableName @ defaultEasing)")
(def itemFontWeight "(:variableName @ normal)")
(def itemTextColor "(:variableName @ textColor)")
(def dividerSize "(:measurement 1 px)")
(def dividerBackground "(:variableName @ internalBorderColor)")
(def subMenuDistance "(:measurement 0.5 em)")
(def subMenuMargin "")
(def subMenuFontSize "(:variableName @ relativeTiny)")
(def subMenuTextColor ")")
(def subMenuIndent "(:measurement 0 em)")
(def subMenuVerticalPadding "(:measurement 0.5 em)")
(def textLineHeight "(:measurement 1.3)")
(def iconFloat "(:identifier none)")
(def iconMargin "(:measurement 0 em)")
(def iconOpacity "(:measurement 0.9)")
(def dropdownIconFloat "(:identifier right)")
(def dropdownIconDistance "(:measurement 1 em)")
(def headerBackground "")
(def headerWeight "(:variableName @ bold)")
(def headerTextTransform "(:variableName @ normal)")
(def verticalIconFloat "(:identifier right)")
(def verticalIconMargin "(:measurement 0.5 em)")
(def verticalHeaderMargin "(:measurement 0.5 em)")
(def verticalHeaderFontSize "(:variableName @ relativeMedium)")
(def verticalHeaderFontWeight "(:variableName @ bold)")
(def arrowSize "(:variableName @ relative8px)")
(def arrowBorderWidth "(:measurement 1 px)")
(def arrowBorder "(:variableName @ solidBorderColor)")
(def arrowTransition "(:variableName @ defaultEasing)")
(def arrowZIndex "(:measurement 2)")
(def arrowHoverColor "#F2F2F2")
(def arrowActiveColor "(:variableName @ arrowHoverColor)")
(def arrowActiveHoverColor "(:variableName @ arrowActiveColor)")
(def arrowVerticalHoverColor "(:variableName @ arrowHoverColor)")
(def arrowVerticalActiveColor "(:variableName @ arrowActiveColor)")
(def arrowVerticalSubMenuColor "(:variableName @ white)")
(def buttonSize "(:variableName @ relativeMedium)")
(def buttonOffset "(:measurement 0 em)")
(def buttonMargin "(:measurement 0 em)")
(def buttonVerticalPadding "(:variableName @ relativeMini)")
(def inputSize "(:variableName @ relativeMedium)")
(def inputVerticalMargin "(:measurement -0.5 em)")
(def inputOffset "(:measurement 0 em)")
(def inputVerticalPadding "(:variableName @ relative8px)")
(def imageMargin "(:measurement 0 em)")
(def imageWidth "(:measurement 2.5 em)")
(def verticalImageWidth "(:identifier auto)")
(def labelOffset "(:measurement -0.15 em)")
(def labelBackground "#999999")
(def labelTextColor "(:variableName @ white)")
(def labelTextMargin "(:measurement 1 em)")
(def labelVerticalPadding "(:measurement 0.3 em)")
(def labelHorizontalPadding "(:variableName @ relativeMini)")
(def labelAndIconFloat "(:identifier none)")
(def labelAndIconMargin "(:measurement 0 em)")
(def dropdownMenuBoxShadow ")")
(def dropdownBackground "#FFFFFF")
(def dropdownMenuDistance "(:measurement 0 em)")
(def dropdownMenuBorderRadius "(:variableName @ borderRadius)")
(def dropdownItemFontSize "(:variableName @ relativeMedium)")
(def dropdownItemPadding "(:variableName @ relativeLarge)")
(def dropdownItemBackground "(:identifier transparent)")
(def dropdownItemColor "(:variableName @ textColor)")
(def dropdownItemTextTransform "(:identifier none)")
(def dropdownItemFontWeight "(:variableName @ normal)")
(def dropdownItemBoxShadow "(:identifier none)")
(def dropdownItemTransition "(:identifier none)")
(def dropdownItemIconFloat "(:identifier none)")
(def dropdownItemIconFontSize "(:variableName @ relativeMedium)")
(def dropdownItemIconMargin "(:measurement 0 em)")
(def dropdownHoveredItemBackground "(:variableName @ transparentBlack)")
(def dropdownHoveredItemColor "(:variableName @ selectedTextColor)")
(def dropdownVerticalMenuBoxShadow ")")
(def secondaryDropdownMenuDistance "(:variableName @ relative5px)")
(def pointingDropdownMenuDistance "(:measurement 0.75 em)")
(def
 invertedSelectionDropdownColor
 "(:variableName @ invertedTextColor)")
(def hoverItemBackground "(:variableName @ subtleTransparentBlack)")
(def hoverItemTextColor "(:variableName @ selectedTextColor)")
(def pressedItemBackground "(:variableName @ subtleTransparentBlack)")
(def pressedItemTextColor "(:variableName @ hoverItemTextColor)")
(def activeItemBackground "(:variableName @ transparentBlack)")
(def activeItemTextColor "(:variableName @ selectedTextColor)")
(def activeItemFontWeight "(:variableName @ normal)")
(def activeIconOpacity "(:measurement 1)")
(def activeItemBoxShadow "(:identifier none)")
(def activeHoverItemBackground "(:variableName @ transparentBlack)")
(def activeHoverItemColor "(:variableName @ selectedTextColor)")
(def
 dropdownSelectedItemBackground
 "(:variableName @ transparentBlack)")
(def dropdownSelectedItemColor "(:variableName @ selectedTextColor)")
(def
 dropdownActiveItemBackground
 "(:variableName @ subtleTransparentBlack)")
(def dropdownActiveItemColor "(:variableName @ selectedTextColor)")
(def dropdownActiveItemFontWeight "(:variableName @ bold)")
(def subMenuActiveBackground "(:identifier transparent)")
(def subMenuActiveTextColor "(:variableName @ activeItemTextColor)")
(def subMenuActiveFontWeight "(:variableName @ bold)")
(def verticalBoxShadow "(:variableName @ boxShadow)")
(def verticalPointerWidth "(:measurement 2 px)")
(def verticalBackground "#FFFFFF")
(def verticalItemBackground "(:identifier none)")
(def verticalDividerBackground "(:variableName @ dividerBackground)")
(def verticalActiveBoxShadow "(:identifier none)")
(def secondaryBackground "(:identifier none)")
(def secondaryMargin "")
(def secondaryItemBackground "(:identifier none)")
(def secondaryItemSpacing "(:variableName @ relative5px)")
(def secondaryItemMargin "(:variableName @ secondaryItemSpacing)")
(def secondaryItemVerticalPadding "(:variableName @ relativeMini)")
(def secondaryItemHorizontalPadding "(:variableName @ relativeSmall)")
(def secondaryItemPadding "(:variableName @ relativeSmall)")
(def secondaryItemBorderRadius "(:variableName @ defaultBorderRadius)")
(def secondaryItemTransition "(:variableName @ defaultEasing)")
(def secondaryItemColor "(:variableName @ unselectedTextColor)")
(def secondaryHoverItemBackground "(:variableName @ transparentBlack)")
(def secondaryHoverItemColor "(:variableName @ selectedTextColor)")
(def secondaryActiveItemBackground "(:variableName @ transparentBlack)")
(def secondaryActiveItemColor "(:variableName @ selectedTextColor)")
(def
 secondaryActiveHoverItemBackground
 "(:variableName @ transparentBlack)")
(def
 secondaryActiveHoverItemColor
 "(:variableName @ selectedTextColor)")
(def
 secondaryActiveHoveredItemBackground
 "(:variableName @ transparentBlack)")
(def
 secondaryActiveHoveredItemColor
 "(:variableName @ selectedTextColor)")
(def secondaryHeaderBackground "(:identifier transparent)")
(def secondaryHeaderBorder "(:identifier none)")
(def
 secondaryItemVerticalSpacing
 "(:variableName @ secondaryItemSpacing)")
(def
 secondaryVerticalItemMargin
 "(:variableName @ secondaryItemVerticalSpacing)")
(def
 secondaryVerticalItemBorderRadius
 "(:variableName @ defaultBorderRadius)")
(def secondaryMenuSubMenuMargin "")
(def secondaryMenuSubMenuItemMargin "(:measurement 0 em)")
(def
 secondaryMenuSubMenuItemPadding
 "(:variableName @ secondarySubMenuHorizontalPadding)")
(def secondaryPointingBorderWidth "(:measurement 2 px)")
(def secondaryPointingBorderColor "(:variableName @ borderColor)")
(def
 secondaryPointingItemVerticalPadding
 "(:variableName @ relativeTiny)")
(def
 secondaryPointingItemHorizontalPadding
 "(:variableName @ relativeLarge)")
(def secondaryPointingHoverTextColor "(:variableName @ textColor)")
(def secondaryPointingActiveBorderColor "(:variableName @ black)")
(def
 secondaryPointingActiveTextColor
 "(:variableName @ selectedTextColor)")
(def secondaryPointingActiveFontWeight "(:variableName @ bold)")
(def
 secondaryPointingActiveDropdownBorderColor
 "(:identifier transparent)")
(def
 secondaryPointingActiveHoverBorderColor
 "(:variableName @ secondaryPointingActiveBorderColor)")
(def
 secondaryPointingActiveHoverTextColor
 "(:variableName @ secondaryPointingActiveTextColor)")
(def secondaryPointingHeaderColor "(:variableName @ darkTextColor)")
(def secondaryVerticalPointingItemMargin "")
(def secondaryInvertedColor "(:variableName @ invertedLightTextColor)")
(def
 secondaryInvertedHoverBackground
 "(:variableName @ transparentWhite)")
(def
 secondaryInvertedHoverColor
 "(:variableName @ invertedSelectedTextColor)")
(def
 secondaryInvertedActiveBackground
 "(:variableName @ strongTransparentWhite)")
(def
 secondaryInvertedActiveColor
 "(:variableName @ invertedSelectedTextColor)")
(def
 secondaryPointingInvertedBorderColor
 "(:variableName @ whiteBorderColor)")
(def
 secondaryPointingInvertedItemTextColor
 "(:variableName @ invertedTextColor)")
(def secondaryPointingInvertedItemHeaderColor "(:variableName @ white)")
(def
 secondaryPointingInvertedItemHoverTextColor
 "(:variableName @ selectedTextColor)")
(def
 secondaryPointingInvertedActiveBorderColor
 "(:variableName @ white)")
(def
 secondaryPointingInvertedActiveColor
 "(:variableName @ invertedSelectedTextColor)")
(def tieredActiveItemBackground "#FCFCFC")
(def tieredActiveMenuBackground "#FCFCFC")
(def tieredSubMenuTextTransform "(:variableName @ normal)")
(def tieredSubMenuFontWeight "(:variableName @ normal)")
(def tieredSubMenuColor "(:variableName @ lightTextColor)")
(def tieredSubMenuHoverBackground "(:identifier transparent)")
(def tieredSubMenuHoverColor "(:variableName @ hoveredTextColor)")
(def tieredSubMenuActiveBackground "(:identifier transparent)")
(def tieredSubMenuActiveColor "(:variableName @ selectedTextColor)")
(def tieredInvertedSubMenuBackground ")")
(def iconMenuTextAlign "(:identifier center)")
(def iconMenuItemColor "(:variableName @ black)")
(def iconMenuInvertedItemColor "(:variableName @ white)")
(def tabularBorderColor "(:variableName @ solidBorderColor)")
(def tabularBackgroundColor "(:identifier transparent)")
(def tabularBackground "(:variableName @ tabularBackgroundColor)")
(def tabularBorderWidth "(:measurement 1 px)")
(def tabularOppositeBorderWidth "")
(def tabularVerticalPadding "(:variableName @ itemVerticalPadding)")
(def tabularHorizontalPadding "(:variableName @ relativeHuge)")
(def tabularBorderRadius "(:variableName @ defaultBorderRadius)")
(def tabularTextColor "(:variableName @ itemTextColor)")
(def tabularHoveredTextColor "(:variableName @ hoveredTextColor)")
(def
 tabularVerticalBackground
 "(:variableName @ tabularBackgroundColor)")
(def tabularFluidOffset "(:measurement 1 px)")
(def tabularActiveBackground "(:variableName @ white)")
(def tabularActiveColor "(:variableName @ selectedTextColor)")
(def tabularActiveBoxShadow "(:identifier none)")
(def tabularActiveWeight "(:variableName @ bold)")
(def paginationMinWidth "(:measurement 3 em)")
(def paginationActiveBackground "(:variableName @ transparentBlack)")
(def paginationActiveTextColor "(:variableName @ selectedTextColor)")
(def
 labeledIconItemHorizontalPadding
 "(:variableName @ relativeMassive)")
(def labeledIconSize "(:variableName @ relativeMassive)")
(def labeledIconMinWidth "(:measurement 6 em)")
(def labeledIconTextMargin "(:identifier rem)")
(def textMenuItemSpacing "(:variableName @ relative7px)")
(def textMenuMargin "")
(def textMenuItemColor "(:variableName @ mutedTextColor)")
(def textMenuItemFontWeight "(:variableName @ normal)")
(def textMenuItemMargin "(:measurement 0 em)")
(def textMenuItemPadding "(:variableName @ textMenuItemSpacing)")
(def textMenuItemTransition "(:variableName @ defaultEasing)")
(def textMenuSubMenuMargin "(:measurement 0 em)")
(def textMenuSubMenuItemMargin "(:measurement 0 em)")
(def textMenuSubMenuItemPadding "(:measurement 0 em)")
(def textMenuActiveItemFontWeight "(:variableName @ normal)")
(def textMenuActiveItemColor "(:variableName @ selectedTextColor)")
(def textMenuHeaderSize "(:variableName @ relativeSmall)")
(def textMenuHeaderColor "(:variableName @ darkTextColor)")
(def textMenuHeaderFontWeight "(:variableName @ bold)")
(def textMenuHeaderTextTransform "(:identifier uppercase)")
(def textVerticalMenuMargin "(:measurement 0 em)")
(def textVerticalMenuHeaderMargin "(:variableName @ relative10px)")
(def textVerticalMenuItemMargin "(:measurement 0 em)")
(def textVerticalMenuIconFloat "(:identifier none)")
(def textVerticalMenuIconMargin "(:variableName @ iconMargin)")
(def invertedBackground "(:variableName @ black)")
(def invertedBoxShadow "(:identifier none)")
(def invertedBorder "(:identifier transparent)")
(def invertedHeaderBackground "(:identifier transparent)")
(def invertedItemBackground "(:identifier transparent)")
(def invertedItemTextColor "(:variableName @ invertedTextColor)")
(def invertedSubMenuBackground "(:identifier transparent)")
(def
 invertedSubMenuColor
 "(:variableName @ invertedUnselectedTextColor)")
(def invertedHoverBackground "(:variableName @ transparentWhite)")
(def invertedHoverColor "(:variableName @ invertedSelectedTextColor)")
(def invertedSubMenuHoverBackground "(:identifier transparent)")
(def
 invertedSubMenuHoverColor
 "(:variableName @ invertedSelectedTextColor)")
(def invertedMenuPressedBackground "(:variableName @ transparentWhite)")
(def
 invertedMenuPressedColor
 "(:variableName @ invertedSelectedTextColor)")
(def
 invertedActiveBackground
 "(:variableName @ strongTransparentWhite)")
(def invertedActiveColor "(:variableName @ invertedSelectedTextColor)")
(def invertedArrowActiveColor "#3D3E3F")
(def
 invertedActiveHoverBackground
 "(:variableName @ invertedActiveBackground)")
(def invertedActiveHoverColor "(:variableName @ white)")
(def
 invertedArrowActiveHoverColor
 "(:variableName @ invertedArrowActiveColor)")
(def invertedSubMenuActiveBackground "(:identifier transparent)")
(def invertedSubMenuActiveColor "(:variableName @ white)")
(def invertedDividerBackground ")")
(def
 invertedVerticalDividerBackground
 "(:variableName @ invertedDividerBackground)")
(def
 invertedColoredDividerBackground
 "(:variableName @ dividerBackground)")
(def
 invertedColoredActiveBackground
 "(:variableName @ strongTransparentBlack)")
(def fixedPrecedingGridMargin "(:identifier rem)")
(def floatedDistance "(:identifier rem)")
(def attachedTopOffset "(:measurement 0 px)")
(def attachedBottomOffset "(:measurement 0 px)")
(def attachedHorizontalOffset "(:variableName @ borderWidth)")
(def attachedWidth "")
(def attachedBoxShadow "(:identifier none)")
(def attachedBorder "(:variableName @ solidBorderColor)")
(def attachedBottomBoxShadow "(:variableName @ attachedBoxShadow)")
(def mini "(:measurement 11 px)")
(def tiny "(:measurement 12 px)")
(def small "(:measurement 13 px)")
(def large "(:measurement 15 px)")
(def big "(:measurement 16 px)")
(def huge "(:measurement 17 px)")
(def massive "(:measurement 18 px)")
(def miniWidth "(:identifier rem)")
(def tinyWidth "(:identifier rem)")
(def smallWidth "(:identifier rem)")
(def mediumWidth "(:identifier rem)")
(def largeWidth "(:identifier rem)")
(def bigWidth "(:identifier rem)")
(def hugeWidth "(:identifier rem)")
(def massiveWidth "(:identifier rem)")
(defstyles root)
