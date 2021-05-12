#!/bin/python3

import math
import os
import random
import re
import sys




if __name__ == '__main__':
    ADD = []
    MAX_SUM = []

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
        for i in range(len(arr)-2):
            for j in range(4):
                ADD.extend(arr[i][j:j+3])
                ADD.append(arr[i+1][j+1])
                ADD.extend(arr[i+2][j:j+3])
                MAX_SUM.append(sum(ADD))
                ADD = []

    print(max(MAX_SUM))
