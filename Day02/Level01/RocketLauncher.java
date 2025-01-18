import java.util.Scanner;

public class RocketLauncher {
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

        //Countdown loop
        System.out.println("Countdown started for rocket launch:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        //Output
        System.out.println("Rocket has launched!");
    }
}
