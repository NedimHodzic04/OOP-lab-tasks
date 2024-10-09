package Week2;
import java.util.Scanner;



public class Task4 {
    public static void main(String[] args){
        int first_num;
        int last_num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        first_num = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the last number");
        last_num = Integer.parseInt(scanner.nextLine());

        for(int i = first_num; i <= last_num; i++){
            System.out.println(i);
        }

    }
}
