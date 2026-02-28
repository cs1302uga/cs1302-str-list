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

# Enable Bash option: echo commands
set -x

#----------#
# Compile. #
#----------#

./compile.sh

#-----------------#
# Run the tester! #
#-----------------#

java -cp ${JAR}:${BIN} cs1302.test.StringListTester
