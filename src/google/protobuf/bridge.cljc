;;;----------------------------------------------------------------------------------
;;; Generated by protoc-gen-clojure.  DO NOT EDIT
;;;
;;; Message Implementation of package google.protobuf.bridge
;;;----------------------------------------------------------------------------------
(ns google.protobuf.bridge
  (:require [protojure.protobuf.protocol :as pb]
            [protojure.protobuf.serdes.core :as serdes.core]
            [protojure.protobuf.serdes.complex :as serdes.complex]
            [protojure.protobuf.serdes.utils :refer [tag-map]]
            [protojure.protobuf.serdes.stream :as serdes.stream]
            [clojure.set :as set]
            [clojure.spec.alpha :as s]))

;;----------------------------------------------------------------------------------
;;----------------------------------------------------------------------------------
;; Forward declarations
;;----------------------------------------------------------------------------------
;;----------------------------------------------------------------------------------

(declare cis->MessageSet)
(declare ecis->MessageSet)
(declare new-MessageSet)


;;----------------------------------------------------------------------------------
;;----------------------------------------------------------------------------------
;; Message Implementations
;;----------------------------------------------------------------------------------
;;----------------------------------------------------------------------------------

;-----------------------------------------------------------------------------
; MessageSet
;-----------------------------------------------------------------------------
(defrecord MessageSet-record []
  pb/Writer
  (serialize [this os]
)
  pb/TypeReflection
  (gettype [this]
    "google.protobuf.bridge.MessageSet"))

(s/def ::MessageSet-spec (s/keys :opt-un []))
(def MessageSet-defaults {})

(defn cis->MessageSet
  "CodedInputStream to MessageSet"
  [is]
  (->> (tag-map MessageSet-defaults
         (fn [tag index]
             (case index
               [index (serdes.core/cis->undefined tag is)]))
         is)
        (map->MessageSet-record)))

(defn ecis->MessageSet
  "Embedded CodedInputStream to MessageSet"
  [is]
  (serdes.core/cis->embedded cis->MessageSet is))

(defn new-MessageSet
  "Creates a new instance from a map, similar to map->MessageSet except that
  it properly accounts for nested messages, when applicable.
  "
  [init]
  {:pre [(if (s/valid? ::MessageSet-spec init) true (throw (ex-info "Invalid input" (s/explain-data ::MessageSet-spec init))))]}
  (-> (merge MessageSet-defaults init)
      (map->MessageSet-record)))

(defn pb->MessageSet
  "Protobuf to MessageSet"
  [input]
  (cis->MessageSet (serdes.stream/new-cis input)))

(def ^:protojure.protobuf.any/record MessageSet-meta {:type "google.protobuf.bridge.MessageSet" :decoder pb->MessageSet})
