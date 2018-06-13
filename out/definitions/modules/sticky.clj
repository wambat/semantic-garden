(clojure.core/ns
 definitions.modules.sticky
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type "module")
(def element "sticky")
(defstyles
 root
 [".ui.sticky"
  {"position" (clojure.core/str "static"),
   "transition" (clojure.core/str transition),
   "z-index" (clojure.core/str zIndex)}]
 [".ui.sticky.bound"
  {"position" (clojure.core/str "absolute"),
   "left" (clojure.core/str "auto"),
   "right" (clojure.core/str "auto")}]
 [".ui.sticky.fixed"
  {"position" (clojure.core/str "fixed"),
   "left" (clojure.core/str "auto"),
   "right" (clojure.core/str "auto")}]
 [".ui.sticky.bound.top"
  {"top" (clojure.core/str "0px"), "bottom" (clojure.core/str "auto")}]
 [".ui.sticky.fixed.top"
  {"top" (clojure.core/str "0px"), "bottom" (clojure.core/str "auto")}]
 [".ui.sticky.bound.bottom"
  {"top" (clojure.core/str "auto"), "bottom" (clojure.core/str "0px")}]
 [".ui.sticky.fixed.bottom"
  {"top" (clojure.core/str "auto"), "bottom" (clojure.core/str "0px")}]
 [".ui.native.sticky" {"position" (clojure.core/str "sticky")}])
