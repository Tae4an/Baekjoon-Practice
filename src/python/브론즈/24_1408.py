def time_to_seconds(time):
    h, m, s = map(int, time.split(':'))
    return h * 3600 + m * 60 + s

def seconds_to_time(seconds):
    hours = (seconds // 3600) % 24
    minutes = (seconds % 3600) // 60
    seconds = seconds % 60
    return f"{hours:02}:{minutes:02}:{seconds:02}"

def calculate_remaining_time(current_time, start_time):
    current_seconds = time_to_seconds(current_time)
    start_seconds = time_to_seconds(start_time)
    total_seconds_in_day = 24 * 3600
    
    # 임무를 수행하는데 남은 시간 계산
    if start_seconds > current_seconds:
        remaining_seconds = start_seconds - current_seconds
    else:
        remaining_seconds = total_seconds_in_day - (current_seconds - start_seconds)
    
    return seconds_to_time(remaining_seconds)

# 입력 예제
current_time = input()
start_time = input()

# 출력
print(calculate_remaining_time(current_time, start_time))