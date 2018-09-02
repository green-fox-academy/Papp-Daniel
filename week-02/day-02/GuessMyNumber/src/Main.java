import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = 1+(int)(Math.random()*99);
        int guess = 0;

        System.out.println("I've the number between 1-100. You have 5 lives.");

        while (guess != number){
            guess = userInput.nextInt();
            if(guess > number){
                System.out.println("lower!");
            } else if (guess < number){
                System.out.println("higher!");
            }
        }
        System.out.println("Congratulations. You won!");
    }
}

