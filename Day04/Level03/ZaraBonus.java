import java.util.Random;

public class ZaraBonus {

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][2]; // 2D array: First column - salary, second column - years of service

        for (int i = 0; i < 10; i++) {
            // Generate a 5-digit salary (between 10000 and 99999)
            double salary = 10000 + (random.nextDouble() * 90000);
            // Generate years of service (between 1 and 20)
            int yearsOfService = 1 + random.nextInt(20);

            employeeData[i][0] = salary; // Assign salary
            employeeData[i][1] = yearsOfService; // Assign years of service
        }
        return employeeData;
    }

    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] resultData = new double[10][3]; // 2D array to hold: old salary, new salary, bonus

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            double newSalary = oldSalary + bonus; // Calculate new salary

            resultData[i][0] = oldSalary; // old salary
            resultData[i][1] = newSalary; // new salary
            resultData[i][2] = bonus; // bonus amount
        }
        return resultData;
    }

    // Method to calculate the total sum of old salary, new salary, and total bonus
    public static void calculateTotalSums(double[][] resultData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            totalOldSalary += resultData[i][0]; // sum of old salary
            totalNewSalary += resultData[i][1]; // sum of new salary
            totalBonus += resultData[i][2]; // sum of bonus
        }

        // Print the tabular format with the totals
        System.out.println("Employee Details (Old Salary, New Salary, Bonus)");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-15s%-15s%-10s\n", "Old Salary", "New Salary", "Bonus");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15.2f%-15.2f%-10.2f\n", resultData[i][0], resultData[i][1], resultData[i][2]);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("%-15s%-15s%-10s\n", "Total:", "Total:", "Total:");
        System.out.printf("%-15.2f%-15.2f%-10.2f\n", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData();

        // Calculate new salary and bonus based on the years of service
        double[][] resultData = calculateNewSalaryAndBonus(employeeData);

        // Calculate the total sums and display the results in a tabular format
        calculateTotalSums(resultData);
    }
}
