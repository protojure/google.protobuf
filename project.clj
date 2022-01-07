(defproject io.github.protojure/google.protobuf "2.0.0"
  :description "Protojure support for https://developers.google.com/protocol-buffers/docs/reference/google.protobuf"
  :url "https://github.com/protojure/google.protobuf"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2022
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [io.github.protojure/core "2.0.1"]]
  :repl-options {:init-ns google.protobuf})
