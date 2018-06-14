(clojure.core/ns
 styles.themes.raised.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def backgroundColor (clojure.core/str "#F8F8F8"))
(def backgroundImage (clojure.core/str "linear-gradient"))
(def verticalAlign (clojure.core/str "middle"))
(def borderRadius (clojure.core/str "0.4em"))
(def borderBoxShadowColor (clojure.core/str borderColor))
(def shadowDistance (clojure.core/str "0.3em"))
(def verticalPadding (clojure.core/str "1em"))
(def horizontalPadding (clojure.core/str "2em"))
(def
 transition
 (clojure.core/str "background" " " defaultDuration " " defaultEasing))
(defstyles root)
