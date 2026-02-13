package javacore.chapter02.condition.exercice;

public class SmartHomeSecurity {

    public static void main(String[] args) {
        // Déclaration des variables
        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = false;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = true;

        // Calcul de la variable isSafeModeActivated
        boolean isSafeModeActivated = (isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        // Affichage du message
        if (isSafeModeActivated) {
            System.out.println("La maison est en mode sécurisé.");
        } else {
            System.out.println("La maison n'est pas en mode sécurisé.");
        }

        // Test du programme avec différentes valeurs
        // Nous pouvons modifier les valeurs des variables ci-dessus pour tester différents scénarios
    }
}
