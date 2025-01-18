import java.util.Scanner;

public class GradeCalculator {
    
    //Function to calculate grade and remarks based on percentage
    public static String[] calculateGrade(double percentage) {
        String[] result = new String[2];
        if (percentage >= 80) {
            result[0] = "A";
            result[1] = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            result[0] = "B";
            result[1] = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            result[0] = "C";
            result[1] = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            result[0] = "D";
            result[1] = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            result[0] = "E";
            result[1] = "Level 1-, too below agency-normalized standards";
        } else {
            result[0] = "R";
            result[1] = "Remedial standards";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = scanner.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = scanner.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        //Calculate total and percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;

        //Calculate grade and remarks
        String[] gradeAndRemarks = calculateGrade(percentage);

        //Output the results
        System.out.println("\nTotal Marks: " + totalMarks + "/300");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + gradeAndRemarks[0]);
        System.out.println("Remarks: " + gradeAndRemarks[1]);
    }
}