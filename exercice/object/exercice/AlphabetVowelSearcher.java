package javacore.chapter05.object.exercice;

public class AlphabetVowelSearcher {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";

        //Recherche manuelle des voyelles
        for (int i = 0; i < vowels.length(); i++) {
            char vowel = vowels.charAt(i);
           // for (int j = 0; j < alphabet.length(); j++) {
               // if (alphabet.charAt(j) == vowel) {
                   // System.out.println("Voyelle trouvée : " + vowel);

                    //Afficher la position de la voyelle
                    //System.out.println("Voyelle trouvée : " + vowel + " à la position " + j);

            //Utiliser la méthode String.indexOf pour optimiser le code
            int index = alphabet.indexOf(vowel);
            if (index != -1) {
                System.out.println("Voyelle trouvée : " + vowel);
                System.out.println("Voyelle trouvée : " + vowel + " à la position " + index);
            }




        }
    }

}
