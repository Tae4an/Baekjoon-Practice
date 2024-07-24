def convert_octopus_to_decimal(octopus_number):
    # 기호와 숫자의 매핑
    symbol_to_digit = {
        '-': 0, '\\': 1, '(': 2, '@': 3, '?': 4, '>': 5, '&': 6, '%': 7, '/': -1
    }
    
    # 변환된 숫자를 저장할 리스트
    digits = [symbol_to_digit[symbol] for symbol in octopus_number]
    
    # 8진수로 변환
    decimal_value = 0
    base = 1  # 8의 제곱수
    
    for digit in reversed(digits):
        decimal_value += digit * base
        base *= 8
    
    return decimal_value

while True:
    octopus_number = input().strip()
    if octopus_number == '#':
        break
    print(convert_octopus_to_decimal(octopus_number))
