package javacore.chapter05.object.exercice;

import java.util.Scanner;

public class UserQuestionnaire {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est votre prénom ?");
        String prenom = sc.nextLine();

        System.out.println("Quel est votre âge ?");
        int age = sc.nextInt();
        sc.nextLine(); // Pour consommer le saut de ligne

        System.out.println("Voulez-vous continuer ? (oui/non)");
        String reponse = sc.nextLine();
        boolean continuer = reponse.equalsIgnoreCase("oui");

        if (!continuer) {
            Questionnaire questionnaire = new Questionnaire(prenom, age, 0, " ", " ");
            questionnaire.afficherReponses();
            return;
        }

        System.out.println("Quel est le résultat de 5 / 2 ?");
        double resultat = sc.nextDouble();
        sc.nextLine(); // Pour consommer le saut de ligne

        System.out.println("Quelle est votre couleur préférée ?");
        String couleur = sc.nextLine();

        System.out.println("Quel est votre animal préféré ?");
        String animal = sc.nextLine();

        Questionnaire questionnaire = new Questionnaire(prenom, age, resultat, couleur, animal);
        questionnaire.afficherReponses();
    }

}
