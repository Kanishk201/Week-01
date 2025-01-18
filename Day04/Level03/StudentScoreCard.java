import java.util.Scanner;

public class StudentScoreCard {

    // Method to take PCM scores input for students
    public static int[][] inputScores(int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            scores[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            scores[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            scores[i][2] = scanner.nextInt();
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3]; // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; // Assuming each subject is out of 100

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100) / 100.0; // Rounded to 2 decimals
            stats[i][2] = Math.round(percentage * 100) / 100.0; // Rounded to 2 decimals
        }
        return stats;
    }

    // Method to assign grades based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 87) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "F";
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] stats) {
        System.out.println("Student    Physics    Chemistry  Maths      Total      Average    Grade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(stats[i][2]);
            System.out.println(
                    (i + 1) + "          " +
                    scores[i][0] + "          " +
                    scores[i][1] + "          " +
                    scores[i][2] + "          " +
                    stats[i][0] + "        " +
                    stats[i][1] + "        " +
                    grade
            );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Input scores for each student
        int[][] scores = inputScores(numberOfStudents);

        // Calculate stats (total, average, percentage)
        double[][] stats = calculateStats(scores);

        // Display scorecard
        displayScoreCard(scores, stats);
    }
}