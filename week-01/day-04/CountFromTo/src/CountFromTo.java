import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner userInPut = new Scanner(System.in);
        int firstNumb = userInPut.nextInt();
        int secondNumb = userInPut.nextInt();

        if (firstNumb>secondNumb){
            System.out.println("The second number should be bigger");

        }
        else{
            for (int a=firstNumb;a<secondNumb;a++){
                System.out.println(a);
            }
        }

    }
}
