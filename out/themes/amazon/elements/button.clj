(clojure.core/ns
 styles.themes.amazon.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageFont (clojure.core/str "sans-serif"))
(def textTransform (clojure.core/str "none"))
(def textColor (clojure.core/str "#111111"))
(def fontWeight (clojure.core/str "normal"))
(def
 transition
 (clojure.core/str "background" " " defaultDuration " " defaultEasing))
(def hoverBackgroundColor (clojure.core/str "#E0E0E0"))
(def borderRadius (clojure.core/str "3px"))
(def verticalPadding (clojure.core/str "0.8em"))
(def horizontalPadding (clojure.core/str "1.75em"))
(def backgroundColor (clojure.core/str "#F7F8FA"))
(def backgroundImage (clojure.core/str "linear-gradient"))
(def
 boxShadow
 (clojure.core/str
  "00"
  " "
  "00"
  " "
  "00"
  " "
  "1px"
  " "
  "#ADB2BB"
  " "
  "inset"))
(def coloredBackgroundImage (clojure.core/str "linear-gradient"))
(def
 coloredBoxShadow
 (clojure.core/str
  "0px"
  " "
  "1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "rgba"
  " "
  "inset"))
(def
 downBoxShadow
 (clojure.core/str "00" " " "1px" " " "3px" " " "rgba" " " "inset"))
(def labeledIconBackgroundColor (clojure.core/str "#313A43"))
(def labeledIconColor (clojure.core/str "#FFFFFF"))
(def labeledIconBorder (clojure.core/str "transparent"))
(def black (clojure.core/str "#444C55"))
(def orange (clojure.core/str "#F4CC67"))
(def coloredBackgroundImage (clojure.core/str "linear-gradient"))
(def primaryColor (clojure.core/str orange))
(def secondaryColor (clojure.core/str black))
(def mini (clojure.core/str "10px"))
(def tiny (clojure.core/str "11px"))
(def small (clojure.core/str "12px"))
(def medium (clojure.core/str "13px"))
(def large (clojure.core/str "14px"))
(def big (clojure.core/str "16px"))
(def huge (clojure.core/str "18px"))
(def massive (clojure.core/str "22px"))
(defstyles root)
