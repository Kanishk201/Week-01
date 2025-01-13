import java.util.Scanner;

public class HandshakeCalculator {

    //Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        //Check for valid input
        if (n < 2) {
            System.out.println("There must be at least 2 students for a handshake to happen.");
        } else {
            //Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(n);

            //Output the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }
    }
}
