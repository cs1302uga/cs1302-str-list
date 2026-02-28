#!/bin/bash

# ensure we change to the directory containing the script
cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null

JAR=lib/cs1302-str-list.jar
SRC=src
BIN=bin

set -x

jdeps -v -cp ${JAR}:${BIN} ${BIN}
