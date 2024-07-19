A, B = map(int, input().split())

small = min(A, B)
large = max(A, B)

n = large - small + 1
result = n * (small + large) // 2

print(result)
