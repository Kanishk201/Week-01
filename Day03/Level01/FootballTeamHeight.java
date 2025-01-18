import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        //Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Declare an array to store the heights of 11 players
        double[] heights = new double[11];

        //Prompt the user to enter the heights
        System.out.println("Enter the heights of 11 players:");

        //Initialize a variable to calculate the sum of heights
        double sum = 0;

        //Loop to get input and calculate the sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        //Calculate the mean height
        double mean = sum / heights.length;

        //Print the mean height
        System.out.println("The mean height of the football team is: " + mean);
    }
}
