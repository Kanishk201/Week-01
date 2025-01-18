import java.util.Scanner;

public class TriangleRun {

    //Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    //Method to calculate the number of rounds the athlete needs to complete 5 km
    public static int calculateRounds(double perimeter) {
        double totalDistance = 5000; // 5 km in meters
        return (int) Math.ceil(totalDistance / perimeter); // Rounds up to the nearest whole number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking input for the sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        //Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        //Calculate the number of rounds
        int rounds = calculateRounds(perimeter);

        //Output the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
}
