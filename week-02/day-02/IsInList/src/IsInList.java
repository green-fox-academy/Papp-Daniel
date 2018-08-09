import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
        int[] numbers ={4,8,12,16};

        checkNums(list,numbers);
        boolean a = checkNums(list,numbers);

        System.out.println(a);
    }
    public static boolean checkNums (ArrayList list,int[] numbers){
        boolean a;
        if (list.containsAll(Arrays.asList(4,8,12,16))){
            a=true;
        } else {
            a=false;
        }
        return a;
    }

}