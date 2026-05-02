def main():
    limite = 100
    for nombre in range(2, limite + 1):
        estPremier = True
        for diviseur in range(2, nombre):
            if nombre % diviseur == 0:
                estPremier = False
                break
        if estPremier:
            print(f"{nombre} est premier")

if __name__ == "__main__":
    main()