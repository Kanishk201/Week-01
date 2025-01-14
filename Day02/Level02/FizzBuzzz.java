import java.util.Scanner;

public class FizzBuzzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        //Check if the number is positive
        if (number > 0) {
            int i = 1; // Start from 1
            // Use while loop to iterate from 1 to the given number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                //Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                //Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                //Otherwise, print the number
                else {
                    System.out.println(i);
                }
                i++; // Increment the counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
