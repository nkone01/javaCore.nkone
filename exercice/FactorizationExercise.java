package javacore.chapter04.function.exercice;

public class FactorizationExercise {

    public static void main(String[] args) {
        afficherTexte("Bonjour");
        afficherTexte("Comment allez-vous ?");
        afficherTableDeMultiplication(2);
        afficherTableDeMultiplication(5);
        afficherCarreEntre(1, 5);
        afficherCarreEntre(6, 10);
    }

    public static void afficherTexte(String texte) {
        System.out.println(texte);
    }

    public static void afficherTableDeMultiplication(int nombre) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }
    }

    public static void afficherCarreEntre(int debut, int fin) {
        for (int i = debut; i <= fin; i++) {
            System.out.println(i * i);
        }
    }
}
