import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        //Get input value for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Loop from 1 to number-1 to find factors
        System.out.println("The factors of " + number + " are: ");
        for (int i = 1; i < number; i++) {
            //Check if number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i); // Print factor if divisible
            }
        }
    }
}
