public class CourseFeeDiscount {
    public static void main(String[] args) {
	   int fee = 125000;
	   int discountPercent = 10;
	   
	   //Calculate Discount Amount
	   double discount = (fee * discountPercent) / 100.0;
	   
	   //Calculate Discounted Fee
	   double discountedFee = fee - discount;
	   
	   //Output
	   System.out.println(
            "The discount amount is INR " + discount + 
            " and final discounted fee is INR " + discountedFee);
	}
}