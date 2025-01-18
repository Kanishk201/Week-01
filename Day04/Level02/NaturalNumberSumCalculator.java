import java.util.Scanner;

public class NaturalNumberSumCalculator {

    //Method to calculate the sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    //Method to calculate the sum of n natural numbers using the formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take user input for the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        //Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        //Calculate the sum using recursion
        int sumRecursive = recursiveSum(n);

        //Calculate the sum using the formula
        int sumFormula = formulaSum(n);

        //Display both results and compare
        System.out.println("Sum of the first " + n + " natural numbers (recursive): " + sumRecursive);
        System.out.println("Sum of the first " + n + " natural numbers (formula): " + sumFormula);

        //Compare the results
        if (sumRecursive == sumFormula) {
            System.out.println("Both methods give the correct and same result.");
        } else {
            System.out.println("The results do not match.");
        }
    }
}
