(clojure.core/ns
 styles.themes.chubby.modules.accordion
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def
 iconMargin
 (clojure.core/str "0em" " " "0.5em" " " "0em" " " "0em"))
(def styledActiveTitleBackground (clojure.core/str subtleGradient))
(def styledActiveTitleColor (clojure.core/str primaryColor))
(def styledActiveChildTitleBackground (clojure.core/str "transparent"))
(def styledTitlePadding (clojure.core/str "1.25em"))
(def styledTitleFontWeight (clojure.core/str "bold"))
(def styledContentPadding (clojure.core/str "1.5em" " " "3.25em"))
(def styledChildContentPadding (clojure.core/str styledContentPadding))
(defstyles root)
