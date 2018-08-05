import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int number = 12;

        Scanner UserIn = new Scanner(System.in);
        int guessedNumb = UserIn.nextInt();

        boolean win = false;

        while (win == false) {
            System.out.println("Guess the number :");
            guessedNumb = UserIn.nextInt();

            if (number == guessedNumb) {
                win = true;

            } else if (number > guessedNumb) {
                System.out.println("The stored number is higher");

            } else if (number < guessedNumb) {
                System.out.println("The stored number is lower");
            }
        }

        System.out.println("You found the number:" +number
        );
    }
}
