import java.util.Scanner;

public class TextSplitter2 {

    // Method to split the text into words without using split()
    public static String[] splitText(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            words[index++] = word.toString();
        }

        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;
    }

    // Method to calculate string length without length()
    public static int stringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to generate a 2D array of words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(stringLength(words[i]));
        }

        return wordLengthArray;
    }

    // Method to find the shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordLengthArray.length; i++) {
            if (Integer.parseInt(wordLengthArray[i][1]) < Integer.parseInt(wordLengthArray[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (Integer.parseInt(wordLengthArray[i][1]) > Integer.parseInt(wordLengthArray[longestIndex][1])) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Processing input
        String[] words = splitText(text);
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Displaying words and their lengths
        System.out.println("\nWord\tLength");
        for (String[] wordData : wordLengthArray) {
            System.out.println(wordData[0] + "\t" + wordData[1]);
        }

        // Finding shortest and longest words
        int[] resultIndices = findShortestAndLongest(wordLengthArray);
        System.out.println("\nShortest Word: " + wordLengthArray[resultIndices[0]][0]);
        System.out.println("Longest Word: " + wordLengthArray[resultIndices[1]][0]);
    }
}
