(clojure.core/ns
 themes.default.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def verticalMargin (clojure.core/str "0em"))
(def horizontalMargin (clojure.core/str "0.25em"))
(def backgroundColor (clojure.core/str "#E0E1E2"))
(def backgroundImage (clojure.core/str "none"))
(def background (clojure.core/str backgroundColor " " backgroundImage))
(def lineHeight (clojure.core/str "1em"))
(def verticalPadding (clojure.core/str inputVerticalPadding))
(def horizontalPadding (clojure.core/str "1.5em"))
(def textTransform (clojure.core/str "none"))
(def tapColor (clojure.core/str "transparent"))
(def fontFamily (clojure.core/str pageFont))
(def fontWeight (clojure.core/str bold))
(def textColor (clojure.core/str "rgba"))
(def textShadow (clojure.core/str "none"))
(def invertedTextShadow (clojure.core/str textShadow))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def verticalAlign (clojure.core/str "baseline"))
(def shadowDistance (clojure.core/str "0em"))
(def shadowOffset nil)
(def shadowBoxShadow nil)
(def borderBoxShadowColor (clojure.core/str "transparent"))
(def borderBoxShadowWidth (clojure.core/str "1px"))
(def
 borderBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  borderBoxShadowWidth
  " "
  borderBoxShadowColor
  " "
  "inset"))
(def boxShadow (clojure.core/str shadowBoxShadow))
(def iconHeight (clojure.core/str relativeTiny))
(def iconOpacity (clojure.core/str "0.80.8"))
(def iconDistance (clojure.core/str relative6px))
(def iconColor (clojure.core/str ""))
(def
 iconTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def iconVerticalAlign (clojure.core/str ""))
(def iconMargin nil)
(def invertedLoaderFillColor (clojure.core/str "rgba"))
(def
 transition
 (clojure.core/str "background" " " defaultDuration " " defaultEasing))
(def willChange (clojure.core/str ""))
(def groupBoxShadow (clojure.core/str "none"))
(def groupButtonBoxShadow (clojure.core/str boxShadow))
(def verticalBoxShadow (clojure.core/str "none"))
(def
 groupButtonOffset
 (clojure.core/str "0px" " " "0px" " " "0px" " " "0px"))
(def
 verticalGroupOffset
 (clojure.core/str "0px" " " "0px" " " "0px" " " "0px"))
(def hoverBackgroundColor (clojure.core/str "#CACBCD"))
(def hoverBackgroundImage (clojure.core/str backgroundImage))
(def hoverBoxShadow (clojure.core/str boxShadow))
(def hoverColor (clojure.core/str hoveredTextColor))
(def iconHoverOpacity (clojure.core/str "0.850.85"))
(def focusBackgroundColor (clojure.core/str hoverBackgroundColor))
(def focusBackgroundImage (clojure.core/str ""))
(def focusBoxShadow (clojure.core/str ""))
(def focusColor (clojure.core/str hoveredTextColor))
(def iconFocusOpacity (clojure.core/str "0.850.85"))
(def disabledBackgroundImage (clojure.core/str "none"))
(def disabledBoxShadow (clojure.core/str "none"))
(def downBackgroundColor (clojure.core/str "#BABBBC"))
(def downBackgroundImage (clojure.core/str ""))
(def downPressedShadow (clojure.core/str "none"))
(def downBoxShadow (clojure.core/str downPressedShadow))
(def downColor (clojure.core/str pressedTextColor))
(def activeBackgroundColor (clojure.core/str "#C0C1C2"))
(def activeBackgroundImage (clojure.core/str "none"))
(def activeColor (clojure.core/str selectedTextColor))
(def activeBoxShadow (clojure.core/str borderBoxShadow))
(def
 activeHoverBackgroundColor
 (clojure.core/str activeBackgroundColor))
(def activeHoverBackgroundImage (clojure.core/str "none"))
(def activeHoverColor (clojure.core/str activeColor))
(def activeHoverBoxShadow (clojure.core/str activeBoxShadow))
(def loadingOpacity (clojure.core/str "11"))
(def loadingPointerEvents (clojure.core/str "auto"))
(def
 loadingTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def orText (clojure.core/str "or"))
