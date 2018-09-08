import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

        System.out.println("Enter how many number would you like :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int numbers = scanner.nextInt();
            sum += numbers;
        }
        double average = sum/number;
        System.out.println("Sum :"+sum + ", Average : " + average);
    }
}
