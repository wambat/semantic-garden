(clojure.core/ns
 themes.default.modules.nag
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def position (clojure.core/str "relative"))
(def width (clojure.core/str "100%"))
(def zIndex (clojure.core/str "999999"))
(def margin (clojure.core/str "0em"))
(def background (clojure.core/str "#555555"))
(def opacity (clojure.core/str "0.950.95"))
(def minHeight (clojure.core/str "0em"))
(def padding (clojure.core/str "0.75em" " " "1em"))
(def lineHeight (clojure.core/str "1em"))
(def
 boxShadow
 (clojure.core/str "0px" " " "1px" " " "2px" " " "0px" " " "rgba"))
(def fontSize (clojure.core/str "11" " " "rem"))
(def textAlign (clojure.core/str "center"))
(def color (clojure.core/str textColor))
(def transition (clojure.core/str "0.2s" " " "background" " " "ease"))
(def titleColor (clojure.core/str white))
(def titleMargin (clojure.core/str "0em" " " "0.5em"))
(def closeSize (clojure.core/str "1em"))
(def closeMargin (clojure.core/str))
(def closeTop (clojure.core/str "50%"))
(def closeRight (clojure.core/str "1em"))
(def closeColor (clojure.core/str white))
(def closeTransition (clojure.core/str "opacity" " " "0.2s" " " "ease"))
(def closeOpacity (clojure.core/str "0.40.4"))
(def nagHoverBackground (clojure.core/str background))
(def nagHoverOpacity (clojure.core/str "11"))
(def closeHoverOpacity (clojure.core/str "11"))
(def top (clojure.core/str "0em"))
(def bottom (clojure.core/str "0em"))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def
 topBorderRadius
 (clojure.core/str "0em" " " "0em" " " borderRadius " " borderRadius))
(def
 bottomBorderRadius
 (clojure.core/str borderRadius " " borderRadius " " "0em" " " "0em"))
(def invertedBackground (clojure.core/str darkWhite))
(def groupedBorderRadius (clojure.core/str "0em"))
(defstyles root)
