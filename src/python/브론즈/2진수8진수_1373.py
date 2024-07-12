def binary_to_octal(binary_str):
    # 2진수 문자열을 정수로 변환
    decimal = int(binary_str, 2)
    # 정수를 8진수 문자열로 변환 (접두어 '0o' 제거를 위해 인덱스 2부터 사용)
    octal = oct(decimal)[2:]
    return octal

# 사용자로부터 2진수 입력 받기
user_input = input("")

# 8진수로 변환하여 출력
print(binary_to_octal(user_input))