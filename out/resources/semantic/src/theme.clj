((clojure.core/ns
  theme
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   ["@{themesFolder}/default/globals/site.variables" :refer :all]
   ["@{themesFolder}/@{site}/globals/site.variables" :refer :all]
   ["@{themesFolder}/@{theme}/globals/site.variables" :refer :all]
   ["@{siteFolder}/globals/site.variables" :refer :all]
   ["@{themesFolder}/default/@{type}s/@{element}.variables"
    :refer
    :all]
   ["@{themesFolder}/@{theme}/@{type}s/@{element}.variables"
    :refer
    :all]
   ["@{siteFolder}/@{type}s/@{element}.variables" :refer :all]))
 (def theme "(:variableName \"@\" (:variableName \"@\" \"element\"))")
 (defstyles root))
