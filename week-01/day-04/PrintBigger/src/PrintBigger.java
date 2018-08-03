import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        System.out.println("Enter two number");

        Scanner number = new Scanner(System.in);

        int numb1 = number.nextInt();
        int numb2 = number.nextInt();

        if (numb1>numb2){
            System.out.println("The first number is bigger");
        }
        else {
            System.out.println("The second number is bigger");
        }

    }
}
