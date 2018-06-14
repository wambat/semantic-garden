# semantic-garden

A work-in-progress to create a [Garden https://github.com/noprompt/garden] version of https://semantic-ui.com/ framework. 

## Usage

In REPL
```
(process-semantic "resources/semantic/src")
```
will generate the clojure code into "out/..."

## What it does

Compiles styles into 
```
(clojure.core/ns
 styles.definitions.collections.form
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]
  [styles.theme.config :refer :all]))
(def type (clojure.core/str "collection"))
(def element (clojure.core/str "form"))
(defstyles
 root
 [".ui.form"
  {"position" (clojure.core/str "relative"),
   "max-width" (clojure.core/str "100%")}]
 [".ui.form" ["> p" {"margin" (clojure.core/str paragraphMargin)}]]
 [".ui.form"
  [".field"
   {"clear" (clojure.core/str "both"),
    "margin" (clojure.core/str fieldMargin)}]]
 [".ui.form"
  [".field:last-child" {"margin-bottom" (clojure.core/str "0em")}]]
 [".ui.form"
  ["input[type='file']:focus"
   {"color" (clojure.core/str inputFocusColor),
    "border-color" (clojure.core/str inputFocusBorderColor),
    "border-radius" (clojure.core/str inputFocusBorderRadius),
    "background" (clojure.core/str inputFocusBackground),
    "box-shadow" (clojure.core/str inputFocusBoxShadow)}]]
 ...)
```
## Application

The idea is to import the framework as a whole at the prototyping stage of the project, and later use only the parts needed in your custom css, like
```
(defstyles 
my-styles
[:form
  (framework-styles form/root [".ui.form"])])

```
where framework-style should select all the style definitions from underlying framework, allowing you to write framework-agnostic markup

## TODOs

* Map less functions to clojure's counterparts and fix the grammar to support it. 
* Theme switching. Now it expects all of the variables to be defined in theme.config. 
* at-media constructs. 
* More tests. 

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
