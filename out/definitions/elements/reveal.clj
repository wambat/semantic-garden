(clojure.core/ns
 styles.definitions.elements.reveal
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "element"))
(def element (clojure.core/str "reveal"))
(defstyles
 root
 [".ui.reveal" nil]
 [".ui.reveal" ["> .visible.content" nil]])
