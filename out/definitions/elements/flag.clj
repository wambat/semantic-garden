(clojure.core/ns
 styles.definitions.elements.flag
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "flag"))
(defstyles
 root
 ["i.flag:not([.icon])"
  {"line-height" (clojure.core/str height),
   "width" (clojure.core/str width),
   "height" (clojure.core/str height),
   "margin" (clojure.core/str "0em" " " margin " " "0em" " " "0em"),
   "font-smoothing" (clojure.core/str "antialiased"),
   "backface-visibility" (clojure.core/str "hidden"),
   "vertical-align" (clojure.core/str verticalAlign),
   "speak" (clojure.core/str "none"),
   "text-decoration" (clojure.core/str "inherit"),
   "display" (clojure.core/str "inline-block")}]
 ["i.flag:not([.icon]):before"
  {"display" (clojure.core/str "inline-block"),
   "content" (clojure.core/str ""),
   "background" nil,
   "width" (clojure.core/str width),
   "height" (clojure.core/str height)}])
