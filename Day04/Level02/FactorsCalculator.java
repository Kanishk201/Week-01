import java.util.Scanner;

public class FactorsCalculator {

    //Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        //Count the factors to initialize the array
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        //Initialize the array to hold the factors
        int[] factors = new int[count];
        int index = 0;

        //Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    //Method to calculate the sum of the factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    //Method to calculate the product of the factors
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //Method to calculate the sum of squares of the factors
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Find factors
        int[] factors = findFactors(number);

        //Calculate results
        int sum = calculateSum(factors);
        long product = calculateProduct(factors);
        int sumOfSquares = calculateSumOfSquares(factors);

        //Display results
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}
