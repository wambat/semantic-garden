(clojure.core/ns
 themes.github.collections.message
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str "linear-gradient" " " "#FEFEFE"))
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
(def infoTextColor (clojure.core/str "#264C72"))
(def warningTextColor (clojure.core/str "#613A00"))
(def errorTextColor (clojure.core/str "#991111"))
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
(def infoBorderColor (clojure.core/str "#97C1DA"))
(def errorBorderColor (clojure.core/str "#DA9797"))
(def warningBorderColor (clojure.core/str "#DCA874"))
(def small (clojure.core/str "12px"))
(def medium (clojure.core/str "13px"))
(def large (clojure.core/str "14px"))
(def huge (clojure.core/str "16px"))
(def massive (clojure.core/str "18px"))
(defstyles root)
