package javacore.chapter02.condition.exercice;

public class ConditionError {

    public static void main(String[] args) {
       // Étape 1 : Analyse du code
        //-Le code utilise des conditions if et else if pour afficher un message en fonction de l'âge de la personne.
        //-Les conditions sont les suivantes :
        //- age <= 16 : Vous êtes mineur.
        //- age == 17 : Vous êtes bientôt majeur !
        //- age == 18 : Vous êtes majeur.
        //- age > 18 : Vous êtes un adulte.
        //- age > 60 && age < 100 : Vous n'êtes plus tout jeune.

        //Étape 2 : Trouver l'erreur
        //- L'erreur se trouve dans l'ordre des conditions.
        // La condition age > 18 est évaluée avant la condition age > 60 && age < 100.
        // Cela signifie que pour les personnes âgées de plus de 60 ans,
        // le message "Vous êtes un adulte." sera affiché au lieu de "Vous n'êtes plus tout jeune."
        //- La condition age > 60 && age < 100 devrait être évaluée avant la condition age > 18.

        // Étape 3 : Corriger l'erreur
        //- Pour corriger l'erreur, nous devons réorganiser les conditions;
        // pour que la condition age > 60 && age < 100 soit évaluée avant la condition age > 18.

        int age = 80;
        if(age <= 16) {
            System.out.println("Vous êtes mineur.");
        } else if(age <= 17) {
            System.out.println("Vous êtes bientôt majeur !");
        } else if(age <= 18) {
            System.out.println("Vous êtes majeur.");
        } else if(age <= 60) {
            System.out.println("Vous êtes un adulte.");
        } else if(age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        } else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }
    }
}
