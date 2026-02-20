package javacore.chapter04.function.exercice;

public class FactorizationExampleFunctionRefactor {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            afficherNombre(i);
        }
    }

    public static void afficherNombre(int nombre) {
        System.out.println(nombre);
    }
}
