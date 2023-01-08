def solve(arr):
    s = " "; #delimeter that joins multiple strings of the array together
#     So, every string of the array arr will have this delimeter between them
    return s.join(arr)

def main():
    arr = ['PrepBytes','offers','excellent','courses']
    print(solve(arr))
    
if __name__ == '__main__':
    main()
