#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'rotLeft' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER d
#

def rotLeft(a, d):
    # Write your code here
    arr = []
    
    if (len(a)==d):
        for i in range(a):
            arr.append(a[i])
        return arr
    
    startIdx = d
    
    for i in range(startIdx,len(a)):
        arr.append(a[i])
    for j in range(startIdx):
        arr.append(a[j])
    return arr
    

if __name__ == '__main__':
    a= [41,73,89,7,10, 1, 59, 58, 84, 77, 77, 97, 58, 1,86, 58, 26, 10, 86, 51]
    d=10
    #a=[1,2,3,4,5]
    #d=4
    print("final output:",rotLeft(a,d))
    
    """
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    d = int(first_multiple_input[1])

    a = list(map(int, input().rstrip().split()))

    result = rotLeft(a, d)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
"""