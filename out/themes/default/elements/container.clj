(clojure.core/ns
 styles.themes.default.elements.container
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def maxWidth (clojure.core/str "100%"))
(def mobileMinimumGutter (clojure.core/str "0em"))
(def mobileWidth (clojure.core/str "auto"))
(def mobileGutter (clojure.core/str "1em"))
(def tabletMinimumGutter nil)
(def tabletGutter (clojure.core/str "auto"))
(def computerMinimumGutter nil)
(def computerGutter (clojure.core/str "auto"))
(def largeMonitorMinimumGutter nil)
(def largeMonitorGutter (clojure.core/str "auto"))
(def gridGutterWidth (clojure.core/str "22" " " "rem"))
(def relaxedGridGutterWidth (clojure.core/str "33" " " "rem"))
(def veryRelaxedGridGutterWidth (clojure.core/str "55" " " "rem"))
(def mobileGridWidth (clojure.core/str mobileWidth))
(def mobileRelaxedGridWidth (clojure.core/str mobileWidth))
(def mobileVeryRelaxedGridWidth (clojure.core/str mobileWidth))
(def textWidth (clojure.core/str "700px"))
(def textFontFamily (clojure.core/str pageFont))
(def textLineHeight (clojure.core/str "1.51.5"))
(def textSize (clojure.core/str large))
(defstyles root)
