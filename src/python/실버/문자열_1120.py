def min_difference(A, B):
    min_diff = float('inf')
    
    # A를 B의 부분 문자열과 비교
    for i in range(len(B) - len(A) + 1):
        # B의 부분 문자열 추출
        sub_B = B[i:i+len(A)]
        # A와 부분 문자열 간의 차이 계산
        diff = sum(1 for x, y in zip(A, sub_B) if x != y)
        # 최소 차이 갱신
        min_diff = min(min_diff, diff)
    
    return min_diff

A, B = input().split()

print(min_difference(A, B))
