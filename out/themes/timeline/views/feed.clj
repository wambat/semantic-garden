(clojure.core/ns
 themes.timeline.views.feed
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def eventMargin (clojure.core/str "0em"))
(def eventDivider (clojure.core/str "none"))
(def eventPadding (clojure.core/str "0em"))
(def labelWidth (clojure.core/str "3em"))
(def labelHeight (clojure.core/str "auto"))
(def
 labeledContentMargin
 (clojure.core/str "0.75em" " " "0em" " " "2em" " " "0.75em"))
(def iconLabelBackground (clojure.core/str primaryColor))
(def iconLabelBorderRadius (clojure.core/str circularRadius))
(def iconLabelColor (clojure.core/str white))
(def metadataDisplay (clojure.core/str "inline-block"))
(def metadataMargin (clojure.core/str "1em" " " "0em" " " "0em"))
(def metadataBackground (clojure.core/str white " " subtleGradient))
(def
 metadataBorder
 (clojure.core/str "1px" " " "solid" " " solidBorderColor))
(def metadataBorderRadius (clojure.core/str "0.25em"))
(def
 metadataBoxShadow
 (clojure.core/str "00" " " "1px" " " "1px" " " "rgba"))
(def metadataPadding (clojure.core/str "0.5em" " " "1em"))
(def metadataColor (clojure.core/str "rgba"))
(defstyles root)
