import java.util.Scanner;

public class StringTrimmer {

    // Method to find the start and end indices of non-space characters
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence with leading and trailing spaces:");
        String text = scanner.nextLine();

        // Find trim indices and create trimmed string
        int[] indices = findTrimIndices(text);
        String trimmedText = createSubstring(text, indices[0], indices[1]);

        // Trim using built-in method for comparison
        String builtInTrimmedText = text.trim();

        // Compare the results
        boolean isSame = compareStrings(trimmedText, builtInTrimmedText);

        // Display results
        System.out.println("\nTrimmed Text (Custom Method): \"" + trimmedText + "\"");
        System.out.println("Trimmed Text (Built-in Method): \"" + builtInTrimmedText + "\"");
        System.out.println("Are the results identical? " + isSame);
    }
}
