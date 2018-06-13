(clojure.core/ns
 themes.amazon.globals.site
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageMinWidth "(:measurement 1049 px)")
(def pageOverflowX "(:identifier visible)")
(def emSize "(:measurement 13 px)")
(def fontSize "(:measurement 13 px)")
(def fontName "Arial")
(def h1 "(:measurement 2.25 em)")
(def defaultBorderRadius "(:measurement 0.30769 em)")
(def disabledOpacity "(:measurement 0.3)")
(def black "#444C55")
(def orange "#FDE07B")
(def linkColor "#0066C0")
(def linkHoverColor "#C45500")
(def linkHoverUnderline "(:identifier underline)")
(def borderColor ")")
(def solidBorderColor "#DDDDDD")
(def internalBorderColor ")")
(def selectedBorderColor "#51A7E8")
(def largeMonitorBreakpoint "(:measurement 1049 px)")
(def computerBreakpoint "(:variableName @ largeMonitorBreakpoint)")
(def tabletBreakpoint "(:variableName @ largeMonitorBreakpoint)")
(def blue "#80A6CD")
(def green "#60B044")
(def orange "#D26911")
(def infoBackgroundColor "#E6F1F6")
(def infoTextColor "#4E575B")
(defstyles root)
