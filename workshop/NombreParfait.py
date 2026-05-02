def est_parfait(n):
    if n <= 1:
        return False
    somme = sum(i for i in range(1, n) if n % i == 0)
    return somme == n

def main():
    parfaits = [n for n in range(1, 10_001) if est_parfait(n)]
    print(parfaits)

if __name__ == "__main__":
    main()
