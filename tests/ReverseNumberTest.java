import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNumberTest {

    ReverseNumber rn = new ReverseNumber();

    @Test
    public void testReverseNumber() throws Exception {
        assertEquals(321,rn.ReverseNumber(123));
    }

    @Test
    public void testReverseNumberSingle() throws Exception {
        assertEquals(1,rn.ReverseNumber(1));
    }

    @Test
    public void testReverseNumberZero() throws Exception {
        assertEquals(0,rn.ReverseNumber(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testReverseNumberNegative() throws Exception {
        rn.ReverseNumber(-1);
    }
}