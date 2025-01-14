import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        //Step 1: Get the integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        //Step 2: Define sum variable and initialize it to zero
        int sum = 0;
        
        //Step 3: Store the original number
        int originalNumber = number;
        
        //Step 4: Use the while loop to process each digit
        while (originalNumber != 0) {
            //Step 4a: Find the remainder (last digit)
            int digit = originalNumber % 10;
            
            //Step 4b: Find the cube of the digit and add it to the sum
            sum += digit * digit * digit;
            
            //Step 4c: Remove the last digit by dividing the original number by 10
            originalNumber /= 10;
        }
        
        //Step 5: Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
