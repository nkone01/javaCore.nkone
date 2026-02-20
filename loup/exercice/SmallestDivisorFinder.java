package javacore.chapter03.loup.exercice;

public class SmallestDivisorFinder {

    public static void main(String[] args) {

        // des valeurs que vous testerez après l’écriture du programme pour vérifier son fonctionnement
        // 12, 15, 5, 7, 11, 13
        int number = 15;
        int divisor = 2;

        while (number % divisor != 0) {
            divisor++;
        }
        if (divisor == number) {
            System.out.println(number + " est un nombre premier.");
        } else {
            System.out.println("Le plus petit diviseur de " + number + " est " + divisor);
        }
    }
}
