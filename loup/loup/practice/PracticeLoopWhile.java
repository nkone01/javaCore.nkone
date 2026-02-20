package javacore.chapter03.loup.practice;

import java.sql.SQLOutput;

public class PracticeLoopWhile {

    public static void main(String[] args) {
        int result = 0;

        int currentNumber = 1;
        int maxNumber = 100;
        int testVariable = 1;

        testVariable++;
        System.out.println(testVariable);

        while ( currentNumber <= maxNumber) {
            System.out.println("result = " + result +" + " + currentNumber);
            result += currentNumber;
            System.out.println("------" + result);

            currentNumber++;
        }
        System.out.println("la somme de 1 à 100 : " + result);

    }
}
