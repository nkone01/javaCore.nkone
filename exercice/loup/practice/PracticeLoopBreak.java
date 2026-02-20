package javacore.chapter03.loup.practice;

public class PracticeLoopBreak {

    public static void main(String[] args) {

        int count = 0;
        int i = 2;
        while (count < 50) {
            boolean isPrime = true;
            int j = 2;
            while (j * j <= i && isPrime) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("Il y a " + count + " nombres premiers.");


    }
}
