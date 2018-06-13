(clojure.core/ns
 themes.default.elements.flag
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 ["i.flag.ad:before"
  {"background-position" (clojure.core/str "0px" " " "0px")}]
 ["i.flag.andorra:before"
  {"background-position" (clojure.core/str "0px" " " "0px")}]
 ["i.flag.ae:before"
  {"background-position" (clojure.core/str "0px" " " "-26px")}]
 ["i.flag.united.arab.emirates:before"
  {"background-position" (clojure.core/str "0px" " " "-26px")}]
 ["i.flag.uae:before"
  {"background-position" (clojure.core/str "0px" " " "-26px")}]
 ["i.flag.af:before"
  {"background-position" (clojure.core/str "0px" " " "-52px")}]
 ["i.flag.afghanistan:before"
  {"background-position" (clojure.core/str "0px" " " "-52px")}]
 ["i.flag.ag:before"
  {"background-position" (clojure.core/str "0px" " " "-78px")}]
 ["i.flag.antigua:before"
  {"background-position" (clojure.core/str "0px" " " "-78px")}]
 ["i.flag.ai:before"
  {"background-position" (clojure.core/str "0px" " " "-104px")}]
 ["i.flag.anguilla:before"
  {"background-position" (clojure.core/str "0px" " " "-104px")}]
 ["i.flag.al:before"
  {"background-position" (clojure.core/str "0px" " " "-130px")}]
 ["i.flag.albania:before"
  {"background-position" (clojure.core/str "0px" " " "-130px")}]
 ["i.flag.am:before"
  {"background-position" (clojure.core/str "0px" " " "-156px")}]
 ["i.flag.armenia:before"
  {"background-position" (clojure.core/str "0px" " " "-156px")}]
 ["i.flag.an:before"
  {"background-position" (clojure.core/str "0px" " " "-182px")}]
 ["i.flag.netherlands.antilles:before"
  {"background-position" (clojure.core/str "0px" " " "-182px")}]
 ["i.flag.ao:before"
  {"background-position" (clojure.core/str "0px" " " "-208px")}]
 ["i.flag.angola:before"
  {"background-position" (clojure.core/str "0px" " " "-208px")}]
 ["i.flag.ar:before"
  {"background-position" (clojure.core/str "0px" " " "-234px")}]
 ["i.flag.argentina:before"
  {"background-position" (clojure.core/str "0px" " " "-234px")}]
 ["i.flag.as:before"
  {"background-position" (clojure.core/str "0px" " " "-260px")}]
 ["i.flag.american.samoa:before"
  {"background-position" (clojure.core/str "0px" " " "-260px")}]
 ["i.flag.at:before"
  {"background-position" (clojure.core/str "0px" " " "-286px")}]
 ["i.flag.austria:before"
  {"background-position" (clojure.core/str "0px" " " "-286px")}]
 ["i.flag.au:before"
  {"background-position" (clojure.core/str "0px" " " "-312px")}]
 ["i.flag.australia:before"
  {"background-position" (clojure.core/str "0px" " " "-312px")}]
 ["i.flag.aw:before"
  {"background-position" (clojure.core/str "0px" " " "-338px")}]
 ["i.flag.aruba:before"
  {"background-position" (clojure.core/str "0px" " " "-338px")}]
 ["i.flag.ax:before"
  {"background-position" (clojure.core/str "0px" " " "-364px")}]
 ["i.flag.aland.islands:before"
  {"background-position" (clojure.core/str "0px" " " "-364px")}]
 ["i.flag.az:before"
  {"background-position" (clojure.core/str "0px" " " "-390px")}]
 ["i.flag.azerbaijan:before"
  {"background-position" (clojure.core/str "0px" " " "-390px")}]
 ["i.flag.ba:before"
  {"background-position" (clojure.core/str "0px" " " "-416px")}]
 ["i.flag.bosnia:before"
  {"background-position" (clojure.core/str "0px" " " "-416px")}]
 ["i.flag.bb:before"
  {"background-position" (clojure.core/str "0px" " " "-442px")}]
 ["i.flag.barbados:before"
  {"background-position" (clojure.core/str "0px" " " "-442px")}]
 ["i.flag.bd:before"
  {"background-position" (clojure.core/str "0px" " " "-468px")}]
 ["i.flag.bangladesh:before"
  {"background-position" (clojure.core/str "0px" " " "-468px")}]
 ["i.flag.be:before"
  {"background-position" (clojure.core/str "0px" " " "-494px")}]
 ["i.flag.belgium:before"
  {"background-position" (clojure.core/str "0px" " " "-494px")}]
 ["i.flag.bf:before"
  {"background-position" (clojure.core/str "0px" " " "-520px")}]
 ["i.flag.burkina.faso:before"
  {"background-position" (clojure.core/str "0px" " " "-520px")}]
 ["i.flag.bg:before"
  {"background-position" (clojure.core/str "0px" " " "-546px")}]
 ["i.flag.bulgaria:before"
  {"background-position" (clojure.core/str "0px" " " "-546px")}]
 ["i.flag.bh:before"
  {"background-position" (clojure.core/str "0px" " " "-572px")}]
 ["i.flag.bahrain:before"
  {"background-position" (clojure.core/str "0px" " " "-572px")}]
 ["i.flag.bi:before"
  {"background-position" (clojure.core/str "0px" " " "-598px")}]
 ["i.flag.burundi:before"
  {"background-position" (clojure.core/str "0px" " " "-598px")}]
 ["i.flag.bj:before"
  {"background-position" (clojure.core/str "0px" " " "-624px")}]
 ["i.flag.benin:before"
  {"background-position" (clojure.core/str "0px" " " "-624px")}]
 ["i.flag.bm:before"
  {"background-position" (clojure.core/str "0px" " " "-650px")}]
 ["i.flag.bermuda:before"
  {"background-position" (clojure.core/str "0px" " " "-650px")}]
 ["i.flag.bn:before"
  {"background-position" (clojure.core/str "0px" " " "-676px")}]
 ["i.flag.brunei:before"
  {"background-position" (clojure.core/str "0px" " " "-676px")}]
 ["i.flag.bo:before"
  {"background-position" (clojure.core/str "0px" " " "-702px")}]
 ["i.flag.bolivia:before"
  {"background-position" (clojure.core/str "0px" " " "-702px")}]
 ["i.flag.br:before"
  {"background-position" (clojure.core/str "0px" " " "-728px")}]
 ["i.flag.brazil:before"
  {"background-position" (clojure.core/str "0px" " " "-728px")}]
 ["i.flag.bs:before"
  {"background-position" (clojure.core/str "0px" " " "-754px")}]
 ["i.flag.bahamas:before"
  {"background-position" (clojure.core/str "0px" " " "-754px")}]
 ["i.flag.bt:before"
  {"background-position" (clojure.core/str "0px" " " "-780px")}]
 ["i.flag.bhutan:before"
  {"background-position" (clojure.core/str "0px" " " "-780px")}]
 ["i.flag.bv:before"
  {"background-position" (clojure.core/str "0px" " " "-806px")}]
 ["i.flag.bouvet.island:before"
  {"background-position" (clojure.core/str "0px" " " "-806px")}]
 ["i.flag.bw:before"
  {"background-position" (clojure.core/str "0px" " " "-832px")}]
 ["i.flag.botswana:before"
  {"background-position" (clojure.core/str "0px" " " "-832px")}]
 ["i.flag.by:before"
  {"background-position" (clojure.core/str "0px" " " "-858px")}]
 ["i.flag.belarus:before"
  {"background-position" (clojure.core/str "0px" " " "-858px")}]
 ["i.flag.bz:before"
  {"background-position" (clojure.core/str "0px" " " "-884px")}]
 ["i.flag.belize:before"
  {"background-position" (clojure.core/str "0px" " " "-884px")}]
 ["i.flag.ca:before"
  {"background-position" (clojure.core/str "0px" " " "-910px")}]
 ["i.flag.canada:before"
  {"background-position" (clojure.core/str "0px" " " "-910px")}]
 ["i.flag.cc:before"
  {"background-position" (clojure.core/str "0px" " " "-962px")}]
 ["i.flag.cocos.islands:before"
  {"background-position" (clojure.core/str "0px" " " "-962px")}]
 ["i.flag.cd:before"
  {"background-position" (clojure.core/str "0px" " " "-988px")}]
 ["i.flag.congo:before"
  {"background-position" (clojure.core/str "0px" " " "-988px")}]
 ["i.flag.cf:before"
  {"background-position" (clojure.core/str "0px" " " "-1014px")}]
 ["i.flag.central.african.republic:before"
  {"background-position" (clojure.core/str "0px" " " "-1014px")}]
 ["i.flag.cg:before"
  {"background-position" (clojure.core/str "0px" " " "-1040px")}]
 ["i.flag.congo.brazzaville:before"
  {"background-position" (clojure.core/str "0px" " " "-1040px")}]
 ["i.flag.ch:before"
  {"background-position" (clojure.core/str "0px" " " "-1066px")}]
 ["i.flag.switzerland:before"
  {"background-position" (clojure.core/str "0px" " " "-1066px")}]
 ["i.flag.ci:before"
  {"background-position" (clojure.core/str "0px" " " "-1092px")}]
 ["i.flag.cote.divoire:before"
  {"background-position" (clojure.core/str "0px" " " "-1092px")}]
 ["i.flag.ck:before"
  {"background-position" (clojure.core/str "0px" " " "-1118px")}]
 ["i.flag.cook.islands:before"
  {"background-position" (clojure.core/str "0px" " " "-1118px")}]
 ["i.flag.cl:before"
  {"background-position" (clojure.core/str "0px" " " "-1144px")}]
 ["i.flag.chile:before"
  {"background-position" (clojure.core/str "0px" " " "-1144px")}]
 ["i.flag.cm:before"
  {"background-position" (clojure.core/str "0px" " " "-1170px")}]
 ["i.flag.cameroon:before"
  {"background-position" (clojure.core/str "0px" " " "-1170px")}]
 ["i.flag.cn:before"
  {"background-position" (clojure.core/str "0px" " " "-1196px")}]
 ["i.flag.china:before"
  {"background-position" (clojure.core/str "0px" " " "-1196px")}]
 ["i.flag.co:before"
  {"background-position" (clojure.core/str "0px" " " "-1222px")}]
 ["i.flag.colombia:before"
  {"background-position" (clojure.core/str "0px" " " "-1222px")}]
 ["i.flag.cr:before"
  {"background-position" (clojure.core/str "0px" " " "-1248px")}]
 ["i.flag.costa.rica:before"
  {"background-position" (clojure.core/str "0px" " " "-1248px")}]
 ["i.flag.cs:before"
  {"background-position" (clojure.core/str "0px" " " "-1274px")}]
 ...)
