import java.util.Random;

public class StudentScorecard {

    // Generate random scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + rand.nextInt(51); // Physics (50-100)
            scores[i][1] = 50 + rand.nextInt(51); // Chemistry (50-100)
            scores[i][2] = 50 + rand.nextInt(51); // Maths (50-100)
        }
        return scores;
    }

    // Calculate total, average, and percentage for each student
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            metrics[i][0] = total;
            metrics[i][1] = Math.round(average * 100.0) / 100.0;
            metrics[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return metrics;
    }

    // Calculate grade based on percentage
    public static String[] calculateGrades(double[][] metrics) {
        String[] grades = new String[metrics.length];
        for (int i = 0; i < metrics.length; i++) {
            double percentage = metrics[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 50) grades[i] = "C";
            else if (percentage >= 40) grades[i] = "D";
            else grades[i] = "E";
        }
        return grades;
    }

    // Display the scorecard
    public static void displayScorecard(int[][] scores, double[][] metrics, String[] grades) {
        System.out.println("Student   Physics   Chemistry   Maths   Total   Average   Percentage   Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "          " +
                scores[i][0] + "        " +
                scores[i][1] + "         " +
                scores[i][2] + "      " +
                (int) metrics[i][0] + "     " +
                metrics[i][1] + "      " +
                metrics[i][2] + "        " +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        int numStudents = 20;

        // Step 1: Generate random scores
        int[][] scores = generateScores(numStudents);

        // Step 2: Calculate metrics
        double[][] metrics = calculateMetrics(scores);

        // Step 3: Calculate grades
        String[] grades = calculateGrades(metrics);

        // Step 4: Display scorecard
        displayScorecard(scores, metrics, grades);
    }
}