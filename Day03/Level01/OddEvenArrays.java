import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        //Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0). Exiting...");
            return;
        }

        //Initialize arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        //Iterate from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Save even number
            } else {
                oddNumbers[oddIndex++] = i; // Save odd number
            }
        }

        //Print odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        //Print even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}