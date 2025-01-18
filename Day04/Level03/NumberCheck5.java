import java.util.Scanner;

public class NumberCheck5 {

    //Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        //First loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;

        //Second loop to find and store the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    //Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    //Method to find the sum of the factors using factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    //Method to find the product of the factors using factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //Method to find product of cube of the factors using factors array
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // cube of the factor
        }
        return product;
    }

    //Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number; // sum of proper divisors
        return sumOfFactors == number;  // Perfect number if sum of divisors equals the number
    }

    //Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number; // sum of proper divisors
        return sumOfFactors > number;  // Abundant number if sum of divisors is greater than the number
    }

    //Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number; // sum of proper divisors
        return sumOfFactors < number;  // Deficient number if sum of divisors is less than the number
    }

    //Method to find factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    //Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        
        //Sum of the factorial of each digit
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        
        return sum == number;  // Strong number if sum of factorial of digits equals the number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take user input for number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Find factors
        int[] factors = findFactors(number);

        //Find greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Find sum of factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        //Find product of factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        //Find product of cube of factors
        double productOfCubes = findProductOfCubeOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        //Check if the number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        //Check if the number is abundant
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        //Check if the number is deficient
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient Number.");
        } else {
            System.out.println(number + " is not a Deficient Number.");
        }

        //Check if the number is strong
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
    }
}