(def orGap (clojure.core/str "0.3em"))
(def orZIndex (clojure.core/str "33"))
(def orCircleDistanceToEdge nil)
(def orCircleSize nil)
(def orLineHeight nil)
(def orBoxShadow (clojure.core/str borderBoxShadow))
(def orVerticalOffset (clojure.core/str))
(def orHorizontalOffset (clojure.core/str))
(def orBackgroundColor (clojure.core/str white))
(def orTextShadow (clojure.core/str invertedTextShadow))
(def orTextStyle (clojure.core/str normal))
(def orTextWeight (clojure.core/str bold))
(def orTextColor (clojure.core/str lightTextColor))
(def orSpacerHeight (clojure.core/str verticalPadding))
(def orSpacerColor (clojure.core/str "transparent"))
(def iconButtonOpacity (clojure.core/str "0.90.9"))
(def labeledLabelFontSize (clojure.core/str medium))
(def labeledLabelAlign (clojure.core/str "center"))
(def labeledLabelPadding (clojure.core/str ""))
(def labeledLabelFontSize (clojure.core/str relativeMedium))
(def labeledLabelBorderColor (clojure.core/str borderColor))
(def labeledLabelBorderOffset nil)
(def labeledTagLabelSize (clojure.core/str "1.85em"))
(def labeledIconMargin (clojure.core/str "0em"))
(def labeledIconWidth nil)
(def labeledIconBackgroundColor (clojure.core/str "rgba"))
(def labeledIconPadding nil)
(def labeledIconBorder (clojure.core/str "transparent"))
(def labeledIconColor (clojure.core/str ""))
(def
 labeledIconLeftShadow
 (clojure.core/str
  "-1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  labeledIconBorder
  " "
  "inset"))
(def
 labeledIconRightShadow
 (clojure.core/str
  "1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  labeledIconBorder
  " "
  "inset"))
(def invertedBorderSize (clojure.core/str "2px"))
(def invertedTextColor (clojure.core/str white))
(def invertedTextHoverColor (clojure.core/str hoverColor))
(def invertedGroupButtonOffset nil)
(def basicBorderRadius (clojure.core/str borderRadius))
(def basicBorderSize (clojure.core/str "1px"))
(def basicTextColor (clojure.core/str textColor))
(def basicColoredBorderSize (clojure.core/str "1px"))
(def basicBackground (clojure.core/str "transparent" " " "none"))
(def basicFontWeight (clojure.core/str normal))
(def basicBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def
 basicBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  basicBorderSize
  " "
  borderColor
  " "
  "inset"))
(def basicLoadingColor (clojure.core/str offWhite))
(def basicTextTransform (clojure.core/str "none"))
(def basicHoverBackground (clojure.core/str "#FFFFFF"))
(def basicHoverTextColor (clojure.core/str hoveredTextColor))
(def
 basicHoverBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  borderColor
  " "
  "inset"))
(def basicFocusBackground (clojure.core/str basicHoverBackground))
(def basicFocusTextColor (clojure.core/str basicHoverTextColor))
(def basicFocusBoxShadow (clojure.core/str basicHoverBoxShadow))
(def basicDownBackground (clojure.core/str "#F8F8F8"))
(def basicDownTextColor (clojure.core/str pressedTextColor))
(def
 basicDownBoxShadow
 (clojure.core/str
  "0px"
  " "
  "1px"
  " "
  "4px"
  " "
  "0px"
  " "
  borderColor
  " "
  "inset"))
(def basicActiveBackground (clojure.core/str transparentBlack))
(def basicActiveBoxShadow (clojure.core/str ""))
(def basicActiveTextColor (clojure.core/str selectedTextColor))
(def basicInvertedBackground (clojure.core/str "transparent"))
(def basicInvertedFocusBackground (clojure.core/str "transparent"))
(def basicInvertedDownBackground (clojure.core/str transparentWhite))
(def basicInvertedActiveBackground (clojure.core/str transparentWhite))
(def
 basicInvertedBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  invertedBorderSize
  " "
  "rgba"
  " "
  "inset"))
(def
 basicInvertedHoverBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  invertedBorderSize
  " "
  "rgba"
  " "
  "inset"))
(def
 basicInvertedFocusBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  invertedBorderSize
  " "
  "rgba"
  " "
  "inset"))
(def
 basicInvertedDownBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  invertedBorderSize
  " "
  "rgba"
  " "
  "inset"))
(def
 basicInvertedActiveBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  invertedBorderSize
  " "
  "rgba"
  " "
  "inset"))
(def basicInvertedColor (clojure.core/str darkWhite))
(def basicInvertedHoverColor (clojure.core/str darkWhiteHover))
(def basicInvertedDownColor (clojure.core/str darkWhiteActive))
(def basicInvertedActiveColor (clojure.core/str invertedTextColor))
(def
 basicGroupBorder
 (clojure.core/str basicBorderSize " " "solid" " " borderColor))
