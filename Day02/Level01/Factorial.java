import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Take user input
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        //Check if the number is a positive integer
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute factorial using while loop
            int factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }

            //Output
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}
