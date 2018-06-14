(clojure.core/ns
 styles.themes.default.globals.site
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def fontName (clojure.core/str "Lato"))
(def fontSmoothing (clojure.core/str "antialiased"))
(def headerFont (clojure.core/str "sans-serif"))
(def pageFont (clojure.core/str "sans-serif"))
(def googleFontName (clojure.core/str fontName))
(def googleFontSizes (clojure.core/str "400,700,400italic,700italic"))
(def googleSubset (clojure.core/str "latin"))
(def googleProtocol (clojure.core/str "https://"))
(def
 googleFontRequest
 (clojure.core/str
  "@{googleFontName}:@{googleFontSizes}&subset=@{googleSubset}"))
(def bold (clojure.core/str "bold"))
(def normal (clojure.core/str "normal"))
(def emSize (clojure.core/str "14px"))
(def fontSize (clojure.core/str "14px"))
(def relativeBorderRadius (clojure.core/str relative4px))
(def absoluteBorderRadius nil)
(def defaultBorderRadius (clojure.core/str absoluteBorderRadius))
(def primaryColor (clojure.core/str blue))
(def secondaryColor (clojure.core/str black))
(def lightPrimaryColor (clojure.core/str lightBlue))
(def lightSecondaryColor (clojure.core/str lightBlack))
(def headerFontWeight (clojure.core/str bold))
(def headerLineHeight (clojure.core/str))
(def h1 (clojure.core/str "rem"))
(def h2 (clojure.core/str "rem"))
(def h3 (clojure.core/str "rem"))
(def h4 (clojure.core/str "rem"))
(def h5 (clojure.core/str "rem"))
(def inputBackground (clojure.core/str white))
(def inputVerticalPadding (clojure.core/str relative11px))
(def inputHorizontalPadding (clojure.core/str relative14px))
(def
 inputPadding
 (clojure.core/str inputVerticalPadding " " inputHorizontalPadding))
