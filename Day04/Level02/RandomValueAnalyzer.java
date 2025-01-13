import java.util.Arrays;

public class RandomValueAnalyzer {

    //Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        //Generate random numbers in the range 1000 to 9999 (inclusive)
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        
        return randomNumbers;
    }

    //Method to find the average, minimum, and maximum value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        //Calculate sum, min, and max
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        
        double average = sum / numbers.length;

        
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        //Display the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        //Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        //Display the results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}
