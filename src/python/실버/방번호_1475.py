def min_number_sets(room_number):
    # 방 번호의 각 숫자의 빈도를 저장할 리스트 초기화
    digit_count = [0] * 10
    
    # 방 번호의 각 숫자 빈도를 센다
    for digit in room_number:
        digit_count[int(digit)] += 1

    # 6과 9는 서로 교환 가능하므로, 합쳐서 필요한 개수를 계산한다
    six_nine_count = digit_count[6] + digit_count[9]
    digit_count[6] = digit_count[9] = (six_nine_count + 1) // 2

    # 필요한 세트의 최소 개수는 각 숫자 빈도 중 최대값
    return max(digit_count)

room_number = input().strip()

print(min_number_sets(room_number))
