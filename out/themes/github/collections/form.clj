(clojure.core/ns
 themes.github.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def inputBackground nil)
(def inputBorder nil)
(def
 inputBoxShadow
 (clojure.core/str "00" " " "1px" " " "2px" " " "rgba" " " "inset"))
(def inputBorderRadius (clojure.core/str "3px"))
(def labelFontWeight (clojure.core/str "bold"))
(def labelDistance (clojure.core/str "6px"))
(def inputFocusBackground nil)
(def
 inputFocusBoxShadow
 (clojure.core/str "0px" " " "0px" " " "5px" " " "rgba"))
(def inputFocusBorderColor nil)
(def inputFocusBorderRadius (clojure.core/str inputBorderRadius))
(defstyles root)
