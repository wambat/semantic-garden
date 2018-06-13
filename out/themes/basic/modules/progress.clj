(clojure.core/ns
 themes.basic.modules.progress
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str "transparent"))
(def border (clojure.core/str "none"))
(def padding (clojure.core/str "0em"))
(def progressLeft (clojure.core/str "0em"))
(def progressWidth (clojure.core/str "100%"))
(def progressTextAlign (clojure.core/str "center"))
(def labelFontWeight (clojure.core/str normal))
(def labelTextAlign (clojure.core/str "left"))
(def labelHeight (clojure.core/str "1.5em"))
(defstyles root)
