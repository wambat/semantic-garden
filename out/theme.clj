(clojure.core/ns
 styles.theme
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.@{themesFolder}/default/globals/site.variables :refer :all]
  [styles.@{themesFolder}/@{site}/globals/site.variables :refer :all]
  [styles.@{themesFolder}/@{theme}/globals/site.variables :refer :all]
  [styles.@{siteFolder}/globals/site.variables :refer :all]
  [styles.@{themesFolder}/default/@{type}s/@{element}.variables
   :refer
   :all]
  [styles.@{themesFolder}/@{theme}/@{type}s/@{element}.variables
   :refer
   :all]
  [styles.@{siteFolder}/@{type}s/@{element}.variables :refer :all]))
(def theme (clojure.core/str "ERR>(:variableName \"@\" \"element\")<"))
(defstyles root)
