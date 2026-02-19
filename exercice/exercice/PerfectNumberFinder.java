package javacore.chapter03.loup.exercice;

public class PerfectNumberFinder {

    public static void main(String[] args) {
        int start = 1;
        int end = 100000;

        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i + " est un nombre parfait");
            }
        }
    }
}
