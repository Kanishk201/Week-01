import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Ask the user to input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        //Check if the year is valid (greater than or equal to 1582)
        if (year >= 1582) {
            
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
    }
}
