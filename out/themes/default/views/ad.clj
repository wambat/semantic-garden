(clojure.core/ns
 styles.themes.default.views.ad
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def margin (clojure.core/str "1em" " " "0em"))
(def overflow (clojure.core/str "hidden"))
(def testBackground (clojure.core/str lightBlack))
(def testColor (clojure.core/str white))
(def testFontWeight (clojure.core/str bold))
(def testText (clojure.core/str "Ad"))
(def testFontSize (clojure.core/str relativeMedium))
(def testMobileFontSize (clojure.core/str relativeTiny))
(defstyles root)
