package javacore.chapter05.object.practice;

public class PracticeStatic {

    public static void main(String[] args) {

        PracticeStaticCar car1 = new PracticeStaticCar("ferari", "F468", 26000);
        PracticeStaticCar car2 = new PracticeStaticCar("ford", "F469", 16000);

        System.out.println("le nombre de voitures crées : " +PracticeStaticCar.carCounter++);

        //PracticeStaticCalculator Calculator = new PracticeStaticCalculator();
       // System.out.println("la somme de a et b est :" + Calculator.sum( 5,  10));
        System.out.println("la somme de a et b est :" + PracticeStaticCalculator.sum(5, 10));
        System.out.println("la difference de a et b est :" + PracticeStaticCalculator.subtract(10, 5));

    }


}
