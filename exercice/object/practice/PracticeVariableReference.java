package javacore.chapter05.object.practice;

public class PracticeVariableReference {

    public static void main(String[] args) {

        int age1 = 20;
        int age2 = age1;

        System.out.println("le premier age est : " + age1);
        System.out.println("le premier age est : " + age2);

        age2 = 45;
        System.out.println("la seconde valeur de age est : " + age1);
        System.out.println("la seconde valeur de age est : " + age2);

        afficherAge(45);
        System.out.println(age2);

        /**
         * variables de references
         */
        ProjectObjectCar car1 = new ProjectObjectCar("hvhnf", "ferrari", "f4564", "red", 0 , 25000);
        ProjectObjectCar car2 = car1; // Utilisez le même type de classe
        System.out.println("la premiere valeur de car est :" + car1);
        System.out.println("la premiere valeur de car est :" + car2);

        System.out.println("la premiere valeur de car est :" + car1.SerialNumber);
        System.out.println("la premiere valeur de car est :" + car2.SerialNumber);


    }
    public static void afficherAge(int age) {

            System.out.println("Age : " + age);

    }
}
