package Week2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int input = 1;
        int sum = 0;
        while(input != 0){
            System.out.println("Enter a number to sum - enter 0 to end summing: ");
            Scanner scanner = new Scanner(System.in);
            input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
