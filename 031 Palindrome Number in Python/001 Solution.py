N = int(input())
rev = 0
oN = N
rem = 0

while N > 0:
    rem = N % 10
    rev = rev * 10 + rem
    N //= 10
    
if rev == oN:
    print("The number is a palindrome")
else:
    print("The number is not a palindrome")
