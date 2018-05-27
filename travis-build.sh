#!/bin/bash
set -e
rm -rf *.zip
./gradlew -Dgrails.env=prod clean build 
