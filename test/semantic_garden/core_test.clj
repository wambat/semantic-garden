(ns semantic-garden.core-test
  (:require [clojure.test :refer :all]
            [semantic-garden.core :refer :all]))

(deftest translate
  (testing "Translate into garden"
    (is (=
         `(ns "test.problems"
            (:import))
         (translate-stylesheet "test.problems"
                                 (parse-file-tree "test/" "problems"))))))

#_(deftest parse
  (testing "Parse into structure"
    ;; (is (= (parse-file-tree "collections/form") ""))
    (is (= (parse-file-tree "test/" "problems")
           '(:stylesheet
            (:statement
             (:variableDeclaration
              (:variableName "@" "element") ":"
              (:values (:commandStatement (:expression "'form'")))) ";")
            (:statement
             (:importDeclaration "@import" "(" (:importOption "multiple") ")" (:referenceUrl "'../../theme.config'") ";"))
            (:statement
             (:ruleset
              (:selectors
               (:selector (:element (:identifier ".ui.form"))
                          (:element (:identifier ".field"))
                          (:element (:identifier ".prompt.label"))))
              (:block
               "{"
               (:property
                (:identifier "white-space") ":"
                (:values (:commandStatement (:expression (:identifier "normal"))))) ";"
               (:property
                (:identifier "background") ":"
                (:values (:commandStatement (:expression (:variableName "@" "promptBackground") "!important")))) ";"
               (:property
                (:identifier "border") ":"
                (:values (:commandStatement (:expression (:variableName "@" "promptBorder") "!important")))) ";"
               (:property (:identifier "color") ":"
                          (:values (:commandStatement (:expression (:variableName "@" "promptTextColor") "!important")))) ";" "}")))
            (:statement
             (:ruleset
              (:selectors
               (:selector (:element (:identifier ".ui.form")) (:element (:pseudo "::" "-webkit-datetime-edit"))) ","
               (:selector (:element (:identifier ".ui.form")) (:element (:pseudo "::" "-webkit-inner-spin-button"))))
              (:block "{"
                      (:property (:identifier "height") ":" (:values (:commandStatement (:expression (:variableName "@" "inputLineHeight"))))) ";" "}")))
            (:statement
             (:ruleset (:selectors (:selector (:element (:identifier ".ui.form")) (:element (:identifier ".field")) (:selectorPrefix ">") (:element (:identifier ".selection.dropdown")) (:selectorPrefix ">") (:element (:identifier ".dropdown.icon")))) (:block "{" (:property (:identifier "float") ":" (:values (:commandStatement (:expression (:identifier "right"))))) ";" "}"))))))

    ))
