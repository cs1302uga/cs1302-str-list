#!/bin/bash

# Enable Bash option: exit on error.
set -e

# Change to the directory containing the script.
#
#   This ensures that relative paths are handled correctly, even if
#   our present working directory is set to something else when we run
#   this script.
#
cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null

# Set some important project-related variables.
JAR=lib/cs1302-str-list.jar
SRC=src
BIN=bin
DOC=doc
JAR_API_URL="https://cs1302uga.github.io/cs1302-str-list/doc"
SRC_API_LINK_NAME="cs1302-str-list-doc"

# Enable Bash option: echo commands
set -x

#--------#
# Clean. #
#--------#

rm -rf bin && mkdir -p bin
rm -rf doc && mkdir -p doc

#--------------------------------------#
# Compile string list implementations. #
#--------------------------------------#

javac -Werror -g -cp ${JAR} -d ${BIN} ${SRC}/cs1302/p2/BaseStringList.java
javac -Werror -g -cp ${JAR}:${BIN} -d ${BIN} ${SRC}/cs1302/p2/ArrayStringList.java
javac -Werror -g -cp ${JAR}:${BIN} -d ${BIN} ${SRC}/cs1302/p2/LinkedStringList.java

#-----------------------------#
# Compile string list tester. #
#-----------------------------#

javac -Werror -g -cp ${JAR}:${BIN} -d ${BIN} ${SRC}/cs1302/test/StringListTester.java

#-------------------------------------#
# Generate API documentation website. #
#-------------------------------------#

javadoc -Werror -private -quiet \
        -cp ${JAR}:${LIB} -d ${DOC} -sourcepath ${SRC} -subpackages cs1302 \
        -link ${JAR_API_URL}

#----------------------------------#
# Check for code style violations. #
#----------------------------------#

check1302 ${SRC}

#-------#
# DONE! #
#-------#
