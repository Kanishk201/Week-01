import java.util.Scanner;

public class BasicCalculator {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  
	  //Take two numbers as input
	  System.out.print("Enter the first number: ");
	  double number1 = sc.nextDouble();
	  
	  System.out.print("Enter the second number: ");
	  double number2 = sc.nextDouble();
	  
	  //Perform arithmetic operations
	  double addition = number1 + number2;
	  double subtraction = number1 - number2;
	  double multiplication = number1 * number2;
	  double division = 0;
	  
	  if(number2 != 0) {
	     division = number1 / number2;
	  }
	  else{
	     System.out.println("Error: Division by zero is not allowed.");
	  }
	  
	   //Output
	   System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " 
	   + addition + " , " + subtraction + " , " + multiplication + " " + " and " + division);
	  
   }
}