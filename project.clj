<<<<<<< Updated upstream
(defproject io.github.protojure/google.protobuf "2.0.2-SNAPSHOT"
||||||| Stash base
(defproject io.github.protojure/google.protobuf "2.0.1"
=======
(defproject io.github.protojure/google.protobuf "4.24.4-1"
>>>>>>> Stashed changes
  :description "Protojure support for https://developers.google.com/protocol-buffers/docs/reference/google.protobuf"
  :url "https://github.com/protojure/google.protobuf"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2023
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [io.github.protojure/core "2.8.0"]]
  :repl-options {:init-ns google.protobuf})
