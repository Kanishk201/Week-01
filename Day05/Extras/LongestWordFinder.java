import java.util.Scanner;

public class LongestWordFinder {
     // Method to find the longest word in a sentence
     public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); // Split the sentence into words
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Find the longest word in the sentence
        String longestWord = findLongestWord(sentence);

        // Display the result
        System.out.println("The longest word is: " + longestWord);
    }   
}