import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from the start and end
        while (start < end) {
            
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a string as input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display the result
        if (isPalindrome) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");
        }
    }   
}
