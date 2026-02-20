package javacore.chapter03.loup.exercice;

public class FullPyramid {

    public static void main(String[] args) {
        int numberOfRows = 5;

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
