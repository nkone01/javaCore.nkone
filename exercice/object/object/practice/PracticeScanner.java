package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("entrer une valeur : ");
        //String userValue = scanner.nextLine();
        //int userValue = scanner.nextInt();
        float userValue = scanner.nextFloat();
        System.out.println(userValue);
    }
}
