import java.util.Scanner;

public class BMICalculator2 {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        
        double[][] personData = new double[numberOfPersons][3];  // [weight, height, BMI]
        // Array to store the weight status for each person
        String[] weightStatus = new String[numberOfPersons];

        // Loop through each person to take input for height and weight
        for (int i = 0; i < numberOfPersons; i++) {
            // Input for weight
            double personWeight;
            do {
                System.out.print("Enter the weight (in kg) for person " + (i + 1) + ": ");
                personWeight = scanner.nextDouble();
                if (personWeight <= 0) {
                    System.out.println("Please enter a valid positive weight.");
                }
            } while (personWeight <= 0);

            // Input for height
            double personHeight;
            do {
                System.out.print("Enter the height (in meters) for person " + (i + 1) + ": ");
                personHeight = scanner.nextDouble();
                if (personHeight <= 0) {
                    System.out.println("Please enter a valid positive height.");
                }
            } while (personHeight <= 0);

            // Store weight and height in the personData array
            personData[i][0] = personWeight;  // weight
            personData[i][1] = personHeight;  // height

            // Calculate BMI: BMI = weight / (height * height)
            personData[i][2] = personWeight / (personHeight * personHeight);  // BMI

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("\n--- Person's Details ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}