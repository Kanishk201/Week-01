import java.util.Scanner;
public class TemperatureConverter{

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter temperature in fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.println("Enter temperature in celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
    }
}