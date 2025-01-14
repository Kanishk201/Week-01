import java.util.Scanner;

public class FriendInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declare variables for names, ages, and heights
        String friend1 = "Amar", friend2 = "Akbar", friend3 = "Anthony";
        int age1, age2, age3;
        double height1, height2, height3;

        //Input ages and heights
        System.out.println("Enter the age and height of " + friend1 + ": ");
        age1 = scanner.nextInt();
        height1 = scanner.nextDouble();

        System.out.println("Enter the age and height of " + friend2 + ": ");
        age2 = scanner.nextInt();
        height2 = scanner.nextDouble();

        System.out.println("Enter the age and height of " + friend3 + ": ");
        age3 = scanner.nextInt();
        height3 = scanner.nextDouble();

        //Find the youngest friend based on age
        int youngestAge = Math.min(age1, Math.min(age2, age3));
        String youngestFriend = "";
        if (youngestAge == age1) youngestFriend = friend1;
        else if (youngestAge == age2) youngestFriend = friend2;
        else youngestFriend = friend3;

        //Find the tallest friend based on height
        double tallestHeight = Math.max(height1, Math.max(height2, height3));
        String tallestFriend = "";
        if (tallestHeight == height1) tallestFriend = friend1;
        else if (tallestHeight == height2) tallestFriend = friend2;
        else tallestFriend = friend3;

        //Display results
        System.out.println("\nThe youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " meters.");
    }
}
