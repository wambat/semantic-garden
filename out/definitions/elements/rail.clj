(clojure.core/ns
 definitions.elements.rail
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type nil)
(def element nil)
(defstyles
 root
 [".ui.rail"
  {"position" (clojure.core/str "absolute"),
   "top" (clojure.core/str "0%"),
   "width" (clojure.core/str width),
   "height" (clojure.core/str height)}]
 [".ui.left.rail"
  {"left" (clojure.core/str "auto"),
   "right" (clojure.core/str "100%"),
   "padding"
   (clojure.core/str "0em" " " splitDistance " " "0em" " " "0em"),
   "margin"
   (clojure.core/str "0em" " " splitDistance " " "0em" " " "0em")}]
 [".ui.right.rail"
  {"left" (clojure.core/str "100%"),
   "right" (clojure.core/str "auto"),
   "padding"
   (clojure.core/str "0em" " " "0em" " " "0em" " " splitDistance),
   "margin"
   (clojure.core/str "0em" " " "0em" " " "0em" " " splitDistance)}]
 [".ui.left.internal.rail"
  {"left" (clojure.core/str "0%"),
   "right" (clojure.core/str "auto"),
   "padding"
   (clojure.core/str "0em" " " "0em" " " "0em" " " splitDistance),
   "margin"
   (clojure.core/str "0em" " " "0em" " " "0em" " " splitDistance)}]
 [".ui.right.internal.rail"
  {"left" (clojure.core/str "auto"),
   "right" (clojure.core/str "0%"),
   "padding"
   (clojure.core/str "0em" " " splitDistance " " "0em" " " "0em"),
   "margin"
   (clojure.core/str "0em" " " splitDistance " " "0em" " " "0em")}]
 [".ui.dividing.rail" {"width" (clojure.core/str dividingWidth)}]
 [".ui.left.dividing.rail"
  {"padding"
   (clojure.core/str
    "0em"
    " "
    splitDividingDistance
    " "
    "0em"
    " "
    "0em"),
   "margin"
   (clojure.core/str
    "0em"
    " "
    splitDividingDistance
    " "
    "0em"
    " "
    "0em"),
   "border-right" (clojure.core/str dividingBorder)}]
 [".ui.right.dividing.rail"
  {"border-left" (clojure.core/str dividingBorder),
   "padding"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    "0em"
    " "
    splitDividingDistance),
   "margin"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    "0em"
    " "
    splitDividingDistance)}]
 [".ui.close.rail" {"width" (clojure.core/str closeWidth)}]
 [".ui.close.left.rail"
  {"padding"
   (clojure.core/str "0em" " " splitCloseDistance " " "0em" " " "0em"),
   "margin"
   (clojure.core/str
    "0em"
    " "
    splitCloseDistance
    " "
    "0em"
    " "
    "0em")}]
 [".ui.close.right.rail"
  {"padding"
   (clojure.core/str "0em" " " "0em" " " "0em" " " splitCloseDistance),
   "margin"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    "0em"
    " "
    splitCloseDistance)}]
 [".ui.very.close.rail" {"width" (clojure.core/str veryCloseWidth)}]
 [".ui.very.close.left.rail"
  {"padding"
   (clojure.core/str
    "0em"
    " "
    splitVeryCloseDistance
    " "
    "0em"
    " "
    "0em"),
   "margin"
   (clojure.core/str
    "0em"
    " "
    splitVeryCloseDistance
    " "
    "0em"
    " "
    "0em")}]
 [".ui.very.close.right.rail"
  {"padding"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    "0em"
    " "
    splitVeryCloseDistance),
   "margin"
   (clojure.core/str
    "0em"
    " "
    "0em"
    " "
    "0em"
    " "
    splitVeryCloseDistance)}]
 [".ui.attached.left.rail"
  {"padding" (clojure.core/str "0em"),
   "margin" (clojure.core/str "0em")}]
 [".ui.attached.right.rail"
  {"padding" (clojure.core/str "0em"),
   "margin" (clojure.core/str "0em")}]
 [".ui.mini.rail" {"font-size" (clojure.core/str mini)}]
 [".ui.tiny.rail" {"font-size" (clojure.core/str tiny)}]
 [".ui.small.rail" {"font-size" (clojure.core/str small)}]
 [".ui.rail" {"font-size" (clojure.core/str medium)}]
 [".ui.large.rail" {"font-size" (clojure.core/str large)}]
 [".ui.big.rail" {"font-size" (clojure.core/str big)}]
 [".ui.huge.rail" {"font-size" (clojure.core/str huge)}]
 [".ui.massive.rail" {"font-size" (clojure.core/str massive)}])
