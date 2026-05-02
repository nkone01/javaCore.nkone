package javacore.chapter06.workshop;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class EmailValidator {

        public static void main(String[] args) {
            // Définir la REGEX
            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

            // Créer un Pattern
            Pattern pattern = Pattern.compile(regex);

            // Créer un Scanner pour lire l'entrée utilisateur
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur d'entrer une adresse email
            System.out.println("Entrez une adresse email :");
            String email = scanner.nextLine();

            // Créer un Matcher
            Matcher matcher = pattern.matcher(email);

            // Vérifier si l'adresse email est valide
            if (matcher.matches()) {
                System.out.println("L'adresse email est valide.");
            } else {
                System.out.println("L'adresse email n'est pas valide.");
            }
        }



}
