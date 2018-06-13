(clojure.core/ns
 themes.instagram.views.card
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def borderBoxShadow (clojure.core/str "none"))
(def shadowBoxShadow (clojure.core/str "none"))
(def boxShadow (clojure.core/str "none"))
(def internalBorderColor nil)
(def border nil)
(def contentPadding (clojure.core/str "14px" " " "20px"))
(def metaColor nil)
(def linkHoverRaiseDistance (clojure.core/str "0px"))
(def linkHoverBoxShadow (clojure.core/str "none"))
(def linkHoverBorder nil)
(defstyles root)
