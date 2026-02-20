package javacore.chapter03.loup.exercice;

public class BoucleWhile {

    public static void main(String[] args) {

        // Affichez les nombres de 1 à 10
        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        //
        // Affichez une séquence en ordre décroissant
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        //BONUS : Affichez les nombres pairs entre 1 et 20
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }
}
