import math
numZeros = 0

def rotate(curr, num: int):
    """
    takes in the number you are rotating by and the current rotation number you're at. will increment numZeros if it passes by zero.
    returns the new number you are at
    """
    global numZeros
    temp = curr
    #temp = curr + num
    #if temp < 0 and curr > 0: numZeros += abs(temp//100) + 1
    #else: numZeros += abs(temp//100)
    #temp = temp%100
    incBy = 1
    if num < 0: incBy = -1
    for _ in range(abs(num)):
        temp += incBy
        if temp%100 == 0: numZeros += 1
    
    #if temp == 0: numZeros += 1
    return temp

with open("D1.in") as temp:
    moves = temp.read().split("\n")
currNum = 50
for rotation in moves:
    rotateBy = int(rotation[1:])
    if rotation[0] == 'L':
        rotateBy *= -1
    currNum = rotate(currNum, rotateBy)

print(numZeros)

