import java.util.Scanner;

public class DistanceCalculator {
   public static void main(String[] args){
     
      Scanner sc = new Scanner(System.in);
	  
	  //Take distance in feet as input
	   System.out.print("Enter the distance in feet: ");
	   double distanceInFeet = sc.nextDouble();
	   
	   //Convert from feet to yards
	   double distanceInYards = distanceInFeet / 3;
	   
	   //Convert from yards to miles
	   double distanceInMiles = distanceInYards / 1760;
	   
	   //Output
	   System.out.println("The distance in yards is " + distanceInYards + " and the distance in miles is " + distanceInMiles);
	   
   }
}
