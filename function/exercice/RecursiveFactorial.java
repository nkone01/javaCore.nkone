package javacore.chapter04.function.exercice;

public class RecursiveFactorial {

    public static void main(String[] args) {
        int number = 5; // Valeurs de tests : 0, 1, 2, 3, 4, 5
        int result = factorial(number);
        System.out.println("La factorielle de " + number + " est : " + result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
