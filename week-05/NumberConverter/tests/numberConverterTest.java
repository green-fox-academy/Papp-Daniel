import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class numberConverterTest {

    @Test

    public void isAnagramTest(){
        String word1 = "asd";
        String word2 = "adsf";

        Anagram anagram = new Anagram();


        assertTrue( anagram.isAnagram(word1,word2));

    }
}
