(clojure.core/ns
 themes.github.collections.message
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background nil)
(def
 boxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  "rgba"
  " "
  "inset"))
(def verticalPadding (clojure.core/str "15px"))
(def horizontalPadding (clojure.core/str "15px"))
(def headerFontSize (clojure.core/str "1.15em"))
(def infoTextColor nil)
(def warningTextColor nil)
(def errorTextColor nil)
(def
 floatingBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "1px"
  " "
  "rgba"
  " "
  "inset"))
(def infoBorderColor nil)
(def errorBorderColor nil)
(def warningBorderColor nil)
(def small (clojure.core/str "12px"))
(def medium (clojure.core/str "13px"))
(def large (clojure.core/str "14px"))
(def huge (clojure.core/str "16px"))
(def massive (clojure.core/str "18px"))
(defstyles root)
