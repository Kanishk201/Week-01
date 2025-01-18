import java.util.Scanner;

public class LeapYears {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        //Check if the year is valid (must be >= 1582)
        if (year < 1582) {
            System.out.println("Year should be 1582 or greater as per the Gregorian calendar.");
        } else {
            //Single if condition with logical operators
            if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