(def inputColor (clojure.core/str textColor))
(def inputPlaceholderColor (clojure.core/str "lighten"))
(def inputPlaceholderFocusColor (clojure.core/str "lighten"))
(def inputLineHeight (clojure.core/str))
(def focusedFormBorderColor (clojure.core/str "#85B7D9"))
(def focusedFormMutedBorderColor (clojure.core/str "#96C8DA"))
(def miniSize nil)
(def tinySize nil)
(def smallSize nil)
(def mediumSize nil)
(def largeSize nil)
(def bigSize nil)
(def hugeSize nil)
(def massiveSize nil)
(def pageBackground (clojure.core/str "#FFFFFF"))
(def pageOverflowX (clojure.core/str "hidden"))
(def lineHeight (clojure.core/str "1.4285em"))
(def textColor (clojure.core/str "rgba"))
(def paragraphMargin (clojure.core/str "0em" " " "0em" " " "1em"))
(def paragraphLineHeight (clojure.core/str lineHeight))
(def linkColor (clojure.core/str "#4183C4"))
(def linkUnderline (clojure.core/str "none"))
(def linkHoverColor (clojure.core/str "darken"))
(def linkHoverUnderline (clojure.core/str linkUnderline))
(def useCustomScrollbars (clojure.core/str "true"))
(def customScrollbarWidth (clojure.core/str "10px"))
(def customScrollbarHeight (clojure.core/str "10px"))
(def trackBackground (clojure.core/str "rgba"))
(def trackBorderRadius (clojure.core/str "0px"))
(def thumbBorderRadius (clojure.core/str "5px"))
(def thumbBackground (clojure.core/str "rgba"))
(def thumbTransition (clojure.core/str "color" " " "0.2s" " " "ease"))
(def thumbInactiveBackground (clojure.core/str "rgba"))
(def thumbHoverBackground (clojure.core/str "rgba"))
(def trackInvertedBackground (clojure.core/str "rgba"))
(def thumbInvertedBackground (clojure.core/str "rgba"))
(def thumbInvertedInactiveBackground (clojure.core/str "rgba"))
(def thumbInvertedHoverBackground (clojure.core/str "rgba"))
(def highlightBackground (clojure.core/str "#CCE2FF"))
(def highlightColor (clojure.core/str textColor))
(def inputHighlightBackground (clojure.core/str "rgba"))
(def inputHighlightColor (clojure.core/str textColor))
(def loaderSize (clojure.core/str relativeBig))
(def loaderSpeed (clojure.core/str "0.6s"))
(def loaderLineWidth (clojure.core/str "0.2em"))
(def loaderFillColor (clojure.core/str "rgba"))
(def loaderLineColor (clojure.core/str grey))
(def invertedLoaderFillColor (clojure.core/str "rgba"))
(def invertedLoaderLineColor (clojure.core/str white))
(def columnCount (clojure.core/str "1616"))
(def defaultDuration (clojure.core/str "0.1s"))
(def defaultEasing (clojure.core/str "ease"))
(def mobileBreakpoint (clojure.core/str "320px"))
(def tabletBreakpoint (clojure.core/str "768px"))
(def computerBreakpoint (clojure.core/str "992px"))
(def largeMonitorBreakpoint (clojure.core/str "1200px"))
(def widescreenMonitorBreakpoint (clojure.core/str "1920px"))
(def red (clojure.core/str "#DB2828"))
(def orange (clojure.core/str "#F2711C"))
(def yellow (clojure.core/str "#FBBD08"))
(def olive (clojure.core/str "#B5CC18"))
(def green (clojure.core/str "#21BA45"))
(def teal (clojure.core/str "#00B5AD"))
(def blue (clojure.core/str "#2185D0"))
(def violet (clojure.core/str "#6435C9"))
(def purple (clojure.core/str "#A333C8"))
(def pink (clojure.core/str "#E03997"))
(def brown (clojure.core/str "#A5673F"))
(def grey (clojure.core/str "#767676"))
(def black (clojure.core/str "#1B1C1D"))
(def lightRed (clojure.core/str "#FF695E"))
(def lightOrange (clojure.core/str "#FF851B"))
(def lightYellow (clojure.core/str "#FFE21F"))
(def lightOlive (clojure.core/str "#D9E778"))
(def lightGreen (clojure.core/str "#2ECC40"))
(def lightTeal (clojure.core/str "#6DFFFF"))
(def lightBlue (clojure.core/str "#54C8FF"))
(def lightViolet (clojure.core/str "#A291FB"))
(def lightPurple (clojure.core/str "#DC73FF"))
(def lightPink (clojure.core/str "#FF8EDF"))
(def lightBrown (clojure.core/str "#D67C1C"))
(def lightGrey (clojure.core/str "#DCDDDE"))
(def lightBlack (clojure.core/str "#545454"))
(def fullBlack (clojure.core/str "#000000"))
(def offWhite (clojure.core/str "#F9FAFB"))
(def darkWhite (clojure.core/str "#F3F4F5"))
(def midWhite (clojure.core/str "#DCDDDE"))
(def white (clojure.core/str "#FFFFFF"))
(def redBackground (clojure.core/str "#FFE8E6"))
(def orangeBackground (clojure.core/str "#FFEDDE"))
(def yellowBackground (clojure.core/str "#FFF8DB"))
(def oliveBackground (clojure.core/str "#FBFDEF"))
(def greenBackground (clojure.core/str "#E5F9E7"))
(def tealBackground (clojure.core/str "#E1F7F7"))
(def blueBackground (clojure.core/str "#DFF0FF"))
(def violetBackground (clojure.core/str "#EAE7FF"))
(def purpleBackground (clojure.core/str "#F6E7FF"))
(def pinkBackground (clojure.core/str "#FFE3FB"))
(def brownBackground (clojure.core/str "#F1E2D3"))
(def redHeaderColor (clojure.core/str "darken"))
(def oliveHeaderColor (clojure.core/str "darken"))
(def greenHeaderColor (clojure.core/str "darken"))
(def yellowHeaderColor (clojure.core/str "darken"))
(def blueHeaderColor (clojure.core/str "darken"))
(def tealHeaderColor (clojure.core/str "darken"))
(def pinkHeaderColor (clojure.core/str "darken"))
(def violetHeaderColor (clojure.core/str "darken"))
(def purpleHeaderColor (clojure.core/str "darken"))
(def orangeHeaderColor (clojure.core/str "darken"))
(def brownHeaderColor (clojure.core/str "darken"))
(def redTextColor (clojure.core/str red))
(def orangeTextColor (clojure.core/str orange))
(def yellowTextColor (clojure.core/str "#B58105"))
(def oliveTextColor (clojure.core/str "#8ABC1E"))
(def greenTextColor (clojure.core/str "#1EBC30"))
(def tealTextColor (clojure.core/str "#10A3A3"))
(def blueTextColor (clojure.core/str blue))
(def violetTextColor (clojure.core/str violet))
(def purpleTextColor (clojure.core/str purple))
(def pinkTextColor (clojure.core/str pink))
(def brownTextColor (clojure.core/str brown))
(def redBorderColor (clojure.core/str redTextColor))
(def orangeBorderColor (clojure.core/str orangeTextColor))
(def yellowBorderColor (clojure.core/str yellowTextColor))
(def oliveBorderColor (clojure.core/str oliveTextColor))
(def greenBorderColor (clojure.core/str greenTextColor))
(def tealBorderColor (clojure.core/str tealTextColor))
(def blueBorderColor (clojure.core/str blueTextColor))
(def violetBorderColor (clojure.core/str violetTextColor))
(def purpleBorderColor (clojure.core/str purpleTextColor))
(def pinkBorderColor (clojure.core/str pinkTextColor))
(def brownBorderColor (clojure.core/str brownTextColor))
(def subtleTransparentBlack (clojure.core/str "rgba"))
(def transparentBlack (clojure.core/str "rgba"))
(def strongTransparentBlack (clojure.core/str "rgba"))
(def veryStrongTransparentBlack (clojure.core/str "rgba"))
(def subtleTransparentWhite (clojure.core/str "rgba"))
(def transparentWhite (clojure.core/str "rgba"))
(def strongTransparentWhite (clojure.core/str "rgba"))
(def subtleGradient (clojure.core/str "linear-gradient"))
(def
 subtleShadow
 (clojure.core/str "0px" " " "1px" " " "2px" " " "00" " " borderColor))
