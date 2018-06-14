(clojure.core/ns
 styles.themes.default.views.comment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def maxWidth (clojure.core/str "650px"))
(def margin (clojure.core/str "1.5em" " " "0em"))
(def commentBackground (clojure.core/str "none"))
(def commentMargin (clojure.core/str "0.5em" " " "0em" " " "0em"))
(def commentPadding (clojure.core/str "0.5em" " " "0em" " " "0em"))
(def commentDivider (clojure.core/str "none"))
(def commentBorder (clojure.core/str "none"))
(def commentLineHeight (clojure.core/str "1.21.2"))
(def firstCommentMargin (clojure.core/str "0em"))
(def firstCommentPadding (clojure.core/str "0em"))
(def
 nestedCommentsMargin
 (clojure.core/str "0em" " " "0em" " " "0.5em" " " "0.5em"))
(def
 nestedCommentsPadding
 (clojure.core/str "1em" " " "0em" " " "1em" " " "1em"))
(def nestedCommentDivider (clojure.core/str "none"))
(def nestedCommentBorder (clojure.core/str "none"))
(def nestedCommentBackground (clojure.core/str "none"))
(def avatarDisplay (clojure.core/str "block"))
(def avatarFloat (clojure.core/str "left"))
(def avatarWidth (clojure.core/str "2.5em"))
(def avatarHeight (clojure.core/str "auto"))
(def avatarSpacing (clojure.core/str "1em"))
(def avatarBorderRadius (clojure.core/str "0.250.25" " " "rem"))
(def contentMargin nil)
(def authorFontSize (clojure.core/str "1em"))
(def authorColor (clojure.core/str textColor))
(def authorHoverColor (clojure.core/str linkHoverColor))
(def authorFontWeight (clojure.core/str bold))
(def metadataDisplay (clojure.core/str "inline-block"))
(def metadataFontSize (clojure.core/str "0.875em"))
(def metadataSpacing (clojure.core/str "0.5em"))
(def metadataContentSpacing (clojure.core/str "0.5em"))
(def metadataColor (clojure.core/str lightTextColor))
(def textFontSize (clojure.core/str "1em"))
(def textMargin (clojure.core/str "0.25em" " " "0em" " " "0.5em"))
(def textWordWrap (clojure.core/str "break-word"))
(def textLineHeight (clojure.core/str "1.31.3"))
(def actionFontSize (clojure.core/str "0.875em"))
(def actionContentDistance (clojure.core/str "0.75em"))
(def actionLinkColor (clojure.core/str unselectedTextColor))
(def actionLinkHoverColor (clojure.core/str hoveredTextColor))
(def replyDistance (clojure.core/str "1em"))
(def replyHeight (clojure.core/str "12em"))
(def replyFontSize (clojure.core/str "1em"))
(def commentReplyDistance (clojure.core/str replyDistance))
(def
 threadedCommentPadding
 (clojure.core/str "3em" " " "0em" " " "2em" " " "2.25em"))
(def
 threadedCommentBoxShadow
 (clojure.core/str "-1px" " " "0px" " " "0px" " " borderColor))
(def minimalActionPosition (clojure.core/str "absolute"))
(def minimalActionTop (clojure.core/str "0px"))
(def minimalActionRight (clojure.core/str "0px"))
(def minimalActionLeft (clojure.core/str "auto"))
(def minimalTransitionDelay (clojure.core/str "0.1s"))
(def minimalEasing (clojure.core/str defaultEasing))
(def minimalDuration (clojure.core/str "0.2s"))
(def
 minimalTransition
 (clojure.core/str "opacity" " " minimalDuration " " minimalEasing))
(defstyles root)
