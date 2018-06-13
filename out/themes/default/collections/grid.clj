(clojure.core/ns
 themes.default.collections.grid
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def minWidth (clojure.core/str "320px"))
(def gutterWidth (clojure.core/str "22" " " "rem"))
(def rowSpacing (clojure.core/str "22" " " "rem"))
(def columnMaxImageWidth (clojure.core/str "100%"))
(def consecutiveGridDistance nil)
(def relaxedGutterWidth (clojure.core/str "33" " " "rem"))
(def veryRelaxedGutterWidth (clojure.core/str "55" " " "rem"))
(def
 dividedBorder
 (clojure.core/str
  "-1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  borderColor))
(def
 verticallyDividedBorder
 (clojure.core/str
  "0px"
  " "
  "-1px"
  " "
  "0px"
  " "
  "0px"
  " "
  borderColor))
(def
 dividedInvertedBorder
 (clojure.core/str
  "-1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  whiteBorderColor))
(def
 verticallyDividedInvertedBorder
 (clojure.core/str
  "0px"
  " "
  "-1px"
  " "
  "0px"
  " "
  "0px"
  " "
  whiteBorderColor))
(def celledMargin (clojure.core/str "1em" " " "0em"))
(def celledWidth (clojure.core/str "1px"))
(def celledBorderColor (clojure.core/str solidBorderColor))
(def celledPadding (clojure.core/str "1em"))
(def celledRelaxedPadding (clojure.core/str "1.5em"))
(def celledVeryRelaxedPadding (clojure.core/str "2em"))
(def
 celledGridDivider
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  celledWidth
  " "
  celledBorderColor))
(def celledColumnDivider (clojure.core/str))
(def stackableRowSpacing (clojure.core/str rowSpacing))
(def stackableGutter (clojure.core/str gutterWidth))
(def
 stackableMobileBorder
 (clojure.core/str "1px" " " "solid" " " borderColor))
(def
 stackableInvertedMobileBorder
 (clojure.core/str "1px" " " "solid" " " whiteBorderColor))
(def mobileWidth (clojure.core/str "auto"))
(def mobileMargin (clojure.core/str "0em"))
(def mobileGutter (clojure.core/str "0em"))
(def tabletWidth (clojure.core/str "auto"))
(def tabletMargin (clojure.core/str "0em"))
(def tabletGutter (clojure.core/str "2em"))
(def computerWidth (clojure.core/str "auto"))
(def computerMargin (clojure.core/str "0em"))
(def computerGutter (clojure.core/str "3%"))
(def largeMonitorWidth (clojure.core/str "auto"))
(def largeMonitorMargin (clojure.core/str "0em"))
(def largeMonitorGutter (clojure.core/str "15%"))
(def widescreenMonitorWidth (clojure.core/str "auto"))
(def widescreenMargin (clojure.core/str "0em"))
(def widescreenMonitorGutter (clojure.core/str "23%"))
(defstyles root)
