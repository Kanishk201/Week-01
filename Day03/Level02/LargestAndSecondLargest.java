import java.util.Scanner;

public class LargestAndSecondLargest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define a maximum number of digits (maxDigits is set to 10 initially)
        int maxDigits = 10;
        
        // Define an array to store the digits (maximum 10 digits)
        int[] digits = new int[maxDigits];
        
        // Define variables for index, largest, and second largest digits
        int index = 0;
        int largest = -1;
        int secondLargest = -1;
        
        // Store digits of the number in the array
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10; // Get the last digit
            number = number / 10;        // Remove the last digit
            index++;
        }

        // Loop through the digits array to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = digits[i];      // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  // Update second largest
            }
        }

        // Output the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