(def basicGroupBoxShadow (clojure.core/str "none"))
(def coloredBackgroundImage (clojure.core/str "none"))
(def coloredBoxShadow (clojure.core/str shadowBoxShadow))
(def brownTextColor (clojure.core/str invertedTextColor))
(def brownTextShadow (clojure.core/str invertedTextShadow))
(def redTextColor (clojure.core/str invertedTextColor))
(def redTextShadow (clojure.core/str invertedTextShadow))
(def orangeTextColor (clojure.core/str invertedTextColor))
(def orangeTextShadow (clojure.core/str invertedTextShadow))
(def greenTextColor (clojure.core/str invertedTextColor))
(def greenTextShadow (clojure.core/str invertedTextShadow))
(def blueTextColor (clojure.core/str invertedTextColor))
(def blueTextShadow (clojure.core/str invertedTextShadow))
(def violetTextColor (clojure.core/str invertedTextColor))
(def violetTextShadow (clojure.core/str invertedTextShadow))
(def purpleTextColor (clojure.core/str invertedTextColor))
(def purpleTextShadow (clojure.core/str invertedTextShadow))
(def pinkTextColor (clojure.core/str invertedTextColor))
(def pinkTextShadow (clojure.core/str invertedTextShadow))
(def blackTextColor (clojure.core/str invertedTextColor))
(def blackTextShadow (clojure.core/str invertedTextShadow))
(def oliveTextColor (clojure.core/str invertedTextColor))
(def oliveTextShadow (clojure.core/str invertedTextShadow))
(def yellowTextColor (clojure.core/str invertedTextColor))
(def yellowTextShadow (clojure.core/str invertedTextShadow))
(def tealTextColor (clojure.core/str invertedTextColor))
(def tealTextShadow (clojure.core/str invertedTextShadow))
(def greyTextColor (clojure.core/str invertedTextColor))
(def greyTextShadow (clojure.core/str invertedTextShadow))
(def lightBrownTextColor (clojure.core/str invertedTextColor))
(def lightBrownTextShadow (clojure.core/str invertedTextShadow))
(def lightRedTextColor (clojure.core/str invertedTextColor))
(def lightRedTextShadow (clojure.core/str invertedTextShadow))
(def lightOrangeTextColor (clojure.core/str invertedTextColor))
(def lightOrangeTextShadow (clojure.core/str invertedTextShadow))
(def lightGreenTextColor (clojure.core/str invertedTextColor))
(def lightGreenTextShadow (clojure.core/str invertedTextShadow))
(def lightBlueTextColor (clojure.core/str invertedTextColor))
(def lightBlueTextShadow (clojure.core/str invertedTextShadow))
(def lightVioletTextColor (clojure.core/str invertedTextColor))
(def lightVioletTextShadow (clojure.core/str invertedTextShadow))
(def lightPurpleTextColor (clojure.core/str invertedTextColor))
(def lightPurpleTextShadow (clojure.core/str invertedTextShadow))
(def lightPinkTextColor (clojure.core/str invertedTextColor))
(def lightPinkTextShadow (clojure.core/str invertedTextShadow))
(def lightBlackTextColor (clojure.core/str invertedTextColor))
(def lightBlackTextShadow (clojure.core/str invertedTextShadow))
(def lightOliveTextColor (clojure.core/str textColor))
(def lightOliveTextShadow (clojure.core/str textShadow))
(def lightYellowTextColor (clojure.core/str textColor))
(def lightYellowTextShadow (clojure.core/str textShadow))
(def lightTealTextColor (clojure.core/str textColor))
(def lightTealTextShadow (clojure.core/str textShadow))
(def lightGreyTextColor (clojure.core/str textColor))
(def lightGreyTextShadow (clojure.core/str textShadow))
(def primaryBackgroundImage (clojure.core/str coloredBackgroundImage))
(def primaryTextColor (clojure.core/str invertedTextColor))
(def primaryTextShadow (clojure.core/str invertedTextShadow))
(def primaryBoxShadow (clojure.core/str coloredBoxShadow))
(def secondaryBackgroundImage (clojure.core/str coloredBackgroundImage))
(def secondaryTextColor (clojure.core/str invertedTextColor))
(def secondaryTextShadow (clojure.core/str invertedTextShadow))
(def secondaryBoxShadow (clojure.core/str coloredBoxShadow))
(def positiveBackgroundImage (clojure.core/str coloredBackgroundImage))
(def positiveTextColor (clojure.core/str invertedTextColor))
(def positiveTextShadow (clojure.core/str invertedTextShadow))
(def positiveBoxShadow (clojure.core/str coloredBoxShadow))
(def negativeBackgroundImage (clojure.core/str coloredBackgroundImage))
(def negativeTextColor (clojure.core/str invertedTextColor))
(def negativeTextShadow (clojure.core/str invertedTextShadow))
(def negativeBoxShadow (clojure.core/str coloredBoxShadow))
(def compactVerticalPadding nil)
(def compactHorizontalPadding nil)
(def attachedOffset (clojure.core/str "-1px"))
(def
 attachedBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " borderColor))
(def attachedHorizontalPadding (clojure.core/str "0.75em"))
(def attachedZIndex (clojure.core/str "22"))
(def floatedMargin (clojure.core/str "0.25em"))
(def animatedVerticalAlign (clojure.core/str "middle"))
(def animatedZIndex (clojure.core/str "11"))
(def animationDuration (clojure.core/str "0.3s"))
(def animationEasing (clojure.core/str "ease"))
(def fadeScaleHigh (clojure.core/str "1.51.5"))
(def fadeScaleLow (clojure.core/str "0.750.75"))
(defstyles root)
