package javacore.chapter02.condition.exercice;

public class CoinChangerV2 {

    public static void main(String[] args) {
        int totalBill = 78;
        int amountPaid = 100;
        int change = amountPaid - totalBill;

        // Quantités de chaque coupure
        int billets50 = 5;
        int billets20 = 10;
        int billets10 = 10;
        int pieces2 = 50;
        int pieces1 = 100;

        int billets50ARendre = change / 50;
        if (billets50ARendre > billets50) {
            billets50ARendre = billets50;
        }
        change -= billets50ARendre * 50;

        int billets20ARendre = change / 20;
        if (billets20ARendre > billets20) {
            billets20ARendre = billets20;
        }
        change -= billets20ARendre * 20;

        int billets10ARendre = change / 10;
        if (billets10ARendre > billets10) {
            billets10ARendre = billets10;
        }
        change -= billets10ARendre * 10;

        int pieces2ARendre = change / 2;
        if (pieces2ARendre > pieces2) {
            pieces2ARendre = pieces2;
        }
        change -= pieces2ARendre * 2;

        int pieces1ARendre = change;
        if (pieces1ARendre > pieces1) {
            System.out.println("Pas assez de pièces de 1€ pour rendre la monnaie");
        } else {
            System.out.println("Billets de 50€ : " + billets50ARendre);
            System.out.println("Billets de 20€ : " + billets20ARendre);
            System.out.println("Billets de 10€ : " + billets10ARendre);
            System.out.println("Pièces de 2€ : " + pieces2ARendre);
            System.out.println("Pièces de 1€ : " + pieces1ARendre);
        }
    }
}
