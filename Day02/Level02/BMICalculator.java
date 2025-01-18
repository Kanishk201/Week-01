import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Variables to store weight and height
        double weight, height, bmi;
        
        //Use while loop to get valid input from the user
        while (true) {
            System.out.print("Enter weight in kg: ");
            weight = scanner.nextDouble();
            
            System.out.print("Enter height in cm: ");
            height = scanner.nextDouble();
            
            if (weight > 0 && height > 0) {
                break; // If input is valid, exit the loop
            } else {
                System.out.println("Please enter valid positive values for weight and height.");
            }
        }

        //Convert height from cm to meters
        height = height / 100;

        //Calculate BMI using the formula BMI = weight / (height * height)
        bmi = weight / (height * height);

        // Determine weight status based on BMI
        String status = "";
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else if (bmi >= 40.0) {
            status = "Obese";
        }

        //Output the result
        System.out.printf("\nBMI: %.2f\n", bmi);
        System.out.println("Status: " + status);
    }
}