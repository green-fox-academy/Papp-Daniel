public class Factorial {
    public static void main(String[] args) {

        int[] numbArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(factorio(numbArray));

    }


    public static int factorio(int[] numbers) {

        int factorial = 1;

        for (int i = 1; i < numbers.length; i++) {
            factorial *= numbers[i];
        }
        return factorial;
    }
}
