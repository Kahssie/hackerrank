#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'checkMagazine' function below.
#
# The function accepts following parameters:
#  1. STRING_ARRAY magazine
#  2. STRING_ARRAY note
#

def checkMagazine(magazine, note):
    # Write your code here
    dicti={}
    for word in (magazine):
        if word in dicti:
            dicti[word]+=1
        else:
            dicti[word] =1
        
    for write in note:
        if write not in dicti:
            print("No")
            return
        if dicti[write]>0:
            dicti[write]-=1
        elif dicti[write]==0:
            print("No")
            return
        
    print("Yes")
    return

if __name__ == '__main__':
    first_multiple_input = input().rstrip().split()

    m = int(first_multiple_input[0])

    n = int(first_multiple_input[1])

    magazine = input().rstrip().split()

    note = input().rstrip().split()

    checkMagazine(magazine, note)
