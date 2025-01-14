import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take input
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        //Validate input
        if (counter <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        //Countdown using a for loop
        System.out.println("Countdown started for rocket launch:");
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        //Output
        System.out.println("Rocket has launched!");
    }
}
