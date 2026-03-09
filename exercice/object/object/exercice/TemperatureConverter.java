package javacore.chapter05.object.exercice;

public class TemperatureConverter {

     static String celsiusUnit = "°C";
     static String fahrenheitUnit = "°F";
     static String kelvinUnit = "K";

    public static double celsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    public static double kelvinToCelsius(double kelvinTemperature) {
        return kelvinTemperature - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5/9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvinTemperature) {
        return (kelvinTemperature - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        double celsius = 27.5;
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " " + TemperatureConverter.celsiusUnit + " = " + fahrenheit + " " + TemperatureConverter.fahrenheitUnit);

        double kelvin = TemperatureConverter.celsiusToKelvin(celsius);
        System.out.println(celsius + " " + TemperatureConverter.celsiusUnit + " = " + kelvin + " " + TemperatureConverter.kelvinUnit);
    }
}
