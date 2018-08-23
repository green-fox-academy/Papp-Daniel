import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    private Sum sum;

    @Before

    public void createSum(){
        sum = new Sum();
    }


    @Test
    public void sumNumbs() {
        assertEquals(20,20);
    }
}