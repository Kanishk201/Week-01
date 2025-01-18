import java.util.Scanner;

public class EuclideanDistance {

    //Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Euclidean distance formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    //Method to find the equation of the line given two points (x1, y1) and (x2, y2)
    public static double[] findEquationOfLine(double x1, double y1, double x2, double y2) {
        // Find the slope m: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        
        //Find the y-intercept b: b = y1 - m * x1
        double b = y1 - (m * x1);
        
        //Return slope and y-intercept in an array
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking inputs for two points (x1, y1) and (x2, y2)
        System.out.println("Enter coordinates for point 1 (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for point 2 (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        //Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        //Find the equation of the line passing through the points
        double[] lineEquation = findEquationOfLine(x1, y1, x2, y2);
        double m = lineEquation[0]; // slope
        double b = lineEquation[1]; // y-intercept

        //Display the equation of the line: y = mx + b
        System.out.println("Equation of the line: y = " + m + "x + " + b);
    }
}
