(clojure.core/ns
 themes.default.modules.dropdown
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def transition "(:variableName @ defaultEasing)")
(def borderRadius "(:variableName @ defaultBorderRadius)")
(def raisedShadow "(:variableName @ borderColor)")
(def dropdownIconSize "(:variableName @ relative12px)")
(def dropdownIconMargin "(:measurement 1 em)")
(def textTransition "(:identifier none)")
(def menuBackground "#FFFFFF")
(def menuMargin "(:measurement 0 em)")
(def menuPadding "(:measurement 0 em)")
(def menuTop "(:measurement 100 %)")
(def menuTextAlign "(:identifier left)")
(def menuBorderWidth "(:measurement 1 px)")
(def menuBorderColor "(:variableName @ borderColor)")
(def menuBorder "(:variableName @ menuBorderColor)")
(def menuBoxShadow "(:variableName @ raisedShadow)")
(def menuBorderRadius "(:variableName @ borderRadius)")
(def menuTransition "(:variableName @ defaultEasing)")
(def menuZIndex "(:measurement 11)")
(def textLineHeight "(:measurement 1 em)")
(def textLineHeightOffset "")
(def textCursorSpacing "(:measurement 1 px)")
(def itemFontSize "(:variableName @ medium)")
(def itemTextAlign "(:identifier left)")
(def itemBorder "(:identifier none)")
(def itemHeight "(:identifier auto)")
(def itemDivider "(:identifier none)")
(def itemColor "(:variableName @ textColor)")
(def itemVerticalPadding "(:variableName @ mini)")
(def itemHorizontalPadding "(:variableName @ large)")
(def itemPadding "(:variableName @ itemHorizontalPadding)")
(def itemFontWeight "(:variableName @ normal)")
(def itemLineHeight "(:measurement 1 em)")
(def itemLineHeightOffset "")
(def itemTextTransform "(:identifier none)")
(def itemBoxShadow "(:identifier none)")
(def subMenuTop "(:measurement 0 %)")
(def subMenuLeft "(:measurement 100 %)")
(def subMenuRight "(:identifier auto)")
(def subMenuDistanceAway "(:measurement -0.5 em)")
(def subMenuMargin "(:variableName @ subMenuDistanceAway)")
(def subMenuBorderRadius "(:variableName @ borderRadius)")
(def subMenuZIndex "(:measurement 21)")
(def menuHeaderColor "(:variableName @ darkTextColor)")
(def menuHeaderFontSize "(:variableName @ relative11px)")
(def menuHeaderFontWeight "(:variableName @ bold)")
(def menuHeaderTextTransform "(:identifier uppercase)")
(def menuHeaderMargin "(:identifier rem)")
(def menuHeaderPadding "(:variableName @ itemHorizontalPadding)")
(def menuDividerMargin "(:measurement 0 em)")
(def menuDividerColor "(:variableName @ internalBorderColor)")
(def menuDividerSize "(:measurement 1 px)")
(def menuDividerBorder "(:variableName @ menuDividerColor)")
(def menuInputMargin "(:variableName @ mini)")
(def menuInputMinWidth "(:identifier rem)")
(def menuInputVerticalPadding "(:measurement 0.5 em)")
(def
 menuInputHorizontalPadding
 "(:variableName @ inputHorizontalPadding)")
(def menuInputPadding "(:variableName @ menuInputHorizontalPadding)")
(def menuImageMaxHeight "(:measurement 2 em)")
(def menuImageVerticalMargin "")
(def itemElementFloat "(:identifier none)")
(def itemElementDistance "(:variableName @ mini)")
(def itemDropdownIconDistance "(:measurement 1 em)")
(def itemDropdownIconFloat "(:identifier right)")
(def
 itemDropdownIconMargin
 "(:variableName @ itemDropdownIconDistance)")
(def itemDescriptionFloat "(:identifier right)")
(def itemDescriptionMargin "(:measurement 1 em)")
(def itemDescriptionColor "(:variableName @ lightTextColor)")
(def messagePadding "(:variableName @ selectionItemPadding)")
(def messageFontWeight "(:variableName @ normal)")
(def messageColor "(:variableName @ unselectedTextColor)")
(def floatedDistance "(:measurement 1 em)")
(def selectionMinWidth "(:measurement 14 em)")
(def selectionVerticalPadding "(:variableName @ inputVerticalPadding)")
(def
 selectionHorizontalPadding
 "(:variableName @ inputHorizontalPadding)")
