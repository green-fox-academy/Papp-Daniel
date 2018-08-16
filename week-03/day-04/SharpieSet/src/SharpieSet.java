import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    static List<Integer> sharpieList = new ArrayList<>();

    static float usableSharpies;


    static void countUsable(List sharpieList) {
        for (int i = 0; i < sharpieList.size(); i++) {
            if (Sharpie.inkAmount > 0) {
                usableSharpies++;

            }

        }
    }
    public static void removeTrash (List sharpieList){
        for (int i = 0; i < sharpieList.size(); i++) {
            if (Sharpie.inkAmount == 0) {
                sharpieList.remove(i);
            }
        }
    }
}
