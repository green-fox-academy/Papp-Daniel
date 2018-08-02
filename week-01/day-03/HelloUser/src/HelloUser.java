import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloUser {



    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine();
        System.out.println("Hello "+line);

    }
}
