(clojure.core/ns
 styles.themes.material.modules.dropdown
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def menuBorderRadius (clojure.core/str borderRadius))
(def menuBorderColor (clojure.core/str "#DADADA"))
(def
 menuBoxShadow
 (clojure.core/str "0px" " " "2px" " " "4px" " " "rgba"))
(def menuPadding (clojure.core/str relative8px " " "0em"))
(def itemVerticalPadding (clojure.core/str "1em"))
(def itemHorizontalPadding (clojure.core/str "1.5em"))
(def menuHeaderFontSize (clojure.core/str small))
(def menuHeaderFontWeight (clojure.core/str "bold"))
(def menuHeaderTextTransform (clojure.core/str "none"))
(def selectionBorderEmWidth (clojure.core/str "0em"))
(def selectionItemDivider (clojure.core/str "none"))
(def labelBoxShadow (clojure.core/str "none"))
(defstyles root)
