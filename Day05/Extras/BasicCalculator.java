import java.util.Scanner;
public class BasicCalculator{
   
    public static double Addition(double num1, double num2){
        return num1 + num2;
    }

    public static double Subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double Multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double Division(double num1, double num2){
        return num1 / num2;
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");

        int userInput = sc.nextInt();

        if(userInput == 1){
            System.out.println("Addition: " + Addition(num1, num2));
        }
        else if(userInput == 2){
            System.out.println("Subtraction: " + Subtraction(num1, num2));
        }
        else if(userInput == 3){
            System.out.println("Multiplication: " + Multiplication(num1, num2));
        }
        else if(userInput == 4){
            System.out.println("Division: " + Division(num1, num2));
        }
    }
}