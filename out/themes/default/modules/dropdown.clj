(clojure.core/ns
 styles.themes.default.modules.dropdown
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def
 transition
 (clojure.core/str "width" " " defaultDuration " " defaultEasing))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def
 raisedShadow
 (clojure.core/str "0px" " " "2px" " " "3px" " " "0px" " " borderColor))
(def dropdownIconSize (clojure.core/str relative12px))
(def
 dropdownIconMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "1em"))
(def textTransition (clojure.core/str "none"))
(def menuBackground (clojure.core/str "#FFFFFF"))
(def menuMargin (clojure.core/str "0em"))
(def menuPadding (clojure.core/str "0em" " " "0em"))
(def menuTop (clojure.core/str "100%"))
(def menuTextAlign (clojure.core/str "left"))
(def menuBorderWidth (clojure.core/str "1px"))
(def menuBorderColor (clojure.core/str borderColor))
(def
 menuBorder
 (clojure.core/str menuBorderWidth " " "solid" " " menuBorderColor))
(def menuBoxShadow (clojure.core/str raisedShadow))
(def menuBorderRadius (clojure.core/str borderRadius))
(def
 menuTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def menuZIndex (clojure.core/str "1111"))
(def textLineHeight (clojure.core/str "1em"))
(def textLineHeightOffset nil)
(def textCursorSpacing (clojure.core/str "1px"))
(def itemFontSize (clojure.core/str medium))
(def itemTextAlign (clojure.core/str "left"))
(def itemBorder (clojure.core/str "none"))
(def itemHeight (clojure.core/str "auto"))
(def itemDivider (clojure.core/str "none"))
(def itemColor (clojure.core/str textColor))
(def itemVerticalPadding (clojure.core/str mini))
(def itemHorizontalPadding (clojure.core/str large))
(def
 itemPadding
 (clojure.core/str itemVerticalPadding " " itemHorizontalPadding))
(def itemFontWeight (clojure.core/str normal))
(def itemLineHeight (clojure.core/str "1em"))
(def itemLineHeightOffset nil)
(def itemTextTransform (clojure.core/str "none"))
(def itemBoxShadow (clojure.core/str "none"))
(def subMenuTop (clojure.core/str "0%"))
(def subMenuLeft (clojure.core/str "100%"))
(def subMenuRight (clojure.core/str "auto"))
(def subMenuDistanceAway (clojure.core/str "-0.5em"))
(def
 subMenuMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " subMenuDistanceAway))
(def subMenuBorderRadius (clojure.core/str borderRadius))
(def subMenuZIndex (clojure.core/str "2121"))
(def menuHeaderColor (clojure.core/str darkTextColor))
(def menuHeaderFontSize (clojure.core/str relative11px))
(def menuHeaderFontWeight (clojure.core/str bold))
(def menuHeaderTextTransform (clojure.core/str "uppercase"))
(def
 menuHeaderMargin
 (clojure.core/str
  "11"
  " "
  "rem"
  " "
  "00"
  " "
  "rem"
  " "
  "0.750.75"
  " "
  "rem"))
(def
 menuHeaderPadding
 (clojure.core/str "0em" " " itemHorizontalPadding))
(def menuDividerMargin (clojure.core/str "0.5em" " " "0em"))
(def menuDividerColor (clojure.core/str internalBorderColor))
(def menuDividerSize (clojure.core/str "1px"))
(def
 menuDividerBorder
 (clojure.core/str menuDividerSize " " "solid" " " menuDividerColor))
(def menuInputMargin (clojure.core/str large " " mini))
(def menuInputMinWidth (clojure.core/str "1010" " " "rem"))
(def menuInputVerticalPadding (clojure.core/str "0.5em"))
(def
 menuInputHorizontalPadding
 (clojure.core/str inputHorizontalPadding))
(def
 menuInputPadding
 (clojure.core/str
  menuInputVerticalPadding
  " "
  menuInputHorizontalPadding))
(def menuImageMaxHeight (clojure.core/str "2em"))
(def menuImageVerticalMargin (clojure.core/str))
(def itemElementFloat (clojure.core/str "none"))
(def itemElementDistance (clojure.core/str mini))
(def itemDropdownIconDistance (clojure.core/str "1em"))
(def itemDropdownIconFloat (clojure.core/str "right"))
(def
 itemDropdownIconMargin
 (clojure.core/str
  itemLineHeightOffset
  " "
  "0em"
  " "
  "0em"
  " "
  itemDropdownIconDistance))
(def itemDescriptionFloat (clojure.core/str "right"))
(def
 itemDescriptionMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "1em"))
