#!bin/bash
echo $HOSTNAME

# Simple for loop using a list
for var in first "the second" third "I'll do it"
do
	echo "This is: $var"
done


# Iterating over a file
IFS=$'\n'
file="test_file.txt"
for var in $(cat $file)
do
	echo "$var"
done

# While var isn't 0
var1=5
while [ $var1 -gt 0 ]
do
	echo $var1
	var1=$[ $var1 - 1 ]
done

# For loop
for (( i=1; i <= 10; ++i))
do
	echo "number is $i"
done

# Output to a file
for (( a = 1; a < 10; ++a ))
do
	echo "Number is $a"
done > test_output_file.txt
