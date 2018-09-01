import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static ArrayList<Integer> unique(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> returnNumbers = new ArrayList<>();
        for (int key : numbers) {
            if (map.containsKey(key)) {
                int occurence = map.get(key);
                occurence++;
                map.put(key, occurence);
            } else {
                map.put(key, 1);
            }
        }
        for (Integer key : map.keySet()) {
            int occurence = map.get(key);
            returnNumbers.add(key);

        }
        return returnNumbers;

    }


}