import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Take input of temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        //Output
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}