(clojure.core/ns
 styles.themes.basic.elements.step
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def stepsBorder (clojure.core/str "none"))
(def stepsBorderRadius (clojure.core/str circularRadius))
(def border (clojure.core/str "none"))
(def divider (clojure.core/str "none"))
(def background (clojure.core/str "transparent"))
(def borderRadius (clojure.core/str circularRadius))
(def iconDistance (clojure.core/str "0.8em"))
(def arrowDisplay (clojure.core/str "none"))
(def activeBackground (clojure.core/str midWhite))
(def activeArrowDisplay (clojure.core/str "none"))
(defstyles root)