(def selectionBorderEmWidth "(:variableName @ relative1px)")
(def selectionBackground "(:variableName @ inputBackground)")
(def selectionDisplay "(:identifier inline-block)")
(def selectionIconDistance "")
(def selectionPadding "(:variableName @ selectionHorizontalPadding)")
(def selectionZIndex "(:measurement 10)")
(def selectionItemDivider "(:variableName @ solidInternalBorderColor)")
(def selectionMessagePadding "(:variableName @ selectionItemPadding)")
(def selectBorder "(:variableName @ borderColor)")
(def selectPadding "(:measurement 0.5 em)")
(def selectVisibility "(:identifier visible)")
(def selectHeight "(:measurement 38 px)")
(def selectionTextColor "(:variableName @ textColor)")
(def
 selectionTextUnderlayIconOpacity
 "(:variableName @ disabledOpacity)")
(def
 selectionTextUnderlayColor
 "(:variableName @ inputPlaceholderFocusColor)")
(def selectionBoxShadow "(:identifier none)")
(def selectionBorderColor "(:variableName @ borderColor)")
(def selectionBorder "(:variableName @ selectionBorderColor)")
(def selectionBorderRadius "(:variableName @ borderRadius)")
(def selectionIconOpacity "(:measurement 0.8)")
(def selectionIconZIndex "(:measurement 3)")
(def selectionIconHitbox "(:variableName @ selectionVerticalPadding)")
(def selectionIconMargin "(:variableName @ selectionIconHitbox)")
(def selectionIconPadding "")
(def selectionIconTransition "(:variableName @ defaultEasing)")
(def selectionMenuBorderRadius "(:variableName @ borderRadius)")
(def selectionMenuBoxShadow "(:variableName @ raisedShadow)")
(def selectionMenuItemBoxShadow "(:identifier none)")
(def
 selectionItemHorizontalPadding
 "(:variableName @ itemHorizontalPadding)")
(def
 selectionItemVerticalPadding
 "(:variableName @ itemVerticalPadding)")
(def
 selectionItemPadding
 "(:variableName @ selectionItemHorizontalPadding)")
(def selectionTransition "(:variableName @ transition)")
(def selectionMenuTransition "(:variableName @ menuTransition)")
(def selectionMobileMaxItems "(:measurement 3)")
(def selectionTabletMaxItems "(:measurement 4)")
(def selectionComputerMaxItems "(:measurement 6)")
(def selectionWidescreenMaxItems "(:measurement 8)")
(def selectedBorderEMWidth "(:measurement 0.1 em)")
(def selectionMobileMaxMenuHeight "")
(def selectionTabletMaxMenuHeight "")
(def selectionComputerMaxMenuHeight "")
(def selectionWidescreenMaxMenuHeight "")
(def selectionHoverBorderColor "(:variableName @ selectedBorderColor)")
(def selectionHoverBoxShadow "(:identifier none)")
(def
 selectionFocusBorderColor
 "(:variableName @ focusedFormMutedBorderColor)")
(def selectionFocusBoxShadow "(:identifier none)")
(def selectionFocusMenuBoxShadow "(:variableName @ raisedShadow)")
(def selectionVisibleTextFontWeight "(:variableName @ normal)")
(def selectionVisibleTextColor "(:variableName @ hoveredTextColor)")
(def
 selectionVisibleBorderColor
 "(:variableName @ focusedFormMutedBorderColor)")
(def selectionVisibleBoxShadow "(:variableName @ raisedShadow)")
(def selectionVisibleMenuBoxShadow "(:variableName @ raisedShadow)")
(def
 selectionActiveHoverBorderColor
 "(:variableName @ focusedFormMutedBorderColor)")
(def
 selectionActiveHoverBoxShadow
 "(:variableName @ selectionVisibleBoxShadow)")
(def
 selectionActiveHoverMenuBoxShadow
 "(:variableName @ selectionVisibleMenuBoxShadow)")
(def selectionVisibleConnectingBorder "(:measurement 0 em)")
(def selectionVisibleIconOpacity "(:measurement 1)")
(def searchMinWidth "")
(def searchSelectionLineHeight "(:variableName @ inputLineHeight)")
(def searchSelectionLineHeightOffset "")
(def searchSelectionVerticalPadding "")
(def
 searchSelectionHorizontalPadding
 "(:variableName @ selectionHorizontalPadding)")
(def
 searchSelectionInputPadding
 "(:variableName @ searchSelectionHorizontalPadding)")
(def
 searchMobileMaxMenuHeight
 "(:variableName @ selectionMobileMaxMenuHeight)")
(def
 searchTabletMaxMenuHeight
 "(:variableName @ selectionTabletMaxMenuHeight)")
(def
 searchComputerMaxMenuHeight
 "(:variableName @ selectionComputerMaxMenuHeight)")
(def
 searchWidescreenMaxMenuHeight
 "(:variableName @ selectionWidescreenMaxMenuHeight)")
(def inlineIconMargin "(:variableName @ relative3px)")
(def inlineTextColor "(:identifier inherit)")
(def inlineTextFontWeight "(:variableName @ bold)")
(def inlineMenuDistance "(:variableName @ relative3px)")
(def inlineMenuBorderRadius "(:variableName @ borderRadius)")
(def multipleSelectionLeftPadding "(:variableName @ relative5px)")
(def
 multipleSelectionRightPadding
 "(:variableName @ selectionIconDistance)")
