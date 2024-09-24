#!/bin/bash

# Check if a directory is provided as an argument
if [ -z "$1" ]; then
  # No directory provided, use the current directory
  open -a "IntelliJ IDEA" .
else
  # Directory provided, open that directory
  open -a "IntelliJ IDEA" "$1"
fi
