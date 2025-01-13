import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Take salary and bonus as input
        System.out.print("Enter the salary in INR: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the bonus in INR: ");
        double bonus = scanner.nextDouble();

        //Calculate the total income
        double totalIncome = salary + bonus;

        //Output
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
