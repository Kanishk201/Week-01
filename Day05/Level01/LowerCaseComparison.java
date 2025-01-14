import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert text to lowercase using charAt() and ASCII values
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch); // Keep other characters unchanged
            }
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

    // Method to split text into words and return a 2D array with words and their lengths
    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split("\\s+"); // Split by spaces
        String[][] wordDetails = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordDetails[i][0] = words[i];
            wordDetails[i][1] = String.valueOf(words[i].length());
        }

        return wordDetails;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase using custom method
        String customLowercase = toLowerCaseCustom(input);

        // Convert to lowercase using built-in method
        String builtInLowercase = input.toLowerCase();

        // Compare the two results
        boolean areEqual = compareStrings(customLowercase, builtInLowercase);

        // Split text into words and their lengths
        String[][] wordDetails = splitTextIntoWords(input);

        // Display the results
        System.out.println("\nCustom Lowercase Conversion: " + customLowercase);
        System.out.println("Built-in Lowercase Conversion: " + builtInLowercase);
        System.out.println("Are both results equal? " + areEqual);

        System.out.println("\nWords and their lengths:");
        for (String[] wordDetail : wordDetails) {
            System.out.println("Word: " + wordDetail[0] + ", Length: " + wordDetail[1]);
        }
    }
}
