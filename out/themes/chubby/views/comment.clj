(clojure.core/ns
 themes.chubby.views.comment
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(def commentBackground (clojure.core/str "#FFFFFF"))
(def commentMargin (clojure.core/str "1em" " " "0em" " " "0em"))
(def commentPadding (clojure.core/str "1em" " " "1.5em"))
(def commentBorder (clojure.core/str "1px" " " "solid" " " "rgba"))
(def commentDivider (clojure.core/str "1px" " " "solid" " " "rgba"))
(def firstCommentMargin (clojure.core/str "1em"))
(def firstCommentPadding (clojure.core/str "1em"))
(def
 nestedCommentsMargin
 (clojure.core/str "0em" " " "0em" " " "0.5em" " " "0.5em"))
(def
 nestedCommentsPadding
 (clojure.core/str "1em" " " "0em" " " "0em" " " "1em"))
(def nestedCommentBackground (clojure.core/str "#F0F0F0"))
(def avatarWidth (clojure.core/str "3.5em"))
(def avatarSpacing (clojure.core/str "1.5em"))
(def avatarBorderRadius (clojure.core/str circularRadius))
(def contentMargin nil)
(def authorFontSize (clojure.core/str "1em"))
(def authorColor (clojure.core/str primaryColor))
(def authorHoverColor (clojure.core/str primaryColorHover))
(def authorFontWeight (clojure.core/str "bold"))
(def metadataDisplay (clojure.core/str "block"))
(def metadataSpacing (clojure.core/str "0em"))
(def metadataColor (clojure.core/str textColor))
(defstyles root)
