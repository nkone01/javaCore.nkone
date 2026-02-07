package javacore.chapter01.variable.exercice;

public class SalaryForecast {

    public static void main(String[] args) {
        // Déclaration et initialisation des variables
        double tauxHoraireBrut = 25.0;
        double heuresTravailleesParJour = 7.7;
        double heuresTravailleesParSemaine = 38.5;
        int semainesParMois = 4;
        double tauxCotisationCadre = 0.25;
        double tauxImpôt = 0.105;
        // Calcul des salaires
        double salaireBrutJournalier = tauxHoraireBrut * heuresTravailleesParJour;
        double salaireBrutHebdomadaire = tauxHoraireBrut * heuresTravailleesParSemaine;
        double salaireBrutMensuel = salaireBrutHebdomadaire * semainesParMois;
        double salaireBrutAnnuel = salaireBrutMensuel * 12;

        double salaireNetImposableMensuel = salaireBrutMensuel * (1 - tauxCotisationCadre);
        double salaireNetImposableAnnuel = salaireNetImposableMensuel * 12;

        double salaireNetMensuel = salaireNetImposableMensuel * (1 - tauxImpôt);
        double salaireNetAnnuel = salaireNetImposableAnnuel * (1 - tauxImpôt);

        //Affichage des résultats
        System.out.println("Salaire brut journalier : " + salaireBrutJournalier + " €");
        System.out.println("Salaire brut hebdomadaire : " + salaireBrutHebdomadaire + " €");
        System.out.println("Salaire brut mensuel : " + salaireBrutMensuel + " €");
        System.out.println("Salaire brut annuel : " + salaireBrutAnnuel + " €");
        System.out.println("Salaire net imposable mensuel : " + salaireNetImposableMensuel + " €");
        System.out.println("Salaire net imposable annuel : " + salaireNetImposableAnnuel + " €");
        System.out.println("Salaire net mensuel : " + salaireNetMensuel + " €");
        System.out.println("Salaire net annuel : " + salaireNetAnnuel + " €");


    }
}
