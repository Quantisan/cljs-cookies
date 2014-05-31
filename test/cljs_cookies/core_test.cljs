(ns cljs-cookies.core-test
  (:require-macros [cemerick.cljs.test :refer [is deftest]])
  (:require [cljs-cookies.core :as c]
            [cemerick.cljs.test :as t]))

(deftest one-test
  (is (= 1 1)))
