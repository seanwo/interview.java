import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalidromeTest {

    LongestPalidrome lp = new LongestPalidrome();

    @Test
    public void testPalidromeNormal() throws Exception {
        assertEquals("anana", lp.LongestPalidrome("banana"));
    }

    @Test
    public void testPalidromeEmptyString() throws Exception {
        assertEquals("", lp.LongestPalidrome(""));
    }

    @Test
    public void testPalidromeSingleCharacter() throws Exception {
        assertEquals("a", lp.LongestPalidrome("a"));
    }

    @Test
    public void testPalidromeTwoCharacterPos() throws Exception {
        assertEquals("aa", lp.LongestPalidrome("aa"));
    }

    @Test
    public void testPalidromeTwoCharacterNeg() throws Exception {
        assertEquals("a", lp.LongestPalidrome("ab"));
    }

    @Test
    public void testPalidromeThreeCharacterPos() throws Exception {
        assertEquals("aaa", lp.LongestPalidrome("aaa"));
    }

    @Test
    public void testPalidromeThreeCharacterNeg() throws Exception {
        assertEquals("a", lp.LongestPalidrome("abc"));
    }

    @Test
    public void testPalidromeIgnoreCase() throws Exception {
        assertEquals("anana", lp.LongestPalidrome("BaNanA"));
    }

    @Test
    public void testPalidromeIgnoreGarbage() throws Exception {
        assertEquals("anana", lp.LongestPalidrome("$%#$v .BaNanA!!@"));
    }

}