(clojure.core/ns
 definitions.globals.reset
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "global"))
(def element (clojure.core/str "reset"))
(defstyles
 root
 nil
 nil
 nil
 ["html" {"box-sizing" (clojure.core/str "border-box")}]
 ["input[type='text']"
  {"-webkit-appearance" (clojure.core/str "none"),
   "-moz-appearance" (clojure.core/str "none")}]
 ["input[type='email']"
  {"-webkit-appearance" (clojure.core/str "none"),
   "-moz-appearance" (clojure.core/str "none")}]
 ["input[type='search']"
  {"-webkit-appearance" (clojure.core/str "none"),
   "-moz-appearance" (clojure.core/str "none")}]
 ["input[type='password']"
  {"-webkit-appearance" (clojure.core/str "none"),
   "-moz-appearance" (clojure.core/str "none")}])
