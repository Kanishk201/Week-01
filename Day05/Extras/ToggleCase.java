import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Toggle the case of each character
        String toggledString = toggleCase(input);

        // Display the result
        System.out.println("String after toggling case: " + toggledString);
    }

    // Method to toggle the case of each character in a string
    private static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Convert to lowercase
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Convert to uppercase
            } else {
                result.append(ch); // Keep non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }
}
