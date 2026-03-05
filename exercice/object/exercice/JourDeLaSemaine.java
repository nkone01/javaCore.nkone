package javacore.chapter05.object.exercice;

import java.util.Scanner;

public class JourDeLaSemaine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jour;
        do {
            System.out.println("Entrez le jour de la semaine actuel :");
            jour = scanner.nextLine().trim().toLowerCase();
        } while (!estJourValide(jour));
        System.out.println("Le jour de la semaine est : " + jour);
    }

    public static boolean estJourValide(String jour) {
        return jour.equals("lundi") ||
                jour.equals("mardi") ||
                jour.equals("mercredi") ||
                jour.equals("jeudi") ||
                jour.equals("vendredi") ||
                jour.equals("samedi") ||
                jour.equals("dimanche");
    }
}
