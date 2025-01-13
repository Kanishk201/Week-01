import java.util.Scanner;

public class LeapYearChecker {

    //Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        //Leap year is divisible by 4 but not divisible by 100 unless also divisible by 400
        if (year >= 1582) { // Ensure the year is in the Gregorian calendar
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        //Check if the year is a leap year and display the result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
