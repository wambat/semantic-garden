(clojure.core/ns
 themes.default.elements.step
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.steps"
  [".step.completed"
   ["> .icon:before" {"font-family" nil, "content" nil}]]]
 [".ui.ordered.steps"
  [".step.completed:before" {"font-family" nil, "content" nil}]])
