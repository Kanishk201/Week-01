import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end using a loop
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Compare characters recursively
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseCharArray(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string and return a char array
    private static char[] reverseCharArray(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        // Removing non-alphanumeric characters and converting to lowercase for uniformity
        String sanitizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Checking palindrome using different logics
        boolean resultLoop = isPalindromeUsingLoop(sanitizedInput);
        boolean resultRecursion = isPalindromeUsingRecursion(sanitizedInput, 0, sanitizedInput.length() - 1);
        boolean resultCharArray = isPalindromeUsingCharArray(sanitizedInput);

        // Displaying results
        System.out.println("Using Loop: " + (resultLoop ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursion: " + (resultRecursion ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Char Array: " + (resultCharArray ? "Palindrome" : "Not a Palindrome"));
    }
}
