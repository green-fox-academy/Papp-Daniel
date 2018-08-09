import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.println("Enter two whole number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter your operation : 1 for add, 2 for sub, 3 for mult, 4 for div");
        int op = scanner.nextInt();
        switch (op){
            case 1:
                System.out.println(add(a,b));
                break;
            case 2:
                System.out.println(sub(a,b));
                break;
            case 3:
                System.out.println(mult(a,b));
                break;
            case 4:
                System.out.println(div(a,b));
                break;
            }
        }




    public static int add(int a, int b){
        int result = a+b;

        return  result;
    }
    public static int sub(int a, int b){
        int result = a-b;

        return result;
    }
    public static int mult(int a, int b){
        int result = a*b;

        return result;
    }
    public static int div(int a, int b){
        int result = a/b;

        return result;
    }
}