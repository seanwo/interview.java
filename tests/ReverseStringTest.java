import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString rs = new ReverseString();

    @Test
    public void testReverseStringSimple() throws Exception {
        String input="abc";
        assertEquals("cba", rs.ReverseString(input));
    }

    @Test
    public void testReverseStringSingleChar() throws Exception {
        String input="a";
        assertEquals("a", rs.ReverseString(input));
    }

    @Test
    public void testReverseStringEmpty() throws Exception {
        String input="";
        assertEquals("", rs.ReverseString(input));
    }

    @Test
    public void testReverseStringNull() throws Exception {
        String input=null;
        assertEquals(null, rs.ReverseString(input));
    }
}