(def
 floatingShadow
 (clojure.core/str "0px" " " "2px" " " "10px" " " "0px" " " "rgba"))
(def positiveColor (clojure.core/str green))
(def positiveBackgroundColor (clojure.core/str "#FCFFF5"))
(def positiveBorderColor (clojure.core/str "#A3C293"))
(def positiveHeaderColor (clojure.core/str "#1A531B"))
(def positiveTextColor (clojure.core/str "#2C662D"))
(def negativeColor (clojure.core/str red))
(def negativeBackgroundColor (clojure.core/str "#FFF6F6"))
(def negativeBorderColor (clojure.core/str "#E0B4B4"))
(def negativeHeaderColor (clojure.core/str "#912D2B"))
(def negativeTextColor (clojure.core/str "#9F3A38"))
(def infoColor (clojure.core/str "#31CCEC"))
(def infoBackgroundColor (clojure.core/str "#F8FFFF"))
(def infoBorderColor (clojure.core/str "#A9D5DE"))
(def infoHeaderColor (clojure.core/str "#0E566C"))
(def infoTextColor (clojure.core/str "#276F86"))
(def warningColor (clojure.core/str "#F2C037"))
(def warningBorderColor (clojure.core/str "#C9BA9B"))
(def warningBackgroundColor (clojure.core/str "#FFFAF3"))
(def warningHeaderColor (clojure.core/str "#794B02"))
(def warningTextColor (clojure.core/str "#573A08"))
(def imagePath (clojure.core/str "themes/default/assets/images"))
(def fontPath (clojure.core/str "themes/default/assets/fonts"))
(def mini (clojure.core/str "unit"))
(def tiny (clojure.core/str "unit"))
(def small (clojure.core/str "unit"))
(def medium (clojure.core/str "unit"))
(def large (clojure.core/str "unit"))
(def big (clojure.core/str "unit"))
(def huge (clojure.core/str "unit"))
(def massive (clojure.core/str "unit"))
(def relativeMini (clojure.core/str "unit"))
(def relativeTiny (clojure.core/str "unit"))
(def relativeSmall (clojure.core/str "unit"))
(def relativeMedium (clojure.core/str "unit"))
(def relativeLarge (clojure.core/str "unit"))
(def relativeBig (clojure.core/str "unit"))
(def relativeHuge (clojure.core/str "unit"))
(def relativeMassive (clojure.core/str "unit"))
(def absoluteMini (clojure.core/str "unit"))
(def absoluteTiny (clojure.core/str "unit"))
(def absoluteSmall (clojure.core/str "unit"))
(def absoluteMedium (clojure.core/str "unit"))
(def absoluteLarge (clojure.core/str "unit"))
(def absoluteBig (clojure.core/str "unit"))
(def absoluteHuge (clojure.core/str "unit"))
(def absoluteMassive (clojure.core/str "unit"))
(def iconWidth (clojure.core/str "1.18em"))
(def darkTextColor (clojure.core/str "rgba"))
(def mutedTextColor (clojure.core/str "rgba"))
(def lightTextColor (clojure.core/str "rgba"))
(def unselectedTextColor (clojure.core/str "rgba"))
(def hoveredTextColor (clojure.core/str "rgba"))
(def pressedTextColor (clojure.core/str "rgba"))
(def selectedTextColor (clojure.core/str "rgba"))
(def disabledTextColor (clojure.core/str "rgba"))
(def invertedTextColor (clojure.core/str "rgba"))
(def invertedMutedTextColor (clojure.core/str "rgba"))
(def invertedLightTextColor (clojure.core/str "rgba"))
(def invertedUnselectedTextColor (clojure.core/str "rgba"))
(def invertedHoveredTextColor (clojure.core/str "rgba"))
(def invertedPressedTextColor (clojure.core/str "rgba"))
(def invertedSelectedTextColor (clojure.core/str "rgba"))
(def invertedDisabledTextColor (clojure.core/str "rgba"))
(def facebookColor (clojure.core/str "#3B5998"))
(def twitterColor (clojure.core/str "#55ACEE"))
(def googlePlusColor (clojure.core/str "#DD4B39"))
(def linkedInColor (clojure.core/str "#1F88BE"))
(def youtubeColor (clojure.core/str "#FF0000"))
(def pinterestColor (clojure.core/str "#BD081C"))
(def vkColor (clojure.core/str "#4D7198"))
(def instagramColor (clojure.core/str "#49769C"))
(def circularRadius (clojure.core/str "500500" " " "rem"))
(def borderColor (clojure.core/str "rgba"))
(def strongBorderColor (clojure.core/str "rgba"))
(def internalBorderColor (clojure.core/str "rgba"))
(def selectedBorderColor (clojure.core/str "rgba"))
(def strongSelectedBorderColor (clojure.core/str "rgba"))
(def disabledBorderColor (clojure.core/str "rgba"))
(def solidInternalBorderColor (clojure.core/str "#FAFAFA"))
(def solidBorderColor (clojure.core/str "#D4D4D5"))
(def solidSelectedBorderColor (clojure.core/str "#BCBDBD"))
(def whiteBorderColor (clojure.core/str "rgba"))
(def selectedWhiteBorderColor (clojure.core/str "rgba"))
(def solidWhiteBorderColor (clojure.core/str "#555555"))
(def selectedSolidWhiteBorderColor (clojure.core/str "#999999"))
(def loaderOffset (clojure.core/str))
(def
 loaderMargin
 (clojure.core/str loaderOffset " " "0em" " " "0em" " " loaderOffset))
