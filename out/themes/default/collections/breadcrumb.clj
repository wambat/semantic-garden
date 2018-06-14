(clojure.core/ns
 styles.themes.default.collections.breadcrumb
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def verticalMargin (clojure.core/str "0em"))
(def display (clojure.core/str "inline-block"))
(def verticalAlign (clojure.core/str "middle"))
(def dividerSpacing nil)
(def dividerOpacity (clojure.core/str "0.70.7"))
(def dividerColor (clojure.core/str lightTextColor))
(def dividerSize (clojure.core/str relativeSmall))
(def dividerVerticalAlign (clojure.core/str "baseline"))
(def iconDividerSize (clojure.core/str relativeTiny))
(def iconDividerVerticalAlign (clojure.core/str "baseline"))
(def sectionMargin (clojure.core/str "0em"))
(def sectionPadding (clojure.core/str "0em"))
(def segmentPadding (clojure.core/str relativeMini " " relativeMedium))
(def activeFontWeight (clojure.core/str bold))
(defstyles root)
