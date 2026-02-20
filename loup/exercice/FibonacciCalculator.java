package javacore.chapter03.loup.exercice;

public class FibonacciCalculator {

    public static void main(String[] args) {
        int n = 1000;
        int a = 0;
        int b = 1;
        int countPair = 0;

        System.out.println("Les " + n + " premiers termes de la suite de Fibonacci sont :");
        System.out.println(a);
        if (a % 2 == 0) {
            countPair++;
        }
        System.out.println(b);
        if (b % 2 == 0) {
            countPair++;
        }

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            if (c % 2 == 0) {
                countPair++;
            }
            a = b;
            b = c;
        }

        System.out.println("Il y a " + countPair + " termes pairs parmi les " + n + " premiers termes.");
    }
}
