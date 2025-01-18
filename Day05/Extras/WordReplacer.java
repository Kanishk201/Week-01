import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Accept the word to replace and the word to replace it with
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Replace the word in the sentence
        String updatedSentence = replaceWord(sentence, oldWord, newWord);

        // Output the updated sentence
        System.out.println("Updated sentence: " + updatedSentence);

        scanner.close();
    }

    // Method to replace a word in the sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace all occurrences of oldWord with newWord
        return sentence.replace(oldWord, newWord);
    }
}
