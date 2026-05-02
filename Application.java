package javacore.chapter06.workshop.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        // Création d'une instance de CalculatorService
        CalculatorService service = new CalculatorService();

        // Affichage du message de bienvenue
        System.out.println("=== CALCULATRICE JAVA ===");

        // Boucle principale
        while (true) {
            // Demande à l'utilisateur de choisir une opération
            String op = InputUtils.getString(
                    "Choisissez une opération (+, -, *, /) ou 'quit' : "
            );

            // Vérification si l'utilisateur veut quitter
            if (op.equalsIgnoreCase("quit")) {
                System.out.println("Fin du programme.");
                break;
            }

            try {
                // Demande à l'utilisateur de saisir les nombres
                double a = InputUtils.getNumber("Entrez le premier nombre : ");
                double b = InputUtils.getNumber("Entrez le deuxième nombre : ");

                // Exécution de l'opération
                double result = service.execute(a, b, op);

                // Affichage du résultat
                System.out.println("Résultat : " + result);
            } catch (Exception e) {
                // Affichage de l'erreur
                System.out.println("Erreur : " + e.getMessage());
            }

            // Saut de ligne
            System.out.println();
        }
    }

    public static class InputUtils {
        private static final Scanner scanner = new Scanner(System.in);

        public static double getNumber(String message) {
            // Boucle pour demander un nombre valide
            while (true) {
                System.out.print(message);
                try {
                    // Lecture de l'entrée utilisateur et conversion en double
                    String userInput = scanner.nextLine().replace(",", ".");
                    return Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    // Affichage d'un message d'erreur
                    System.out.println("Entrée invalide. Essayez encore.");
                }
            }
        }

        public static String getString(String message) {
            // Lecture de l'entrée utilisateur
            System.out.print(message);
            return scanner.nextLine();
        }
    }

    public static class CalculatorService {
        private final OperationFactory factory;

        public CalculatorService() {
            // Création d'une instance de OperationFactory
            this.factory = new OperationFactory();
        }

        public double execute(double a, double b, String op) {
            // Exécution de l'opération
            return factory.getOperation(op).calculate(a, b);
        }
    }

    public static class OperationFactory {
        private final Map<String, OperationStrategy> operations = new HashMap<>();

        public OperationFactory() {
            // Initialisation des opérations
            operations.put("+", new AddOperation());
            operations.put("-", new SubtractOperation());
            operations.put("*", new MultiplyOperation());
            operations.put("/", new DivideOperation());
        }

        public OperationStrategy getOperation(String symbol) {
            // Récupération de l'opération
            OperationStrategy op = operations.get(symbol);
            if (op == null) {
                // L'opération n'existe pas
                throw new IllegalArgumentException("Opération invalide : " + symbol);
            }
            return op;
        }
    }

    public interface OperationStrategy {
        double calculate(double a, double b);
    }

    public static class AddOperation implements OperationStrategy {
        @Override
        public double calculate(double a, double b) {
            // Addition
            return a + b;
        }
    }

    public static class SubtractOperation implements OperationStrategy {
        @Override
        public double calculate(double a, double b) {
            // Soustraction
            return a - b;
        }
    }

    public static class MultiplyOperation implements OperationStrategy {
        @Override
        public double calculate(double a, double b) {
            // Multiplication
            return a * b;
        }
    }

    public static class DivideOperation implements OperationStrategy {
        @Override
        public double calculate(double a, double b) {
            // Vérification de la division par zéro
            if (b == 0) {
                throw new ArithmeticException("Division par zéro impossible");
            }
            // Division
            return a / b;
        }
    }
}
