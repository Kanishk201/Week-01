import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    // Method to find the most frequent character in a string
    private static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        char mostFrequentChar = '\0';

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

            // Update the most frequent character if necessary
            if (frequencyMap.get(ch) > maxFrequency) {
                maxFrequency = frequencyMap.get(ch);
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}
