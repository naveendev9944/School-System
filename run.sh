#!/bin/bash

# Compile School.java and TestMain.java
javac School.java TestMain.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful."

    # Run TestMain.java
    java TestMain
else
    echo "Compilation failed."
fi
