import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialize total to 0.0
        double total = 0.0;

        //Infinite while loop
        while (true) {
            // Prompt user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = scanner.nextDouble();

            //Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop if input is 0 or negative
            }

            //Add the entered value to the total
            total += userInput;
        }

        //Output
		 System.out.println("The total sum is: " + total);
    }
}
