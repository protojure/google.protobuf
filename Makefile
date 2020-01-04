PROTOS:=$(shell find protos -name "*.proto" | sed 's|protos/||g')

all:
	protoc --clojure_out=src --proto_path=protos ${PROTOS}
