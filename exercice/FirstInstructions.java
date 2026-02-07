package javacore.chapter01.variable.exercice;

public class FirstInstructions {

    public static void main(String[] args) {

        int age = 44;

        System.out.println(age);
        System.out.println("J'ai " + age + " ans.");

        String displayAge = " J'ai 44 ans.";

        System.out.println(displayAge);

        String firstName = " Alexandre";

        System.out.println(firstName);

        String displayFirstName = "Je m'appelle " + firstName + ".";

        System.out.println(displayFirstName);

        System.out.println(displayFirstName + displayAge);

        System.out.println(firstName + " " + age );




    }
}
