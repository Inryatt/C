#!/bin/bash

antlr4-build
antlr4-visitor Execute String
antlr4-main -v Execute -i -f
antlr4-run
