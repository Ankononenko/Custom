#!/bin/bash
echo "Hello World"
echo "Home for the current user is:$HOME"
grade=5
person="Anton"
echo "$person is a good boy, he is in $grade th grade. He is very sexy"
mydir=`pwd`
echo "The current directory the $person is in is $mydir"
answertoall=$(( 40 + 2 ))
echo "Answer to everything is $answertoall"
doubleanswertoall=$(($answertoall * 2))
echo "Double answer to all is $doubleanswertoall"

user=punk
if grep $user /etc/passwd
then
	echo "The user $user exists"
elif ls /home
then
	echo "The user doesn't exist but anyway there is a directory under /home"
else
	echo "The user $user doesn't exist"
fi

n1=1
n2=2
if [ $n1 -eq $n2 ]
then
	echo "1 equals 2"
else
	echo "Not a chance"
fi

text1="text greater greater"
text2="another text"
if [ "$text1" \> "$text2" ]
then
	echo "$text1 is greater than $text2"
else
	echo "$text2 is greater than $text1"
fi

mydir=testdir
mkdir $mydir
if [ -d $mydir ]
then
	echo "The $mydir directory exists"
cd $mydir
ls
else
	echo "The $mydir directory does not exist"
fi
