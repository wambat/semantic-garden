(clojure.core/ns
 styles.themes.default.elements.image
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def placeholderColor (clojure.core/str "transparent"))
(def roundedBorderRadius (clojure.core/str "0.3125em"))
(def imageHorizontalMargin (clojure.core/str "0.250.25" " " "rem"))
(def imageVerticalMargin (clojure.core/str "0.50.5" " " "rem"))
(def imageBorder (clojure.core/str "1px" " " "solid" " " "rgba"))
(def avatarSize (clojure.core/str "2em"))
(def avatarMargin (clojure.core/str "0.25em"))
(def spacedDistance (clojure.core/str "0.5em"))
(def floatedHorizontalMargin (clojure.core/str "1em"))
(def floatedVerticalMargin (clojure.core/str "1em"))
(def miniWidth (clojure.core/str "35px"))
(def tinyWidth (clojure.core/str "80px"))
(def smallWidth (clojure.core/str "150px"))
(def mediumWidth (clojure.core/str "300px"))
(def largeWidth (clojure.core/str "450px"))
(def bigWidth (clojure.core/str "600px"))
(def hugeWidth (clojure.core/str "800px"))
(def massiveWidth (clojure.core/str "960px"))
(defstyles root)
