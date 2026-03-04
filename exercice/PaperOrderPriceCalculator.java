package javacore.chapter05.object.exercice;

import java.util.Scanner;

public class PaperOrderPriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreFeuilles;
        int tentatives = 0;

        do {
            System.out.println("Entrez le nombre de feuilles (entre 200 et 200 000) :");
            nombreFeuilles = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le saut de ligne
            tentatives++;

            if (tentatives >= 5) {
                System.out.println("Nombre de tentatives dépassé. Au revoir !");
                return;
            }
        } while (nombreFeuilles < 200 || nombreFeuilles > 200000);

        double prixHT = calculerPrixHT(nombreFeuilles);
        double fraisLivraison = calculerFraisLivraison(prixHT);
        double prixTTC = calculerPrixTTC(prixHT);

        System.out.println("Prix HT : " + prixHT + "€");
        System.out.println("Frais de livraison : " + fraisLivraison + "€");
        System.out.println("Prix TTC : " + prixTTC + "€");
    }

    public static double calculerPrixHT(int nombreFeuilles) {
        double prixHT = 0;

        if (nombreFeuilles <= 10000) {
            prixHT = nombreFeuilles * 0.01;
        } else if (nombreFeuilles <= 30000) {
            prixHT = 10000 * 0.01 + (nombreFeuilles - 10000) * 0.005;
        } else {
            prixHT = 10000 * 0.01 + 20000 * 0.005 + (nombreFeuilles - 30000) * 0.0025;
        }

        return prixHT;
    }

    public static double calculerFraisLivraison(double prixHT) {
        if (prixHT > 200) {
            return 0;
        } else {
            return 9.99;
        }
    }
    public static double calculerPrixTTC(double prixHT) {
        return prixHT * 1.2;
    }
}