(def scrollbarWidth (clojure.core/str "17px"))
(def glyphWidth (clojure.core/str "1.1em"))
(def lineHeightOffset (clojure.core/str))
(def headerBottomMargin (clojure.core/str "11" " " "rem"))
(def
 headerMargin
 (clojure.core/str headerTopMargin " " "0em" " " headerBottomMargin))
(def pageMinWidth (clojure.core/str "320px"))
(def successBackgroundColor (clojure.core/str positiveBackgroundColor))
(def successColor (clojure.core/str positiveColor))
(def successBorderColor (clojure.core/str positiveBorderColor))
(def successHeaderColor (clojure.core/str positiveHeaderColor))
(def successTextColor (clojure.core/str positiveTextColor))
(def errorBackgroundColor (clojure.core/str negativeBackgroundColor))
(def errorColor (clojure.core/str negativeColor))
(def errorBorderColor (clojure.core/str negativeBorderColor))
(def errorHeaderColor (clojure.core/str negativeHeaderColor))
(def errorTextColor (clojure.core/str negativeTextColor))
(def largestMobileScreen nil)
(def largestTabletScreen nil)
(def largestSmallMonitor nil)
(def largestLargeMonitor nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def  nil)
(def relative1px (clojure.core/str))
(def relative2px (clojure.core/str))
(def relative3px (clojure.core/str))
(def relative4px (clojure.core/str))
(def relative5px (clojure.core/str))
(def relative6px (clojure.core/str))
(def relative7px (clojure.core/str))
(def relative8px (clojure.core/str))
(def relative9px (clojure.core/str))
(def relative10px (clojure.core/str))
(def relative11px (clojure.core/str))
(def relative12px (clojure.core/str))
(def relative13px (clojure.core/str))
(def relative14px (clojure.core/str))
(def relative15px (clojure.core/str))
(def relative16px (clojure.core/str))
(def relative17px (clojure.core/str))
(def relative18px (clojure.core/str))
(def relative19px (clojure.core/str))
(def relative20px (clojure.core/str))
(def relative21px (clojure.core/str))
(def relative22px (clojure.core/str))
(def relative23px (clojure.core/str))
(def relative24px (clojure.core/str))
(def relative25px (clojure.core/str))
(def relative26px (clojure.core/str))
(def relative27px (clojure.core/str))
(def relative28px (clojure.core/str))
(def relative29px (clojure.core/str))
(def relative30px (clojure.core/str))
(def relative31px (clojure.core/str))
(def relative32px (clojure.core/str))
(def relative33px (clojure.core/str))
(def relative34px (clojure.core/str))
(def relative35px (clojure.core/str))
(def relative36px (clojure.core/str))
(def relative37px (clojure.core/str))
(def relative38px (clojure.core/str))
(def relative39px (clojure.core/str))
(def relative40px (clojure.core/str))
(def relative41px (clojure.core/str))
(def relative42px (clojure.core/str))
(def relative43px (clojure.core/str))
(def relative44px (clojure.core/str))
(def relative45px (clojure.core/str))
(def relative46px (clojure.core/str))
(def relative47px (clojure.core/str))
(def relative48px (clojure.core/str))
(def relative49px (clojure.core/str))
(def relative50px (clojure.core/str))
(def relative51px (clojure.core/str))
(def relative52px (clojure.core/str))
(def relative53px (clojure.core/str))
(def relative54px (clojure.core/str))
(def relative55px (clojure.core/str))
(def relative56px (clojure.core/str))
(def relative57px (clojure.core/str))
(def relative58px (clojure.core/str))
(def relative59px (clojure.core/str))
(def relative60px (clojure.core/str))
(def relative61px (clojure.core/str))
(def relative62px (clojure.core/str))
(def relative63px (clojure.core/str))
(def relative64px (clojure.core/str))
(def oneWide nil)
(def twoWide nil)
(def threeWide nil)
(def fourWide nil)
(def fiveWide nil)
(def sixWide nil)
(def sevenWide nil)
(def eightWide nil)
(def nineWide nil)
(def tenWide nil)
(def elevenWide nil)
(def twelveWide nil)
(def thirteenWide nil)
(def fourteenWide nil)
(def fifteenWide nil)
(def sixteenWide nil)
(def oneColumn nil)
(def twoColumn nil)
(def threeColumn nil)
(def fourColumn nil)
(def fiveColumn nil)
(def sixColumn nil)
(def sevenColumn nil)
(def eightColumn nil)
(def nineColumn nil)
(def tenColumn nil)
(def elevenColumn nil)
(def twelveColumn nil)
(def thirteenColumn nil)
(def fourteenColumn nil)
(def fifteenColumn nil)
(def sixteenColumn nil)
(def disabledOpacity (clojure.core/str "0.450.45"))
(def disabledTextColor (clojure.core/str "rgba"))
(def invertedDisabledTextColor (clojure.core/str "rgba"))
(def
 floatingShadowHover
 (clojure.core/str "0px" " " "2px" " " "10px" " " "0px" " " "rgba"))
