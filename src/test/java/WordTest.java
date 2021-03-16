import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class WordTest {
    private static String s;
    private static int num;
    @Before
    public void setup(){
        s="abc";
    }

    @Test
    public void comWord() {
        Word w=new Word();
        num=w.comWord(s);
        assertEquals(1,num);
    }
}
