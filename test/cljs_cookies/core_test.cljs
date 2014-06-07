(ns cljs-cookies.core-test
  (:require-macros [cemerick.cljs.test :refer [is deftest]])
  (:require [cemerick.cljs.test :as t]
            [cljs-cookies.core :as c]))

(enable-console-print!)

(deftest cookies-test
  (is (not (nil? c/cookies))))

(deftest enabled?-test
  (is (c/enabled?)))

(deftest empty?-test
  (is (c/empty?)))

(deftest set-get-cookie-test
  (do
    (c/set-cookie :foo "bar" :max-age 10000)
    (is (= "bar" (c/get-cookie :foo)))))

(deftest not-empty?-test
  (is (not (c/empty?))))
