((clojure.core/ns
  definitions.elements.button
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'element'")
 (def element "'button'")
 (defstyles root [".ui.button" nil]))
