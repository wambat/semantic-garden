(clojure.core/ns
 themes.default.elements.flag
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def spritePath (clojure.core/str "@{imagePath}/flags.png"))
(def width (clojure.core/str "16px"))
(def height (clojure.core/str "11px"))
(def verticalAlign (clojure.core/str "baseline"))
(def margin (clojure.core/str "0.5em"))
(defstyles root)
