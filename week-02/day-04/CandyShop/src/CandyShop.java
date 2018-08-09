import java.util.*;

public class CandyShop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        String a ="Croissant";
        String b ="Ice cream";

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.
        sweets(arrayList,a,b);
        System.out.println(arrayList);
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    public static void sweets ( ArrayList arrayList, String a, String b){
        arrayList.set(1, a);
        arrayList.set(3, b);
    }
}