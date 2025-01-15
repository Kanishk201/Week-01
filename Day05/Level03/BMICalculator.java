import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] bmiData = new String[data.length][4];
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round off to 2 decimal places

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            bmiData[i][0] = String.valueOf(heightInCm);
            bmiData[i][1] = String.valueOf(weight);
            bmiData[i][2] = String.valueOf(bmi);
            bmiData[i][3] = status;
        }
        
        return bmiData;
    }

    // Method to display the BMI data
    public static void displayBMIData(String[][] bmiData) {
        System.out.println("Person   Height(cm)   Weight(kg)   BMI   Status");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(
                (i + 1) + "         " +
                bmiData[i][0] + "         " +
                bmiData[i][1] + "         " +
                bmiData[i][2] + "   " +
                bmiData[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        // Take input for height and weight
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiData = calculateBMI(data);

        // Display BMI data
        displayBMIData(bmiData);
    }
}