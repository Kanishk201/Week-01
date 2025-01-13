import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   //Take two numbers as input
	   System.out.print("Enter the first number: ");
       int number1 = scanner.nextInt();
	   
	   System.out.print("Enter the second number: ");
       int number2 = scanner.nextInt();
	   
	   //Calculate quotient and remainder
	   int quotient = number1 / number2;
       int remainder = number1 % number2;
	   
	   //Output
	   System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder 
                   + " of two numbers " + number1 + " and " + number2);
	}
}