(clojure.core/ns
 themes.instagram.views.card
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [) :refer :all]))
(defstyles
 root
 [".ui.cards"
  ["> .card"
   {"font-family" nil,
    "font-size-adjust" (clojure.core/str "0.50.5")}]]
 [".ui.card"
  {"font-family" nil, "font-size-adjust" (clojure.core/str "0.50.5")}])
