import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalidromeTest {

    IsPalidrome ip = new IsPalidrome();

    @Test
    public void testIsPalidromeSimpleOddTrue() throws Exception {
        String input= "aba";
        assertTrue(ip.IsPalidrome(input));
    }

    @Test
    public void testIsPalidromeSimpleOddFalse() throws Exception {
        String input= "abc";
        assertFalse(ip.IsPalidrome(input));
    }

    @Test
    public void testIsPalidromeOneChar() throws Exception {
        String input= "a";
        assertTrue(ip.IsPalidrome(input));
    }

    @Test
    public void testIsPalidromeSimpleEvenTrue() throws Exception {
        String input= "aa";
        assertTrue(ip.IsPalidrome(input));
    }

    @Test
    public void testIsPalidromeSimpleEvenFalse() throws Exception {
        String input= "ab";
        assertFalse(ip.IsPalidrome(input));
    }

    @Test
    public void testIsPalidromeSimple() throws Exception {
        String input= "zerorez";
        assertTrue(ip.IsPalidrome(input));
    }

    @Test
    public void testIsPalidromeEmpty() throws Exception {
        String input= "";
        assertTrue(ip.IsPalidrome(input));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPalidromeNull() throws Exception {
        String input= null;
        ip.IsPalidrome(input);
    }
}