package javacore.chapter02.condition.exercice;

public class AgeBasedDiscount {

    public static void main(String[] args) {

        // age = 10, 20, 25, 30, 64, 65, 70
        int age = 64;

        // price = 20, 50, 100
        double price = 50.0;

        double finalPrice = price;
        if (age <= 25) {
            finalPrice = price * 0.75; // réduction de 25%
            System.out.println("Forfait Jeune : " + finalPrice + "€");
        } else if (age >= 65) {
            finalPrice = price * 0.25; // réduction de 75%
            System.out.println("Forfait Senior : " + finalPrice + "€");
        } else {
            System.out.println("Forfait Basique : " + finalPrice + "€");
        }
    }
}