package javacore.chapter04.function.exercice;

public class CoinChangerV4 {

    public static void main(String[] args) {
        int amount = 93;
        distribute50(amount);
    }

    public static void distribute50(int amount) {
        int count = amount / 50;
        if (count > 0) {
            System.out.println("Pièce de 50€ : " + count);
        }
        distribute20(amount - count * 50);
    }

    public static void distribute20(int amount) {
        int count = amount / 20;
        if (count > 0) {
            System.out.println("Pièce de 20€ : " + count);
        }
        distribute10(amount - count * 20);
    }

    public static void distribute10(int amount) {
        int count = amount / 10;
        if (count > 0) {
            System.out.println("Pièce de 10€ : " + count);
        }
        distribute5(amount - count * 10);
    }

    public static void distribute5(int amount) {
        int count = amount / 5;
        if (count > 0) {
            System.out.println("Pièce de 5€ : " + count);
        }
        distribute2(amount - count * 5);
    }

    public static void distribute2(int amount) {
        int count = amount / 2;
        if (count > 0) {
            System.out.println("Pièce de 2€ : " + count);
        }
        distribute1(amount - count * 2);
    }

    public static void distribute1(int amount) {
        int count = amount / 1;
        if (count > 0) {
            System.out.println("Pièce de 1€ : " + count);
        }
    }
}
