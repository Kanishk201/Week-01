import java.util.Arrays;

public class NumberCheck3 {

    //Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    //Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    //Method to reverse the digits of the number
    public static int[] reverseDigits(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }
        return reversed;
    }

    //Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    //Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    //Method to check if a number is a Duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // A Duck number should contain at least one non-zero digit
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 101; // Example number, change this as needed

        //Display the count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        //Display the digits
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        //Reverse the digits and display them
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

        //Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        //Check if the number is a Duck number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }
    }
}
