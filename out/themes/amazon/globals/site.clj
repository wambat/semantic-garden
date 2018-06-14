(clojure.core/ns
 styles.themes.amazon.globals.site
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageMinWidth (clojure.core/str "1049px"))
(def pageOverflowX (clojure.core/str "visible"))
(def emSize (clojure.core/str "13px"))
(def fontSize (clojure.core/str "13px"))
(def fontName (clojure.core/str "Arial"))
(def h1 (clojure.core/str "2.25em"))
(def defaultBorderRadius (clojure.core/str "0.30769em"))
(def disabledOpacity (clojure.core/str "0.30.3"))
(def black (clojure.core/str "#444C55"))
(def orange (clojure.core/str "#FDE07B"))
(def linkColor (clojure.core/str "#0066C0"))
(def linkHoverColor (clojure.core/str "#C45500"))
(def linkHoverUnderline (clojure.core/str "underline"))
(def borderColor (clojure.core/str "rgba"))
(def solidBorderColor (clojure.core/str "#DDDDDD"))
(def internalBorderColor (clojure.core/str "rgba"))
(def selectedBorderColor (clojure.core/str "#51A7E8"))
(def largeMonitorBreakpoint (clojure.core/str "1049px"))
(def computerBreakpoint (clojure.core/str largeMonitorBreakpoint))
(def tabletBreakpoint (clojure.core/str largeMonitorBreakpoint))
(def blue (clojure.core/str "#80A6CD"))
(def green (clojure.core/str "#60B044"))
(def orange (clojure.core/str "#D26911"))
(def infoBackgroundColor (clojure.core/str "#E6F1F6"))
(def infoTextColor (clojure.core/str "#4E575B"))
(defstyles root)