(def primaryColorHover (clojure.core/str "saturate"))
(def secondaryColorHover (clojure.core/str "saturate"))
(def redHover (clojure.core/str "saturate"))
(def orangeHover (clojure.core/str "saturate"))
(def yellowHover (clojure.core/str "saturate"))
(def oliveHover (clojure.core/str "saturate"))
(def greenHover (clojure.core/str "saturate"))
(def tealHover (clojure.core/str "saturate"))
(def blueHover (clojure.core/str "saturate"))
(def violetHover (clojure.core/str "saturate"))
(def purpleHover (clojure.core/str "saturate"))
(def pinkHover (clojure.core/str "saturate"))
(def brownHover (clojure.core/str "saturate"))
(def lightRedHover (clojure.core/str "saturate"))
(def lightOrangeHover (clojure.core/str "saturate"))
(def lightYellowHover (clojure.core/str "saturate"))
(def lightOliveHover (clojure.core/str "saturate"))
(def lightGreenHover (clojure.core/str "saturate"))
(def lightTealHover (clojure.core/str "saturate"))
(def lightBlueHover (clojure.core/str "saturate"))
(def lightVioletHover (clojure.core/str "saturate"))
(def lightPurpleHover (clojure.core/str "saturate"))
(def lightPinkHover (clojure.core/str "saturate"))
(def lightBrownHover (clojure.core/str "saturate"))
(def lightGreyHover (clojure.core/str "saturate"))
(def lightBlackHover (clojure.core/str "saturate"))
(def positiveColorHover (clojure.core/str "saturate"))
(def negativeColorHover (clojure.core/str "saturate"))
(def facebookHoverColor (clojure.core/str "saturate"))
(def twitterHoverColor (clojure.core/str "saturate"))
(def googlePlusHoverColor (clojure.core/str "saturate"))
(def linkedInHoverColor (clojure.core/str "saturate"))
(def youtubeHoverColor (clojure.core/str "saturate"))
(def instagramHoverColor (clojure.core/str "saturate"))
(def pinterestHoverColor (clojure.core/str "saturate"))
(def vkHoverColor (clojure.core/str "saturate"))
(def fullBlackHover (clojure.core/str "lighten"))
(def blackHover (clojure.core/str "lighten"))
(def greyHover (clojure.core/str "lighten"))
(def whiteHover (clojure.core/str "darken"))
(def offWhiteHover (clojure.core/str "darken"))
(def darkWhiteHover (clojure.core/str "darken"))
(def primaryColorFocus (clojure.core/str "saturate"))
(def secondaryColorFocus (clojure.core/str "saturate"))
(def redFocus (clojure.core/str "saturate"))
(def orangeFocus (clojure.core/str "saturate"))
(def yellowFocus (clojure.core/str "saturate"))
(def oliveFocus (clojure.core/str "saturate"))
(def greenFocus (clojure.core/str "saturate"))
(def tealFocus (clojure.core/str "saturate"))
(def blueFocus (clojure.core/str "saturate"))
(def violetFocus (clojure.core/str "saturate"))
(def purpleFocus (clojure.core/str "saturate"))
(def pinkFocus (clojure.core/str "saturate"))
(def brownFocus (clojure.core/str "saturate"))
(def lightRedFocus (clojure.core/str "saturate"))
(def lightOrangeFocus (clojure.core/str "saturate"))
(def lightYellowFocus (clojure.core/str "saturate"))
(def lightOliveFocus (clojure.core/str "saturate"))
(def lightGreenFocus (clojure.core/str "saturate"))
(def lightTealFocus (clojure.core/str "saturate"))
(def lightBlueFocus (clojure.core/str "saturate"))
(def lightVioletFocus (clojure.core/str "saturate"))
(def lightPurpleFocus (clojure.core/str "saturate"))
(def lightPinkFocus (clojure.core/str "saturate"))
(def lightBrownFocus (clojure.core/str "saturate"))
(def lightGreyFocus (clojure.core/str "saturate"))
(def lightBlackFocus (clojure.core/str "saturate"))
(def positiveColorFocus (clojure.core/str "saturate"))
(def negativeColorFocus (clojure.core/str "saturate"))
(def facebookFocusColor (clojure.core/str "saturate"))
(def twitterFocusColor (clojure.core/str "saturate"))
(def googlePlusFocusColor (clojure.core/str "saturate"))
(def linkedInFocusColor (clojure.core/str "saturate"))
(def youtubeFocusColor (clojure.core/str "saturate"))
(def instagramFocusColor (clojure.core/str "saturate"))
(def pinterestFocusColor (clojure.core/str "saturate"))
(def vkFocusColor (clojure.core/str "saturate"))
(def fullBlackFocus (clojure.core/str "lighten"))
(def blackFocus (clojure.core/str "lighten"))
(def greyFocus (clojure.core/str "lighten"))
(def whiteFocus (clojure.core/str "darken"))
(def offWhiteFocus (clojure.core/str "darken"))
(def darkWhiteFocus (clojure.core/str "darken"))
(def primaryColorDown (clojure.core/str "darken"))
(def secondaryColorDown (clojure.core/str "lighten"))
(def redDown (clojure.core/str "darken"))
(def orangeDown (clojure.core/str "darken"))
(def yellowDown (clojure.core/str "darken"))
(def oliveDown (clojure.core/str "darken"))
(def greenDown (clojure.core/str "darken"))
(def tealDown (clojure.core/str "darken"))
(def blueDown (clojure.core/str "darken"))
(def violetDown (clojure.core/str "darken"))
(def purpleDown (clojure.core/str "darken"))
(def pinkDown (clojure.core/str "darken"))
(def brownDown (clojure.core/str "darken"))
(def lightRedDown (clojure.core/str "darken"))
(def lightOrangeDown (clojure.core/str "darken"))
(def lightYellowDown (clojure.core/str "darken"))
(def lightOliveDown (clojure.core/str "darken"))
(def lightGreenDown (clojure.core/str "darken"))
(def lightTealDown (clojure.core/str "darken"))
(def lightBlueDown (clojure.core/str "darken"))
(def lightVioletDown (clojure.core/str "darken"))
(def lightPurpleDown (clojure.core/str "darken"))
(def lightPinkDown (clojure.core/str "darken"))
(def lightBrownDown (clojure.core/str "darken"))
(def lightGreyDown (clojure.core/str "darken"))
(def lightBlackDown (clojure.core/str "darken"))
(def positiveColorDown (clojure.core/str "darken"))
(def negativeColorDown (clojure.core/str "darken"))
(def facebookDownColor (clojure.core/str "darken"))
(def twitterDownColor (clojure.core/str "darken"))
(def googlePlusDownColor (clojure.core/str "darken"))
(def linkedInDownColor (clojure.core/str "darken"))
(def youtubeDownColor (clojure.core/str "darken"))
(def instagramDownColor (clojure.core/str "darken"))
(def pinterestDownColor (clojure.core/str "darken"))
(def vkDownColor (clojure.core/str "darken"))
(def fullBlackDown (clojure.core/str "lighten"))
(def blackDown (clojure.core/str "lighten"))
(def greyDown (clojure.core/str "lighten"))
(def whiteDown (clojure.core/str "darken"))
(def offWhiteDown (clojure.core/str "darken"))
(def darkWhiteDown (clojure.core/str "darken"))
(def primaryColorActive (clojure.core/str "saturate"))
(def secondaryColorActive (clojure.core/str "saturate"))
(def redActive (clojure.core/str "saturate"))
(def orangeActive (clojure.core/str "saturate"))
(def yellowActive (clojure.core/str "saturate"))
(def oliveActive (clojure.core/str "saturate"))
(def greenActive (clojure.core/str "saturate"))
(def tealActive (clojure.core/str "saturate"))
(def blueActive (clojure.core/str "saturate"))
(def violetActive (clojure.core/str "saturate"))
(def purpleActive (clojure.core/str "saturate"))
(def pinkActive (clojure.core/str "saturate"))
(def brownActive (clojure.core/str "saturate"))
(def lightRedActive (clojure.core/str "saturate"))
(def lightOrangeActive (clojure.core/str "saturate"))
(def lightYellowActive (clojure.core/str "saturate"))
(def lightOliveActive (clojure.core/str "saturate"))
(def lightGreenActive (clojure.core/str "saturate"))
(def lightTealActive (clojure.core/str "saturate"))
(def lightBlueActive (clojure.core/str "saturate"))
(def lightVioletActive (clojure.core/str "saturate"))
(def lightPurpleActive (clojure.core/str "saturate"))
(def lightPinkActive (clojure.core/str "saturate"))
(def lightBrownActive (clojure.core/str "saturate"))
(def lightGreyActive (clojure.core/str "saturate"))
(def lightBlackActive (clojure.core/str "saturate"))
(def positiveColorActive (clojure.core/str "saturate"))
(def negativeColorActive (clojure.core/str "saturate"))
(def facebookActiveColor (clojure.core/str "saturate"))
(def twitterActiveColor (clojure.core/str "saturate"))
(def googlePlusActiveColor (clojure.core/str "saturate"))
(def linkedInActiveColor (clojure.core/str "saturate"))
(def youtubeActiveColor (clojure.core/str "saturate"))
(def instagramActiveColor (clojure.core/str "saturate"))
(def pinterestActiveColor (clojure.core/str "saturate"))
(def vkActiveColor (clojure.core/str "saturate"))
(def fullBlackActive (clojure.core/str "darken"))
(def blackActive (clojure.core/str "darken"))
(def greyActive (clojure.core/str "darken"))
(def whiteActive (clojure.core/str "darken"))
(def offWhiteActive (clojure.core/str "darken"))
(def darkWhiteActive (clojure.core/str "darken"))
(defstyles root)
