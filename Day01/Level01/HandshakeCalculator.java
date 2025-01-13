import java.util.Scanner;

public class HandshakeCalculator {
   public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
		
		//Take number of students as input
		System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
		
		//Calculate the maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
 
        //Output
		System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);

   }
}