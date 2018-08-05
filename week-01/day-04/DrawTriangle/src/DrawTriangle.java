import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        System.out.println("Enter a number :");

        Scanner UserIn = new Scanner(System.in);


        int size = UserIn.nextInt();

        for (int i=1; i<=size; i++){
            for (int j=1; j<=size;j++){
                if (j <i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
