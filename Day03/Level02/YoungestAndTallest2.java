import java.util.Scanner;

public class YoungestAndTallest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maximum size of the array for three friends
        int maxSize = 3;
        
        // Arrays to store ages and heights of the friends
        int[] ages = new int[maxSize];
        int[] heights = new int[maxSize];
        
        // Variables to store youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        // Loop to take input for ages and heights
        for (int i = 0; i < maxSize; i++) {
            System.out.print("Enter the age of friend " + (i+1) + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter the height (in cm) of friend " + (i+1) + ": ");
            heights[i] = scanner.nextInt();
            
            // Dynamically increase array size if the index reaches maxSize
            if (i == maxSize - 1) {
                maxSize += 10; // Increase size by 10
                // Create new temp arrays
                int[] tempAges = new int[maxSize];
                int[] tempHeights = new int[maxSize];
                
                // Copy the old arrays to new ones
                System.arraycopy(ages, 0, tempAges, 0, ages.length);
                System.arraycopy(heights, 0, tempHeights, 0, heights.length);
                
                // Assign the new arrays back to ages and heights
                ages = tempAges;
                heights = tempHeights;
            }
        }

        // Find the youngest and tallest
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;  // Update youngest index
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;  // Update tallest index
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is " + (youngestIndex+1) + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + (tallestIndex+1) + " with height " + heights[tallestIndex] + " cm");
    }
}
