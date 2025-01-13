import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Take month and day as input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        
		//Output
        if ((month > 3 || (month == 3 && day >= 20)) && (month < 6 || (month == 6 && day <= 20))) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}