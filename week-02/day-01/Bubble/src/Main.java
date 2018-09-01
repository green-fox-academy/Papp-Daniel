import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending
        //  Example:
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    public static String bubble(int[] numbers) {
        Arrays.sort(numbers);
        String string = Arrays.toString(numbers);


        return string;
    }
    public static String advancedBubble (int[] numbers,boolean sort) {
        String string ="";
            int[] unsortedArray = new int[numbers.length];
            if (sort){
                for(int i = 0; i < unsortedArray.length; i++){
                    unsortedArray[i] = numbers[i];
            }
                 string = Arrays.toString(unsortedArray);
            }else {
                Arrays.sort(numbers);
                 string = Arrays.toString(numbers);
            }

            return string;
    }
}