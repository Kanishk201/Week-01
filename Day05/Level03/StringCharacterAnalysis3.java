import java.util.Scanner;

public class StringCharacterAnalysis3 {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
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
