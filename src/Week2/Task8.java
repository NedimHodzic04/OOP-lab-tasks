package Week2;

public class Task8 {
    public static void main(String[] args) {
        drawStarsPiramid(5);
    }

    public static void drawStarsPiramid(int num){
        for (int i = num; i > 0; i--){

            for (int j = 1; j <= i; j++) {  // Print stars based on the current row
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
