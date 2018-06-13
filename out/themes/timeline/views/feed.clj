(clojure.core/ns
 themes.timeline.views.feed
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [".ui.feed" ["> .event" [".label" {"border-left" nil}]]]
 [".ui.feed"
  ["> .event:last-child"
   [".label" {"border-left-color" (clojure.core/str "transparent")}]]]
 [".ui.feed"
  ["> .event" ["> .label" {"margin-left" (clojure.core/str "1.6em")}]]]
 [".ui.feed"
  ["> .event"
   ["> .label"
    ["> img"
     {"background-color" nil,
      "border-radius" (clojure.core/str "500500" " " "rem"),
      "color" nil,
      "width" (clojure.core/str "33" " " "rem"),
      "height" (clojure.core/str "33" " " "rem"),
      "line-height" (clojure.core/str "1.51.5"),
      "left" (clojure.core/str "-1.6-1.6" " " "rem"),
      "opacity" (clojure.core/str "11"),
      "position" (clojure.core/str "relative")}]]]]
 [".ui.feed"
  ["> .event"
   ["> .label"
    ["> .icon"
     {"background-color" nil,
      "border-radius" (clojure.core/str "500500" " " "rem"),
      "color" nil,
      "width" (clojure.core/str "33" " " "rem"),
      "height" (clojure.core/str "33" " " "rem"),
      "line-height" (clojure.core/str "1.51.5"),
      "left" (clojure.core/str "-1.6-1.6" " " "rem"),
      "opacity" (clojure.core/str "11"),
      "position" (clojure.core/str "relative")}]]]])
