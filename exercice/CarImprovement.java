package javacore.chapter05.object.exercice;

public class CarImprovement {

    String SerialNumber;
    String brand;
    String model;
    String color;
    int year;
    double odometer;
    double price;
    boolean isEngineStarted = false;

    public CarImprovement(String SerialNumber, String brand, String model, String color, int year, double odometer, double price) {
        this.SerialNumber = SerialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
        this.isEngineStarted = false;
    }
    // Identifions et implémentons les méthodes qui modifient l'attribut isEngineStarted

    public void demarrerMoteur() {
        if (!isEngineStarted) {
            isEngineStarted = true;
            System.out.println("Le moteur est démarré.");
        } else {
            System.out.println("Le moteur est déjà démarré.");
        }
    }

    public void arreterMoteur() {
        if (isEngineStarted) {
            isEngineStarted = false;
            System.out.println("Le moteur est éteint.");
        } else {
            System.out.println("Le moteur est déjà éteint.");
        }
    }
    // Identifions et implementons les méthodes qui dépendent de l'attribut isEngineStarted

    public void accelerer() {
        if (isEngineStarted) {
            System.out.println("La voiture accélère.");
        } else {
            System.out.println("Impossible d'accélérer, le moteur est éteint.");
        }
    }

    public void freiner() {
        if (isEngineStarted) {
            System.out.println("La voiture freine.");
        } else {
            System.out.println("Impossible de freiner, le moteur est éteint.");
        }
    }
    public static void main(String[] args) {
        CarImprovement voiture = new CarImprovement("dhff5ff4ff7f","ferrari", "F448" , "rouge" ,2020,30000 , 28000);
        voiture.demarrerMoteur();
        voiture.accelerer();
        voiture.freiner();
        voiture.arreterMoteur();
    }
}

