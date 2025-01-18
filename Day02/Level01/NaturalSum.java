import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Take user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        //Check if it's a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer (natural number).");
        } else {
            // Compute sum using while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }

            //Compute sum using formula
            int sumFormula = n * (n + 1) / 2;
            
            // Compare the results and print output
            System.out.println("Sum using while loop: " + sumWhileLoop);
            System.out.println("Sum using formula (n * (n + 1) / 2): " + sumFormula);
            
            if (sumWhileLoop == sumFormula) {
                System.out.println("Both computations match. The result is correct.");
            } else {
                System.out.println("There seems to be an issue. The results do not match.");
            }
        }
    }
}
