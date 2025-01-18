import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Take user input for salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();
        
        //Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus if years of service is greater than 5
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }
    }
}
