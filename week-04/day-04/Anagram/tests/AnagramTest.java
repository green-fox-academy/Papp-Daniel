import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram a;

    @Before
    public void createAnagram(){
        a=new Anagram("dani", "inad");
    }


    @Test
    public void isItAnagram() {
        assertTrue(a.isItAnagram());
    }
}