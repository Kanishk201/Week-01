import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        // Compare the two strings lexicographically
        int comparisonResult = compareStrings(string1, string2);

        // Display the result
        if (comparisonResult < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" lexicographically.");
        }
    }

    // Method to compare two strings lexicographically without using built-in methods
    private static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2; // Return the difference of the characters
            }
        }

        // If all characters are equal, compare by length
        return length1 - length2;
    }
}
