N = int(input())

def fib(N):
    if N == 0 or N == 1:
        return N
    elif N < 0:
        return -1
    else:
        return fib(N-1) + fib(N-2)


res = fib(N)
if res == -1:
    print("Invalid input")
else:
    print(res)
