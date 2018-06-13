(clojure.core/ns
 themes.github.collections.message
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background "#FEFEFE")
(def boxShadow "(:identifier inset)")
(def verticalPadding "(:measurement 15 px)")
(def horizontalPadding "(:measurement 15 px)")
(def headerFontSize "(:measurement 1.15 em)")
(def infoTextColor "#264C72")
(def warningTextColor "#613A00")
(def errorTextColor "#991111")
(def floatingBoxShadow "(:identifier inset)")
(def infoBorderColor "#97C1DA")
(def errorBorderColor "#DA9797")
(def warningBorderColor "#DCA874")
(def small "(:measurement 12 px)")
(def medium "(:measurement 13 px)")
(def large "(:measurement 14 px)")
(def huge "(:measurement 16 px)")
(def massive "(:measurement 18 px)")
(defstyles root)
