import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempt to access an index larger than the array length
        System.out.println("Accessing element at index 10: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Attempt to access an index larger than the array length
            System.out.println("Accessing element at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the array of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\n**Demonstrating ArrayIndexOutOfBoundsException:**");
        try {
            generateArrayIndexOutOfBoundsException(names); // Call method to generate the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\n**Handling ArrayIndexOutOfBoundsException:**");
        handleArrayIndexOutOfBoundsException(names); // Call method to handle the exception
    }
}
