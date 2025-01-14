import java.util.Scanner;

public class YoungestTallestFinder {

    //Method to find the youngest among the 3 friends
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = "Amar";

        if (ages[1] < youngestAge) {
            youngestAge = ages[1];
            youngestFriend = "Akbar";
        }

        if (ages[2] < youngestAge) {
            youngestAge = ages[2];
            youngestFriend = "Anthony";
        }

        return youngestFriend;
    }

    //Method to find the tallest among the 3 friends
    public static String findTallest(double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriend = "Amar";

        if (heights[1] > tallestHeight) {
            tallestHeight = heights[1];
            tallestFriend = "Akbar";
        }

        if (heights[2] > tallestHeight) {
            tallestHeight = heights[2];
            tallestFriend = "Anthony";
        }

        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Arrays to store age and height of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        //Taking user input for ages and heights of the 3 friends
        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt();

        System.out.print("Enter height of Amar (in cm): ");
        heights[0] = scanner.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        heights[1] = scanner.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        heights[2] = scanner.nextDouble();

        //Finding the youngest and the tallest among the 3 friends
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        //Displaying the result
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
