(clojure.core/ns
 definitions.views.ad
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [../../theme.config :refer :all]))
(def type (clojure.core/str "view"))
(def element (clojure.core/str "ad"))
(defstyles
 root
 [".ui.ad"
  {"display" (clojure.core/str "block"),
   "overflow" (clojure.core/str overflow),
   "margin" (clojure.core/str margin)}]
 [".ui.ad:first-child" {"margin" (clojure.core/str "0em")}]
 [".ui.ad:last-child" {"margin" (clojure.core/str "0em")}]
 [".ui.ad"
  ["iframe"
   {"margin" (clojure.core/str "0em"),
    "padding" (clojure.core/str "0em"),
    "border" (clojure.core/str "none"),
    "overflow" (clojure.core/str "hidden")}]]
 [".ui.leaderboard.ad"
  {"width" (clojure.core/str "728px"),
   "height" (clojure.core/str "90px")}]
 [".ui[class='medium']"
  [nil
   {"width" (clojure.core/str "300px"),
    "height" (clojure.core/str "250px")}]]
 [".ui[class='large']"
  [nil
   {"width" (clojure.core/str "336px"),
    "height" (clojure.core/str "280px")}]]
 [".ui[class='half']"
  [nil
   {"width" (clojure.core/str "300px"),
    "height" (clojure.core/str "600px")}]]
 [".ui.square.ad"
  {"width" (clojure.core/str "250px"),
   "height" (clojure.core/str "250px")}]
 [".ui[class='small']"
  [nil
   {"width" (clojure.core/str "200px"),
    "height" (clojure.core/str "200px")}]]
 [".ui[class='small']"
  [nil
   {"width" (clojure.core/str "180px"),
    "height" (clojure.core/str "150px")}]]
 [".ui[class='vertical']"
  [nil
   {"width" (clojure.core/str "240px"),
    "height" (clojure.core/str "400px")}]]
 [".ui.button.ad"
  {"width" (clojure.core/str "120px"),
   "height" (clojure.core/str "90px")}]
 [".ui[class='square']"
  [nil
   {"width" (clojure.core/str "125px"),
    "height" (clojure.core/str "125px")}]]
 [".ui[class='small']"
  [nil
   {"width" (clojure.core/str "120px"),
    "height" (clojure.core/str "60px")}]]
 [".ui.skyscraper.ad"
  {"width" (clojure.core/str "120px"),
   "height" (clojure.core/str "600px")}]
 [".ui[class='wide']" [nil {"width" (clojure.core/str "160px")}]]
 [".ui.banner.ad"
  {"width" (clojure.core/str "468px"),
   "height" (clojure.core/str "60px")}]
 [".ui[class='vertical']"
  [nil
   {"width" (clojure.core/str "120px"),
    "height" (clojure.core/str "240px")}]]
 [".ui[class='top']"
  [nil
   {"width" (clojure.core/str "930px"),
    "height" (clojure.core/str "180px")}]]
 [".ui[class='half']"
  [nil
   {"width" (clojure.core/str "234px"),
    "height" (clojure.core/str "60px")}]]
 [".ui[class='large']"
  [nil
   {"width" (clojure.core/str "970px"),
    "height" (clojure.core/str "90px")}]]
 [".ui.billboard.ad"
  {"width" (clojure.core/str "970px"),
   "height" (clojure.core/str "250px")}]
 [".ui.panorama.ad"
  {"width" (clojure.core/str "980px"),
   "height" (clojure.core/str "120px")}]
 [".ui.netboard.ad"
  {"width" (clojure.core/str "580px"),
   "height" (clojure.core/str "400px")}]
 [".ui[class='large']"
  ["mobile"
   [nil
    {"width" (clojure.core/str "320px"),
     "height" (clojure.core/str "100px")}]]]
 [".ui[class='mobile']"
  [nil
   {"width" (clojure.core/str "320px"),
    "height" (clojure.core/str "50px")}]]
 [".ui.mobile.ad" {"display" (clojure.core/str "none")}])
