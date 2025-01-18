import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a DateTimeFormatter for the input format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date inputs from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (YYYY-MM-DD): ");
        String firstDateInput = scanner.nextLine();

        System.out.println("Enter the second date (YYYY-MM-DD): ");
        String secondDateInput = scanner.nextLine();

        // Convert the input strings to LocalDate
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
