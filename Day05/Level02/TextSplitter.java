import java.util.Scanner;

public class TextSplitter {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        String[] words = splitText(text);

        System.out.println("\nWord\tLength");
        for (String word : words) {
            System.out.println(word + "\t" + stringLength(word));
        }
    }
}
