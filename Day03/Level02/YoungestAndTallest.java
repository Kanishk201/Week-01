import java.util.Scanner;

public class YoungestAndTallest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the age and height of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights for Amar, Akbar, and Anthony
        System.out.println("Enter the age and height for each of the 3 friends:");
        
        // For Amar
        System.out.print("Amar's age: ");
        ages[0] = scanner.nextInt();
        System.out.print("Amar's height (in cm): ");
        heights[0] = scanner.nextDouble();

        // For Akbar
        System.out.print("Akbar's age: ");
        ages[1] = scanner.nextInt();
        System.out.print("Akbar's height (in cm): ");
        heights[1] = scanner.nextDouble();

        // For Anthony
        System.out.print("Anthony's age: ");
        ages[2] = scanner.nextInt();
        System.out.print("Anthony's height (in cm): ");
        heights[2] = scanner.nextDouble();

        // Finding the youngest friend
        int youngestAge = ages[0];
        String youngestFriend = "Amar";

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                if (i == 1) {
                    youngestFriend = "Akbar";
                } else {
                    youngestFriend = "Anthony";
                }
            }
        }

        // Finding the tallest friend
        double tallestHeight = heights[0];
        String tallestFriend = "Amar";

        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                if (i == 1) {
                    tallestFriend = "Akbar";
                } else {
                    tallestFriend = "Anthony";
                }
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is: " + youngestFriend + " with age: " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height: " + tallestHeight + " cm");
    }
}
