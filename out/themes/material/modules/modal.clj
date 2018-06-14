(clojure.core/ns
 styles.themes.material.modules.modal
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def
 boxShadow
 (clojure.core/str "0px" " " "10px" " " "18px" " " "rgba"))
(def borderRadius (clojure.core/str "0em"))
(def headerBackground (clojure.core/str white))
(def headerVerticalPadding (clojure.core/str "1.71421.7142" " " "rem"))
(def
 headerHorizontalPadding
 (clojure.core/str "1.71421.7142" " " "rem"))
(def headerFontWeight (clojure.core/str "400400"))
(def headerFontFamily (clojure.core/str "sans-serif"))
(def headerBorder (clojure.core/str "none"))
(def
 contentPadding
 (clojure.core/str
  "11"
  " "
  "rem"
  " "
  "22"
  " "
  "rem"
  " "
  "22"
  " "
  "rem"))
(def actionBorder (clojure.core/str "none"))
(def actionBackground (clojure.core/str white))
(defstyles root)
