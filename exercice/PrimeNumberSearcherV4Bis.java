package javacore.chapter05.object.exercice;

import java.util.*;

public class PrimeNumberSearcherV4Bis {

    public static void main(String[] args) {
        int n = 10000;
        List<Integer> nombresPremiers = new ArrayList<>();
        List<Integer> aSupprimer = new ArrayList<>();

        // Initialiser la liste avec des nombres de 2 à n
        for (int i = 2; i <= n; i++) {
            nombresPremiers.add(i);
        }

        // Parcourir les nombres de 2 à sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (nombresPremiers.contains(i)) {
                // Ajouter les multiples de i à la liste à supprimer
                for (int j = i * i; j <= n; j += i) {
                    aSupprimer.add(j);
                }
            }
        }

        // Supprimer les nombres à supprimer de la liste des nombres premiers
        nombresPremiers.removeAll(aSupprimer);

        // Afficher les nombres premiers
        System.out.println(nombresPremiers);
    }
}
