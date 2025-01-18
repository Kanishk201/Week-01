import java.util.Arrays;

public class NumberCheck2 {

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

    //Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    //Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2); // Sum of squares using Math.pow
        }
        return sumOfSquares;
    }

    //Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    //Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; // Array for digits 0-9 and their frequency

        //Initialize the frequency array with digits and their counts
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // The first column stores the digit
            frequency[i][1] = 0; // The second column stores the frequency
        }

        //Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 21; // Example number, you can change this as needed

        //Display the count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        //Display the digits
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        //Display the sum of digits
        int sumDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumDigits);

        //Display the sum of squares of digits
        double sumSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumSquares);

        //Check if the number is a Harshad number
        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        //Display the frequency of each digit
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
            }
        }
    }
}
