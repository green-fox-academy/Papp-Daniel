import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {
    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        ArrayList<String> asd = new ArrayList<>();

        match(girls,boys,asd);
        System.out.println(asd);

    }

    public static void match(ArrayList<String>girlsList,ArrayList<String>boysList,ArrayList<String>matchedList) {
        int temp =0;
        if(girlsList.size()<boysList.size()){
            temp =girlsList.size();
        }else {
            temp =girlsList.size();
        }

        for (int i =0; i< temp; i++){
            matchedList.add(girlsList.get(i));
            matchedList.add(boysList.get(i));
        }


    }
}
