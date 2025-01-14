import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialize total to 0.0
        double total = 0.0;

        //Start the loop
        while (true) {
            // Prompt user to enter a number
            System.out.print("Enter a number (0 to stop): ");
            double userInput = scanner.nextDouble();

            //If user enters 0, break the loop
            if (userInput == 0) {
                break;
            }

            //Add the entered value to the total
            total += userInput;
        }

        //Output
        System.out.println("The total sum is: " + total);
    }
}
