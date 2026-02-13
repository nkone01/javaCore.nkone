package javacore.chapter02.condition.exercice;

public class CoinChangerV1 {

    public static void main(String[] args) {
        // totalBill = 78, 100, 50, 20, 10
        int totalBill = 10;
        // amountPaid = 100, 200, 500
        int amountPaid = 100;

        int change = amountPaid - totalBill;

        int billets50 = change / 50;
        change -= billets50 * 50;

        int billets20 = change / 20;
        change -= billets20 * 20;

        int billets10 = change / 10;
        change -= billets10 * 10;

        int pieces2 = change / 2;
        change -= pieces2 * 2;

        int pieces1 = change;

        System.out.println("Billets de 50€ : " + billets50);
        System.out.println("Billets de 20€ : " + billets20);
        System.out.println("Billets de 10€ : " + billets10);
        System.out.println("Pièces de 2€ : " + pieces2);
        System.out.println("Pièces de 1€ : " + pieces1);
    }
}