(def itemDescriptionColor (clojure.core/str lightTextColor))
(def messagePadding (clojure.core/str selectionItemPadding))
(def messageFontWeight (clojure.core/str normal))
(def messageColor (clojure.core/str unselectedTextColor))
(def floatedDistance (clojure.core/str "1em"))
(def selectionMinWidth (clojure.core/str "14em"))
(def selectionVerticalPadding (clojure.core/str inputVerticalPadding))
(def
 selectionHorizontalPadding
 (clojure.core/str inputHorizontalPadding))
(def selectionBorderEmWidth (clojure.core/str relative1px))
(def selectionBackground (clojure.core/str inputBackground))
(def selectionDisplay (clojure.core/str "inline-block"))
(def selectionIconDistance nil)
(def
 selectionPadding
 (clojure.core/str
  selectionVerticalPadding
  " "
  selectionIconDistance
  " "
  selectionVerticalPadding
  " "
  selectionHorizontalPadding))
(def selectionZIndex (clojure.core/str "1010"))
(def
 selectionItemDivider
 (clojure.core/str "1px" " " "solid" " " solidInternalBorderColor))
(def selectionMessagePadding (clojure.core/str selectionItemPadding))
(def selectBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def selectPadding (clojure.core/str "0.5em"))
(def selectVisibility (clojure.core/str "visible"))
(def selectHeight (clojure.core/str "38px"))
(def selectionTextColor (clojure.core/str textColor))
(def
 selectionTextUnderlayIconOpacity
 (clojure.core/str disabledOpacity))
(def
 selectionTextUnderlayColor
 (clojure.core/str inputPlaceholderFocusColor))
(def selectionBoxShadow (clojure.core/str "none"))
(def selectionBorderColor (clojure.core/str borderColor))
(def
 selectionBorder
 (clojure.core/str "1px" " " "solid" " " selectionBorderColor))
(def selectionBorderRadius (clojure.core/str borderRadius))
(def selectionIconOpacity (clojure.core/str "0.80.8"))
(def selectionIconZIndex (clojure.core/str "33"))
(def selectionIconHitbox (clojure.core/str selectionVerticalPadding))
(def selectionIconMargin nil)
(def selectionIconPadding nil)
(def
 selectionIconTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def
 selectionMenuBorderRadius
 (clojure.core/str "0em" " " "0em" " " borderRadius " " borderRadius))
(def selectionMenuBoxShadow (clojure.core/str raisedShadow))
(def selectionMenuItemBoxShadow (clojure.core/str "none"))
(def
 selectionItemHorizontalPadding
 (clojure.core/str itemHorizontalPadding))
(def
 selectionItemVerticalPadding
 (clojure.core/str itemVerticalPadding))
(def
 selectionItemPadding
 (clojure.core/str
  selectionItemVerticalPadding
  " "
  selectionItemHorizontalPadding))
(def selectionTransition (clojure.core/str transition))
(def selectionMenuTransition (clojure.core/str menuTransition))
(def selectionMobileMaxItems (clojure.core/str "33"))
(def selectionTabletMaxItems (clojure.core/str "44"))
(def selectionComputerMaxItems (clojure.core/str "66"))
(def selectionWidescreenMaxItems (clojure.core/str "88"))
(def selectedBorderEMWidth (clojure.core/str "0.1em"))
(def selectionMobileMaxMenuHeight nil)
(def selectionTabletMaxMenuHeight nil)
(def selectionComputerMaxMenuHeight nil)
(def selectionWidescreenMaxMenuHeight nil)
(def selectionHoverBorderColor (clojure.core/str selectedBorderColor))
(def selectionHoverBoxShadow (clojure.core/str "none"))
(def
 selectionFocusBorderColor
 (clojure.core/str focusedFormMutedBorderColor))
(def selectionFocusBoxShadow (clojure.core/str "none"))
(def selectionFocusMenuBoxShadow (clojure.core/str raisedShadow))
(def selectionVisibleTextFontWeight (clojure.core/str normal))
(def selectionVisibleTextColor (clojure.core/str hoveredTextColor))
(def
 selectionVisibleBorderColor
 (clojure.core/str focusedFormMutedBorderColor))
