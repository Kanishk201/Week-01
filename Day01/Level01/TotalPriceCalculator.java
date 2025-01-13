import java.util.Scanner;

public class TotalPriceCalculator {

    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   //Take input for unit price and quantity
	   System.out.print("Enter the unit price of the item (INR): ");
       double unitPrice = sc.nextDouble();
	   
	   System.out.print("Enter the quantity of the item: ");
	   int quantity = sc.nextInt();
	   
	   //Calculate total price        
	   double totalPrice = unitPrice * quantity;
	   
	   //Output
	   System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

	}
}	