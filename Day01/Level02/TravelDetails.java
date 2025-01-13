import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Take inputs for travel details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();

        // Take inputs for distances
        System.out.print("Enter the distance from the starting city to the via city in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from the via city to the destination city in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        // Take input for time taken
        System.out.print("Enter the time taken fromCity to viaCity in minutes: ");
        double timeFromToVia = scanner.nextDouble();
		
		System.out.print("Enter the time taken viaCity to toCity in minutes: ");
        double timeViaToTo = scanner.nextDouble();

        // Calculate total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToTo;

        //Output
		System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
    }
}
