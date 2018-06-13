(clojure.core/ns
 themes.github.elements.step
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str "transparent" " " "linear-gradient"))
(def verticalPadding (clojure.core/str "1em"))
(def arrowDisplay (clojure.core/str "none"))
(def lastArrowDisplay (clojure.core/str "none"))
(def activeArrowDisplay (clojure.core/str "block"))
(def activeLastArrowDisplay (clojure.core/str "block"))
(def stepsBackground (clojure.core/str "#FFFFFF"))
(def
 stepsBoxShadow
 (clojure.core/str "0px" " " "0px" " " "1px" " " "0px" " " "rgba"))
(def activeBackground (clojure.core/str "#FFFFFF"))
(def activeIconColor (clojure.core/str darkTextColor))
(def arrowTopOffset (clojure.core/str "100%"))
(def arrowRightOffset (clojure.core/str "50%"))
(def arrowBorderColor (clojure.core/str "rgba"))
(def
 arrowBorderWidth
 (clojure.core/str "0px" " " "0px" " " borderWidth " " borderWidth))
(defstyles root)
