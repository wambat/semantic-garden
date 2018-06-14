(clojure.core/ns
 styles.themes.default.elements.loader
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def loaderTopOffset (clojure.core/str "50%"))
(def loaderLeftOffset (clojure.core/str "50%"))
(def
 shapeBorderColor
 (clojure.core/str loaderLineColor " " "transparent" " " "transparent"))
(def
 invertedShapeBorderColor
 (clojure.core/str
  invertedLoaderLineColor
  " "
  "transparent"
  " "
  "transparent"))
(def textDistance (clojure.core/str relativeMini))
(def loaderTextColor (clojure.core/str textColor))
(def invertedLoaderTextColor (clojure.core/str invertedTextColor))
(def indeterminateDirection (clojure.core/str "reverse"))
(def indeterminateSpeed nil)
(def inlineVerticalAlign (clojure.core/str "middle"))
(def inlineMargin (clojure.core/str "0em"))
(def mini nil)
(def tiny nil)
(def small nil)
(def medium nil)
(def large nil)
(def big nil)
(def huge nil)
(def massive nil)
(def miniOffset nil)
(def tinyOffset nil)
(def smallOffset nil)
(def mediumOffset nil)
(def largeOffset nil)
(def bigOffset nil)
(def hugeOffset nil)
(def massiveOffset nil)
(def tinyFontSize (clojure.core/str relativeTiny))
(def miniFontSize (clojure.core/str relativeMini))
(def smallFontSize (clojure.core/str relativeSmall))
(def mediumFontSize (clojure.core/str relativeMedium))
(def largeFontSize (clojure.core/str relativeLarge))
(def bigFontSize (clojure.core/str relativeBig))
(def hugeFontSize (clojure.core/str relativeHuge))
(def massiveFontSize (clojure.core/str relativeMassive))
(defstyles root)
