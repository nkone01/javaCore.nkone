package javacore.chapter05.object.exercice;

import java.util.Arrays;

public class CommonStaticTools {

    public static void main(String[] args) {

        // Bac-à-sable pour tester les instructions

        // Recherche de méthodes statiques utiles en Java:
        //- Recherche sur ChatGPT :
        //- La classe Arrays propose des méthodes statiques pour manipuler des tableaux, telles que sort(), binarySearch(), equals(), etc.
        //- La classe Math propose des méthodes statiques pour effectuer des opérations mathématiques, telles que sqrt(), pow(), sin(), etc.
        //- La classe String propose des méthodes statiques pour manipuler des chaînes de caractères, telles que valueOf(), format(), etc.

        //Simplification du code de l'exercice [⭐⭐⭐⭐⭐] Tri d'un tableau dans l'ordre croissant (Bubble Sorting) à l'aide de la methode Arrays.sort()
        int[] tableau = {5, 2, 8, 1, 9};
        Arrays.sort(tableau);
        System.out.println(Arrays.toString(tableau)); // [1, 2, 5, 8, 9]

        //Simplification du code de l'exercice [⭐⭐⭐] Analyseur de notes à l'école avec la methode Arrays.stream().average()
        double[] notes = {12, 15, 8, 18, 10};
        double moyenne = Arrays.stream(notes).average().getAsDouble();
        System.out.println("Moyenne : " + moyenne);

        //Calcul de valeurs comme des racines carrées et des puissances à l'aide de la classe Math
        double x = 16;
        double racineCarree = Math.sqrt(x);
        double puissance = Math.pow(x, 2);
        System.out.println("Racine carrée de " + x + " : " + racineCarree);
        System.out.println(x + " au carré : " + puissance);

        //Quelle morale faut-il retenir des résultats de ma recherches ?
        //- La morale est qu'il est important de connaître les méthodes statiques proposées par les classes Java pour simplifier le code et éviter de réinventer la roue.
        //- Il est également important de savoir chercher des réponses à ses questions et de sélectionner les méthodes les plus pertinentes pour un problème donné.
    }
}
