package javacore.chapter03.loup.exercice;

public class MultiplicationTables {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Table de " + i + " :");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
