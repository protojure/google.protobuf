(defproject protojure/google.protobuf "1.0.1-SNAPSHOT"
  :description "Protojure support for https://developers.google.com/protocol-buffers/docs/reference/google.protobuf"
  :url "https://github.com/protojure/google.protobuf"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2020
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.10.3" :scope "provided"]
                 [protojure "1.7.0" :scope "provided"]
                 [com.google.protobuf/protobuf-java "3.19.1" :scope "provided"]]
  :repl-options {:init-ns google.protobuf})
