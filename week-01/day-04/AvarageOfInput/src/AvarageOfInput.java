import java.util.Scanner;

public class AvarageOfInput {

    public static void main(String[] args) {

        System.out.println("Enter five whole number :");

        Scanner mile = new Scanner(System.in);

        int firstNum = mile.nextInt();
        int secondtNum = mile.nextInt();
        int thirdNum = mile.nextInt();
        int fourthNum = mile.nextInt();
        int fifthNum = mile.nextInt();

        int sum=firstNum+secondtNum+thirdNum+fourthNum+fifthNum;
        double avarage = sum/5;

        System.out.println("Sum is:"+sum+"  Avarage is:"+avarage);

    }
}
