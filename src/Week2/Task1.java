package Week2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        while(true){
            System.out.println("Enter password");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            String correct_word = "neda";
            if(password.equals(correct_word)){
                System.out.println("Right!!! Secret is 'dasnfasjdjsad dnsandasn' ");
                break;
            }
        }
    }
}
