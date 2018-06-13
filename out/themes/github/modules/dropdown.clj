(clojure.core/ns
 themes.github.modules.dropdown
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def transition "(:variableName @ defaultEasing)")
(def menuPadding "(:measurement 0 px)")
(def itemVerticalPadding "(:variableName @ relative8px)")
(def itemHorizontalPadding "(:variableName @ relative14px)")
(def dropdownIconMargin "(:measurement 2 px)")
(def raisedBoxShadow ")")
(def menuPadding "(:measurement 0 px)")
(def menuHeaderMargin "(:measurement 0 em)")
(def menuHeaderPadding "(:variableName @ itemHorizontalPadding)")
(def menuHeaderFontSize "(:variableName @ relative12px)")
(def menuHeaderTextTransform "(:identifier none)")
(def menuHeaderFontWeight "(:identifier normal)")
(def menuHeaderColor "#767676")
(def menuDividerMargin "(:measurement 0 em)")
(def disabledOpacity "(:measurement 0.6)")
(def hoveredItemBackground "#4078C0")
(def hoveredItemColor "(:variableName @ white)")
(def pointingArrowSize "(:variableName @ relative9px)")
(defstyles root)
