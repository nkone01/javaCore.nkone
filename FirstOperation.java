package javacore.chapter01.variable.exercice;

public class FirstOperation {

    public static void main(String[] args) {

        // N°1 : Opérations Arithmétiques de base;

        int a = 5;
        int b = 10;
        int sum = a + b;
        int subtraction = a - b;
        int division = a / b;
        int multiplication = a * b;

        System.out.println(" La somme de a et b est = "  + sum);
        System.out.println(" La difference de a et b est = "  + subtraction);
        System.out.println(" Le produit de a et b est = "  + multiplication);
        System.out.println(" Le quotient de a et b est = "  + division);

        // N°2 : Opérateurs Combinés avec Assignation;

        int c = 15;
        int d = 10;

        c += d; // c = c + d;
        System.out.println(" La valeur de c après addition est = "  + c);

        d -= 5; // d = d - 5;
        System.out.println(" La valeur de d après soustration est = "  + d);

        c *= 3; // c = c * 3;
        System.out.println(" La valeur de c après multiplication est = "  + c);

        d /= 3; // d = d / 3;
        System.out.println(" La valeur de d après division est = "  + d);

        // N°3 :Priorité des opérateurs;

        int e = 1 * 5 + 2;
        // la multiplication est prioritaire sur l'addition, donc e = (1 * 5) + 2 = 5 + 2 = 7;
        System.out.println(" La valeur de e = "  + e);

        int f = 1 * (5 + 2);
        // Les parenthèses ont la priorité la plus élevée, donc f = 1 * 7 = 7;
        System.out.println(" La valeur de f = "  + f);

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        // ordre de calcul:
        // 1.les parenthèses les plus internes : (4-2) = 2 et (2 * 5) = 10;
        // 2.la division : 2 / 2 = 1;
        // 3.la soustraction interne : 10 - 1 = 9;
        // 4.la soustraction finale : 9 - 1 = 8;
        System.out.println(" La valeur de g = "  + g);

        // N°4 : Nettoyage du code écrit;
        // pas de code à ecrire,
        // mais j'ai essayé de rendre mon code lisible et facilement exploitable;











    }
}
