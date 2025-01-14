import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Access an index beyond the length of the string
        System.out.println("Character at index 100: " + text.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            // Access an index beyond the length of the string
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBoundsException(inputString); // Call method to generate the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(inputString); // Call method to handle the exception
    }
}
