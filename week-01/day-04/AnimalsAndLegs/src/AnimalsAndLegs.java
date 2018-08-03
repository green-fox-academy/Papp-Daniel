import java.util.Scanner;


public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("The number of chickens, and the number of pigs :");

        Scanner mile = new Scanner(System.in);

        int chickensLegs = mile.nextInt();
        int pigsLegs = mile.nextInt();

        System.out.println("The number of chickens legs is: "+chickensLegs*2);
        System.out.println("The number of pigs legs is: "+pigsLegs*4);


    }
}
