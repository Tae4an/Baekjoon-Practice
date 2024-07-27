def josephus_problem(N, K):
    # 초기 리스트 (1부터 N까지)
    people = list(range(1, N+1))
    result = []
    index = 0

    while people:
        # 다음에 제거될 사람의 인덱스를 계산
        index = (index + K - 1) % len(people)
        # 그 사람을 제거하고 결과 리스트에 추가
        result.append(people.pop(index))

    # 결과를 형식에 맞게 출력
    return "<" + ", ".join(map(str, result)) + ">"

N, K = map(int, input().split())

print(josephus_problem(N, K))
