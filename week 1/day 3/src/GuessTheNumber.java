import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        // Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess what number I wish u guess! :");

        int number = 8;
        boolean yes = true;

        while (yes) {
            int userGuess = scanner.nextInt();
            if (userGuess < number) {
                System.out.println("number is higher!");
                return;
            }
            else if (userGuess > number) {
                System.out.println("number is lower!");
                return;
            }
            else {
                System.out.println("You hit right number!");
                return;
            }
        }


    }
}
