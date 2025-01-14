public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initialize the variable to null
        // Attempt to call a String method on the null variable
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleNullPointerException() {
        String text = null; // Initialize the variable to null
        try {
            // Attempt to call a String method on the null variable
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateNullPointerException(); // Call method to generate the exception
        } catch (NullPointerException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException:");
        handleNullPointerException(); // Call method to handle the exception
    }
}
