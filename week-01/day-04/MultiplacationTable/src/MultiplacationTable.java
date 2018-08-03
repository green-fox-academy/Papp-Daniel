import java.util.Scanner;

public class MultiplacationTable {
    public static void main(String[] args) {

        System.out.println("Enter a number :");

        Scanner input = new Scanner(System.in);

        int userinput = input.nextInt();

        int a=1;
        for(a=1;a<100;a++){
            System.out.println(a + "*"+userinput+ "="+ a*userinput);
        }

    }
}
