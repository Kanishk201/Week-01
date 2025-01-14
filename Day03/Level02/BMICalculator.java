public class BMICalculator {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        
        for (int i = 0; i < numberOfPersons; i++) {
            
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

            // Store weight and height in the arrays
            weight[i] = personWeight;
            height[i] = personHeight;

            // Calculate BMI: BMI = weight / (height * height)
            bmi[i] = personWeight / (personHeight * personHeight);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("\n--- Person's Details ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}