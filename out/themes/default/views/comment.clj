(clojure.core/ns
 themes.default.views.comment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def maxWidth "(:measurement 650 px)")
(def margin "(:measurement 0 em)")
(def commentBackground "(:identifier none)")
(def commentMargin "(:measurement 0 em)")
(def commentPadding "(:measurement 0 em)")
(def commentDivider "(:identifier none)")
(def commentBorder "(:identifier none)")
(def commentLineHeight "(:measurement 1.2)")
(def firstCommentMargin "(:measurement 0 em)")
(def firstCommentPadding "(:measurement 0 em)")
(def nestedCommentsMargin "(:measurement 0.5 em)")
(def nestedCommentsPadding "(:measurement 1 em)")
(def nestedCommentDivider "(:identifier none)")
(def nestedCommentBorder "(:identifier none)")
(def nestedCommentBackground "(:identifier none)")
(def avatarDisplay "(:identifier block)")
(def avatarFloat "(:identifier left)")
(def avatarWidth "(:measurement 2.5 em)")
(def avatarHeight "(:identifier auto)")
(def avatarSpacing "(:measurement 1 em)")
(def avatarBorderRadius "(:identifier rem)")
(def contentMargin "")
(def authorFontSize "(:measurement 1 em)")
(def authorColor "(:variableName @ textColor)")
(def authorHoverColor "(:variableName @ linkHoverColor)")
(def authorFontWeight "(:variableName @ bold)")
(def metadataDisplay "(:identifier inline-block)")
(def metadataFontSize "(:measurement 0.875 em)")
(def metadataSpacing "(:measurement 0.5 em)")
(def metadataContentSpacing "(:measurement 0.5 em)")
(def metadataColor "(:variableName @ lightTextColor)")
(def textFontSize "(:measurement 1 em)")
(def textMargin "(:measurement 0.5 em)")
(def textWordWrap "(:identifier break-word)")
(def textLineHeight "(:measurement 1.3)")
(def actionFontSize "(:measurement 0.875 em)")
(def actionContentDistance "(:measurement 0.75 em)")
(def actionLinkColor "(:variableName @ unselectedTextColor)")
(def actionLinkHoverColor "(:variableName @ hoveredTextColor)")
(def replyDistance "(:measurement 1 em)")
(def replyHeight "(:measurement 12 em)")
(def replyFontSize "(:measurement 1 em)")
(def commentReplyDistance "(:variableName @ replyDistance)")
(def threadedCommentPadding "(:measurement 2.25 em)")
(def threadedCommentBoxShadow "(:variableName @ borderColor)")
(def minimalActionPosition "(:identifier absolute)")
(def minimalActionTop "(:measurement 0 px)")
(def minimalActionRight "(:measurement 0 px)")
(def minimalActionLeft "(:identifier auto)")
(def minimalTransitionDelay "(:measurement 0.1 s)")
(def minimalEasing "(:variableName @ defaultEasing)")
(def minimalDuration "(:measurement 0.2 s)")
(def minimalTransition "(:variableName @ minimalEasing)")
(defstyles root)
