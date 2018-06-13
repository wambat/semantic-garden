(clojure.core/ns
 themes.github.collections.menu
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def itemVerticalPadding (clojure.core/str "1em"))
(def itemHorizontalPadding (clojure.core/str "1.25em"))
(def background (clojure.core/str "#FFFFFF" " " "linear-gradient"))
(def fontWeight (clojure.core/str "normal"))
(def activeBorderSize (clojure.core/str "0em"))
(def hoverBackground (clojure.core/str "rgba"))
(def downBackground (clojure.core/str "rgba"))
(def activeBackground (clojure.core/str "rgba"))
(def activeHoverBackground (clojure.core/str "rgba"))
(def headerBackground (clojure.core/str "rgba"))
(def subMenuMargin (clojure.core/str "0.5em" " " "-0.6em" " " "00"))
(def subMenuHorizontalPadding (clojure.core/str "0.7em"))
(def arrowHoverColor (clojure.core/str "#EEEEEE"))
(def arrowActiveColor (clojure.core/str "#EEEEEE"))
(def arrowVerticalHoverColor (clojure.core/str "#F4F4F4"))
(def arrowVerticalActiveColor (clojure.core/str "#F4F4F4"))
(def dividerBackground (clojure.core/str "#E8E8E8"))
(def verticalDividerBackground (clojure.core/str "#E8E8E8"))
(def buttonOffset (clojure.core/str "-0.15em"))
(def buttonVerticalPadding (clojure.core/str "0.75em"))
(def paginationMinWidth (clojure.core/str "3.5em"))
(def tieredActiveItemBackground (clojure.core/str "#F5F5F5"))
(def tieredActiveMenuBackground (clojure.core/str "#F5F5F5"))
(def verticalBackground (clojure.core/str "#FFFFFF"))
(def verticalItemBackground (clojure.core/str "linear-gradient"))
(def invertedBackground (clojure.core/str black " " "linear-gradient"))
(def
 invertedBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " "rgba"))
(def secondaryVerticalPadding (clojure.core/str "0.75em"))
(defstyles root)
