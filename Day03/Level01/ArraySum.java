import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Array to store up to 10 elements and variable for total sum
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers. Enter 0 or a negative number to stop:");

        //Infinite loop for user input
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            //Check for termination conditions
            if (input <= 0) {
                break;
            }

            //Assign input to the array and increment the index
            numbers[index] = input;
            index++;

            //Break the loop if the array is full
            if (index == 10) {
                break;
            }
        }

        //Calculate the total sum
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        //Display the total sum
        System.out.println("\nThe total sum of the numbers is: " + total);
    }
}
