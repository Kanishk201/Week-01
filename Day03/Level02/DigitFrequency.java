import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Find the count of digits
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;  // Remove the last digit
        }

        // Step 2: Create an array to store the digits
        int[] digits = new int[count];
        temp = number;

        // Step 3: Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;  // Get the last digit
            temp /= 10;  // Remove the last digit
        }

        // Step 4: Create a frequency array to store the frequency of each digit
        int[] frequency = new int[10];  // Array for digits 0 to 9

        // Step 5: Calculate the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;  // Increase the frequency of the digit
        }

        // Step 6: Display the frequency of each digit
        System.out.println("Frequency of digits in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }
}
