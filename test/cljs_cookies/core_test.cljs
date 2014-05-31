(ns cljs-cookies.core-test
  (:require-macros [cemerick.cljs.test :refer [is deftest]])
  (:require [cemerick.cljs.test :as t]
            [cljs-cookies.core :as c]))

(deftest set-get-cookie-test
  (c/set-cookie :foo "bar")
  (is (= "bar" (c/get-cookie :foo))))
