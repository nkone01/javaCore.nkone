def est_premier(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def main():
    limite = 100
    premiers = [n for n in range(2, limite + 1) if est_premier(n)]
    print(premiers)

if __name__ == "__main__":
    main()