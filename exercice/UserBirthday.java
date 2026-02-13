package javacore.chapter02.condition.exercice;

public class UserBirthday {

    public static void main(String[] args) {

         /* Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */
         //Récupération de la date courante de la machine exécutant ce programme
        //java.time.LocalDate currentDate = java.time.LocalDate.now();
        //int currentDay = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        //int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        //int currentYear = currentDate.getYear(); // Année courante (202X)
        //System.out.println("Nous sommes le " + currentDay + "/" + currentMonth + "/" + currentYear);

         //* Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !*/


        // Écrivez votre code ci-dessous...

        // Déclaration des variables
        int birthDay = 3;
        int birthMonth = 1;
        int birthYear = 1982;

        int currentDay = 13;
        int currentMonth = 2;
        int currentYear = 2026;

        //Implémentation du programme
       /* if (currentYear - birthYear > 18) {
            System.out.println("L'utilisateur est majeur.");
        } else if (currentYear - birthYear == 18) {
            if (currentMonth > birthMonth) {
                System.out.println("L'utilisateur est majeur.");
            } else if (currentMonth == birthMonth) {
                if (currentDay >= birthDay) {
                    System.out.println("L'utilisateur est majeur.");
                } else {
                    System.out.println("L'utilisateur est mineur.");
                }
            } else {
                System.out.println("L'utilisateur est mineur.");
            }
        } else {
            System.out.println("L'utilisateur est mineur.");
        }*/

       // BONUS N°1 : Solution alternative
        int majorityYear = birthYear + 18;
        int majorityMonth = birthMonth;
        int majorityDay = birthDay;

        if (majorityMonth > 12) {
            majorityMonth -= 12;
            majorityYear++;
        }

        if (currentYear > majorityYear) {
            System.out.println("L'utilisateur est majeur.");
        } else if (currentYear == majorityYear) {
            if (currentMonth > majorityMonth) {
                System.out.println("L'utilisateur est majeur.");
            } else if (currentMonth == majorityMonth) {
                if (currentDay >= majorityDay) {
                    System.out.println("L'utilisateur est majeur.");
                } else {
                    System.out.println("L'utilisateur est mineur.");
                }
            } else {
                System.out.println("L'utilisateur est mineur.");
            }
        } else {
            System.out.println("L'utilisateur est mineur.");
        }

        //BONUS N°2 : Années bissextiles
        if ((birthYear % 4 == 0 && birthYear % 100 != 0) || birthYear % 400 == 0) {
            // Année bissextile, ajuster le jour de naissance si nécessaire
            if (birthMonth == 2 && birthDay == 29) {
                birthDay = 28;
            }
        }

        // BONUS 3 : Afficher le temps restant
        if (currentYear > majorityYear) {
            int yearsRemaining = majorityYear - currentYear;
            int monthsRemaining = majorityMonth - currentMonth;
            int daysRemaining = majorityDay - currentDay;

            // Ajuster les mois et jours restants si nécessaire
            if (daysRemaining < 0) {
                daysRemaining += 30; // Approximation, ne prend pas en compte les mois de 31 jours
                monthsRemaining--;
            }
            if (monthsRemaining < 0) {
                monthsRemaining += 12;
                yearsRemaining--;
            }

            System.out.println("L'utilisateur sera majeur dans " + yearsRemaining + " an(s), " + monthsRemaining + " mois et " + daysRemaining + " jour(s).");
        }


    }

}
