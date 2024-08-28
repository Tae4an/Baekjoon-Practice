def find_cycle_length(N, P):
    sequence = []
    remainder = N % P

    while remainder not in sequence:
        sequence.append(remainder)
        remainder = (remainder * N) % P

    cycle_start = sequence.index(remainder)
    
    cycle_length = len(sequence) - cycle_start
    return cycle_length

N, P = map(int, input().split())

print(find_cycle_length(N, P))
