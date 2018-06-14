(clojure.core/ns
 styles.themes.chubby.elements.header
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def headerFont (clojure.core/str "sans-serif"))
(def fontWeight (clojure.core/str "bold"))
(def textTransform (clojure.core/str "none"))
(def h1 (clojure.core/str "1.331.33" " " "rem"))
(def h2 (clojure.core/str "1.21.2" " " "rem"))
(def h3 (clojure.core/str "11" " " "rem"))
(def h4 (clojure.core/str "0.90.9" " " "rem"))
(def h5 (clojure.core/str "0.80.8" " " "rem"))
(def hugeFontSize (clojure.core/str "1.33em"))
(def largeFontSize (clojure.core/str "1.2em"))
(def mediumFontSize (clojure.core/str "1em"))
(def smallFontSize (clojure.core/str "0.9em"))
(def tinyFontSize (clojure.core/str "0.8em"))
(defstyles root)
