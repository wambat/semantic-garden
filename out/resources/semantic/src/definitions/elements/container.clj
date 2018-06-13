((clojure.core/ns
  definitions.elements.container
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'element'")
 (def element "'container'")
 (defstyles
  root
  [".ui.container"
   {"display" (clojure.core/str "block"),
    "max-width" (clojure.core/str maxWidth)}]))
