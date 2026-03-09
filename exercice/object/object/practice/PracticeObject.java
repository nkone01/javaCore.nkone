package javacore.chapter05.object.practice;


public class PracticeObject {

    public static void main(String[] args) {

        ProjectObjectCar car1 = new ProjectObjectCar("dhff5ff4ff7f", "ferrari" , "F448" , "rouge" ,0 , 28000);

        car1.run(1999);
        car1.displayInformations();


    }
    public static double run(double distance) {
        System.out.println(" la voiture roule pendant " + distance + " kms");
        return distance;
    }
}
