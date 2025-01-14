import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        
        //Step 1: Get the integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        //Step 2: Create an integer variable sum with initial value 0
        int sum = 0;
        int originalNumber = number;  // Store the original number for divisibility check
        
        //Step 3: Use a while loop to access each digit of the number
        while (number != 0) {
            //Step 3a: Add each digit of the number to sum
            sum += number % 10;
            
            //Step 3b: Remove the last digit by dividing the number by 10
            number /= 10;
        }
        
        //Step 4: Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
