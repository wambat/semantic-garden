(clojure.core/ns
 themes.flat.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def paragraphMargin "(:measurement 0 em)")
(def fieldMargin "(:measurement 1 em)")
(def labelFontSize "(:variableName @ relative11px)")
(def labelTextTransform "(:identifier uppercase)")
(def groupedLabelTextTransform "(:identifier none)")
(def inputHorizontalPadding "(:measurement 0.5 em)")
(def inputBackground "(:identifier transparent)")
(def inputBorder "(:identifier none)")
(def inputBorderRadius "(:measurement 0 em)")
(def inputBoxShadow "(:identifier none)")
(def invertedInputColor "(:variableName @ invertedTextColor)")
(def textAreaPadding "(:measurement 1 em)")
(def textAreaBackground "(:identifier transparent)")
(def textAreaFocusBackground "#EEEEEE")
(def textAreaBorder "#DDDDDD")
(def dividerMargin "(:measurement 0 em)")
(def validationMargin "(:measurement 1 em)")
(def validationArrowOffset "(:measurement -0.3 em)")
(def inputFocusPointerSize "(:measurement 0 px)")
(def inputErrorPointerSize "(:measurement 0 px)")
(def dropdownErrorHoverBackground "#FFF2F2")
(def dropdownErrorActiveBackground "#FDCFCF")
(def
 inputErrorFocusBackground
 "(:variableName @ negativeBackgroundColor)")
(def inputErrorFocusColor "(:variableName @ negativeColorHover)")
(def inputErrorFocusBorder "(:variableName @ negativeBorderColor)")
(def inputErrorFocusBoxShadow "(:identifier inset)")
(def inputPlaceholderColor ")")
(def inputPlaceholderFocusColor ")")
(def inputErrorPlaceholderColor ")")
(def inputErrorPlaceholderFocusColor ")")
(def formLoaderDimmerColor ")")
(def formLoaderPath "@{imagePath}/loader-large.gif")
(def formLoaderPosition "(:measurement 50 %)")
(def gutterWidth "(:measurement 1.5 em)")
(defstyles root)
