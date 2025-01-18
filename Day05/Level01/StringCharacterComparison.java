import java.util.Scanner;

public class StringCharacterComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharactersWithoutToCharArray(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter the string: ");
        String inputString = scanner.next();

        // Getting characters using user-defined method
        char[] userDefinedResult = getCharactersWithoutToCharArray(inputString);

        // Getting characters using built-in toCharArray() method
        char[] builtInResult = inputString.toCharArray();

        // Comparing the two character arrays
        boolean comparisonResult = compareCharArrays(userDefinedResult, builtInResult);

        // Displaying results
        System.out.println("Characters using user-defined method: " + new String(userDefinedResult));
        System.out.println("Characters using toCharArray(): " + new String(builtInResult));
        System.out.println("Are both results equal? " + comparisonResult);
    }
}
