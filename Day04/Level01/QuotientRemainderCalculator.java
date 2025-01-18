import java.util.Scanner;

public class QuotientRemainderCalculator {

        //Method to calculate remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;

        //Return an array with remainder and quotient
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking user input for two integers
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        //Validating divisor
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please enter a valid divisor.");
        } else {
            //Calling the method to find remainder and quotient
            int[] result = findRemainderAndQuotient(number, divisor);

            //Printing the results
            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        }   
    }
}
