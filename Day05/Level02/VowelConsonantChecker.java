import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char c) {
        // Convert to lowercase if uppercase
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }

        // Check if the character is a vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }
        // Not a letter
        return "Not a Letter";
    }

    // Method to find vowels, consonants, or other characters in a string
    public static String[][] analyzeString(String text) {
        String[][] resultArray = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            resultArray[i][0] = String.valueOf(c);
            resultArray[i][1] = checkCharacter(c);
        }

        return resultArray;
    }

    // Method to display a 2D array of characters and their types
    public static void displayCharacterAnalysis(String[][] analysis) {
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (String[] entry : analysis) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Analyzing characters in the string
        String[][] analysis = analyzeString(text);

        // Displaying the analysis in tabular format
        displayCharacterAnalysis(analysis);
    }
}
