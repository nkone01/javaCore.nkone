package javacore.chapter05.object.exercice;

public class LoopAndArrayOptimization {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[i] * 2;
        }
        for (int j = 0; j < numbers.length; j += 1) {
            results[j] += 3;
        }
        for (int k = 0; k < results.length; k = k + 1) {
            System.out.println(results[k]);
        }

        //Analyse du code

        //Le code initial fait les opérations suivantes :

        //1. Il crée un tableau numbers contenant les entiers de 1 à 5.
        //2. Il crée un tableau results de même taille que numbers.
        //3. Il multiplie chaque élément de numbers par 2 et stocke le résultat dans results.
        //4. Il ajoute 3 à chaque élément de results.
        //5. Il affiche chaque élément de results.

        //la version optimisée a permis de :

        //1. Fusionné les deux premières boucles for en une seule.
        //2. Supprimé la deuxième boucle for en ajoutant 3 directement dans la première boucle.
        //3. Supprimé la troisième boucle for en affichant les résultats directement dans la première boucle.


        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[i] * 2 + 3;
            System.out.println(results[i]);
        }
    }
}
