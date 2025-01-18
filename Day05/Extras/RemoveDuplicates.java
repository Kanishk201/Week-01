import java.util.Scanner;

public class RemoveDuplicates {

     // Method to remove duplicate characters from a string
     public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Array to track characters (ASCII)

        // Loop through the characters in the string
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                result.append(ch); // Add the character if not seen before
                seen[ch] = true;   // Mark the character as seen
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a string as input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Remove duplicates and get the modified string
        String result = removeDuplicates(input);

        // Display the result
        System.out.println("String after removing duplicates: " + result);
    }
}
