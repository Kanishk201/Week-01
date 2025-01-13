public class EarthVolume {
    public static void main(String[] args) {
        
        double radiusKm = 6378;

        
        double kmToMilesFactor = 0.621371;

        // Calculate the volume in cubic kilometers
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Calculate the volume in cubic miles
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMilesFactor, 3);

        //Output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
            " and cubic miles is " + volumeMiles3);
    }
}
