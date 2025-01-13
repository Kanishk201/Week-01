import java.util.Scanner;

public class NumberChecker {

    //Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero"; // In case of zero
        }
    }

    //Method to check if the number is even or odd
    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;  // number1 is greater
        } else if (number1 == number2) {
            return 0;  // both numbers are equal
        } else {
            return -1; // number1 is smaller
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Array to store 5 numbers
        int[] numbers = new int[5];

        //Taking user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        //Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String sign = isPositive(number);  // Check if the number is positive or negative
            System.out.print("Number " + number + " is " + sign);

            if (sign.equals("positive")) {
                String evenOdd = isEvenOrOdd(number);  // Check if positive number is even or odd
                System.out.println(" and it is " + evenOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        //Comparing the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }
}
