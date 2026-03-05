package javacore.chapter05.object.practice;

public class ProjectObjectCar {

    String SerialNumber;
    String brand;
    String model;
    String color;
    double odometer;
    double price;

    public ProjectObjectCar(String SerialNumber, String brand, String model, String color, double odometer, double price) {
        this.SerialNumber = SerialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.price = price;

        this.displayInformations();

    }



    public double run(double distance) {
        System.out.println(" la voiture roule pendant " + distance + " kms");
        odometer += distance;
        return(distance);
    }
    public void displayInformations() {

        System.out.println("N Serie :" + SerialNumber + " | marque : " + brand + " | Modèle :" + model + " | couleur :" + color + "kilométrage :" + odometer );
    }

}
