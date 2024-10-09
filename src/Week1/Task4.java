import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number: ");
        int b = Integer.parseInt(scanner.nextLine());
        int sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);

    }
}
