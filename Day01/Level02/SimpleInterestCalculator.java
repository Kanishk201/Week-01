import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Take input for the Principal, Rate, and Time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period: ");
        double time = scanner.nextDouble();

        //Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        //Output
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
    }
}
