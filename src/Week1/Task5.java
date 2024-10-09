import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is negative.");
    }
}