(def selectionVisibleBoxShadow (clojure.core/str raisedShadow))
(def selectionVisibleMenuBoxShadow (clojure.core/str raisedShadow))
(def
 selectionActiveHoverBorderColor
 (clojure.core/str focusedFormMutedBorderColor))
(def
 selectionActiveHoverBoxShadow
 (clojure.core/str selectionVisibleBoxShadow))
(def
 selectionActiveHoverMenuBoxShadow
 (clojure.core/str selectionVisibleMenuBoxShadow))
(def selectionVisibleConnectingBorder (clojure.core/str "0em"))
(def selectionVisibleIconOpacity (clojure.core/str "11"))
(def searchMinWidth (clojure.core/str ""))
(def searchSelectionLineHeight (clojure.core/str inputLineHeight))
(def searchSelectionLineHeightOffset (clojure.core/str))
(def searchSelectionVerticalPadding nil)
(def
 searchSelectionHorizontalPadding
 (clojure.core/str selectionHorizontalPadding))
(def
 searchSelectionInputPadding
 (clojure.core/str
  searchSelectionVerticalPadding
  " "
  selectionIconDistance
  " "
  searchSelectionVerticalPadding
  " "
  searchSelectionHorizontalPadding))
(def
 searchMobileMaxMenuHeight
 (clojure.core/str selectionMobileMaxMenuHeight))
(def
 searchTabletMaxMenuHeight
 (clojure.core/str selectionTabletMaxMenuHeight))
(def
 searchComputerMaxMenuHeight
 (clojure.core/str selectionComputerMaxMenuHeight))
(def
 searchWidescreenMaxMenuHeight
 (clojure.core/str selectionWidescreenMaxMenuHeight))
(def
 inlineIconMargin
 (clojure.core/str "0em" " " relative7px " " "0em" " " relative3px))
(def inlineTextColor (clojure.core/str "inherit"))
(def inlineTextFontWeight (clojure.core/str bold))
(def inlineMenuDistance (clojure.core/str relative3px))
(def inlineMenuBorderRadius (clojure.core/str borderRadius))
(def multipleSelectionLeftPadding (clojure.core/str relative5px))
(def
 multipleSelectionRightPadding
 (clojure.core/str selectionIconDistance))
(def
 multipleSelectionPadding
 (clojure.core/str
  multipleSelectionVerticalPadding
  " "
  multipleSelectionRightPadding
  " "
  multipleSelectionVerticalPadding
  " "
  multipleSelectionLeftPadding))
(def multipleSelectionChildLeftMargin nil)
(def
 multipleSelectionChildMargin
 (clojure.core/str
  multipleSelectionChildVerticalMargin
  " "
  "0em"
  " "
  multipleSelectionChildVerticalMargin
  " "
  multipleSelectionChildLeftMargin))
(def multipleSelectionChildLineHeight (clojure.core/str relative17px))
(def multipleSelectionSearchStartWidth nil)
(def multipleSelectionDropdownIconMargin (clojure.core/str ""))
(def multipleSelectionDropdownIconPadding (clojure.core/str ""))
(def
 multipleSelectionSearchAfterLabelDistance
 (clojure.core/str relative2px))
(def labelSize (clojure.core/str relativeMedium))
(def labelHorizontalMargin nil)
(def labelVerticalMargin nil)
(def
 labelMargin
 (clojure.core/str
  labelVerticalMargin
  " "
  labelHorizontalMargin
  " "
  labelVerticalMargin
  " "
  "0em"))
(def labelBorderWidth (clojure.core/str "1px"))
(def
 labelBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  labelBorderWidth
  " "
  borderColor
  " "
  "inset"))
(def labelVerticalPadding (clojure.core/str relative5px))
(def labelHorizontalPadding (clojure.core/str relativeMini))
(def
 labelPadding
 (clojure.core/str labelVerticalPadding " " labelHorizontalPadding))
(def hoveredItemBackground (clojure.core/str transparentBlack))
(def hoveredItemColor (clojure.core/str selectedTextColor))
(def hoveredZIndex nil)
(def defaultTextColor (clojure.core/str inputPlaceholderColor))
(def
 defaultTextFocusColor
 (clojure.core/str inputPlaceholderFocusColor))
