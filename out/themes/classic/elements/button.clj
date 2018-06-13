(clojure.core/ns
 themes.classic.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def shadowDistance (clojure.core/str "0em"))
(def shadowOffset nil)
(def shadowBoxShadow nil)
(def backgroundColor (clojure.core/str "#FAFAFA"))
(def backgroundImage (clojure.core/str "linear-gradient"))
(def boxShadow (clojure.core/str shadowBoxShadow))
(def verticalPadding (clojure.core/str "0.8em"))
(def horizontalPadding (clojure.core/str "1.5em"))
(def groupBoxShadow (clojure.core/str "none"))
(def groupButtonBoxShadow (clojure.core/str shadowBoxShadow))
(def
 verticalBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  borderColor
  " "
  "inset"))
(def
 groupButtonOffset
 (clojure.core/str "0px" " " "0px" " " "0px" " " "-1px"))
(def
 verticalGroupOffset
 (clojure.core/str "0px" " " "0px" " " "-1px" " " "0px"))
(def hoverBackgroundColor (clojure.core/str ""))
(def hoverBackgroundImage (clojure.core/str "linear-gradient"))
(def hoverBoxShadow (clojure.core/str ""))
(def hoverColor (clojure.core/str hoveredTextColor))
(def iconHoverOpacity (clojure.core/str "0.850.85"))
(def focusBackgroundColor (clojure.core/str ""))
(def focusBackgroundImage (clojure.core/str ""))
(def
 focusBoxShadow
 (clojure.core/str "0px" " " "0px" " " "3px" " " "2px" " " "rgba"))
(def focusColor (clojure.core/str hoveredTextColor))
(def iconFocusOpacity (clojure.core/str "0.850.85"))
(def downBackgroundColor (clojure.core/str "#F1F1F1"))
(def downBackgroundImage (clojure.core/str ""))
(def
 downBoxShadow
 (clojure.core/str
  "0px"
  " "
  "1px"
  " "
  "4px"
  " "
  "0px"
  " "
  "rgba"
  " "
  "inset"))
(def downColor (clojure.core/str pressedTextColor))
(def activeBackgroundColor (clojure.core/str "#DADADA"))
(def activeBackgroundImage (clojure.core/str "none"))
(def activeColor (clojure.core/str selectedTextColor))
(def
 activeBoxShadow
 (clojure.core/str
  "0px"
  " "
  "1px"
  " "
  "4px"
  " "
  "0px"
  " "
  "rgba"
  " "
  "inset"))
(def activeHoverBackgroundColor (clojure.core/str "#DADADA"))
(def activeHoverBackgroundImage (clojure.core/str "none"))
(def
 activeHoverBoxShadow
 (clojure.core/str
  "0px"
  " "
  "1px"
  " "
  "4px"
  " "
  "0px"
  " "
  "rgba"
  " "
  "inset"))
(def activeHoverColor (clojure.core/str selectedTextColor))
(def loadingBackgroundColor (clojure.core/str "#FFFFFF"))
(def labeledIconBackgroundColor (clojure.core/str "rgba"))
(def
 labeledIconLeftShadow
 (clojure.core/str
  "-1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  labeledIconBorder
  " "
  "inset"))
(def
 labeledIconRightShadow
 (clojure.core/str
  "1px"
  " "
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  labeledIconBorder
  " "
  "inset"))
(defstyles root)
