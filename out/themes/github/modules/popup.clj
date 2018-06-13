(clojure.core/ns
 themes.github.modules.popup
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def small "(:variableName @ relative10px)")
(def medium "(:variableName @ relative11px)")
(def large "(:variableName @ relative13px)")
(def verticalPadding "(:variableName @ relative7px)")
(def horizontalPadding "(:variableName @ relative11px)")
(defstyles root)
