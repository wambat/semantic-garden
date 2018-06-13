(clojure.core/ns
 themes.bookish.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def headerFont (clojure.core/str "serif"))
(def fontWeight (clojure.core/str normal))
(def iconSize (clojure.core/str "1.5em"))
(def iconOffset (clojure.core/str "0.2em"))
(def iconAlignment (clojure.core/str "top"))
(def subHeaderFontSize (clojure.core/str "0.850.85" " " "rem"))
(def dividedBorder (clojure.core/str "1px" " " "dotted" " " "rgba"))
(def blockVerticalPadding (clojure.core/str "1.3em"))
(def blockHorizontalPadding (clojure.core/str "1em"))
(def
 attachedBackground
 (clojure.core/str
  "linear-gradient"
  " "
  "repeat"
  " "
  "scroll"
  " "
  "00"
  " "
  "00"
  " "
  "#F8F8F8"))
(def attachedVerticalPadding (clojure.core/str "1.31.3"))
(def attachedHorizontalPadding (clojure.core/str "1em"))
(def h1 (clojure.core/str "1.751.75" " " "rem"))
(def h2 (clojure.core/str "1.331.33" " " "rem"))
(def h3 (clojure.core/str "1.331.33" " " "rem"))
(def h4 (clojure.core/str "11" " " "rem"))
(def h5 (clojure.core/str "0.90.9" " " "rem"))
(def hugeFontSize (clojure.core/str "1.75em"))
(def largeFontSize (clojure.core/str "1.33em"))
(def mediumFontSize (clojure.core/str "1.33em"))
(def smallFontSize (clojure.core/str "1em"))
(def tinyFontSize (clojure.core/str "0.9em"))
(defstyles root)
