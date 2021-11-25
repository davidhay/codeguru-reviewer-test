import java.util.Scanner;

public class GuessingGame {

    private static void processGuess(int computerNumber, int userAnswer){
        if (userAnswer <=0 || userAnswer >100) {
            System.out.println("Invalid response");
        }
        else if (userAnswer == computerNumber ){
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        }
        else if (userAnswer > computerNumber) {
            System.out.println("Your guess is too high, guess again.");
        }
        else if (userAnswer < computerNumber) {
            System.out.println("Your guess is too low, guess again.");
        }
        else {
            System.out.println("Your guess is incorrect");
        }
    }

    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        System.out.println("A random number has been generated...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a guess between 1 and 100");
        int userAnswer = scanner.nextInt();

        // Guess 1
        processGuess(computerNumber, userAnswer);
            
        // Guess 2
        System.out.println("Enter a guess between 1 and 100");
        userAnswer = scanner.nextInt();

        processGuess(computerNumber, userAnswer);

        // Guess 3
        System.out.println("Enter a guess between 1 and 100");
        userAnswer = scanner.nextInt();

        processGuess(computerNumber, userAnswer);

        System.out.println("Sorry for your luck, restart the program to play again!");
    }
}