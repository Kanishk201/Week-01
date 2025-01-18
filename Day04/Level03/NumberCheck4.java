import java.util.Scanner;

public class NumberCheck4 {

    //Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Not a prime number
            }
        }
        return true;
    }

    //Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        //Sum the digits of the square of the number
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number;  // Neon number if sum of digits equals the original number
    }

    //Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        // Find sum and product of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;  // Spy number if sum equals product
    }

    //Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        //Check if the number's square ends with the number itself
        while (square > 0 && temp > 0) {
            if (square % 10 != temp % 10) {
                return false;  // Not an automorphic number
            }
            square /= 10;
            temp /= 10;
        }

        return true;
    }

    //Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);  // Buzz number if divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Check if the number is a prime number
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        //Check if the number is a neon number
        if (isNeon(number)) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }

        //Check if the number is a spy number
        if (isSpy(number)) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }

        //Check if the number is an automorphic number
        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        //Check if the number is a buzz number
        if (isBuzz(number)) {
            System.out.println(number + " is a buzz number.");
        } else {
            System.out.println(number + " is not a buzz number.");
        }
    }
}
