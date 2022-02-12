#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'minimumBribes' function below.
#
# The function accepts INTEGER_ARRAY q as parameter.
#

def minimumBribes(q):
    # Write your code here
    # Write your code here
    
    currentBribeCount = 0
    
    for i in range(len(q)-1,0,-1):
        if (q[i]!=(i+1)):
            # we can count number of bribes by seeing how many people have moved ahead of the current position person
            if (q[i-1]==i+1):
                currentBribeCount += 1
                q[i],q[i-1]=q[i-1],q[i]
            elif (q[i-2]==i+1):
                currentBribeCount += 2
                q[i-1],q[i-2]=q[i-2],q[i-1]
                q[i],q[i-1]=q[i-1],q[i]
            else: 
                # if anyone bribes more than 2 people, print too chaotic
                print("Too chaotic") 
                return
                
    
    print(currentBribeCount)
    return    
    
    """
        # This was the initial naive solution which has n^2 timing!
        currentBribeCount = 0
    
        for i in range(len(q)):
        # if anyone bribes more than 2 people, print too chaotic
        if (q[i]-(i+1)>2):
            print("Too chaotic") 
            return
        
        # else, we can count number of bribes by seeing how many people have moved ahead of the current position person
        
        else:
            for j in range(i):
                if (q[i]<q[j]):
                    currentBribeCount += 1
    print(currentBribeCount)
    return """
                
    
                           


if __name__ == '__main__':
    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        q = list(map(int, input().rstrip().split()))

        minimumBribes(q)
