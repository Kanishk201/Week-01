import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Take input of base and height of the triangle
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = sc.nextDouble();

        //Calculate the area of the triangle in square inches
        double areaInches = 0.5 * base * height;

        //Convert the height into square centimeters (1 inch = 2.54 cm)
        double heightInCm = height * 2.54;

        //Convert the height into feet (1 inch = 1/12 feet)
        double heightInFeet = height / 12;

        //Output
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + height);
         
    }
}
