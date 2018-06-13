(clojure.core/ns
 themes.default.modules.modal
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str white))
(def border (clojure.core/str "none"))
(def zIndex (clojure.core/str "10011001"))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def transformOrigin (clojure.core/str "50%" " " "25%"))
(def
 boxShadow
 (clojure.core/str "1px" " " "3px" " " "15px" " " "2px" " " "rgba"))
(def closeOpacity (clojure.core/str "0.80.8"))
(def closeSize (clojure.core/str "1.25em"))
(def closeColor (clojure.core/str white))
(def closeHitbox (clojure.core/str "2.252.25" " " "rem"))
(def closeDistance (clojure.core/str "0.250.25" " " "rem"))
(def
 closePadding
 (clojure.core/str
  closeHitBoxOffset
  " "
  "00"
  " "
  "rem"
  " "
  "00"
  " "
  "rem"
  " "
  "00"
  " "
  "rem"))
(def closeTop (clojure.core/str))
(def closeRight (clojure.core/str))
(def headerMargin (clojure.core/str "0em"))
(def headerVerticalPadding (clojure.core/str "1.251.25" " " "rem"))
(def headerHorizontalPadding (clojure.core/str "1.51.5" " " "rem"))
(def
 headerPadding
 (clojure.core/str headerVerticalPadding " " headerHorizontalPadding))
(def headerBackground (clojure.core/str white))
(def headerColor (clojure.core/str darkTextColor))
(def headerFontSize (clojure.core/str huge))
(def headerBoxShadow (clojure.core/str "none"))
(def headerFontWeight (clojure.core/str bold))
(def headerFontFamily (clojure.core/str headerFont))
(def headerBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def contentFontSize (clojure.core/str "1em"))
(def contentPadding (clojure.core/str "1.51.5" " " "rem"))
(def contentLineHeight (clojure.core/str "1.41.4"))
(def contentBackground nil)
(def imageWidth nil)
(def imageIconSize (clojure.core/str "88" " " "rem"))
(def imageVerticalAlign (clojure.core/str "top"))
(def descriptionDistance (clojure.core/str "2em"))
(def descriptionMinWidth nil)
(def descriptionWidth (clojure.core/str "auto"))
(def descriptionVerticalAlign (clojure.core/str "top"))
(def actionBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def actionBackground (clojure.core/str offWhite))
(def actionPadding (clojure.core/str "11" " " "rem" " " "11" " " "rem"))
(def actionAlign (clojure.core/str "right"))
(def buttonDistance (clojure.core/str "0.75em"))
(def innerCloseRight (clojure.core/str "11" " " "rem"))
(def innerCloseColor (clojure.core/str textColor))
(def
 mobileHeaderPadding
 (clojure.core/str "0.750.75" " " "rem" " " "11" " " "rem"))
(def mobileContentPadding (clojure.core/str "11" " " "rem"))
(def
 mobileImagePadding
 (clojure.core/str
  "00"
  " "
  "rem"
  " "
  "00"
  " "
  "rem"
  " "
  "11"
  " "
  "rem"))
(def
 mobileDescriptionPadding
 (clojure.core/str "11" " " "rem" " " "00" " " "rem"))
(def mobileButtonDistance (clojure.core/str "11" " " "rem"))
(def
 mobileActionPadding
 (clojure.core/str "11" " " "rem" " " "11" " " "rem"))
(def mobileImageIconSize (clojure.core/str "55" " " "rem"))
(def mobileCloseTop (clojure.core/str "0.50.5" " " "rem"))
(def mobileCloseRight (clojure.core/str "0.50.5" " " "rem"))
(def mobileWidth (clojure.core/str "95%"))
(def tabletWidth (clojure.core/str "88%"))
(def computerWidth (clojure.core/str "850px"))
(def largeMonitorWidth (clojure.core/str "900px"))
(def widescreenMonitorWidth (clojure.core/str "950px"))
(def
 mobileMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 tabletMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 computerMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 largeMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 widescreenMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def fullScreenWidth (clojure.core/str "95%"))
(def fullScreenOffset (clojure.core/str "0em"))
(def fullScreenMargin (clojure.core/str "1em" " " "auto"))
(def
 invertedBoxShadow
 (clojure.core/str "1px" " " "3px" " " "10px" " " "2px" " " "rgba"))
(def loadingZIndex (clojure.core/str "-1-1"))
(def basicModalHeaderColor (clojure.core/str white))
(def basicModalColor (clojure.core/str white))
(def basicModalCloseTop (clojure.core/str "11" " " "rem"))
(def basicModalCloseRight (clojure.core/str "1.51.5" " " "rem"))
(def basicInnerCloseColor (clojure.core/str white))
(def basicInvertedModalColor (clojure.core/str textColor))
(def basicInvertedModalHeaderColor (clojure.core/str darkTextColor))
(def topAlignedMargin (clojure.core/str "55" " " "vh"))
(def mobileTopAlignedMargin (clojure.core/str "11" " " "rem"))
(def scrollingMargin (clojure.core/str "11" " " "rem"))
(def mobileScrollingMargin (clojure.core/str mobileTopAlignedMargin))
(def scrollingContentMaxHeight (clojure.core/str "calc"))
(def miniRatio (clojure.core/str "0.40.4"))
(def tinyRatio (clojure.core/str "0.60.6"))
(def smallRatio (clojure.core/str "0.80.8"))
(def largeRatio (clojure.core/str "1.21.2"))
(def miniHeaderSize (clojure.core/str "1.3em"))
(def miniMobileWidth (clojure.core/str mobileWidth))
(def miniTabletWidth nil)
(def miniComputerWidth nil)
(def miniLargeMonitorWidth nil)
(def miniWidescreenMonitorWidth nil)
(def
 miniMobileMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 miniTabletMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 miniComputerMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 miniLargeMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 miniWidescreenMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def tinyHeaderSize (clojure.core/str "1.3em"))
(def tinyMobileWidth (clojure.core/str mobileWidth))
(def tinyTabletWidth nil)
(def tinyComputerWidth nil)
(def tinyLargeMonitorWidth nil)
(def tinyWidescreenMonitorWidth nil)
(def
 tinyMobileMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 tinyTabletMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 tinyComputerMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 tinyLargeMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 tinyWidescreenMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def smallHeaderSize (clojure.core/str "1.3em"))
(def smallMobileWidth (clojure.core/str mobileWidth))
(def smallTabletWidth nil)
(def smallComputerWidth nil)
(def smallLargeMonitorWidth nil)
(def smallWidescreenMonitorWidth nil)
(def
 smallMobileMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 smallTabletMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 smallComputerMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 smallLargeMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 smallWidescreenMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def largeHeaderSize (clojure.core/str "1.6em"))
(def largeMobileWidth (clojure.core/str mobileWidth))
(def largeTabletWidth (clojure.core/str tabletWidth))
(def largeComputerWidth nil)
(def largeLargeMonitorWidth nil)
(def largeWidescreenMonitorWidth nil)
(def
 largeMobileMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 largeTabletMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 largeComputerMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 largeLargeMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(def
 largeWidescreenMonitorMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "0em"))
(defstyles root)
