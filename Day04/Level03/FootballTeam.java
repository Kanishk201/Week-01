import java.util.Arrays;
import java.util.Random;

public class FootballTeam {

    //Method to generate an array of 11 random heights between 150 and 250 cm
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];

        //Generate random heights in the range of 150 to 250 cm
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(101) + 150;  // (0 to 100) + 150 to get the range 150-250
        }

        return heights;
    }

    //Method to find the sum of all heights in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    //Method to find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    //Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            minHeight = Math.min(minHeight, height);
        }
        return minHeight;
    }

    //Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            maxHeight = Math.max(maxHeight, height);
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        //Create an array of 11 random heights for the football team
        int teamSize = 11;
        int[] heights = generateRandomHeights(teamSize);

        //Display the heights of the players
        System.out.println("Heights of the football players: " + Arrays.toString(heights));

        //Find the sum of all the heights
        int sum = findSum(heights);

        //Find the mean, shortest, and tallest heights
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        //Display the results
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + meanHeight + " cm");
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
