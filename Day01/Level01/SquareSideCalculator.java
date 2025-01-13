import java.util.Scanner;

public class SquareSideCalculator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	  
	  //Take perimeter of square as input
	  System.out.print("Enter the perimeter of the square: ");
	  double perimeter = sc.nextDouble();
	  
	  //Calculate the side of square
	  double side = perimeter / 4;
      
	  //Output
	  System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
   }
}