import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        
        //Step 1: Get the integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        //Step 2: Create a count variable and initialize it to 0
        int count = 0;
        
        //Step 3: Use a loop to count the digits
        while (number != 0) {
            //Step 3a: Remove the last digit from the number
            number /= 10;
            
            //Step 3b: Increase count by 1
            count++;
        }
        
        //Step 4: Display the count to show the number of digits
        System.out.println("Number of digits: " + count);
    }
}
