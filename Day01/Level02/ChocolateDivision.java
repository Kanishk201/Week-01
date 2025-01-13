import java.util.Scanner;

public class ChocolateDivision {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        //Take input for the number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        //Calculate the chocolates each child gets and the remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        //Output
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                           " and the number of remaining chocolates are " + remainingChocolates);
    }
}
