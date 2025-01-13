import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		
	   //Take three values a, b, and c as input
	   System.out.print("Enter the value of a: ");
       double a = scanner.nextDouble();
	   
	   System.out.print("Enter the value of b: ");
       double b = scanner.nextDouble();
	   
	   System.out.print("Enter the value of c: ");
       double c = scanner.nextDouble();
	   
	   //Compute the results
	   double result1 = a + b * c;
	   double result2 = a * b + c;
	   double result3 = c + a / b;
	   double result4 = a % b + c;
	   
	   //Output
	   System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " 
	   + result3 + ", and " + result4);
    }
}