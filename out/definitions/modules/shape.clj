(clojure.core/ns
 definitions.modules.shape
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "module"))
(def element (clojure.core/str "shape"))
(defstyles
 root
 [".ui.shape"
  {"position" (clojure.core/str "relative"),
   "vertical-align" (clojure.core/str "top"),
   "display" (clojure.core/str display),
   "perspective" (clojure.core/str perspective),
   "transition" (clojure.core/str transition)}]
 [".ui.shape"
  [".sides" {"transform-style" (clojure.core/str "preserve-3d")}]]
 [".ui.shape"
  [".side"
   {"opacity" (clojure.core/str "11"),
    "width" (clojure.core/str "100%"),
    "margin" (clojure.core/str sideMargin),
    "backface-visibility" (clojure.core/str backfaceVisibility)}]]
 [".ui.shape" [".side" {"display" (clojure.core/str "none")}]]
 nil
 [".ui.cube.shape"
  [".side"
   {"min-width" (clojure.core/str cubeSize),
    "height" (clojure.core/str cubeSize),
    "padding" (clojure.core/str cubePadding),
    "background-color" (clojure.core/str cubeBackground),
    "color" (clojure.core/str cubeTextColor),
    "box-shadow" (clojure.core/str cubeBoxShadow)}]]
 [".ui.cube.shape"
  [".side"
   ["> .content"
    {"width" (clojure.core/str "100%"),
     "height" (clojure.core/str "100%"),
     "display" (clojure.core/str "table"),
     "text-align" (clojure.core/str cubeTextAlign),
     "user-select" (clojure.core/str "text")}]]]
 [".ui.cube.shape"
  [".side"
   ["> .content"
    ["> div"
     {"display" (clojure.core/str "table-cell"),
      "vertical-align" (clojure.core/str "middle"),
      "font-size" (clojure.core/str cubeFontSize)}]]]]
 [".ui.text.shape.animating"
  [".sides" {"position" (clojure.core/str "static")}]]
 [".ui.text.shape"
  [".side" {"white-space" (clojure.core/str "nowrap")}]]
 nil
 [".ui.loading.shape"
  {"position" (clojure.core/str "absolute"),
   "top" (clojure.core/str "-9999px"),
   "left" (clojure.core/str "-9999px")}]
 [".ui.shape"
  [".animating.side"
   {"position" (clojure.core/str "absolute"),
    "top" (clojure.core/str "0px"),
    "left" (clojure.core/str "0px"),
    "display" (clojure.core/str "block"),
    "z-index" (clojure.core/str animatingZIndex)}]]
 [".ui.shape"
  [".hidden.side" {"opacity" (clojure.core/str hiddenSideOpacity)}]]
 [".ui.shape.animating"
  [".sides" {"position" (clojure.core/str "absolute")}]]
 [".ui.shape.animating"
  [".sides" {"transition" (clojure.core/str transition)}]]
 [".ui.shape.animating"
  [".side" {"transition" (clojure.core/str sideTransition)}]]
 [".ui.shape" [".active.side" {"display" (clojure.core/str "block")}]])
