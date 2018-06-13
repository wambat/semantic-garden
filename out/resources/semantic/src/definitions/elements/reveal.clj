((clojure.core/ns
  definitions.elements.reveal
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'element'")
 (def element "'reveal'")
 (defstyles
  root
  [".ui.reveal" nil]
  [".ui.reveal" ["> .visible.content" nil]]))
