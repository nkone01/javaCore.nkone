package javacore.chapter04.function.exercice;

public class RecursiveFibonacci {

    public static void main(String[] args) {

        fibonacci(0, 1, 0);

    }
    public static void fibonacci(int a, int b, int compteur) {
        if (compteur >= 50) {
            return;
        }
        System.out.println(a);
        fibonacci(b, a + b, compteur + 1);
    }
}
