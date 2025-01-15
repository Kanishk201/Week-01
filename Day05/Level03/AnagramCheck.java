import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store character frequencies
        int[] frequency1 = new int[256]; // ASCII character set
        int[] frequency2 = new int[256];

        // Find frequency of characters in text1
        for (char c : text1.toCharArray()) {
            frequency1[c]++;
        }

        // Find frequency of characters in text2
        for (char c : text2.toCharArray()) {
            frequency2[c]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        System.out.println(result ? "The texts are anagrams." : "The texts are not anagrams.");
    }
}
