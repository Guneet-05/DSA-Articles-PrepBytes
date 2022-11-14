N = int(input())

a = 0
b = 1
c = 0

if N < 0:
    print("Invalid input")
elif N == 0:
    print("0")
elif N == 1:
    print("0 1")
else:
    print("0  1  ",end="")
    for i in range(N-1):
        c = a + b
        print(c," ",end="")
        a = b
        b = c
