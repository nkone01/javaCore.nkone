package javacore.chapter03.loup.practice;

public class PracticeLoopFor {

    public static void main(String[] args) {
        int result = 0;

        int currentNumber = 1;
        int maxNumber = 100;

        while ( currentNumber <= maxNumber) {
            System.out.println("result = " + result +" + " + currentNumber);
            result += currentNumber;
            System.out.println("------" + result);

            currentNumber++;
        }
        System.out.println("la somme de 1 à 100 : " + result);

        int resultFor = 0;

       for (int cNumber = 1; cNumber <= maxNumber; cNumber++) {
        System.out.println("result = " + resultFor +" + " + cNumber);
           resultFor += cNumber;
            System.out.println("------" + resultFor);


        }
        System.out.println("la somme de 1 à 100 : " + resultFor);

        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) {

                int resultForIf = 0;
                for (int b = 1; b <= 100; b++) {
                    resultForIf++;

                }
                System.out.println("la somme de 1 à 100 : " + resultForIf);
            }
        }

    }
}

