import java.util.Scanner;

public class SpringSeasonCheck {

    //Method to check if the date falls in the Spring season
    public static boolean SpringSeason(int month, int day) {
        //Check if the date is between March 20 and June 20
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true; // It's Spring season
        } else {
            return false; // Not Spring season
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the month and day from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        //Check if the date is in the Spring season
        if (SpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
