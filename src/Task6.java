import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        System.out.println("Enter first number: ");

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number: ");
        int b = Integer.parseInt(sc.nextLine());

        if (a > b){
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
