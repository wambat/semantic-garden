(clojure.core/ns
 themes.amazon.globals.site
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageMinWidth (clojure.core/str "1049px"))
(def pageOverflowX (clojure.core/str "visible"))
(def emSize (clojure.core/str "13px"))
(def fontSize (clojure.core/str "13px"))
(def fontName nil)
(def h1 (clojure.core/str "2.25em"))
(def defaultBorderRadius (clojure.core/str "0.30769em"))
(def disabledOpacity (clojure.core/str "0.30.3"))
(def black nil)
(def orange nil)
(def linkColor nil)
(def linkHoverColor nil)
(def linkHoverUnderline (clojure.core/str "underline"))
(def borderColor (clojure.core/str "rgba"))
(def solidBorderColor nil)
(def internalBorderColor (clojure.core/str "rgba"))
(def selectedBorderColor nil)
(def largeMonitorBreakpoint (clojure.core/str "1049px"))
(def computerBreakpoint (clojure.core/str largeMonitorBreakpoint))
(def tabletBreakpoint (clojure.core/str largeMonitorBreakpoint))
(def blue nil)
(def green nil)
(def orange nil)
(def infoBackgroundColor nil)
(def infoTextColor nil)
(defstyles root)
