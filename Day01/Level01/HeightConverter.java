import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
	   
	   Scanner input = new Scanner(System.in);
	   
	   //Enter height in centimeters
	    System.out.print("Enter your height in centimeters: ");
		double heightCm = input.nextDouble();
		
		double cmPerInch = 2.54;
		int inchesPerFoot = 12;
		
		//Convert height to inches
		double totalInches = heightCm / cmPerInch;
		
		//Convert inches to feet and remaining inches
		int feet = (int) (totalInches / inchesPerFoot);
		double inches = totalInches % inchesPerFoot;
		
		//Output
		System.out.println(
            "Your Height in cm is " + heightCm +
			" while in feet is "  + feet +" and inches is "+ inches);
	}
}