package javacore.chapter02.condition.exercice;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {
        // Déclaration des variables
        int valeur1 = 20;
        int valeur2 = 30;
        int somme = valeur1 + valeur2; // Calcul de la somme

        // Vérification si la somme est supérieure à 30
        if (somme > 30) {
            System.out.println("Somme élevée");
        } else {
            System.out.println("Somme faible");
        }

        // Affichage d'un message de fin
        System.out.println("Résultat du calcul");

        // Boucle pour afficher "Boucle" 5 fois
        for (int i = 0; i < 5; i++) {
            System.out.println("Itération " + (i + 1));
        }
    }
}
