(clojure.core/ns
 themes.rtl.globals.site
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def googleFontName (clojure.core/str "Droid Sans"))
(def headerFont (clojure.core/str "sans-serif"))
(def pageFont (clojure.core/str "sans-serif"))
(defstyles root)
