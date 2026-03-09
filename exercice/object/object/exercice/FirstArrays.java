package javacore.chapter05.object.exercice;

public class FirstArrays {

    public static void main(String[] args) {
        int[] integerArray = new int[10];
        integerArray[0] = 1;

        for (int i = 1; i < integerArray.length; i++) {
            integerArray[i] = i + 1;
        }

        displayArray(integerArray);

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] *= 3;
        }

        displayArray(integerArray);

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                System.out.println("Valeur pair : " + integerArray[i]);
            }
        }

        for (int i = 1; i < integerArray.length; i++) {
            if (integerArray[i] % 3 == 0) {
                integerArray[i - 1] = 0;
            }
        }

        displayArray(integerArray);
    }

    public static void displayArray(int[] array) {
        System.out.print("Valeurs du tableau = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

