import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Takein puts for the sides of the triangular park
        System.out.print("Enter the length of side 1 in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 in meters: ");
        double side3 = scanner.nextDouble();

        //Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        //Convert 5 km to meters
        double totalDistance = 5000;

        //Calculate the number of rounds needed
        double rounds = totalDistance / perimeter;

        //Output
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
	}
}
