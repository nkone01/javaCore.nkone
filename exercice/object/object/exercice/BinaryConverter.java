package javacore.chapter05.object.exercice;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une valeur binaire : ");
        String binaryText = scanner.next();

        // Vérification de la validité de la chaîne de caractères binaire
        if (!binaryText.matches("[01]+")) {
            System.out.println("Erreur : la valeur entrée n'est pas une chaîne de caractères binaire.");
            return;
        }

        // Conversion de la chaîne de caractères binaire en valeur décimale
        long decimalValue = 0;
        for (int i = 0; i < binaryText.length(); i++) {
            char bit = binaryText.charAt(binaryText.length() - 1 - i);
            int bitValue = Integer.parseInt(String.valueOf(bit));
            decimalValue += bitValue * (long) Math.pow(2, i);
        }

        System.out.println("Valeur décimale : " + decimalValue);
    }
}
