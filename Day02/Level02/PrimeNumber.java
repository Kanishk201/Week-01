import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Initialize the isPrime variable to true (assuming the number is prime)
        boolean isPrime = true;

        //Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            //Loop through all numbers from 2 to the number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    // If the remainder is 0, the number is divisible by i, so it's not prime
                    isPrime = false;
                    break;  // Exit the loop as no further checks are needed
                }
            }
        }

        //Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
