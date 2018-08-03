import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        System.out.println("Enter two number");

        Scanner numbers = new Scanner(System.in);

        int boysNumb = numbers.nextInt();
        int girlsNumb = numbers.nextInt();

        int sum = boysNumb+girlsNumb;

        if (boysNumb==girlsNumb && sum>=20){
            System.out.println("The party is excellent!");
        }
        else if (sum>=20 && boysNumb!=girlsNumb && boysNumb!=0){
            System.out.println("Quite cool party!");
        }
        else if (sum<20 ){
            System.out.println("Average party...");
        }
        else if (girlsNumb==0){
            System.out.println("Sausage party");
        }


    }
}
