import java.util.Scanner;

public class MileToKmConverter {

    public static void main (String[] args){
        System.out.println("Enter the mile");

        Scanner mile = new Scanner(System.in);

        double userInput2 = mile.nextInt();
        double km = 1.609344;

        System.out.println("Km :"+userInput2*km);





    }
}

