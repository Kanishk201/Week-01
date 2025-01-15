import java.util.Scanner;
import java.util.Random;

public class StudentVotingChecker {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random 2-digit number (10-99)
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; // Negative ages cannot vote
            } else {
                result[i][1] = ages[i] >= 18 ? "true" : "false"; // Check if 18 or above
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Generate ages for students
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Display the results
        displayResults(results);
    }
}
