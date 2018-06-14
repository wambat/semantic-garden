(clojure.core/ns
 styles.themes.classic.views.card
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def shadowDistance (clojure.core/str "0em"))
(def padding (clojure.core/str "0em"))
(def extraDivider (clojure.core/str "1px" " " "solid" " " "rgba"))
(def extraBackground (clojure.core/str "#FAFAFA" " " subtleGradient))
(def extraPadding (clojure.core/str "0.75em" " " "1em"))
(def
 extraBoxShadow
 (clojure.core/str "00" " " "1px" " " "1px" " " "rgba"))
(def extraColor (clojure.core/str lightTextColor))
(defstyles root)
