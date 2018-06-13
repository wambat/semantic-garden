(clojure.core/ns
 themes.bootstrap3.elements.button
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def pageFont (clojure.core/str "sans-serif"))
(def textTransform (clojure.core/str "none"))
(def fontWeight (clojure.core/str normal))
(def textColor (clojure.core/str "rgba"))
(def borderRadius nil)
(def lineHeight (clojure.core/str "1.428571.42857"))
(def verticalPadding (clojure.core/str "0.8571em"))
(def horizontalPadding (clojure.core/str "0.8571em"))
(def backgroundColor (clojure.core/str white))
(def backgroundImage (clojure.core/str "none"))
(def borderBoxShadowColor (clojure.core/str "rgba"))
(def green nil)
(def red nil)
(def blue nil)
(def green nil)
(def orange nil)
(def primaryColor (clojure.core/str blue))
(def secondaryColor (clojure.core/str green))
(def labeledIconBackgroundColor (clojure.core/str "transparent"))
(def basicBorderSize (clojure.core/str "0px"))
(def basicColoredBorderSize (clojure.core/str "0px"))
(def invertedBorderSize (clojure.core/str "0px"))
(def basicActiveBackground (clojure.core/str "transparent"))
(def basicHoverBackground (clojure.core/str "transparent"))
(def
 basicDownBoxShadow
 (clojure.core/str "00" " " "3px" " " "5px" " " "rgba" " " "inset"))
(def
 groupButtonOffset
 (clojure.core/str "0px" " " "0px" " " "0px" " " "-1px"))
(def
 verticalGroupOffset
 (clojure.core/str "0px" " " "0px" " " "-1px" " " "0px"))
(def hoverBackgroundColor nil)
(def hoverBoxShadow nil)
(def downBackgroundColor nil)
(def
 downBoxShadow
 (clojure.core/str "00" " " "3px" " " "5px" " " "rgba" " " "inset"))
(def activeBackgroundColor nil)
(def disabledOpacity (clojure.core/str "0.650.65"))
(defstyles root)
