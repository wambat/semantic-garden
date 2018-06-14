(clojure.core/ns
 styles.themes.instagram.views.card
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def borderBoxShadow (clojure.core/str "none"))
(def shadowBoxShadow (clojure.core/str "none"))
(def boxShadow (clojure.core/str "none"))
(def internalBorderColor (clojure.core/str "#EDEDEE"))
(def border (clojure.core/str "1px" " " "solid" " " "#EDEDEE"))
(def contentPadding (clojure.core/str "14px" " " "20px"))
(def metaColor (clojure.core/str "#A5A7AA"))
(def linkHoverRaiseDistance (clojure.core/str "0px"))
(def linkHoverBoxShadow (clojure.core/str "none"))
(def linkHoverBorder (clojure.core/str "1px" " " "solid" " " "#D0D0D8"))
(defstyles root)
