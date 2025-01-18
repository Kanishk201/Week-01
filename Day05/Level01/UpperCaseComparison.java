import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert each character to uppercase using charAt and ASCII logic
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert to uppercase
            } else {
                result.append(ch); // Keep other characters unchanged
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are not equal if lengths differ
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Characters differ
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the text:");
        String userInput = scanner.nextLine();

        // Using built-in toUpperCase method
        String builtInUpperCase = userInput.toUpperCase();

        // Using user-defined convertToUpperCase method
        String customUpperCase = toUpperCaseCustom(userInput);

        // Comparing the two results
        boolean areEqual = compareStrings(builtInUpperCase, customUpperCase);

        // Displaying the results
        System.out.println("Original Text: " + userInput);
        System.out.println("Built-in Uppercase: " + builtInUpperCase);
        System.out.println("Custom Uppercase: " + customUpperCase);
        System.out.println("Are the results identical? " + areEqual);

       
    }
}