(clojure.core/ns
 themes.chubby.views.comment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def commentBackground "#FFFFFF")
(def commentMargin "(:measurement 0 em)")
(def commentPadding "(:measurement 1.5 em)")
(def commentBorder ")")
(def commentDivider ")")
(def firstCommentMargin "(:measurement 1 em)")
(def firstCommentPadding "(:measurement 1 em)")
(def nestedCommentsMargin "(:measurement 0.5 em)")
(def nestedCommentsPadding "(:measurement 1 em)")
(def nestedCommentBackground "#F0F0F0")
(def avatarWidth "(:measurement 3.5 em)")
(def avatarSpacing "(:measurement 1.5 em)")
(def avatarBorderRadius "(:variableName @ circularRadius)")
(def contentMargin "")
(def authorFontSize "(:measurement 1 em)")
(def authorColor "(:variableName @ primaryColor)")
(def authorHoverColor "(:variableName @ primaryColorHover)")
(def authorFontWeight "(:identifier bold)")
(def metadataDisplay "(:identifier block)")
(def metadataSpacing "(:measurement 0 em)")
(def metadataColor "(:variableName @ textColor)")
(defstyles root)
