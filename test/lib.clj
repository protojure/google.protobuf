(ns lib
  (:require [clojure.test :refer :all]
            [com.google.protobuf :as pb]
            [com.google.protobuf.compiler :as compiler]))

(deftest requires-test
  (testing "This test simply ensures that the generated code compiles and is importable"
    (let [primary (pb/new-Any {:type-url "http://example.com"})
          secondary (compiler/new-Version {:version 34})]
      (is (and (some? primary) (some? secondary))))))
