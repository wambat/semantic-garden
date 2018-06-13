(clojure.core/ns
 themes.github.elements.icon
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def fontPath nil)
(def fontName nil)
(def fallbackSRC nil)
(def width (clojure.core/str "1em"))
(def height (clojure.core/str "1em"))
(def small (clojure.core/str "13px"))
(def medium (clojure.core/str "16px"))
(def large (clojure.core/str "18px"))
(def big (clojure.core/str "20px"))
(def huge (clojure.core/str "28px"))
(def massive (clojure.core/str "32px"))
(defstyles root)
