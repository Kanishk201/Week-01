import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Take user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        //Check if it's a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer (natural number).");
        } else {
            //Compute sum using for loop
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }

            //Compute sum using formula
            int sumFormula = n * (n + 1) / 2;
            
            //Compare the results and print Output
            System.out.println("Sum using for loop: " + sumForLoop);
            System.out.println("Sum using formula (n * (n + 1) / 2): " + sumFormula);
            
            if (sumForLoop == sumFormula) {
                System.out.println("Both computations match. The result is correct.");
            } else {
                System.out.println("There seems to be an issue. The results do not match.");
            }
        }
    }
}
