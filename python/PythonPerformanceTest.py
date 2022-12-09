#========== CODE WRITTEN BY DYLAN CHEN ==========#
from time import perf_counter
loopCount = 100000000

def Operate(op):
    time1 = perf_counter()
    
    stringOp = ""
    x = 1
    for i in range(loopCount):
        if op == 0:
            x += 1
            stringOp = "addition: "
        elif op == 1:
            x -= 1
            stringOp = "subtraction: "
        elif op == 2:
            x *= 2
            stringOp = "multiplication: "
        elif op == 3:
            x /= 2
            stringOp = "division: "
        
    time2 = perf_counter()
    print("Execution time for", stringOp, time2 - time1)

for i in range(4):
    Operate(i)