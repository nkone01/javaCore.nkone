package javacore.chapter02.condition.exercice;

public class AgeCategorization {

    public static void main(String[] args) {
        // age = 5, 12, 20, 30, 64, 65, 70
        int age = 65;

        if (age < 10) {
            System.out.println("Enfant");
        } else if (age < 18) {
            System.out.println("Adolescent");
        } else if (age < 25) {
            System.out.println("Jeune adulte");
        } else if (age < 65) {
            System.out.println("Adulte");
        } else {
            System.out.println("Senior");
        }
    }
}
