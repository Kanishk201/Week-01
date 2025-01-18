import java.util.Scanner;

public class ZaraBonus {
    
    // Method to take valid input from the user for salary and years of service
    public static double[] takeValidInput(String prompt, Scanner scanner) {
        double[] input = new double[2];  // input[0] -> salary, input[1] -> years of service
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                input[0] = scanner.nextDouble();
                if (input[0] <= 0) {
                    System.out.println("Salary must be a positive number. Please try again.");
                    continue;
                }
            } else {
                System.out.println("Invalid input for salary. Please enter a valid number.");
                scanner.next(); // clear invalid input
                continue;
            }

            if (scanner.hasNextInt()) {
                input[1] = scanner.nextInt();
                if (input[1] <= 0) {
                    System.out.println("Years of service must be a positive number. Please try again.");
                    continue;
                }
                break; // break the loop if both salary and years of service are valid
            } else {
                System.out.println("Invalid input for years of service. Please enter a valid number.");
                scanner.next(); // clear invalid input
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store salary, years of service, new salary and bonus for each employee
        double[][] employees = new double[10][4]; // [][0] -> salary, [][1] -> years of service, [][2] -> new salary, [][3] -> bonus
        
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Input loop for salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            double[] input = takeValidInput("Enter salary and years of service: ", scanner);

            // Assign values to the employee data array
            employees[i][0] = input[0]; // Salary
            employees[i][1] = input[1]; // Years of service

            // Calculate the bonus and new salary
            double bonus = 0;
            if (employees[i][1] > 5) {
                bonus = employees[i][0] * 0.05; // 5% bonus
            } else {
                bonus = employees[i][0] * 0.02; // 2% bonus
            }

            employees[i][3] = bonus; // Save the bonus
            employees[i][2] = employees[i][0] + bonus; // Save the new salary

            // Accumulate totals for old salary, new salary, and bonus
            totalOldSalary += employees[i][0];
            totalNewSalary += employees[i][2];
            totalBonus += employees[i][3];
        }

        // Print results
        System.out.println("\nEmployee Salary and Bonus Details:");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Old Salary", "New Salary", "Bonus", "Years of Service");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15.2f%-15.2f%-15.2f%-15.2f\n", 
                employees[i][0], 
                employees[i][2], 
                employees[i][3], 
                employees[i][1]);
        }

        // Print total salary and bonus payout
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s\n", "Total Old Salary", "Total New Salary", "Total Bonus");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-15.2f%-15.2f%-15.2f\n", totalOldSalary, totalNewSalary, totalBonus);
    }
}
