package javacore.chapter01.variable.exercice;

public class PrimitiveOverflow {

    public static void main(String[] args) {

        // Étape 1 : Déclaration de variables et calcul du nombre de secondes dans une heure
        short hourSeconds = 60 * 60; // une heure = 60 minutes * 60 secondes
        System.out.println("Nombre de secondes dans une heure : " + hourSeconds);

        // Étape 2 : Calcul des secondes dans une journée
        int daySeconds = 24 * hourSeconds;// probleme de depassement
        System.out.println("Nombre de secondes dans une journée : " + daySeconds);

        // Étape 3 : Calcul des secondes dans une semaine
        int weekSeconds = 7 * daySeconds;
        System.out.println("Nombre de secondes dans une semaine : " + weekSeconds);

        // Étape 4 : Calcul des secondes dans un mois
       // int monthSeconds = 4 * weekSeconds; // en utilisant les semaines
       // System.out.println("Nombre de secondes dans un mois : " + monthSeconds);
       int monthSeconds = 30 * daySeconds; // en utilisant les mois
       System.out.println("Nombre de secondes dans un mois : " + monthSeconds);

        // Étape 5 : Calcul des secondes dans une année
        long yearSeconds = 365L * daySeconds; // par prudence pour éviter le depassement
        System.out.println("Nombre de secondes dans une année : " + yearSeconds);



    }
}
