package javacore.chapter05.object.exercice;

import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {

    public static void main(String[] args) {
        Random random = new Random();
        int mysteryNumber = random.nextInt(101); // 101 pour inclure 100

        Scanner scanner = new Scanner(System.in);
        int attempts = 7;

        while (attempts > 0) {
            System.out.println("Tentatives restantes : " + attempts);
            System.out.println("Entrez un nombre entre 0 et 100 : ");
            int userNumber = scanner.nextInt();

            if (userNumber < 0 || userNumber > 100) {
                System.out.println("Nombre invalide !");
                continue;
            }

            if (userNumber < mysteryNumber) {
                System.out.println("C'est plus grand !");
            } else if (userNumber > mysteryNumber) {
                System.out.println("C'est plus petit !");
            } else {
                System.out.println("Félicitations ! Vous avez trouvé le nombre mystère !");
                return;
            }

            attempts--;
        }

        System.out.println("Dommage ! Le nombre mystère était " + mysteryNumber);
    }
}
