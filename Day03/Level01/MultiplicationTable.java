import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the number for which the multiplication table is needed
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        //Define an array to store the results of multiplication
        int[] multiplicationTable = new int[10];

        //Calculate the multiplication table and store the results in the array
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        //Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
    }
}
