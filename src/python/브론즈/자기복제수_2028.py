T = int(input())

for _ in range(T):
    N = int(input())
    
    square = N * N
    
    if str(square).endswith(str(N)):
        print("YES")
    else:
        print("NO")
