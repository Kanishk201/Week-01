import java.util.Scanner;

public class CollinearPoints {

    //Method to check collinearity using slope formula
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        int slopeAB = (y2 - y1) * (x3 - x2); // To avoid division, compare cross-products
        int slopeBC = (y3 - y2) * (x2 - x1);
        return slopeAB == slopeBC; // Check if slopes are equal
    }

    //Method to check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        //Calculate the determinant (area)
        int determinant = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return determinant == 0; // If determinant is 0, points are collinear
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input points from the user
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        //Check collinearity using slope formula
        boolean collinearUsingSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        //Check collinearity using area of triangle formula
        boolean collinearUsingArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        if (collinearUsingSlope && collinearUsingArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}