(clojure.core/ns
 styles.themes.default.views.item
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def groupMargin (clojure.core/str "1.5em" " " "0em"))
(def display (clojure.core/str "flex"))
(def background (clojure.core/str "transparent"))
(def borderRadius (clojure.core/str "00" " " "rem"))
(def minHeight (clojure.core/str "0px"))
(def padding (clojure.core/str "0em"))
(def width (clojure.core/str "100%"))
(def boxShadow (clojure.core/str "none"))
(def border (clojure.core/str "none"))
(def zIndex (clojure.core/str ""))
(def
 transition
 (clojure.core/str "box-shadow" " " defaultDuration " " defaultEasing))
(def itemSpacing (clojure.core/str "1em"))
(def imageWidth (clojure.core/str "175px"))
(def contentImageDistance (clojure.core/str "1.5em"))
(def tabletItemSpacing (clojure.core/str "1em"))
(def tabletImageWidth (clojure.core/str "150px"))
(def tabletContentImageDistance (clojure.core/str "1em"))
(def mobileItemSpacing (clojure.core/str "2em"))
(def mobileImageWidth (clojure.core/str "auto"))
(def mobileImageMaxHeight (clojure.core/str "250px"))
(def mobileContentImageDistance (clojure.core/str "1.5em"))
(def imageDisplay (clojure.core/str "block"))
(def imageFloat (clojure.core/str "none"))
(def imageMaxHeight (clojure.core/str ""))
(def imageVerticalAlign (clojure.core/str "top"))
(def imageMargin (clojure.core/str "0em"))
(def imagePadding (clojure.core/str "0em"))
(def imageBorder (clojure.core/str "none"))
(def imageBorderRadius (clojure.core/str "0.1250.125" " " "rem"))
(def imageBoxShadow (clojure.core/str "none"))
(def imageBorder (clojure.core/str "none"))
(def contentDisplay (clojure.core/str "block"))
(def contentVerticalAlign (clojure.core/str "top"))
(def contentWidth (clojure.core/str "auto"))
(def contentOffset (clojure.core/str "0em"))
(def contentBackground (clojure.core/str "none"))
(def contentMargin (clojure.core/str "0em"))
(def contentPadding (clojure.core/str "0em"))
(def contentFontSize (clojure.core/str "1em"))
(def contentBorder (clojure.core/str "none"))
(def contentBorderRadius (clojure.core/str "0em"))
(def contentBoxShadow (clojure.core/str "none"))
(def headerMargin nil)
(def headerFontWeight (clojure.core/str bold))
(def headerFontSize (clojure.core/str relativeBig))
(def headerColor (clojure.core/str darkTextColor))
(def metaMargin (clojure.core/str "0.5em" " " "0em" " " "0.5em"))
(def metaFontSize (clojure.core/str "1em"))
(def metaLineHeight (clojure.core/str "1em"))
(def metaSpacing (clojure.core/str "0.3em"))
(def metaColor (clojure.core/str "rgba"))
(def actionOpacity (clojure.core/str "0.750.75"))
(def actionHoverOpacity (clojure.core/str "11"))
(def
 actionTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def favoriteColor (clojure.core/str "#FFB70A"))
(def favoriteActiveColor (clojure.core/str "#FFE623"))
(def likeColor (clojure.core/str "#FF2733"))
(def likeActiveColor (clojure.core/str "#FF2733"))
(def headerLinkColor (clojure.core/str headerColor))
(def headerLinkHoverColor (clojure.core/str linkHoverColor))
(def metaLinkColor (clojure.core/str lightTextColor))
(def metaLinkHoverColor (clojure.core/str textColor))
(def contentLinkColor (clojure.core/str ""))
(def contentLinkHoverColor (clojure.core/str ""))
(def
 contentLinkTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def descriptionDistance (clojure.core/str "0.6em"))
(def descriptionMaxWidth (clojure.core/str "auto"))
(def descriptionFontSize (clojure.core/str "1em"))
(def descriptionLineHeight (clojure.core/str lineHeight))
(def descriptionColor (clojure.core/str textColor))
(def contentImageWidth (clojure.core/str ""))
(def contentImageVerticalAlign (clojure.core/str "middle"))
(def avatarSize (clojure.core/str contentImageWidth))
(def avatarBorderRadius (clojure.core/str circularRadius))
(def paragraphDistance (clojure.core/str "0.5em"))
(def extraDivider (clojure.core/str "none"))
(def extraHorizontalSpacing (clojure.core/str "0.50.5" " " "rem"))
(def extraRowSpacing (clojure.core/str "0.50.5" " " "rem"))
(def extraBackground (clojure.core/str "none"))
(def extraDisplay (clojure.core/str "block"))
(def extraPosition (clojure.core/str "relative"))
(def extraTop (clojure.core/str "0em"))
(def extraLeft (clojure.core/str "0em"))
(def extraWidth (clojure.core/str "100%"))
(def extraPadding (clojure.core/str "0em" " " "0em" " " "0em"))
(def extraBoxShadow (clojure.core/str "none"))
(def extraColor (clojure.core/str lightTextColor))
(def
 extraTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def relaxedItemSpacing (clojure.core/str "1.5em"))
(def veryRelaxedItemSpacing (clojure.core/str "2em"))
(def dividedBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def dividedMargin (clojure.core/str "0em"))
(def dividedPadding (clojure.core/str "1em" " " "0em"))
(def dividedFirstLastMargin (clojure.core/str "0em"))
(def dividedFirstLastPadding (clojure.core/str "0em"))
(def unstackableMobileImageWidth (clojure.core/str "125px"))
(defstyles root)
