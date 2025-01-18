import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Find the number of digits
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

        // Step 4: Display the digits in reverse order (already stored in reverse)
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
