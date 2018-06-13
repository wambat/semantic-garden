(clojure.core/ns
 themes.chubby.collections.menu
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background "(:variableName @ darkWhite)")
(def boxShadow "(:identifier none)")
(def dividerSize "(:measurement 0 px)")
(def verticalBoxShadow "(:identifier inset)")
(def verticalActiveBoxShadow "(:identifier none)")
(def itemVerticalPadding "(:measurement 1.25 em)")
(def itemHorizontalPadding "(:measurement 2 em)")
(def itemFontWeight "(:identifier bold)")
(def activeItemBackground "(:variableName @ primaryColor)")
(def activeItemTextColor "(:variableName @ white)")
(def activeHoverItemBackground "(:variableName @ primaryColorHover)")
(def activeHoverItemColor "(:variableName @ white)")
(def secondaryItemPadding "(:variableName @ relativeMedium)")
(def secondaryActiveItemBackground "(:variableName @ primaryColor)")
(def secondaryActiveItemColor "(:variableName @ white)")
(def
 secondaryActiveHoverItemBackground
 "(:variableName @ primaryColorHover)")
(def secondaryActiveHoverItemColor "(:variableName @ white)")
(def secondaryPointingBorderWidth "(:measurement 4 px)")
(def
 secondaryPointingActiveBorderColor
 "(:variableName @ primaryColor)")
(def secondaryPointingActiveTextColor "(:variableName @ primaryColor)")
(def arrowSize "(:measurement 1 em)")
(def arrowActiveColor "(:variableName @ primaryColor)")
(def arrowActiveHoverColor "(:variableName @ primaryColorHover)")
(def arrowBorder "(:identifier transparent)")
(def paginationActiveBackground "(:variableName @ lightGrey)")
(def borderColor "(:variableName @ darkWhite)")
(def tabularBorderWidth "(:measurement 2 px)")
(defstyles root)
