(clojure.core/ns
 styles.themes.flat.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def paragraphMargin (clojure.core/str "1em" " " "0em"))
(def fieldMargin (clojure.core/str "0em" " " "0em" " " "1em"))
(def labelFontSize (clojure.core/str relative11px))
(def labelTextTransform (clojure.core/str "uppercase"))
(def groupedLabelTextTransform (clojure.core/str "none"))
(def inputHorizontalPadding (clojure.core/str "0.5em"))
(def inputBackground (clojure.core/str "transparent"))
(def inputBorder (clojure.core/str "none"))
(def inputBorderRadius (clojure.core/str "0em"))
(def inputBoxShadow (clojure.core/str "none"))
(def invertedInputColor (clojure.core/str invertedTextColor))
(def textAreaPadding (clojure.core/str "1em"))
(def textAreaBackground (clojure.core/str "transparent"))
(def textAreaFocusBackground (clojure.core/str "#EEEEEE"))
(def textAreaBorder (clojure.core/str "1px" " " "solid" " " "#DDDDDD"))
(def dividerMargin (clojure.core/str "1em" " " "0em"))
(def
 validationMargin
 (clojure.core/str "0em" " " "0em" " " "0em" " " "1em"))
(def validationArrowOffset (clojure.core/str "-0.3em"))
(def inputFocusPointerSize (clojure.core/str "0px"))
(def inputErrorPointerSize (clojure.core/str "0px"))
(def dropdownErrorHoverBackground (clojure.core/str "#FFF2F2"))
(def dropdownErrorActiveBackground (clojure.core/str "#FDCFCF"))
(def
 inputErrorFocusBackground
 (clojure.core/str negativeBackgroundColor))
(def inputErrorFocusColor (clojure.core/str negativeColorHover))
(def inputErrorFocusBorder (clojure.core/str negativeBorderColor))
(def
 inputErrorFocusBoxShadow
 (clojure.core/str
  inputErrorPointerSize
  " "
  "0em"
  " "
  "0em"
  " "
  "0em"
  " "
  negativeColorHover
  " "
  "inset"))
(def inputPlaceholderColor (clojure.core/str "lighten"))
(def inputPlaceholderFocusColor (clojure.core/str "lighten"))
(def inputErrorPlaceholderColor (clojure.core/str "lighten"))
(def inputErrorPlaceholderFocusColor (clojure.core/str "lighten"))
(def formLoaderDimmerColor (clojure.core/str "rgba"))
(def formLoaderPath (clojure.core/str "@{imagePath}/loader-large.gif"))
(def formLoaderPosition (clojure.core/str "50%" " " "50%"))
(def gutterWidth (clojure.core/str "1.5em"))
(defstyles root)
