import java.util.Scanner;

public class CharacterAnalysis {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Trim the uniqueChars array to the actual number of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            result[i][0] = Character.toString(uniqueChar);
            result[i][1] = Integer.toString(frequency[uniqueChar]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[][] characterFrequencies = findCharacterFrequencies(input);

        // Display the result
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");
        for (String[] row : characterFrequencies) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
