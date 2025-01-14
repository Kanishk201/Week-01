import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Get input value for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Loop backwards from 100 to 1
        System.out.println("Multiples of " + number + " below 100 are: ");
        for (int i = 100; i >= 1; i--) {
            //Check if i is a multiple of number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }
    }
}
