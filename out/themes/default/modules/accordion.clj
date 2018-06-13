(clojure.core/ns
 themes.default.modules.accordion
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def boxShadow (clojure.core/str "none"))
(def titleFont (clojure.core/str headerFont))
(def titlePadding (clojure.core/str "0.5em" " " "0em"))
(def titleFontSize (clojure.core/str "1em"))
(def titleColor (clojure.core/str textColor))
(def iconOpacity (clojure.core/str "11"))
(def iconFontSize (clojure.core/str "1em"))
(def iconFloat (clojure.core/str "none"))
(def iconWidth (clojure.core/str "1.25em"))
(def iconHeight (clojure.core/str "1em"))
(def iconDisplay (clojure.core/str "inline-block"))
(def
 iconMargin
 (clojure.core/str
  "0em"
  " "
  "0.250.25"
  " "
  "rem"
  " "
  "0em"
  " "
  "00"
  " "
  "rem"))
(def iconPadding (clojure.core/str "0em"))
(def
 iconTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def iconVerticalAlign (clojure.core/str "baseline"))
(def iconTransform (clojure.core/str "none"))
(def childAccordionMargin (clojure.core/str "1em" " " "0em" " " "0em"))
(def childAccordionPadding (clojure.core/str "0em"))
(def contentMargin (clojure.core/str ""))
(def contentPadding (clojure.core/str "0.5em" " " "0em" " " "1em"))
(def menuTitlePadding (clojure.core/str "0em"))
(def menuIconFloat (clojure.core/str "right"))
(def
 menuIconMargin
 (clojure.core/str lineHeightOffset " " "0em" " " "0em" " " "1em"))
(def menuIconTransform (clojure.core/str "rotate"))
(def activeIconTransform (clojure.core/str "rotate"))
(def styledWidth (clojure.core/str "600px"))
(def styledBackground (clojure.core/str white))
(def styledBorderRadius (clojure.core/str defaultBorderRadius))
(def
 styledBoxShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "1px" " " borderColor))
(def styledContentMargin (clojure.core/str "0em"))
(def
 styledContentPadding
 (clojure.core/str "0.5em" " " "1em" " " "1.5em"))
(def styledChildContentMargin (clojure.core/str "0em"))
(def styledChildContentPadding (clojure.core/str styledContentPadding))
(def styledTitleMargin (clojure.core/str "0em"))
(def styledTitlePadding (clojure.core/str "0.75em" " " "1em"))
(def styledTitleFontWeight (clojure.core/str bold))
(def styledTitleColor (clojure.core/str unselectedTextColor))
(def
 styledTitleTransition
 (clojure.core/str
  "background-color"
  " "
  defaultDuration
  " "
  defaultEasing))
(def
 styledTitleBorder
 (clojure.core/str "1px" " " "solid" " " borderColor))
(def
 styledTitleTransition
 (clojure.core/str "color" " " defaultDuration " " defaultEasing))
(def styledTitleHoverBackground (clojure.core/str "transparent"))
(def styledTitleHoverColor (clojure.core/str textColor))
(def styledActiveTitleBackground (clojure.core/str "transparent"))
(def styledActiveTitleColor (clojure.core/str selectedTextColor))
(def
 styledHoverChildTitleBackground
 (clojure.core/str styledTitleHoverBackground))
(def
 styledHoverChildTitleColor
 (clojure.core/str styledTitleHoverColor))
(def
 styledActiveChildTitleBackground
 (clojure.core/str styledActiveTitleBackground))
(def
 styledActiveChildTitleColor
 (clojure.core/str styledActiveTitleColor))
(def invertedTitleColor (clojure.core/str invertedTextColor))
(defstyles root)
