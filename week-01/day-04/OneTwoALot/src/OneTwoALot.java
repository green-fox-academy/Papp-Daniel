import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner numb = new Scanner(System.in);

        int userIn = numb.nextInt();

        if (userIn==0 || userIn<0){
            System.out.println("Not enough");
        }
        else if (userIn==1){
            System.out.println("One");
        }
        else if (userIn==2){
            System.out.println("Two");
        }
        else if (userIn>2){
            System.out.println("A lot");
        }



    }
}
