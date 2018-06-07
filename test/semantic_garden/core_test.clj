(ns semantic-garden.core-test
  (:require [clojure.test :refer :all]
            [semantic-garden.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (parse-file-tree "collections/form") ""))
    ;; (is (= (parse-file-tree "test/" "problems") ""))
    ))
