package javacore.chapter04.function.exercice;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 50) {
            if (isPrimeNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrimeNumber(int number) {
        int divisor = 2;
        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}
