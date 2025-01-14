import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        // Use substring with invalid indices to generate the exception
        System.out.println("Substring: " + text.substring(5, 3));
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleIllegalArgumentException(String text) {
        try {
            // Use substring with invalid indices
            System.out.println("Substring: " + text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("\n**Demonstrating IllegalArgumentException:**");
        try {
            generateIllegalArgumentException(inputString); // Call method to generate the exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\n**Handling IllegalArgumentException:**");
        handleIllegalArgumentException(inputString); // Call method to handle the exception
    }
}
