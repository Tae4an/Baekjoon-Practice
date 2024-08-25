from collections import Counter

def min_deletions_to_make_anagram(str1, str2):
    counter1 = Counter(str1)
    counter2 = Counter(str2)
    
    counter1.subtract(counter2)
    
    return sum(abs(count) for count in counter1.values())

str1 = input().strip()
str2 = input().strip()

print(min_deletions_to_make_anagram(str1, str2))
