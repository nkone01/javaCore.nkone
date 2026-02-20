package javacore.chapter03.loup.exercice;

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 21;
        long result = 1;
        if (number < 0) {
            System.out.println("Erreur : la factorielle n'est définie que pour les entiers non négatifs.");
        } else if (number == 0) {
            System.out.println("La factorielle de 0 est 1");
        } else {
            int i = 1;
            while (i <= number) {
                result *= i;
                i++;
            }
            System.out.println("La factorielle de " + number + " est " + result);
        }
        // Les résultats des factorielles de 7, 9, 11, 20 et 21 sont :
        //
        //- 7 : 5040
        //- 9 : 362880
        //- 11 : 39916800
        //- 20 : 2432902008176640000
        //- 21 : -4249290049419214848 (erreur de dépassement de capacité)
        // La factorielle de 21 est incorrecte
        // en raison d'un dépassement de capacité de la variable result de type long.
        // La factorielle 20 est déjà très grande,
        // et la factorielle 21 est encore plus grande,
        // ce qui provoque un dépassement de capacité.
    }
}
