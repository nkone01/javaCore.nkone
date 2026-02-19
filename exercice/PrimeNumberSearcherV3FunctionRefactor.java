package javacore.chapter04.function.exercice;

public class PrimeNumberSearcherV3FunctionRefactor {

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 50) {
            if (estPremier(number)) {
                afficherNombre(number);
                count++;
            }
            number++;
        }
    }

    public static boolean estPremier(int nombre) {
        int divisor = 2;
        while (divisor * divisor <= nombre) {
            if (nombre % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static void afficherNombre(int nombre) {
        System.out.println(nombre);
    }
}
