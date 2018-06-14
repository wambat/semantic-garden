(clojure.core/ns
 styles.themes.default.views.statistic
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def margin (clojure.core/str "1em" " " "0em"))
(def textAlign (clojure.core/str "center"))
(def maxWidth (clojure.core/str "auto"))
(def horizontalSpacing (clojure.core/str "1.5em"))
(def rowSpacing (clojure.core/str "2em"))
(def groupMargin nil)
(def
 elementMargin
 (clojure.core/str "0em" " " horizontalSpacing " " rowSpacing))
(def elementMaxWidth (clojure.core/str maxWidth))
(def valueFont (clojure.core/str pageFont))
(def valueFontWeight (clojure.core/str normal))
(def valueLineHeight (clojure.core/str "1em"))
(def valueColor (clojure.core/str black))
(def valueTextTransform (clojure.core/str "uppercase"))
(def labelSize (clojure.core/str relativeMedium))
(def topLabelDistance (clojure.core/str "00" " " "rem"))
(def bottomLabelDistance (clojure.core/str "00" " " "rem"))
(def labelFont (clojure.core/str headerFont))
(def labelFontWeight (clojure.core/str bold))
(def labelColor (clojure.core/str textColor))
(def labelLineHeight (clojure.core/str relativeLarge))
(def labelTextTransform (clojure.core/str "uppercase"))
(def textValueLineHeight (clojure.core/str "1em"))
(def textValueMinHeight (clojure.core/str "2em"))
(def textValueFontWeight (clojure.core/str bold))
(def imageHeight (clojure.core/str "33" " " "rem"))
(def imageVerticalAlign (clojure.core/str "baseline"))
(def horizontalGroupElementMargin (clojure.core/str "1em" " " "0em"))
(def horizontalLabelDistance (clojure.core/str "0.75em"))
(def
 leftFloatedMargin
 (clojure.core/str "0em" " " "2em" " " "1em" " " "0em"))
(def
 rightFloatedMargin
 (clojure.core/str "0em" " " "0em" " " "1em" " " "2em"))
(def invertedValueColor (clojure.core/str white))
(def invertedLabelColor (clojure.core/str invertedTextColor))
(def itemGroupMargin nil)
(def itemMargin (clojure.core/str "0em" " " "0em" " " rowSpacing))
(def miniTextValueSize (clojure.core/str "11" " " "rem"))
(def miniValueSize (clojure.core/str "1.51.5" " " "rem"))
(def miniHorizontalValueSize (clojure.core/str "1.51.5" " " "rem"))
(def tinyTextValueSize (clojure.core/str "11" " " "rem"))
(def tinyValueSize (clojure.core/str "22" " " "rem"))
(def tinyHorizontalValueSize (clojure.core/str "22" " " "rem"))
(def smallTextValueSize (clojure.core/str "11" " " "rem"))
(def smallValueSize (clojure.core/str "33" " " "rem"))
(def smallHorizontalValueSize (clojure.core/str "22" " " "rem"))
(def textValueSize (clojure.core/str "22" " " "rem"))
(def valueSize (clojure.core/str "44" " " "rem"))
(def horizontalValueSize (clojure.core/str "33" " " "rem"))
(def largeTextValueSize (clojure.core/str "2.52.5" " " "rem"))
(def largeValueSize (clojure.core/str "55" " " "rem"))
(def largeHorizontalValueSize (clojure.core/str "44" " " "rem"))
(def hugeTextValueSize (clojure.core/str "2.52.5" " " "rem"))
(def hugeValueSize (clojure.core/str "66" " " "rem"))
(def hugeHorizontalValueSize (clojure.core/str "55" " " "rem"))
(defstyles root)
