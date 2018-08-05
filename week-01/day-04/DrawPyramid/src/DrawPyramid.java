import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        int i;
        int j;
        int k;

        Scanner UserIn = new Scanner(System.in);
        System.out.println("Enter the number");
        int size = UserIn.nextInt();

        for (i=0; i<size; i++){
            for (j=0; j<size-i; j++){
                System.out.print(" ");
            }
            for (k=1; k<=2*i-1; k++){
                System.out.print("*");

            }
            System.out.println();
        }



    }
}
