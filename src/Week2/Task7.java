package Week2;


public class Task7 {
    public static void main(String[] args) {

        drawStarsPiramid(5);
    }

    public static void drawStarsPiramid(int num){
        for (int i = 0; i < num; i++){
            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
