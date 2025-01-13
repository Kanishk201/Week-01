import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        //Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a positive integer (natural number).");
        } else {
            //Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
