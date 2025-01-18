import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Take user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        //Use a for loop to print the multiplication tables from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(number + " * " + j + " = " + (number * j));
            }
            System.out.println();  // Adding an empty line between tables for clarity
        }
    }
}
