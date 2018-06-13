((clojure.core/ns
  definitions.modules.transition
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ['../../theme.config' :refer :all]))
 (def type "'module'")
 (def element "'transition'")
 (defstyles
  root
  [".transition"
   {"animation-iteration-count" (clojure.core/str "11"),
    "animation-duration" (clojure.core/str transitionDefaultDuration),
    "animation-timing-function"
    (clojure.core/str transitionDefaultEasing),
    "animation-fill-mode" (clojure.core/str transitionDefaultFill)}]
  [".animating.transition"
   {"backface-visibility" (clojure.core/str backfaceVisibility),
    "visibility" (clojure.core/str "visible")}]
  [".loading.transition"
   {"position" (clojure.core/str "absolute"),
    "top" (clojure.core/str "-99999px"),
    "left" (clojure.core/str "-99999px")}]
  [".hidden.transition"
   {"display" (clojure.core/str "none"),
    "visibility" (clojure.core/str "hidden")}]
  [".visible.transition"
   {"display" (clojure.core/str "block"),
    "visibility" (clojure.core/str "visible")}]
  [".disabled.transition"
   {"animation-play-state" (clojure.core/str "paused")}]
  [".looping.transition"
   {"animation-iteration-count" (clojure.core/str "infinite")}]))
