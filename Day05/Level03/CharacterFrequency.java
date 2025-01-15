import java.util.Scanner;

public class CharacterFrequency {
    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        int n = text.length();
        char[] chars = text.toCharArray();
        int[] freq = new int[n];
        
        // Initialize frequencies and mark characters as not visited
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        // Outer loop for each character
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') { // If not already visited
                for (int j = i + 1; j < n; j++) {
                    if (chars[i] == chars[j]) { // Duplicate found
                        freq[i]++;
                        chars[j] = '0'; // Mark as visited
                    }
                }
            }
        }

        // Create a 1D array to store characters and their frequencies
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') count++;
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + ": " + freq[i];
            }
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Finding frequency of characters
        String[] frequencies = findFrequency(input);

        // Displaying the result
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
    }
}
