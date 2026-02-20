package javacore.chapter03.loup.exercice;

public class ForLoopExample {

    public static void main(String[] args) {
        // Affichez les nombres de 1 à 10
        System.out.println("Nombres de 1 à 10 :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Affichez une séquence en ordre décroissant
        System.out.println("Séquence en ordre décroissant :");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Affichez les nombres pairs
        System.out.println("Nombres pairs entre 1 et 20 :");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Affichez l'alphabet
        System.out.println("Alphabet :");
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();

        // Calculez une factorielle
        int number = 4;
        int result = 1;
        System.out.println("Factorielle de " + number + " :");
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("La factorielle de " + number + " est " + result);
    }
}
