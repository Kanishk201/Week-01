import java.util.Scanner;

public class FactorialUsingRecursion{
     public static int findFactorial(int n){
        if(n==0){
            return 1;
        }

        return n * findFactorial(n-1);
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The factorial of the given number is " + findFactorial(n));
     }
}