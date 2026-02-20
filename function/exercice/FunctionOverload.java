package javacore.chapter04.function.exercice;

public class FunctionOverload {

    public static void main(String[] args) {
        System.out.println("La somme de 2 et 3 est : " + sum(2, 3));
        System.out.println("La somme de 2, 3 et 4 est : " + sum(2, 3, 4));
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
    // deuxieme fonction exprimant la surcharge

    public static int sum(int number1, int number2, int number3) {
        return sum(number1, number2) + number3;
    }
}
