package javacore.chapter05.object.exercice;

public class PrimeNumberSearcherV4 {

    public static void main(String[] args) {
        int n = 10000;
        boolean[] nombresPremiers = new boolean[n + 1];

        // Initialiser tous les éléments à true
        for (int i = 2; i <= n; i++) {
            nombresPremiers[i] = true;
        }

        // Parcourir les nombres de 2 à sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (nombresPremiers[i]) {
                // Marquer les multiples de i comme non premiers
                for (int j = i * i; j <= n; j += i) {
                    nombresPremiers[j] = false;
                }
            }
        }

        // Afficher les nombres premiers
        for (int i = 2; i <= n; i++) {
            if (nombresPremiers[i]) {
                System.out.println(i);
            }
        }
    }
}
