import java.util.ArrayList;
import java.util.List;

public class GetIndex {
    public int getIndexFromList(List numbers, int index) {

        for (int i = 0; i < numbers.size(); i++) {
            if (index == i) {
                return index;
            }
        }
        return -1;
    }
}
