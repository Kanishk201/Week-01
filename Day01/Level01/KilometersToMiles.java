import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
	   
	    Scanner input = new Scanner(System.in);
		
		//Taking input for distance
		System.out.print("Enter the distance in kilometers: ");
		double km = input.nextDouble();
		
		//Calculate distance in miles
		double miles = km / 1.6;
		
		//Output
		System.out.println("The total miles is " + miles + " mile for the given " + km + " km");


	}
}