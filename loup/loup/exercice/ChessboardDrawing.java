package javacore.chapter03.loup.exercice;

public class ChessboardDrawing {

    public static void main(String[] args) {
        int chessboardSize = 5;

        for (int i = 0; i < chessboardSize; i++) {
            for (int j = 0; j < chessboardSize; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
