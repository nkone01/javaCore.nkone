package javacore.chapter03.loup.exercice;

public class AlphabetPrinter {

    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }

        while (letter <= 'z') {
            if (letter >= 'a') {
                System.out.print(letter + " ");
            }
            letter++;
        }
    }
}
