(clojure.core/ns
 styles.themes.github.modules.popup
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def small (clojure.core/str relative10px))
(def medium (clojure.core/str relative11px))
(def large (clojure.core/str relative13px))
(def verticalPadding (clojure.core/str relative7px))
(def horizontalPadding (clojure.core/str relative11px))
(defstyles root)
