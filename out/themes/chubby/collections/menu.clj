(clojure.core/ns
 themes.chubby.collections.menu
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background (clojure.core/str darkWhite))
(def boxShadow (clojure.core/str "none"))
(def dividerSize (clojure.core/str "0px"))
(def
 verticalBoxShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  "2px"
  " "
  borderColor
  " "
  "inset"))
(def verticalActiveBoxShadow (clojure.core/str "none"))
(def itemVerticalPadding (clojure.core/str "1.25em"))
(def itemHorizontalPadding (clojure.core/str "2em"))
(def itemFontWeight (clojure.core/str "bold"))
(def activeItemBackground (clojure.core/str primaryColor))
(def activeItemTextColor (clojure.core/str white))
(def activeHoverItemBackground (clojure.core/str primaryColorHover))
(def activeHoverItemColor (clojure.core/str white))
(def
 secondaryItemPadding
 (clojure.core/str relativeSmall " " relativeMedium))
(def secondaryActiveItemBackground (clojure.core/str primaryColor))
(def secondaryActiveItemColor (clojure.core/str white))
(def
 secondaryActiveHoverItemBackground
 (clojure.core/str primaryColorHover))
(def secondaryActiveHoverItemColor (clojure.core/str white))
(def secondaryPointingBorderWidth (clojure.core/str "4px"))
(def secondaryPointingActiveBorderColor (clojure.core/str primaryColor))
(def secondaryPointingActiveTextColor (clojure.core/str primaryColor))
(def arrowSize (clojure.core/str "1em"))
(def arrowActiveColor (clojure.core/str primaryColor))
(def arrowActiveHoverColor (clojure.core/str primaryColorHover))
(def arrowBorder (clojure.core/str "transparent"))
(def paginationActiveBackground (clojure.core/str lightGrey))
(def borderColor (clojure.core/str darkWhite))
(def tabularBorderWidth (clojure.core/str "2px"))
(defstyles root)
