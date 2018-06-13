(clojure.core/ns
 definitions.views.comment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type nil)
(def element nil)
(defstyles
 root
 [".ui.comments"
  {"margin" (clojure.core/str margin),
   "max-width" (clojure.core/str maxWidth)}]
 [".ui.comments:first-child" {"margin-top" (clojure.core/str "0em")}]
 [".ui.comments:last-child" {"margin-bottom" (clojure.core/str "0em")}]
 [".ui.comments"
  [".comment"
   {"position" (clojure.core/str "relative"),
    "background" (clojure.core/str commentBackground),
    "margin" (clojure.core/str commentMargin),
    "padding" (clojure.core/str commentPadding),
    "border" (clojure.core/str commentBorder),
    "border-top" (clojure.core/str commentDivider),
    "line-height" (clojure.core/str commentLineHeight)}]]
 [".ui.comments"
  [".comment:first-child"
   {"margin-top" (clojure.core/str firstCommentMargin),
    "padding-top" (clojure.core/str firstCommentPadding)}]]
 [".ui.comments"
  [".comment"
   [".comments"
    {"margin" (clojure.core/str nestedCommentsMargin),
     "padding" (clojure.core/str nestedCommentsPadding)}]]]
 [".ui.comments"
  [".comment"
   [".comments:before"
    {"position" (clojure.core/str "absolute"),
     "top" (clojure.core/str "0px"),
     "left" (clojure.core/str "0px")}]]]
 [".ui.comments"
  [".comment"
   [".comments"
    [".comment"
     {"border" (clojure.core/str nestedCommentBorder),
      "border-top" (clojure.core/str nestedCommentDivider),
      "background" (clojure.core/str nestedCommentBackground)}]]]]
 [".ui.comments"
  [".comment"
   [".avatar"
    {"display" (clojure.core/str avatarDisplay),
     "width" (clojure.core/str avatarWidth),
     "height" (clojure.core/str avatarHeight),
     "float" (clojure.core/str avatarFloat),
     "margin" (clojure.core/str avatarMargin)}]]]
 [".ui.comments"
  [".comment"
   ["img.avatar"
    {"display" (clojure.core/str "block"),
     "margin" (clojure.core/str "0em" " " "auto"),
     "width" (clojure.core/str "100%"),
     "height" (clojure.core/str "100%"),
     "border-radius" (clojure.core/str avatarBorderRadius)}]]]
 [".ui.comments"
  [".comment"
   [".avatar"
    ["img"
     {"display" (clojure.core/str "block"),
      "margin" (clojure.core/str "0em" " " "auto"),
      "width" (clojure.core/str "100%"),
      "height" (clojure.core/str "100%"),
      "border-radius" (clojure.core/str avatarBorderRadius)}]]]]
 [".ui.comments"
  [".comment" ["> .content" {"display" (clojure.core/str "block")}]]]
 [".ui.comments"
  [".comment"
   ["> .avatar"
    ["~ .content" {"margin-left" (clojure.core/str contentMargin)}]]]]
 [".ui.comments"
  [".comment"
   [".author"
    {"font-size" (clojure.core/str authorFontSize),
     "color" (clojure.core/str authorColor),
     "font-weight" (clojure.core/str authorFontWeight)}]]]
 [".ui.comments"
  [".comment" ["a.author" {"cursor" (clojure.core/str "pointer")}]]]
 [".ui.comments"
  [".comment"
   ["a.author:hover" {"color" (clojure.core/str authorHoverColor)}]]]
 [".ui.comments"
  [".comment"
   [".metadata"
    {"display" (clojure.core/str metadataDisplay),
     "margin-left" (clojure.core/str metadataSpacing),
     "color" (clojure.core/str metadataColor),
     "font-size" (clojure.core/str metadataFontSize)}]]]
 nil
 [":last-child" {"margin-right" (clojure.core/str "0em")}]
 [".ui.comments"
  [".comment"
   [".text"
    {"margin" (clojure.core/str textMargin),
     "font-size" (clojure.core/str textFontSize),
     "word-wrap" (clojure.core/str textWordWrap),
     "color" (clojure.core/str textColor),
     "line-height" (clojure.core/str textLineHeight)}]]]
 [".ui.comments"
  [".comment"
   [".actions" {"font-size" (clojure.core/str actionFontSize)}]]]
 [".ui.comments"
  [".comment"
   [".actions"
    ["a"
     {"cursor" (clojure.core/str "pointer"),
      "display" (clojure.core/str "inline-block"),
      "margin"
      (clojure.core/str
       "0em"
       " "
       actionContentDistance
       " "
       "0em"
       " "
       "0em"),
      "color" (clojure.core/str actionLinkColor)}]]]]
 [".ui.comments"
  [".comment"
   [".actions"
    ["a:last-child" {"margin-right" (clojure.core/str "0em")}]]]]
 [".ui.comments"
  [".comment"
   [".actions"
    ["a.active" {"color" (clojure.core/str actionLinkHoverColor)}]]]]
 [".ui.comments"
  [".comment"
   [".actions"
    ["a:hover" {"color" (clojure.core/str actionLinkHoverColor)}]]]]
 [".ui.comments"
  ["> .reply.form" {"margin-top" (clojure.core/str replyDistance)}]]
 [".ui.comments"
  [".comment"
   [".reply.form"
    {"width" (clojure.core/str "100%"),
     "margin-top" (clojure.core/str commentReplyDistance)}]]]
 [".ui.comments"
  [".reply.form"
   ["textarea"
    {"font-size" (clojure.core/str replyFontSize),
     "height" (clojure.core/str replyHeight)}]]]
 [".ui.collapsed.comments" {"display" (clojure.core/str "none")}]
 [".ui.comments"
  [".collapsed.comments" {"display" (clojure.core/str "none")}]]
 [".ui.comments"
  [".collapsed.comment" {"display" (clojure.core/str "none")}]]
 [".ui.threaded.comments"
  [".comment"
   [".comments"
    {"margin" (clojure.core/str threadedCommentMargin),
     "padding" (clojure.core/str threadedCommentPadding),
     "box-shadow" (clojure.core/str threadedCommentBoxShadow)}]]]
 [".ui.minimal.comments"
  [".comment"
   [".actions"
    {"opacity" (clojure.core/str "00"),
     "position" (clojure.core/str minimalActionPosition),
     "top" (clojure.core/str minimalActionTop),
     "right" (clojure.core/str minimalActionRight),
     "left" (clojure.core/str minimalActionLeft),
     "transition" (clojure.core/str minimalTransition),
     "transition-delay" (clojure.core/str minimalTransitionDelay)}]]]
 [".ui.minimal.comments"
  [".comment"
   ["> .content:hover"
    ["> .actions" {"opacity" (clojure.core/str "11")}]]]]
 [".ui.mini.comments" {"font-size" (clojure.core/str mini)}]
 [".ui.tiny.comments" {"font-size" (clojure.core/str tiny)}]
 [".ui.small.comments" {"font-size" (clojure.core/str small)}]
 [".ui.comments" {"font-size" (clojure.core/str medium)}]
 [".ui.large.comments" {"font-size" (clojure.core/str large)}]
 [".ui.big.comments" {"font-size" (clojure.core/str big)}]
 [".ui.huge.comments" {"font-size" (clojure.core/str huge)}]
 [".ui.massive.comments" {"font-size" (clojure.core/str massive)}])
