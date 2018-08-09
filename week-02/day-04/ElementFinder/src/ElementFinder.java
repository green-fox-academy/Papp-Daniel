import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

        containsSeven(arrayList);
        boolean a = containsSeven(arrayList);

        if (a){
            System.out.println("Hoorray");
        } else {
            System.out.println("Noooooo");
        }


    }
    public static boolean containsSeven (ArrayList arrayList){
        boolean a;

        if (arrayList.contains(7)){
            a=true;
        } else {
            a=false;
        }
        return a;

    }
}