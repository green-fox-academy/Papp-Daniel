import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void testIndex (){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int index = 4;

        GetIndex getIndex = new GetIndex();

        getIndex.getIndexFromList(numbers,index);

        assertEquals(index,getIndex.getIndexFromList(numbers,index) );


    }

}
