import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a DateTimeFormatter for the input and output formats
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        // Convert the input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the updated date
        newDate = newDate.minusWeeks(3);

        // Display the final result
        System.out.println("Updated date after operations: " + newDate.format(formatter));
    }
}
