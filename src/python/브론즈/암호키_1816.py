def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

def generate_primes(limit):
    sieve = [True] * (limit + 1)
    sieve[0] = sieve[1] = False
    for start in range(2, int(limit**0.5) + 1):
        if sieve[start]:
            for multiple in range(start*start, limit + 1, start):
                sieve[multiple] = False
    return [num for num, is_prime in enumerate(sieve) if is_prime]

def is_valid_key(S, primes):
    for prime in primes:
        if S % prime == 0:
            return False
    return True

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    numbers = list(map(int, data[1:N+1]))
    
    limit = 1000000
    primes = generate_primes(limit)
    
    results = []
    for number in numbers:
        if is_valid_key(number, primes):
            results.append("YES")
        else:
            results.append("NO")
    
    for result in results:
        print(result)

if __name__ == "__main__":
    main()
