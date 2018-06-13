(clojure.core/ns
 themes.github.modules.dropdown
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def
 transition
 (clojure.core/str "width" " " defaultDuration " " defaultEasing))
(def menuPadding (clojure.core/str "0px"))
(def itemVerticalPadding (clojure.core/str relative8px))
(def itemHorizontalPadding (clojure.core/str relative14px))
(def
 dropdownIconMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "2px"))
(def
 raisedBoxShadow
 (clojure.core/str "0px" " " "3px" " " "12px" " " "rgba"))
(def menuPadding (clojure.core/str relative5px " " "0px"))
(def menuHeaderMargin (clojure.core/str "0em"))
(def
 menuHeaderPadding
 (clojure.core/str relative6px " " itemHorizontalPadding))
(def menuHeaderFontSize (clojure.core/str relative12px))
(def menuHeaderTextTransform (clojure.core/str "none"))
(def menuHeaderFontWeight (clojure.core/str "normal"))
(def menuHeaderColor (clojure.core/str "#767676"))
(def menuDividerMargin (clojure.core/str relative8px " " "0em"))
(def disabledOpacity (clojure.core/str "0.60.6"))
(def hoveredItemBackground (clojure.core/str "#4078C0"))
(def hoveredItemColor (clojure.core/str white))
(def pointingArrowSize (clojure.core/str relative9px))
(defstyles root)
