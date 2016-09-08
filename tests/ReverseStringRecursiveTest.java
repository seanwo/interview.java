import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringRecursiveTest {

    ReverseStringRecursive rsr = new ReverseStringRecursive();

    @Test
    public void testReverseStringSimple() throws Exception {
        String input="abcd";
        assertEquals("dcba", rsr.ReverseString(input));
    }

    @Test
    public void testReverseStringSingleChar() throws Exception {
        String input="a";
        assertEquals("a", rsr.ReverseString(input));
    }

    @Test
    public void testReverseStringEmpty() throws Exception {
        String input="";
        assertEquals("", rsr.ReverseString(input));
    }

    @Test
    public void testReverseStringNull() throws Exception {
        String input=null;
        assertEquals(null, rsr.ReverseString(input));
    }
}