package Week2;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
            System.out.println("Guess the number :");
            int guess = 50, guesses = 0;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());

            if (input == guess){
                System.out.println("You are correct!");
                System.out.println("You made " + guesses + " guesses !");
            } else if (input > guess){
                guesses++;
                System.out.println("Higher! - This is your " + guesses + ". guess !");
            } else if (input < guess){
                guesses++;
                System.out.println("Lower! - This is your " + guesses + ". guess !");
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            }

        }
    }
}
