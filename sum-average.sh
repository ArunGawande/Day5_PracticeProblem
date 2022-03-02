#!/bin/bash 

for i in `seq 5`
do
   num=$(( RANDOM % (99) + 10 ));
   echo $num;
   sum=$(( sum + num ))
done
   echo "Sum of the number:" $sum;
   avg=$((sum/i));
   echo "average of the number:" $avg;
 
