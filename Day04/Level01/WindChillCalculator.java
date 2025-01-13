import java.util.Scanner;

public class WindChillCalculator {

    //Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking user input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        //Validate input for wind speed
        if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative. Please enter a valid wind speed.");
        } else {
            //Calculate wind chill using the method
            double windChill = calculateWindChill(temperature, windSpeed);

            //Display the wind chill temperature
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        }
    }
}
