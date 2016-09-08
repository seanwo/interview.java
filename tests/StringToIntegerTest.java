import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    StringToInteger s2i = new StringToInteger();

    @Test
    public void testAtoi0() throws Exception {
        assertEquals(0,s2i.atoi("0"));
    }

    @Test
    public void testAtoi1() throws Exception {
        assertEquals(1,s2i.atoi("1"));
    }

    @Test
    public void testAtoi9() throws Exception {
        assertEquals(9,s2i.atoi("9"));
    }

    @Test
    public void testAtoi99() throws Exception {
        assertEquals(99,s2i.atoi("99"));
    }

    @Test
    public void testAtoi1Neg1() throws Exception {
        assertEquals(-1,s2i.atoi("-1"));
    }

    @Test
    public void testAtoi1123456() throws Exception {
        assertEquals(123456,s2i.atoi("123456"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAtoiNull() throws Exception {
        s2i.atoi(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAtoiEmpty() throws Exception {
        s2i.atoi("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAtoiTrimEmpty() throws Exception {
        s2i.atoi("  ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAtoiNonNumeric() throws Exception {
        s2i.atoi("aa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAtoiMixedNonNumeric() throws Exception {
        s2i.atoi("1a3");
    }
}