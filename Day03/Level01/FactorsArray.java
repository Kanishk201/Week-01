import java.util.Scanner;
import java.util.Arrays;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get input from the user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        //Check if the number is valid
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number. Exiting...");
            return;
        }

        //Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        //Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add factor to the array
                if (index == maxFactor) {
                    // Double the size of the array
                    maxFactor *= 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[index++] = i;
            }
        }

        //Display factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
