import java.util.Scanner;

public class PoundsToKilogramsConverter {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        //Take input of weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        //Convert pounds to kilograms
        double weightInKilograms = weightInPounds * 2.2;

        //Output
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKilograms);
    }
}
