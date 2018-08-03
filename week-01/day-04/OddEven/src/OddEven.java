import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        System.out.println("Enter a whole number: ");

        Scanner number = new Scanner (System.in);

        int numberUserIn= number.nextInt();

        if (numberUserIn%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }

    }
}
