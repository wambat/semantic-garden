(clojure.core/ns
 themes.material.modules.dropdown
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def menuBorderRadius "(:variableName @ borderRadius)")
(def menuBorderColor "#DADADA")
(def menuBoxShadow ")")
(def menuPadding "(:measurement 0 em)")
(def itemVerticalPadding "(:measurement 1 em)")
(def itemHorizontalPadding "(:measurement 1.5 em)")
(def menuHeaderFontSize "(:variableName @ small)")
(def menuHeaderFontWeight "(:identifier bold)")
(def menuHeaderTextTransform "(:identifier none)")
(def selectionBorderEmWidth "(:measurement 0 em)")
(def selectionItemDivider "(:identifier none)")
(def labelBoxShadow "(:identifier none)")
(defstyles root)
