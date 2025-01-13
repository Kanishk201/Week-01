import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    //Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        //Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        //Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        //Return results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take angle input from the user
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        //Calculate trigonometric functions using the method
        double[] results = calculateTrigonometricFunctions(angle);

        //Display results
        System.out.println("Sine of " + angle + "°: " + results[0]);
        System.out.println("Cosine of " + angle + "°: " + results[1]);
        System.out.println("Tangent of " + angle + "°: " + results[2]);
    }
}
