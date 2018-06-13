(clojure.core/ns
 definitions.modules.tab
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type "module")
(def element "tab")
(defstyles
 root
 [".ui.tab" {"display" (clojure.core/str "none")}]
 [".ui.tab.active" {"display" (clojure.core/str "block")}]
 [".ui.tab.open" {"display" (clojure.core/str "block")}]
 [".ui.tab.loading"
  {"position" (clojure.core/str "relative"),
   "overflow" (clojure.core/str "hidden"),
   "display" (clojure.core/str "block"),
   "min-height" (clojure.core/str loadingMinHeight)}]
 nil
 [".ui.tab.loading:before"
  {"position" (clojure.core/str "absolute"),
   "content" nil,
   "top" (clojure.core/str loaderDistanceFromTop),
   "left" (clojure.core/str "50%"),
   "margin" (clojure.core/str loaderMargin),
   "width" (clojure.core/str loaderSize),
   "height" (clojure.core/str loaderSize),
   "border-radius" (clojure.core/str circularRadius),
   "border"
   (clojure.core/str loaderLineWidth " " "solid" " " loaderFillColor)}]
 [".ui.tab.loading.segment:before"
  {"position" (clojure.core/str "absolute"),
   "content" nil,
   "top" (clojure.core/str loaderDistanceFromTop),
   "left" (clojure.core/str "50%"),
   "margin" (clojure.core/str loaderMargin),
   "width" (clojure.core/str loaderSize),
   "height" (clojure.core/str loaderSize),
   "border-radius" (clojure.core/str circularRadius),
   "border"
   (clojure.core/str loaderLineWidth " " "solid" " " loaderFillColor)}]
 [".ui.tab.loading:after"
  {"width" (clojure.core/str loaderSize),
   "border-width" (clojure.core/str loaderLineWidth),
   "top" (clojure.core/str loaderDistanceFromTop),
   "border-color"
   (clojure.core/str
    loaderLineColor
    " "
    "transparent"
    " "
    "transparent"),
   "height" (clojure.core/str loaderSize),
   "margin" (clojure.core/str loaderMargin),
   "border-style" (clojure.core/str "solid"),
   "position" (clojure.core/str "absolute"),
   "animation-iteration-count" (clojure.core/str "infinite"),
   "animation"
   (clojure.core/str "button-spin" " " loaderSpeed " " "linear"),
   "content" nil,
   "box-shadow"
   (clojure.core/str
    "0px"
    " "
    "0px"
    " "
    "0px"
    " "
    "1px"
    " "
    "transparent"),
   "border-radius" (clojure.core/str circularRadius),
   "left" (clojure.core/str "50%")}]
 [".ui.tab.loading.segment:after"
  {"width" (clojure.core/str loaderSize),
   "border-width" (clojure.core/str loaderLineWidth),
   "top" (clojure.core/str loaderDistanceFromTop),
   "border-color"
   (clojure.core/str
    loaderLineColor
    " "
    "transparent"
    " "
    "transparent"),
   "height" (clojure.core/str loaderSize),
   "margin" (clojure.core/str loaderMargin),
   "border-style" (clojure.core/str "solid"),
   "position" (clojure.core/str "absolute"),
   "animation-iteration-count" (clojure.core/str "infinite"),
   "animation"
   (clojure.core/str "button-spin" " " loaderSpeed " " "linear"),
   "content" nil,
   "box-shadow"
   (clojure.core/str
    "0px"
    " "
    "0px"
    " "
    "0px"
    " "
    "1px"
    " "
    "transparent"),
   "border-radius" (clojure.core/str circularRadius),
   "left" (clojure.core/str "50%")}])
