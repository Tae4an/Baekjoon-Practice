def count_subsequences_with_sum(arr, target_sum):
    n = len(arr)
    count = 0
    
    def backtrack(index, current_sum):
        nonlocal count
        if index == n:
            return
        current_sum += arr[index]
        
        if current_sum == target_sum:
            count += 1
        
        # 현재 원소를 포함하는 경우
        backtrack(index + 1, current_sum)
        # 현재 원소를 포함하지 않는 경우
        current_sum -= arr[index]
        backtrack(index + 1, current_sum)
    
    backtrack(0, 0)
    return count

N, S = map(int, input().split())
numbers = list(map(int, input().split()))

result = count_subsequences_with_sum(numbers, S)
print(result)
