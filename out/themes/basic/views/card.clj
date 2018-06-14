(clojure.core/ns
 styles.themes.basic.views.card
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def width (clojure.core/str "250px"))
(def background (clojure.core/str "transparent"))
(def border (clojure.core/str "none"))
(def boxShadow (clojure.core/str "none"))
(def contentPadding (clojure.core/str "1em" " " "0em"))
(def rowSpacing (clojure.core/str "1.5em"))
(def
 groupCardMargin
 (clojure.core/str "0em" " " horizontalSpacing " " rowSpacing))
(def extraBackground (clojure.core/str "transparent"))
(def extraDivider (clojure.core/str "none"))
(def extraBoxShadow (clojure.core/str "none"))
(def extraPadding (clojure.core/str "0.5em" " " "0em"))
(def extraLinkColor (clojure.core/str textColor))
(def extraLinkHoverColor (clojure.core/str linkHoverColor))
(def headerFontSize (clojure.core/str relativeLarge))
(def headerLinkColor (clojure.core/str textColor))
(def headerLinkHoverColor (clojure.core/str linkHoverColor))
(def imageBorderRadius (clojure.core/str borderRadius))
(def imageBorder (clojure.core/str "1px" " " "solid" " " borderColor))
(def linkHoverBackground (clojure.core/str "transparent"))
(def linkHoverBoxShadow (clojure.core/str "none"))
(defstyles root)
