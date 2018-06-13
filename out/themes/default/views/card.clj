(clojure.core/ns
 themes.default.views.card
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def shadowDistance (clojure.core/str "1px"))
(def
 shadowBoxShadow
 (clojure.core/str
  "0px"
  " "
  shadowDistance
  " "
  "3px"
  " "
  "0px"
  " "
  solidBorderColor))
(def fontFamily (clojure.core/str pageFont))
(def display (clojure.core/str "flex"))
(def background (clojure.core/str white))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def margin (clojure.core/str "1em" " " "0em"))
(def minHeight (clojure.core/str "0px"))
(def padding (clojure.core/str "0em"))
(def width (clojure.core/str "290px"))
(def borderWidth (clojure.core/str "1px"))
(def
 borderShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  borderWidth
  " "
  solidBorderColor))
(def boxShadow (clojure.core/str borderShadow))
(def border (clojure.core/str "none"))
(def zIndex nil)
(def
 transition
 (clojure.core/str "transform" " " defaultDuration " " defaultEasing))
(def horizontalSpacing (clojure.core/str "1em"))
(def rowSpacing (clojure.core/str "1.75em"))
(def groupMargin (clojure.core/str))
(def groupDisplay (clojure.core/str "flex"))
(def groupCardFloat (clojure.core/str "none"))
(def groupCardDisplay (clojure.core/str "flex"))
(def consecutiveGroupDistance nil)
(def imageBackground (clojure.core/str transparentBlack))
(def imagePadding (clojure.core/str "0em"))
(def imageBorder (clojure.core/str "none"))
(def imageBoxShadow (clojure.core/str "none"))
(def imageBorder (clojure.core/str "none"))
(def
 contentDivider
 (clojure.core/str borderWidth " " "solid" " " internalBorderColor))
(def contentMargin (clojure.core/str "0em"))
(def contentBackground (clojure.core/str "none"))
(def contentPadding (clojure.core/str "1em" " " "1em"))
(def contentFontSize (clojure.core/str "1em"))
(def contentBorderRadius (clojure.core/str "0em"))
(def contentBoxShadow (clojure.core/str "none"))
(def contentBorder (clojure.core/str "none"))
(def headerMargin nil)
(def headerFontWeight (clojure.core/str bold))
(def headerFontSize (clojure.core/str relativeBig))
(def headerLineHeightOffset (clojure.core/str))
(def headerColor (clojure.core/str darkTextColor))
(def metaFontSize (clojure.core/str relativeMedium))
(def metaSpacing (clojure.core/str "0.3em"))
(def metaColor (clojure.core/str lightTextColor))
(def actionOpacity (clojure.core/str "0.750.75"))
(def actionHoverOpacity (clojure.core/str "11"))
(def
 actionTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def starColor nil)
(def starActiveColor nil)
(def likeColor nil)
(def likeActiveColor nil)
(def contentLinkColor nil)
(def contentLinkHoverColor nil)
(def
 contentLinkTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def headerLinkColor (clojure.core/str headerColor))
(def headerLinkHoverColor (clojure.core/str linkHoverColor))
(def metaLinkColor (clojure.core/str lightTextColor))
(def metaLinkHoverColor (clojure.core/str textColor))
(def descriptionDistance (clojure.core/str "0.5em"))
(def descriptionColor (clojure.core/str "rgba"))
(def contentImageWidth nil)
(def contentImageVerticalAlign (clojure.core/str "middle"))
(def avatarSize (clojure.core/str "2em"))
(def avatarBorderRadius (clojure.core/str circularRadius))
(def paragraphDistance (clojure.core/str "0.5em"))
(def dimmerZIndex (clojure.core/str "1010"))
(def dimmerColor nil)
(def extraDivider (clojure.core/str "1px" " " "solid" " " "rgba"))
(def extraBackground (clojure.core/str "none"))
(def extraPosition (clojure.core/str "static"))
(def extraWidth (clojure.core/str "auto"))
(def extraTop (clojure.core/str "0em"))
(def extraLeft (clojure.core/str "0em"))
(def extraMargin (clojure.core/str "0em" " " "0em"))
(def extraPadding (clojure.core/str "0.75em" " " "1em"))
(def extraBoxShadow (clojure.core/str "none"))
(def extraColor (clojure.core/str lightTextColor))
(def
 extraTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def extraLinkColor (clojure.core/str unselectedTextColor))
(def extraLinkHoverColor (clojure.core/str linkHoverColor))
(def buttonMargin nil)
(def linkHoverBackground (clojure.core/str white))
(def linkHoverBorder (clojure.core/str border))
(def linkHoverZIndex (clojure.core/str "55"))
(def linkHoverRaiseDistance (clojure.core/str "3px"))
(def linkHoverTransform (clojure.core/str "translateY"))
(def
 shadowHoverBoxShadow
 (clojure.core/str
  "0px"
  " "
  shadowDistance
  " "
  linkHoverRaiseDistance
  " "
  "0px"
  " "
  solidSelectedBorderColor))
(def linkHoverBoxShadow (clojure.core/str borderShadow))
(def raisedShadow (clojure.core/str floatingShadow))
(def raisedShadowHover (clojure.core/str floatingShadowHover))
(def wideCardSpacing (clojure.core/str "1em"))
(def cardSpacing (clojure.core/str "0.75em"))
(def smallCardSpacing (clojure.core/str "0.5em"))
(def oneCardSpacing (clojure.core/str "0em"))
(def twoCardSpacing (clojure.core/str wideCardSpacing))
(def threeCardSpacing (clojure.core/str wideCardSpacing))
(def fourCardSpacing (clojure.core/str cardSpacing))
(def fiveCardSpacing (clojure.core/str cardSpacing))
(def sixCardSpacing (clojure.core/str cardSpacing))
(def sevenCardSpacing (clojure.core/str smallCardSpacing))
(def eightCardSpacing (clojure.core/str smallCardSpacing))
(def nineCardSpacing (clojure.core/str smallCardSpacing))
(def tenCardSpacing (clojure.core/str smallCardSpacing))
(def oneCard (clojure.core/str oneColumn))
(def oneCardOffset (clojure.core/str "0em"))
(def twoCardOffset nil)
(def threeCardOffset nil)
(def fourCardOffset nil)
(def fiveCardOffset nil)
(def sixCardOffset nil)
(def sevenCardOffset nil)
(def eightCardOffset nil)
(def nineCardOffset nil)
(def tenCardOffset nil)
(def stackableRowSpacing (clojure.core/str "1em"))
(def stackableCardSpacing (clojure.core/str "1em"))
(def medium (clojure.core/str "1em"))
(def coloredShadowDistance (clojure.core/str "2px"))
(defstyles root)
