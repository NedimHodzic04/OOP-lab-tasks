import java.util.Scanner;

public class Task7calculator {
    public static void main(String[] args) {
        while (true){
            System.out.println("Welcome to the calculator. Choose your option sum/multiply/quit");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            if (input.equals("multiply") || input.equals("sum")){
                System.out.println("Enter first number: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter second number: ");
                int b = Integer.parseInt(scanner.nextLine());
                if (input.equals("sum"))
                    System.out.println("The sum of " + a + " and " + b + " is: " + (a+b));
                else
                    System.out.println("The product of " + a + " and " + b + " is: " + (a*b));

                break;
            }
        }
    }
}
