(clojure.core/ns
 styles.themes.default.modules.embed
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str lightGrey))
(def transitionDuration (clojure.core/str "0.5s"))
(def transitionEasing (clojure.core/str defaultEasing))
(def placeholderUnderlay (clojure.core/str background))
(def placeholderBackground (clojure.core/str "radial-gradient"))
(def placeholderBackgroundOpacity (clojure.core/str "0.50.5"))
(def
 placeholderBackgroundTransition
 (clojure.core/str
  "opacity"
  " "
  transitionDuration
  " "
  transitionEasing))
(def iconBackground (clojure.core/str veryStrongTransparentBlack))
(def iconSize (clojure.core/str "66" " " "rem"))
(def
 iconTransition
 (clojure.core/str "color" " " transitionDuration " " transitionEasing))
(def iconColor (clojure.core/str white))
(def
 iconShadow
 (clojure.core/str "0px" " " "2px" " " "10px" " " "rgba"))
(def iconZIndex (clojure.core/str "1010"))
(def
 hoverPlaceholderBackground
 (clojure.core/str placeholderBackground))
(def hoverPlaceholderBackgroundOpacity (clojure.core/str "11"))
(def hoverIconColor (clojure.core/str white))
(defstyles root)
