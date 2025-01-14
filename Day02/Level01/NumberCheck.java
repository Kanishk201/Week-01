import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Enter a number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
