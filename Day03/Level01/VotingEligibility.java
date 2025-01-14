import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        //Taking input for student ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        //Checking voting eligibility
        System.out.println("\nVoting eligibility results:");
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < 0) {
                System.out.println("Invalid age: " + studentAges[i]);
            } else if (studentAges[i] >= 18) {
                System.out.println("The student with the age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + studentAges[i] + " cannot vote.");
            }
        }
    }
}