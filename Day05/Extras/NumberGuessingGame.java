import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

     // Main game loop
     public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(lowerBound, upperBound, random);
            System.out.println("My guess: " + guess);

            String feedback = getUserFeedback(scanner);

            if (feedback.equalsIgnoreCase("low")) {
                lowerBound = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                upperBound = guess - 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! I guessed your number: " + guess);
                guessedCorrectly = true;
            } else {
                System.out.println("Invalid input. Please respond with 'low', 'high', or 'correct'.");
            }

            if (lowerBound > upperBound) {
                System.out.println("Something went wrong. Are you sure you responded correctly?");
                break;
            }
        }
    }

    // Generate a random guess within the current bounds
    public static int generateGuess(int lowerBound, int upperBound, Random random) {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    // Get feedback from the user
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Is my guess too 'low', too 'high', or 'correct'? ");
        return scanner.nextLine().trim();
    }

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        System.out.println("Respond with 'low' if my guess is too low, 'high' if it's too high, and 'correct' if I guess your number.");

        playGame();
    }

   
}
