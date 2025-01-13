import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the number for which the multiplication table is needed
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        //Define an array to store the multiplication results
        int[] multiplicationResult = new int[4];

        //Calculate the multiplication table for numbers from 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        //Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}