public class DivideByZero {
    public static void main(String[] args) {
        int numberToDivide = 2;
        int result = divideTenWith(numberToDivide);
        System.out.println("Succes " + "10 can be divided by " + divideTenWith(result));

    }

    public static int divideTenWith(int numberToDivide) {
        int ten = 10;
        int result = 0;
        try {
            result = ten / numberToDivide;
        } catch (ArithmeticException e) {
            System.out.println("Fail, the parameter is ZERO");
        }
        return result;
    }
}
