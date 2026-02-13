package javacore.chapter02.condition.exercice;

public class ConditionToTernary {

    public static void main(String[] args) {
        Integer age = 12;
        //Integer pourcentageReduction = 0;
        /*if(age < 18) {
            pourcentageReduction = 50;
        } else {
            pourcentageReduction = 10;
        }
        System.out.println("La réduction appliquée est de " + pourcentageReduction + "% car l'utilisateur est agé de " + age + " ans");

        /*Explication de l'opérateur ternaire
        L'opérateur ternaire est un opérateur qui prend trois opérandes :

        - Une condition (booléenne)
        - Une valeur si la condition est vraie
        - Une valeur si la condition est fausse

        La syntaxe est la suivante :

        condition ? valeurSiVraie : valeurSiFausse

        Application à l'exercice
Dans notre cas, la condition est age < 18, la valeur si vraie est 50 et la valeur si fausse est 10. On peut donc remplacer la condition if-else par l'opérateur ternaire suivant :

pourcentageReduction = age < 18 ? 50 : 10;

        */
       // Code final
            Integer pourcentageReduction = age < 18 ? 50 : 10;
            System.out.println("La réduction appliquée est de " + pourcentageReduction + "% car l'utilisateur est agé de " + age + " ans");
        }
    }



