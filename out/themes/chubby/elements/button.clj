(clojure.core/ns
 themes.chubby.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [) :refer :all]))
(defstyles
 root
 [".ui.labeled.icon.buttons"
  ["> .button"
   ["> .icon"
    {"box-shadow"
     (clojure.core/str
      "-1px"
      " "
      "0px"
      " "
      "0px"
      " "
      "0px"
      " "
      "rgba"
      " "
      "inset")}]]]
 [".ui.labeled.icon.button"
  ["> .icon"
   {"box-shadow"
    (clojure.core/str
     "-1px"
     " "
     "0px"
     " "
     "0px"
     " "
     "0px"
     " "
     "rgba"
     " "
     "inset")}]]
 [".ui.right.labeled.icon.buttons"
  [".button"
   [".icon"
    {"box-shadow"
     (clojure.core/str
      "1px"
      " "
      "0px"
      " "
      "0px"
      " "
      "0px"
      " "
      "rgba"
      " "
      "inset")}]]]
 [".ui.right.labeled.icon.button"
  [".icon"
   {"box-shadow"
    (clojure.core/str
     "1px"
     " "
     "0px"
     " "
     "0px"
     " "
     "0px"
     " "
     "rgba"
     " "
     "inset")}]])
