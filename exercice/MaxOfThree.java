package javacore.chapter02.condition.exercice;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a == b && b == c) {
            System.err.println("Toutes les valeurs sont égales, il n'y en pas une plus grande que les autres.");
        } else if (a == b && a > c) {
            System.err.println("Les valeurs de a et b sont égales.");
        } else if (a == c && a > b) {
            System.err.println("Les valeurs de a et c sont égales.");
        } else if (b == c && b > a) {
            System.err.println("Les valeurs de b et c sont égales.");
        } else {
            if (a >= b && a >= c) {
                System.out.println("La valeur la plus grande est a : " + a);
            } else if (b >= a && b >= c) {
                System.out.println("La valeur la plus grande est b : " + b);
            } else {
                System.out.println("La valeur la plus grande est c : " + c);
            }
        }
    }
}
