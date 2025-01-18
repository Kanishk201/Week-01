import java.util.Scanner;

public class BMI_Calculator {

    //Method to calculate BMI for each person and populate the BMI array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInM = heightInCm / 100;  // Convert height from cm to meters
            double bmi = weight / (heightInM * heightInM);  // BMI formula
            data[i][2] = bmi;  // Store BMI in the third column
        }
    }

    //Method to determine the BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2D array to store weight, height, and BMI of 10 people
        double[][] data = new double[10][3];

        //Taking input for weight and height of 10 people
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        //Calculate BMI for each person
        calculateBMI(data);

        //Determine BMI status for each person
        String[] bmiStatus = determineBMIStatus(data);

        //Display the results
        System.out.println("\nBMI Calculation Results:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI    | Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-7d | %-12.2f | %-12.2f | %-6.2f | %-15s\n", 
                               i + 1, data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }
    }
}
