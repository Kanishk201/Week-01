import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Take a number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Output
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
	}
}
