import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Attempt to parse the text to an integer
        System.out.println("Parsed number: " + Integer.parseInt(text));
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleNumberFormatException(String text) {
        try {
            // Attempt to parse the text to an integer
            System.out.println("Parsed number: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string to parse as an integer: ");
        String inputString = scanner.nextLine();

        System.out.println("\n**Demonstrating NumberFormatException:**");
        try {
            generateNumberFormatException(inputString); // Call method to generate the exception
        } catch (NumberFormatException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\n**Handling NumberFormatException:**");
        handleNumberFormatException(inputString); // Call method to handle the exception
    }
}
