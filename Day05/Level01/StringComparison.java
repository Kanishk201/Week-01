import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare characters one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String string1 = scanner.next();
        
        System.out.print("Enter the second string: ");
        String string2 = scanner.next();
        
        // Comparing strings using charAt() method
        boolean resultUsingCharAt = compareStringsUsingCharAt(string1, string2);
        
        // Comparing strings using the built-in equals() method
        boolean resultUsingEquals = string1.equals(string2);
        
        // Displaying results
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);
        
        // Verifying if the results match
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results of the two methods do not match.");
        }
    }
}
