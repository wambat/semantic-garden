(clojure.core/ns
 themes.fixed-width.modules.modal
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def modalComputerWidth (clojure.core/str "700px"))
(def modalLargeMonitorWidth (clojure.core/str "800px"))
(def modalWidescreenMonitorWidth (clojure.core/str "850px"))
(def modalComputerMargin nil)
(def modalLargeMonitorMargin nil)
(def modalWidescreenMonitorMargin nil)
(def modalSmallRatio (clojure.core/str "0.60.6"))
(def modalLargeRatio (clojure.core/str "1.21.2"))
(def modalSmallHeaderSize (clojure.core/str "1.3em"))
(def modalSmallComputerWidth nil)
(def modalSmallLargeMonitorWidth nil)
(def modalSmallWidescreenMonitorWidth nil)
(def modalSmallComputerMargin nil)
(def modalSmallLargeMonitorMargin nil)
(def modalSmallWidescreenMonitorMargin nil)
(def modalLargeHeaderSize (clojure.core/str "1.3em"))
(def modalLargeComputerWidth nil)
(def modalLargeLargeMonitorWidth nil)
(def modalLargeWidescreenMonitorWidth nil)
(def modalLargeComputerMargin nil)
(def modalLargeLargeMonitorMargin nil)
(def modalLargeWidescreenMonitorMargin nil)
(defstyles root)
