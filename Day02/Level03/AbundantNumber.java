import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {
        
        //Step 1: Get the integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        //Step 2: Create an integer variable sum with initial value 0
        int sum = 0;
        
        //Step 3: Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Step 3a: Check if the number is divisible by i
            if (number % i == 0) {
                // Step 3b: If true, add i to sum
                sum += i;
            }
        }
        
        //Step 4: Check if sum is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
