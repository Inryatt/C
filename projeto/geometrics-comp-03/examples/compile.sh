#!/bin/bash

if [[ "$#" -ne 1 ]]; then
    echo "Usage: ./make <file> -- this file can be a .py (to run) or a .geo (to compile and run)"
    echo "or ./make clean to clean the created files -> not the .py file! (which wont run after this)"
    exit 1
fi


filename=$1
echo filename: ${filename}

# if [[ $filename == *.geo ]]; then
        #rm library.py               #update library
        #rm ./bin/${filename}.py     #delete old output
        #cp examples/library.py .    #update library

        # antlr4-build 2> /dev/null
        # antlr4-build

        cd ../src/Grammar
        # cat ../../examples/${filename} | java GeometricsMain > ../../examples/bin/${filename}.py 
        java GeometricsMain ../../examples/${filename} # > ../../examples/bin/${filename}.py 
        if [[ $? == 0 ]]; then
            cd ../../examples
            python3 ./bin/${filename}.py
        fi

        #should it clean the generated/copied files?
# else
#     echo "ERROR: File not recognized. Pass a .geo file!"
#     exit 1
# fi

exit 0
