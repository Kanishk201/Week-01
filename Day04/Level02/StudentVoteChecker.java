import java.util.Scanner;

public class StudentVoteChecker {

    //Method to check if the student can vote based on age
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;  // Age can't be negative, so they cannot vote
        } else if (age >= 18) {
            return true;   // If age is 18 or above, student can vote
        } else {
            return false;  // If age is less than 18, student cannot vote
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        //Array to store the ages of 10 students
        int[] ages = new int[10];

        //Taking user input for the ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        //Checking if each student can vote and displaying the result
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }
    }
}
