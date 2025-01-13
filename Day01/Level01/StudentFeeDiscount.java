import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
	   
	   Scanner input = new Scanner(System.in);
	   
	   //Take input for user fee and Discout percent
	   System.out.print("Enter the student fee in INR: ");
	   double fee = input.nextDouble();
	   
	    System.out.print("Enter the discount percentage: ");
		double discountPercent = input.nextDouble();
		
		//Calculate Discount Amount
		double discount = (fee * discountPercent) / 100.0;
		
		//Calculate final Discounted fee
		double discountedFee = fee - discount;
		
		//Output
		System.out.println("The discount amount is INR " + discount + 
            " and final discounted fee is INR " + discountedFee);
	}
}