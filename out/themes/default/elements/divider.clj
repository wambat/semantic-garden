(clojure.core/ns
 styles.themes.default.elements.divider
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def margin (clojure.core/str "11" " " "rem" " " "00" " " "rem"))
(def highlightWidth (clojure.core/str "1px"))
(def highlightColor (clojure.core/str whiteBorderColor))
(def shadowWidth (clojure.core/str "1px"))
(def shadowColor (clojure.core/str borderColor))
(def letterSpacing (clojure.core/str "0.05em"))
(def fontWeight (clojure.core/str bold))
(def color (clojure.core/str darkTextColor))
(def textTransform (clojure.core/str "uppercase"))
(def dividerIconSize (clojure.core/str "11" " " "rem"))
(def dividerIconMargin (clojure.core/str "00" " " "rem"))
(def horizontalMargin (clojure.core/str ""))
(def horizontalDividerMargin (clojure.core/str "1em"))
(def verticalDividerMargin (clojure.core/str "11" " " "rem"))
(def invertedTextColor (clojure.core/str white))
(def invertedHighlightColor (clojure.core/str "rgba"))
(def invertedShadowColor (clojure.core/str borderColor))
(def sectionMargin (clojure.core/str "22" " " "rem"))
(def medium (clojure.core/str "11" " " "rem"))
(defstyles root)
