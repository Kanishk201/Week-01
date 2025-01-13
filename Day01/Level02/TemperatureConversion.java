import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		
		//Take input of temperature in Celsius
		System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
		
		// Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;
		
		//Output
		System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
	}
}