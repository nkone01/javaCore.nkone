package javacore.chapter01.variable.exercice;

public class FahrenheitCelsiusConverter {

    public static void main(String[] args) {

        double temperatureEnFahrenheit = 86.0;
        // Appliquer la formule de conversion Fahrenheit vers Celsius
        double temperatureEnCelsius = (temperatureEnFahrenheit - 32) / 1.8;
        System.out.println(temperatureEnFahrenheit + "°F équivaut à " + temperatureEnCelsius + "°C");

    }
}
