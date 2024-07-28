def find_ranking(N, new_score, P, scores):
    if N == 0:
        return 1

    rank = 1
    for score in scores:
        if new_score > score:
            break
        elif new_score < score:
            rank += 1
    
    if N == P and new_score <= scores[-1]:
        return -1
    
    return rank

N, new_score, P = map(int, input().split())
if N > 0:
    scores = list(map(int, input().split()))
else:
    scores = []

print(find_ranking(N, new_score, P, scores))
