(clojure.core/ns
 themes.default.modules.rating
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def margin (clojure.core/str "0em" " " relativeMini))
(def whiteSpace (clojure.core/str "nowrap"))
(def verticalAlign (clojure.core/str "baseline"))
(def iconCursor (clojure.core/str "pointer"))
(def iconWidth (clojure.core/str "1.25em"))
(def iconHeight (clojure.core/str "auto"))
(def
 iconTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def inactiveBackground (clojure.core/str "transparent"))
(def inactiveColor (clojure.core/str "rgba"))
(def selectedBackground (clojure.core/str inactiveBackground))
(def selectedColor (clojure.core/str textColor))
(def activeBackground (clojure.core/str inactiveBackground))
(def activeColor (clojure.core/str darkTextColor))
(def starIconWidth (clojure.core/str iconWidth))
(def starIconHeight (clojure.core/str iconHeight))
(def starShadowWidth (clojure.core/str "1px"))
(def starInactiveBackground (clojure.core/str inactiveBackground))
(def starInactiveColor (clojure.core/str inactiveColor))
(def starInactiveTextShadow (clojure.core/str "none"))
(def starActiveBackground (clojure.core/str activeBackground))
(def starActiveColor nil)
(def starActiveShadowColor nil)
(def
 starActiveTextShadow
 (clojure.core/str
  starShadowWidth
  " "
  "0px"
  " "
  "0px"
  " "
  starActiveShadowColor))
(def starSelectedBackground (clojure.core/str selectedBackground))
(def starSelectedColor nil)
(def starSelectedShadowColor nil)
(def
 starSelectedTextShadow
 (clojure.core/str
  starShadowWidth
  " "
  "0px"
  " "
  "0px"
  " "
  starSelectedShadowColor))
(def heartIconWidth (clojure.core/str "1.4em"))
(def heartIconHeight (clojure.core/str iconHeight))
(def heartShadowWidth (clojure.core/str "1px"))
(def heartInactiveBackground (clojure.core/str inactiveBackground))
(def heartInactiveColor (clojure.core/str inactiveColor))
(def heartInactiveTextShadow (clojure.core/str "none"))
(def heartActiveBackground (clojure.core/str activeBackground))
(def heartActiveColor nil)
(def heartActiveShadowColor nil)
(def
 heartActiveTextShadow
 (clojure.core/str
  heartShadowWidth
  " "
  "0px"
  " "
  "0px"
  " "
  heartActiveShadowColor))
(def heartSelectedBackground (clojure.core/str selectedBackground))
(def heartSelectedColor nil)
(def heartSelectedShadowColor nil)
(def
 heartSelectedTextShadow
 (clojure.core/str
  heartShadowWidth
  " "
  "0px"
  " "
  "0px"
  " "
  heartSelectedShadowColor))
(def interactiveActiveIconOpacity (clojure.core/str "11"))
(def interactiveSelectedIconOpacity (clojure.core/str "11"))
(def massive (clojure.core/str "22" " " "rem"))
(defstyles root)
