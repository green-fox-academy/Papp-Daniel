import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        checkArmstrongNumber(371);
    }

    public static void checkArmstrongNumber(int number) {
        /*String stringNumber = Integer.toString(number);
        String[] stringsArray = stringNumber.split("(?!^)");
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < stringsArray.length; i++) {
            result.add(Integer.parseInt(stringsArray[i]));
        }*/
        int c = 0, a, temp;
        int n = number;
        temp = n;
        boolean isArmstorng = false;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            isArmstorng = true;
        } else {
            isArmstorng = false;
        }
        if (isArmstorng) {
            System.out.println(number + " is an armstorng number");
        } else {
            System.out.println(number + " is not armstrong number");
        }
    }
}
