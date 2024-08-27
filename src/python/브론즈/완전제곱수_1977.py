import math

M = int(input())
N = int(input())

perfect_squares = []

for i in range(1, int(math.sqrt(N)) + 1):
    square = i * i
    if M <= square <= N:
        perfect_squares.append(square)

if perfect_squares:
    print(sum(perfect_squares))
    print(min(perfect_squares))
else:
    print(-1)
