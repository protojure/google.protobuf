NAME = protojure
LEIN = $(shell which lein || echo ./lein)
VERSION = $(shell cat project.clj | grep defproject | awk '{ print $$3 }' | sed 's/\"//g')
OUTPUT = target/$(NAME)-$(VERSION).jar
PROTOS:=$(shell find protos -name "*.proto" | sed 's|protos/||g')

DEPS = Makefile project.clj $(shell find src -type f)

all: test bin

.PHONY: test
test:
	$(LEIN) test

bin: $(OUTPUT) $(POM)

$(OUTPUT): $(DEPS)
	$(LEIN) jar

clean:
	$(LEIN) clean

.PHONY: protos
protos:
	protoc --clojure_out=src --proto_path=protos ${PROTOS}
