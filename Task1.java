import java.util.Scanner;
import java.util.Random;

public class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;

        System.out.println("::WELCOME TO NUMBER GUESSING GAME::");
        System.out.println("I Picked a number between " + minRange + " and " + maxRange);
        System.out.println("You have " + attempts + " attempts left");

        int rounds = 0;
        int totalAttempts = 0;
        int totalWins = 0;
        boolean playAgain = true;

        while (playAgain) {
            rounds++;
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int guess;
            int low = minRange;
            int high = maxRange;

            while (true) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("!!!!!CORRECT!!!!! " + targetNumber + " in " + attempts + " attempts!");
                    totalWins++;
                    break;
                } else if (guess > targetNumber) {
                    System.out.println("TOO HIGH TRY AGAIN");
                    high = guess - 1;
                } else {
                    System.out.println("TOO LOW TRY AGAIN");
                    low = guess + 1;
                }

                if (attempts >= 10) { 
                    System.out.println("SORRY!! YOU RAN OUT OF ATTEMPTS");
                    break;
                }
            }

            totalAttempts += attempts;
            System.out.print("WANT TO PLAY AGAIN? (YES / NO): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("YES");
            attempts = 0; 
        }

        System.out.println("THANKS FOR PLAYING");
        System.out.println("You played " + rounds + " rounds");
        System.out.println("TOTAL ATTEMPTS: " + totalAttempts);
        System.out.println("TOTAL WINS: " + totalWins);

        scanner.close(); 
    }
}
