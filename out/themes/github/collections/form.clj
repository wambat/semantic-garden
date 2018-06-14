(clojure.core/ns
 styles.themes.github.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def inputBackground (clojure.core/str "#FAFAFA"))
(def inputBorder (clojure.core/str "1px" " " "solid" " " "#CCCCCC"))
(def
 inputBoxShadow
 (clojure.core/str "00" " " "1px" " " "2px" " " "rgba" " " "inset"))
(def inputBorderRadius (clojure.core/str "3px"))
(def labelFontWeight (clojure.core/str "bold"))
(def labelDistance (clojure.core/str "6px"))
(def inputFocusBackground (clojure.core/str "#FFFFFF"))
(def
 inputFocusBoxShadow
 (clojure.core/str "0px" " " "0px" " " "5px" " " "rgba"))
(def inputFocusBorderColor (clojure.core/str "#51A7E8"))
(def inputFocusBorderRadius (clojure.core/str inputBorderRadius))
(defstyles root)
