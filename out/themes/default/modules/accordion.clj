(clojure.core/ns
 themes.default.modules.accordion
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.accordion"
  [".title"
   [".dropdown.icon"
    {"font-family" (clojure.core/str "Accordion"),
     "line-height" (clojure.core/str "11"),
     "backface-visibility" (clojure.core/str "hidden"),
     "font-weight" (clojure.core/str "normal"),
     "font-style" (clojure.core/str "normal"),
     "text-align" (clojure.core/str "center")}]]]
 [".ui.accordion"
  [".accordion"
   [".title"
    [".dropdown.icon"
     {"font-family" (clojure.core/str "Accordion"),
      "line-height" (clojure.core/str "11"),
      "backface-visibility" (clojure.core/str "hidden"),
      "font-weight" (clojure.core/str "normal"),
      "font-style" (clojure.core/str "normal"),
      "text-align" (clojure.core/str "center")}]]]]
 [".ui.accordion" [".title" [".dropdown.icon:before" {"content" nil}]]]
 [".ui.accordion"
  [".accordion" [".title" [".dropdown.icon:before" {"content" nil}]]]])
