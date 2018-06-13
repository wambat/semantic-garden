(clojure.core/ns
 themes.default.collections.message
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def verticalMargin (clojure.core/str "1em"))
(def verticalPadding (clojure.core/str "1em"))
(def horizontalPadding (clojure.core/str "1.5em"))
(def padding (clojure.core/str verticalPadding " " horizontalPadding))
(def background nil)
(def lineHeightOffset (clojure.core/str))
(def borderRadius (clojure.core/str defaultBorderRadius))
(def borderWidth (clojure.core/str "1px"))
(def
 borderShadow
 (clojure.core/str
  "0px"
  " "
  "0px"
  " "
  "0px"
  " "
  borderWidth
  " "
  strongBorderColor
  " "
  "inset"))
(def
 shadowShadow
 (clojure.core/str "0px" " " "0px" " " "0px" " " "0px" " " "rgba"))
(def boxShadow (clojure.core/str shadowShadow))
(def
 transition
 (clojure.core/str "box-shadow" " " defaultDuration " " defaultEasing))
(def headerFontSize (clojure.core/str relativeLarge))
(def headerFontWeight (clojure.core/str bold))
(def headerDisplay (clojure.core/str "block"))
(def headerDistance (clojure.core/str "00" " " "rem"))
(def headerMargin nil)
(def headerParagraphDistance (clojure.core/str "0.25em"))
(def messageTextOpacity (clojure.core/str "0.850.85"))
(def messageParagraphMargin (clojure.core/str "0.75em"))
(def listOpacity (clojure.core/str "0.850.85"))
(def listStylePosition (clojure.core/str "inside"))
(def listMargin (clojure.core/str "0.5em"))
(def listItemIndent (clojure.core/str "1em"))
(def listItemMargin (clojure.core/str "0.3em"))
(def iconDistance (clojure.core/str "0.6em"))
(def closeTopDistance nil)
(def closeRightDistance (clojure.core/str "0.5em"))
(def closeOpacity (clojure.core/str "0.70.7"))
(def
 closeTransition
 (clojure.core/str "opacity" " " defaultDuration " " defaultEasing))
(def iconSize (clojure.core/str "3em"))
(def iconOpacity (clojure.core/str "0.80.8"))
(def iconContentDistance (clojure.core/str "00" " " "rem"))
(def iconVerticalAlign (clojure.core/str "middle"))
(def attachedXOffset (clojure.core/str "-1px"))
(def attachedYOffset (clojure.core/str "-1px"))
(def
 attachedBoxShadow
 (clojure.core/str
  "0em"
  " "
  "0em"
  " "
  "0em"
  " "
  borderWidth
  " "
  borderColor
  " "
  "inset"))
(def attachedBottomBoxShadow (clojure.core/str subtleShadow))
(def floatingBoxShadow (clojure.core/str floatingShadow))
(def redBoxShadow (clojure.core/str shadowShadow))
(def orangeBoxShadow (clojure.core/str shadowShadow))
(def yellowBoxShadow (clojure.core/str shadowShadow))
(def oliveBoxShadow (clojure.core/str shadowShadow))
(def greenBoxShadow (clojure.core/str shadowShadow))
(def tealBoxShadow (clojure.core/str shadowShadow))
(def blueBoxShadow (clojure.core/str shadowShadow))
(def violetBoxShadow (clojure.core/str shadowShadow))
(def purpleBoxShadow (clojure.core/str shadowShadow))
(def pinkBoxShadow (clojure.core/str shadowShadow))
(def brownBoxShadow (clojure.core/str shadowShadow))
(def positiveBoxShadow (clojure.core/str shadowShadow))
(def negativeBoxShadow (clojure.core/str shadowShadow))
(def infoBoxShadow (clojure.core/str shadowShadow))
(def warningBoxShadow (clojure.core/str shadowShadow))
(def errorBoxShadow (clojure.core/str shadowShadow))
(def successBoxShadow (clojure.core/str shadowShadow))
(defstyles root)
