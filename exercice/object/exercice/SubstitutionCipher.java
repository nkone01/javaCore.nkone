package javacore.chapter05.object.exercice;

import java.util.Scanner;

public class SubstitutionCipher {
     String alphabet;
     String substitutionAlphabet;

    public SubstitutionCipher(String alphabet, String substitutionAlphabet) {
        if (!isValidAlphabet(alphabet) || !isValidSubstitutionAlphabet(substitutionAlphabet)) {
            throw new IllegalArgumentException("Alphabet ou alphabet de substitution invalide");
        }
        this.alphabet = alphabet;
        this.substitutionAlphabet = substitutionAlphabet;
    }

     boolean isValidAlphabet(String alphabet) {
        return alphabet.length() == 26 && alphabet.equals(alphabet.toLowerCase());
    }

     boolean isValidSubstitutionAlphabet(String substitutionAlphabet) {
        if (substitutionAlphabet.length() != 26) {
            return false;
        }
        for (int i = 0; i < substitutionAlphabet.length(); i++) {
            char c = substitutionAlphabet.charAt(i);
            if (!Character.isLowerCase(c)) {
                return false;
            }
            if (substitutionAlphabet.indexOf(c, i + 1) != -1) {
                return false;
            }
        }
        return true;
    }

    public String cipher(String textToEncrypt, int iterations) {
        String encryptedText = textToEncrypt;
        for (int i = 0; i < iterations; i++) {
            encryptedText = cipher(encryptedText);
        }
        return encryptedText;
    }

    public String decipher(String textToDecrypt, int iterations) {
        String decryptedText = textToDecrypt;
        for (int i = 0; i < iterations; i++) {
            decryptedText = decipher(decryptedText);
        }
        return decryptedText;
    }

     String cipher(String textToEncrypt) {
        String encryptedText = textToEncrypt.toLowerCase();
        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            char s = substitutionAlphabet.charAt(i);
            encryptedText = encryptedText.replaceAll(String.valueOf(c), String.valueOf(s));
        }
        return encryptedText;
    }

     String decipher(String textToDecrypt) {
        String decryptedText = textToDecrypt.toLowerCase();
        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            char s = substitutionAlphabet.charAt(i);
            decryptedText = decryptedText.replaceAll(String.valueOf(s), String.valueOf(c));
        }
        return decryptedText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Veuillez entrer votre alphabet de substitution (26 caractères, lettres en minuscules, sans doublons) :");
        String substitutionAlphabet = scanner.nextLine();
        SubstitutionCipher cipher = new SubstitutionCipher(latinAlphabet, substitutionAlphabet);
        System.out.println("Veuillez choisir une action :");
        System.out.println("1. Chiffrer un message");
        System.out.println("2. Déchiffrer un message");
        int action = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le saut de ligne
        System.out.println("Veuillez entrer votre message :");
        String message = scanner.nextLine();
        int iterations = 1;
        System.out.println("Veuillez entrer le nombre d'itérations (par défaut 1) :");
        String input = scanner.nextLine();
        if (!input.isEmpty()) {
            iterations = Integer.parseInt(input);
        }
        String result;
        if (action == 1) {
            result = cipher.cipher(message, iterations);
            System.out.println("Message chiffré " + iterations + " fois : " + result);
        } else if (action == 2) {
            result = cipher.decipher(message, iterations);
            System.out.println("Message déchiffré " + iterations + " fois : " + result);
        } else {
            System.out.println("Action invalide !");
        }
    }
}
