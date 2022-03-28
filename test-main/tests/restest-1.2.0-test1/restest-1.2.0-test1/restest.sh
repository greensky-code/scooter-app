#!/bin/bash

if [[ -z $JAVA_HOME ]]; then
	echo "JAVA_HOME is not set"
	exit
fi
if [[ ! -e "$JAVA_HOME/bin/java" ]]; then
        echo "JAVA_HOME is not set to a valid JDK"
        exit
fi

if [[ $# != 1 ]]; then
    PROPERTIES_FILE=src/test/resources/scooter/scooter.properties
else PROPERTIES_FILE=$1 
fi

echo "Testing using test properties from: " $PROPERTIES_FILE

$JAVA_HOME/bin/java -jar restest.jar $PROPERTIES_FILE 