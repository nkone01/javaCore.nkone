package javacore.chapter03.loup.exercice;

public class PrimeNumberSearcherV2 {

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int iterations = 0;

        while (count < 50) {
            boolean isPrime = true;
            int divisor = 2;
            while (divisor * divisor <= number) {
                iterations++;
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }
            number++;
        }
        System.out.println("Il a fallu " + iterations + " itérations pour trouver les 50 premiers nombres premiers.");
    }
}
