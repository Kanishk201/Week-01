import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Take user input
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        //Check if the number is a positive integer
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute factorial using for loop
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            //Print the factorial
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}
