from collections import Counter

def make_palindrome(name):
    # Step 1: Count the occurrences of each character
    counter = Counter(name)
    
    # Step 2: Check the number of characters with odd counts
    odd_count = 0
    odd_char = ''
    half_palindrome = []
    
    for char, count in sorted(counter.items()):
        if count % 2 == 1:
            odd_count += 1
            odd_char = char
        
        half_palindrome.append(char * (count // 2))
    
    # Step 3: Determine if a palindrome is possible
    if odd_count > 1:
        return "I'm Sorry Hansoo"
    
    # Step 4: Form the palindrome
    left_side = ''.join(half_palindrome)
    if odd_char:
        return left_side + odd_char + left_side[::-1]
    else:
        return left_side + left_side[::-1]

name = input().strip()

print(make_palindrome(name))
