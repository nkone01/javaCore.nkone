package javacore.chapter04.function.exercice;

public class RecursiveFunction {

    public static void main(String[] args) {

        int nombre = 1;
        int limit = 1000;
        afficherNombres(1, 1000);

    }
    public static void afficherNombres(int nombre, int limite) {
        if (nombre <= limite) {
            System.out.println(nombre);
            afficherNombres(nombre + 1, limite);
        }
    }


}
