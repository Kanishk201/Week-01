import java.util.Scanner;
public class FibonacciGenerator {
    
    // Function to calculate and print fibonacci series
    public static void generateFibonacci(int terms){
        if(terms<=0){
            System.out.println("Please enter a positive number");
            return;
        }
        
        int first=0;
        int second=1;

        for(int i=1;i<=terms;i++){
            System.out.print(first + " ");
            int next=first+second;
            first=second;
            second=next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        
        // Calling the function to generate the Fibonacci sequence
        generateFibonacci(terms);
    }
}
