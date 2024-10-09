package Week2;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        printText("Baba", 5);
    }

    public static void printText(String text, int times){
        for(int i = 0; i <times; i++){
            System.out.println(text);
        }
    }
}
