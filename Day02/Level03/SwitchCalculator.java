import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {
        
        //Step 1: Declare the variables
        double first, second;
        String op;
        
        //Step 2: Get input values for the variables
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble(); // First number
        
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble(); // Second number
        
        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next(); // Operator
        
        //Step 3: Perform the operation using a switch...case statement
        double result = 0;
        boolean validOperator = true;
        
        switch (op) {
            case "+":
                result = first + second; // Addition
                break;
            case "-":
                result = first - second; // Subtraction
                break;
            case "*":
                result = first * second; // Multiplication
                break;
            case "/":
                if (second != 0) {
                    result = first / second; // Division
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator"); // Invalid operator
                validOperator = false;
                break;
        }
        
        //Step 4: Print the result if the operator was valid
        if (validOperator) {
            System.out.println("The result is: " + result);
        }
    }
}
