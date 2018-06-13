(clojure.core/ns
 themes.default.modules.embed
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def background "(:variableName @ lightGrey)")
(def transitionDuration "(:measurement 0.5 s)")
(def transitionEasing "(:variableName @ defaultEasing)")
(def placeholderUnderlay "(:variableName @ background)")
(def placeholderBackground ")")
(def placeholderBackgroundOpacity "(:measurement 0.5)")
(def
 placeholderBackgroundTransition
 "(:variableName @ transitionEasing)")
(def iconBackground "(:variableName @ veryStrongTransparentBlack)")
(def iconSize "(:identifier rem)")
(def iconTransition "(:variableName @ transitionEasing)")
(def iconColor "(:variableName @ white)")
(def iconShadow ")")
(def iconZIndex "(:measurement 10)")
(def
 hoverPlaceholderBackground
 "(:variableName @ placeholderBackground)")
(def hoverPlaceholderBackgroundOpacity "(:measurement 1)")
(def hoverIconColor "(:variableName @ white)")
(defstyles root)
