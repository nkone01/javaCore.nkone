package javacore.chapter03.loup.exercice;

public class CoinChangerV3 {

    public static void main(String[] args) {
        int amount = 93;
        int fiftyCount = 0;
        int twentyCount = 0;
        int tenCount = 0;
        int twoCount = 0;
        int oneCount = 0;

        while (amount >= 50) {
            amount -= 50;
            fiftyCount++;
        }
        while (amount >= 20) {
            amount -= 20;
            twentyCount++;
        }
        while (amount >= 10) {
            amount -= 10;
            tenCount++;
        }
        while (amount >= 2) {
            amount -= 2;
            twoCount++;
        }
        while (amount >= 1) {
            amount -= 1;
            oneCount++;
        }

        if (fiftyCount > 0) {
            System.out.println("50€ : " + fiftyCount);
        }
        if (twentyCount > 0) {
            System.out.println("20€ : " + twentyCount);
        }
        if (tenCount > 0) {
            System.out.println("10€ : " + tenCount);
        }
        if (twoCount > 0) {
            System.out.println("2€ : " + twoCount);
        }
        if (oneCount > 0) {
            System.out.println("1€ : " + oneCount);
        }
    }
}
