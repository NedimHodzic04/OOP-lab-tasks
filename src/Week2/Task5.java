package Week2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter n number: ");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int result = (int)Math.pow(2,n);

        System.out.println("The result is: " + result);
    }
}
