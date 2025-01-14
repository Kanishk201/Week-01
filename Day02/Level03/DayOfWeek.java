import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        
        //Step 1: Take month, day, and year as input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();  // Month (1 for January, 2 for February, etc.)
        
        System.out.print("Enter day: ");
        int d = scanner.nextInt();  // Day
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt();  // Year
        
        //Step 2: Calculate y0, x, m0, and d0 using the given formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        
        //Step 3: Output the result (day of the week)
        System.out.println("Day of the week: " + d0);
    }
}
