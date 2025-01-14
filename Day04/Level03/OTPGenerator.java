import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    //Method to generate a 6-digit OTP number
    public static int generateOTP() {
        //Generating a random 6-digit number
        int otp = (int)(Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
        return otp;
    }

    //Method to ensure OTP numbers are unique by checking if any number repeats
    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> otpSet = new HashSet<>();
        
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) {
                return false; // If the set already contains the OTP, it's not unique
            }
        }
        
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        //Create an array to store the OTP numbers
        int[] otpArray = new int[10];
        
        //Generate OTPs 10 times
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }
        
        //Check if all OTPs are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
