import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        //Create Scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        //Get integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Define greatestFactor variable
        int greatestFactor = 1;

        //Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop once the greatest factor is found
            }
        }

        //Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
    }
}
