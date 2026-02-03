package javacore.chapter01.variable.exercice;

public class VariablePermutation {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // Sans Permutation
        System.out.println("Sans permutation : a = " + a + ", b = " + b);

        // Avec Permutation
        int temp = a;
         a = b;
         b = temp;
        System.out.println("Avec Permutation : a = " + a + ", b = " + b);
    }

}
