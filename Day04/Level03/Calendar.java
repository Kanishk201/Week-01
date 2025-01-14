import java.util.Scanner;

public class Calendar {
    //Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    //Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    //Method to calculate the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7; // Return 0 for Sunday, 1 for Monday, etc.
    }

    public static void displayCalendar(int month, int year) {
        //Get month name and days in month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        //Print the calendar header
        System.out.println("     " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        //Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        //Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // Move to next line after Saturday
            }
        }
        System.out.println(); // Final newline
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input month and year from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        //Display the calendar
        displayCalendar(month, year);
        scanner.close();
    }
}