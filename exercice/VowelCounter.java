package javacore.chapter05.object.exercice;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        //String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        //Demander le texte à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un texte :");
        String text = scanner.nextLine();
        String vowels = "aeiouy";

        //Compter les voyelles
        for (int i = 0; i < vowels.length(); i++) {
            char vowel = vowels.charAt(i);
            int count = 0;
           // for (int j = 0; j < text.length(); j++) {
             //   if (text.charAt(j) == vowel) {
            //        count++;
              //  }
            //}
            int index = text.indexOf(vowel); //cette methode permet de faciliter la recherche en commencant sur un indice spécifique
            // contrairement à la premiere recherche qui recommence dès le debut
            while (index != -1) {
                count++;
                index = text.indexOf(vowel, index + 1);
            }
            System.out.println("La voyelle '" + vowel + "' apparait " + count + " fois.");
        }
    }
}
