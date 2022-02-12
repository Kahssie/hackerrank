#!/bin/python3

import math
import os
import random
import re
import sys

# there is a problem with the question that is very frustrating when marking accuracy.

if __name__ == '__main__':
    S = input()
    
    try: 
        intS = int(S)
        print (intS)
    except ValueError: 
        print ("Bad String")