package javacore.chapter03.loup.exercice;

public class HalfPyramid {

    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
