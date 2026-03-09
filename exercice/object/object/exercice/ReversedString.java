package javacore.chapter05.object.exercice;

public class ReversedString {

    public static void main(String[] args) {
        String text = "! ecicrexe'l issuér zeva suov ,ovarB";

       // Analyse du problème

        //Pour afficher la chaîne de caractères text dans le sens inverse, nous devons :

        //1. Connaître la longueur de la chaîne de caractères text.
        //2. Itérer sur les indices de la chaîne de caractères text en partant de la fin.
        //3. Afficher le caractère à chaque indice.

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
