import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths of the strings are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
