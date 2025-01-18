import java.util.Scanner;

public class ChocolateDistribution {

    //Method to calculate the number of chocolates each child gets (quotient) and the remaining chocolates (remainder)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;

        //Return an array with remainder and quotient
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking user input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        //Validating the number of children
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero. Please enter a valid number of children.");
        } else {
            // Calling the method to calculate chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            //Printing the results
            System.out.println("Each child will get: " + result[1] + " chocolates");
            System.out.println("Remaining chocolates: " + result[0]);
        }
    }
}