(def
 multipleSelectionPadding
 "(:variableName @ multipleSelectionLeftPadding)")
(def multipleSelectionChildLeftMargin "")
(def
 multipleSelectionChildMargin
 "(:variableName @ multipleSelectionChildLeftMargin)")
(def multipleSelectionChildLineHeight "(:variableName @ relative17px)")
(def multipleSelectionSearchStartWidth "")
(def multipleSelectionDropdownIconMargin "")
(def multipleSelectionDropdownIconPadding "")
(def
 multipleSelectionSearchAfterLabelDistance
 "(:variableName @ relative2px)")
(def labelSize "(:variableName @ relativeMedium)")
(def labelHorizontalMargin "(:measurement 4 px)")
(def labelVerticalMargin "(:measurement 2 px)")
(def labelMargin "(:measurement 0 em)")
(def labelBorderWidth "(:measurement 1 px)")
(def labelBoxShadow "(:identifier inset)")
(def labelVerticalPadding "(:variableName @ relative5px)")
(def labelHorizontalPadding "(:variableName @ relativeMini)")
(def labelPadding "(:variableName @ labelHorizontalPadding)")
(def hoveredItemBackground "(:variableName @ transparentBlack)")
(def hoveredItemColor "(:variableName @ selectedTextColor)")
(def hoveredZIndex "")
(def defaultTextColor "(:variableName @ inputPlaceholderColor)")
(def
 defaultTextFocusColor
 "(:variableName @ inputPlaceholderFocusColor)")
(def loadingZIndex "(:measurement -1)")
(def activeItemZIndex "")
(def activeItemBackground "(:identifier transparent)")
(def activeItemBoxShadow "(:identifier none)")
(def activeItemFontWeight "(:variableName @ bold)")
(def activeItemColor "(:variableName @ selectedTextColor)")
(def selectedBackground "(:variableName @ subtleTransparentBlack)")
(def selectedColor "(:variableName @ selectedTextColor)")
(def errorLabelBackground "#EACBCB")
(def errorLabelColor "(:variableName @ errorTextColor)")
(def errorItemTextColor "(:variableName @ errorTextColor)")
(def errorItemHoverBackground "#FFF2F2")
(def errorItemActiveBackground "#FDCFCF")
(def scrollingMenuWidth "(:measurement 100 %)")
(def scrollingMenuItemBorder "(:identifier none)")
(def scrollingMobileMaxItems "(:measurement 4)")
(def scrollingTabletMaxItems "(:measurement 6)")
(def scrollingComputerMaxItems "(:measurement 8)")
(def scrollingWidescreenMaxItems "(:measurement 12)")
(def scrollingBorderEMWidth "(:measurement 0 em)")
(def scrollingMobileMaxMenuHeight "")
(def scrollingTabletMaxMenuHeight "")
(def scrollingComputerMaxMenuHeight "")
(def scrollingWidescreenMaxMenuHeight "")
(def
 upwardSelectionVisibleBorderRadius
 "(:variableName @ borderRadius)")
(def upwardMenuBoxShadow ")")
(def upwardSelectionMenuBoxShadow ")")
(def upwardMenuBorderRadius "(:measurement 0 em)")
(def upwardSelectionHoverBoxShadow ")")
(def upwardSelectionVisibleBoxShadow ")")
(def upwardSelectionActiveHoverBoxShadow ")")
(def upwardSelectionActiveHoverMenuBoxShadow ")")
(def leftMenuDropdownIconFloat "(:identifier left)")
(def leftMenuDropdownIconMargin "(:measurement 0 em)")
(def leftSubMenuBorderRadius "(:variableName @ borderRadius)")
(def leftSubMenuMargin "(:measurement 0 em)")
(def simpleTransitionDuration "(:variableName @ defaultDuration)")
(def simpleTransition "(:variableName @ defaultEasing)")
(def floatingMenuDistance "(:measurement 0.5 em)")
(def floatingMenuBoxShadow "(:variableName @ floatingShadow)")
(def floatingMenuBorderRadius "(:variableName @ borderRadius)")
(def pointingArrowOffset "")
(def pointingArrowDistanceFromEdge "(:measurement 1 em)")
(def pointingArrowBackground "(:variableName @ white)")
(def pointingArrowZIndex "(:measurement 2)")
(def pointingArrowBoxShadow "")
(def pointingArrowSize "(:variableName @ relative7px)")
(def pointingMenuDistance "(:variableName @ mini)")
(def pointingMenuBorderRadius "(:variableName @ borderRadius)")
(def pointingArrowBoxShadow "")
(def pointingUpwardMenuBorderRadius "(:variableName @ borderRadius)")
(def pointingUpwardArrowBoxShadow "(:variableName @ menuBorderColor)")
(defstyles root)
