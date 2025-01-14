import java.util.Scanner;

public class SimpleInterestCalculator {

    //Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take Input of Principal, Rate of Interest and Time
        System.out.print("Enter the Principal: ");
        double principal = scanner.nextDouble();

        //Input Rate of Interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        //Input Time
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        //Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        //Output the result
        System.out.println("The Simple Interest is " + simpleInterest 
                           + " for Principal " + principal 
                           + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
	}
}
