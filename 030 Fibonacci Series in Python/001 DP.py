N = int(input())
dp = [0,1]

for i in range(N-1):
    dp.append(dp[-1] + dp[-2])

for i in dp:
    print(i," ",end="")
