package Week2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            sum = number + sum;
        }

        System.out.println("The sum of the 3 numbers is: " + sum);
    }
}
