(clojure.core/ns
 themes.rtl.globals.site
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def googleFontName "Droid Sans")
(def headerFont "(:identifier sans-serif)")
(def pageFont "(:identifier sans-serif)")
(defstyles root)
