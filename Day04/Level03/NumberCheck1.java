import java.util.Arrays;

public class NumberCheck1 {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; // Duck number if any non-zero digit exists
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        int digitCount = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, digitCount); // Raise each digit to the power of digitCount
        }

        return sum == number; // Armstrong condition: sum of powers equals the original number
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;  // Example number (can change as needed)

        // Displaying the count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Storing digits and displaying the array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Checking if the number is a Duck number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        // Checking if the number is an Armstrong number
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Finding and displaying the largest and second largest elements
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest element: " + largestAndSecondLargest[0]);
        System.out.println("Second largest element: " + largestAndSecondLargest[1]);

        // Finding and displaying the smallest and second smallest elements
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest element: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest element: " + smallestAndSecondSmallest[1]);
    }
}
