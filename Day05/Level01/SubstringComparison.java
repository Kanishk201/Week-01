import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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

        // Taking user input for the string and start/end indices
        System.out.print("Enter the original string: ");
        String originalString = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Validating the start and end indices
        if (startIndex < 0 || endIndex > originalString.length() || startIndex >= endIndex) {
            System.out.println("Invalid indices. Please ensure 0 <= start < end <= string length.");
            return;
        }

        // Creating substring using charAt()
        String substringUsingCharAt = createSubstringUsingCharAt(originalString, startIndex, endIndex);

        // Creating substring using built-in substring() method
        String substringUsingBuiltIn = originalString.substring(startIndex, endIndex);

        // Comparing the two substrings using charAt()
        boolean comparisonResult = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Displaying results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + comparisonResult);
    }
}
