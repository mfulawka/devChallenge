#!/bin/bash

sleep 5
IP1=`curl -s "localhost:8080/api/direct?dep_sid=3&arr_sid=4" | grep -E 'true|false'`
IP2=`curl -s "localhost:8080/api/direct?dep_sid=0&arr_sid=1" | grep -E 'true|false'`
if [ -n "$IP1" ] && [ -n "$IP2" ]; then   
echo "TEST PASSED!"
else echo "TEST FAILED!"
fi