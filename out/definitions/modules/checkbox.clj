(clojure.core/ns
 definitions.modules.checkbox
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "checkbox"))
(defstyles
 root
 [".ui.checkbox"
  {"min-width" (clojure.core/str checkboxSize),
   "line-height" (clojure.core/str checkboxLineHeight),
   "backface-visibility" (clojure.core/str "hidden"),
   "vertical-align" (clojure.core/str "baseline"),
   "outline" (clojure.core/str "none"),
   "position" (clojure.core/str "relative"),
   "min-height" (clojure.core/str checkboxSize),
   "font-size" (clojure.core/str medium),
   "display" (clojure.core/str "inline-block"),
   "font-style" (clojure.core/str "normal")}]
 [".ui.checkbox" ["input[type='checkbox']" nil]]
 [".ui.checkbox" ["input[type='radio']" nil]])