(def loadingZIndex (clojure.core/str "-1-1"))
(def activeItemZIndex nil)
(def activeItemBackground (clojure.core/str "transparent"))
(def activeItemBoxShadow (clojure.core/str "none"))
(def activeItemFontWeight (clojure.core/str bold))
(def activeItemColor (clojure.core/str selectedTextColor))
(def selectedBackground (clojure.core/str subtleTransparentBlack))
(def selectedColor (clojure.core/str selectedTextColor))
(def errorLabelBackground (clojure.core/str "#EACBCB"))
(def errorLabelColor (clojure.core/str errorTextColor))
(def errorItemTextColor (clojure.core/str errorTextColor))
(def errorItemHoverBackground (clojure.core/str "#FFF2F2"))
(def errorItemActiveBackground (clojure.core/str "#FDCFCF"))
(def scrollingMenuWidth (clojure.core/str "100%"))
(def scrollingMenuItemBorder (clojure.core/str "none"))
(def scrollingMobileMaxItems (clojure.core/str "44"))
(def scrollingTabletMaxItems (clojure.core/str "66"))
(def scrollingComputerMaxItems (clojure.core/str "88"))
(def scrollingWidescreenMaxItems (clojure.core/str "1212"))
(def scrollingBorderEMWidth (clojure.core/str "0em"))
(def scrollingMobileMaxMenuHeight nil)
(def scrollingTabletMaxMenuHeight nil)
(def scrollingComputerMaxMenuHeight nil)
(def scrollingWidescreenMaxMenuHeight nil)
(def
 upwardSelectionVisibleBorderRadius
 (clojure.core/str
  selectionVisibleConnectingBorder
  " "
  selectionVisibleConnectingBorder
  " "
  borderRadius
  " "
  borderRadius))
(def
 upwardMenuBoxShadow
 (clojure.core/str "0px" " " "0px" " " "3px" " " "0px" " " "rgba"))
(def
 upwardSelectionMenuBoxShadow
 (clojure.core/str "0px" " " "-2px" " " "3px" " " "0px" " " "rgba"))
(def
 upwardMenuBorderRadius
 (clojure.core/str borderRadius " " borderRadius " " "0em" " " "0em"))
(def
 upwardSelectionHoverBoxShadow
 (clojure.core/str "0px" " " "0px" " " "2px" " " "0px" " " "rgba"))
(def
 upwardSelectionVisibleBoxShadow
 (clojure.core/str "0px" " " "0px" " " "3px" " " "0px" " " "rgba"))
(def
 upwardSelectionActiveHoverBoxShadow
 (clojure.core/str "0px" " " "0px" " " "3px" " " "0px" " " "rgba"))
(def
 upwardSelectionActiveHoverMenuBoxShadow
 (clojure.core/str "0px" " " "-2px" " " "3px" " " "0px" " " "rgba"))
(def leftMenuDropdownIconFloat (clojure.core/str "left"))
(def
 leftMenuDropdownIconMargin
 (clojure.core/str itemLineHeightOffset " " "0em" " " "0em" " " "0em"))
(def leftSubMenuBorderRadius (clojure.core/str borderRadius))
(def
 leftSubMenuMargin
 (clojure.core/str "0em" " " subMenuDistanceAway " " "0em" " " "0em"))
(def simpleTransitionDuration (clojure.core/str defaultDuration))
(def
 simpleTransition
 (clojure.core/str
  "opacity"
  " "
  simpleTransitionDuration
  " "
  defaultEasing))
(def floatingMenuDistance (clojure.core/str "0.5em"))
(def floatingMenuBoxShadow (clojure.core/str floatingShadow))
(def floatingMenuBorderRadius (clojure.core/str borderRadius))
(def pointingArrowOffset (clojure.core/str))
(def pointingArrowDistanceFromEdge (clojure.core/str "1em"))
(def pointingArrowBackground (clojure.core/str white))
(def pointingArrowZIndex (clojure.core/str "22"))
(def pointingArrowBoxShadow nil)
(def pointingArrowSize (clojure.core/str relative7px))
(def pointingMenuDistance (clojure.core/str mini))
(def pointingMenuBorderRadius (clojure.core/str borderRadius))
(def pointingArrowBoxShadow nil)
(def pointingUpwardMenuBorderRadius (clojure.core/str borderRadius))
(def
 pointingUpwardArrowBoxShadow
 (clojure.core/str
  menuBorderWidth
  " "
  menuBorderWidth
  " "
  "0px"
  " "
  "0px"
  " "
  menuBorderColor))
(defstyles root)
