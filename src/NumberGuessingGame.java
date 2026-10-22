import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            playRound(input, random);
        } while (shouldPlayAgain(input));

        System.out.println("Thanks for playing!");
        input.close();
    }

    private static void playRound(Scanner input, Random random) {
        int secretNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        int attempts = 0;

        System.out.println("\nI'm thinking of a number from " + MIN_NUMBER + " to " + MAX_NUMBER + ".");

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess (" + (MAX_ATTEMPTS - attempts) + " attempts left): ");
            if (!input.hasNextLine()) {
                return;
            }

            String guessText = input.nextLine().trim();
            int guess;
            try {
                guess = Integer.parseInt(guessText);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a whole number.");
                continue;
            }

            if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                System.out.println("Your guess must be between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");
                continue;
            }

            attempts++;
            if (guess == secretNumber) {
                System.out.println("Correct! You guessed the number in " + attempts + " "
                        + (attempts == 1 ? "attempt." : "attempts."));
                return;
            }

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        System.out.println("Out of attempts! The number was " + secretNumber + ".");
    }

    private static boolean shouldPlayAgain(Scanner input) {
        while (true) {
            System.out.print("Would you like to play again? (y/n): ");
            if (!input.hasNextLine()) {
                return false;
            }

            String answer = input.nextLine().trim();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                return true;
            }
            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                return false;
            }

            System.out.println("Please enter y or n.");
        }
    }
}
