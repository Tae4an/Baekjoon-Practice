def calculate_prize(dice):
    dice.sort()
    if dice[0] == dice[3]:
        # 같은 눈이 4개
        return 50000 + dice[0] * 5000
    elif dice[0] == dice[2] or dice[1] == dice[3]:
        # 같은 눈이 3개
        return 10000 + dice[1] * 1000
    elif dice[0] == dice[1] and dice[2] == dice[3]:
        # 2개씩 두 쌍
        return 2000 + dice[0] * 500 + dice[2] * 500
    elif dice[0] == dice[1] or dice[1] == dice[2] or dice[2] == dice[3]:
        # 같은 눈이 2개
        if dice[0] == dice[1]:
            return 1000 + dice[0] * 100
        elif dice[1] == dice[2]:
            return 1000 + dice[1] * 100
        else:
            return 1000 + dice[2] * 100
    else:
        # 모두 다른 눈
        return dice[3] * 100

# 입력 처리
N = int(input())
max_prize = 0

for _ in range(N):
    dice = list(map(int, input().split()))
    prize = calculate_prize(dice)
    if prize > max_prize:
        max_prize = prize

# 가장 큰 상금 출력
print(max_prize)
